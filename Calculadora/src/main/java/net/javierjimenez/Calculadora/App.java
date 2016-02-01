package net.javierjimenez.Calculadora;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class App {

	private JFrame frame;

	private int valor1, valor2 = 0;

	private String total = null;

	private boolean operacio, decimal, numero = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblCalculadora = new JLabel("0");
		lblCalculadora.setBackground(Color.BLACK);
		lblCalculadora.setForeground(Color.WHITE);
		lblCalculadora.setOpaque(true);
		GridBagConstraints g = new GridBagConstraints();
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 3;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 0;
		frame.getContentPane().add(lblCalculadora, g);

		JButton button7 = new JButton("7");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 1;
		frame.getContentPane().add(button7, g);

		JButton button8 = new JButton("8");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 1;
		frame.getContentPane().add(button8, g);

		JButton button9 = new JButton("9");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 1;
		frame.getContentPane().add(button9, g);

		JButton button4 = new JButton("4");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 2;
		frame.getContentPane().add(button4, g);

		JButton button5 = new JButton("5");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 2;
		frame.getContentPane().add(button5, g);

		JButton button6 = new JButton("6");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 2;
		frame.getContentPane().add(button6, g);

		JButton button1 = new JButton("1");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 3;
		frame.getContentPane().add(button1, g);

		JButton button2 = new JButton("2");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 3;
		frame.getContentPane().add(button2, g);

		JButton button3 = new JButton("3");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 3;
		frame.getContentPane().add(button3, g);

		JButton button0 = new JButton("0");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 2;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 4;
		frame.getContentPane().add(button0, g);

		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblCalculadora.setText(clickNumero(button0.getText()));
			}
		});

		JButton buttonPnt = new JButton(".");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 4;
		frame.getContentPane().add(buttonPnt, g);

		buttonPnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!operacio) {
					if (!decimal) {
						decimal = true;
						operacio = true;
						total = String.valueOf(valor1) + ".";
						lblCalculadora.setText(total);
					}
				} else {
					if (!decimal) {
						decimal = true;
						total = String.valueOf(valor1) + ".";
						lblCalculadora.setText(total);
					}
				}
			}
		});

		JButton buttonMns = new JButton("-");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 3;
		g.gridy = 1;
		frame.getContentPane().add(buttonMns, g);

		JButton buttonEq = new JButton("=");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 3;
		g.gridy = 4;
		frame.getContentPane().add(buttonEq, g);

		JButton buttonPls = new JButton("+");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 2;

		g.gridx = 3;
		g.gridy = 2;
		frame.getContentPane().add(buttonPls, g);

	}

	private String clickNumero(String num) {

		if (operacio) {
			total = total + num;
			int value = Integer.parseInt(total);
			if(numero) {
				valor2 = value;
			} else {
				valor1 = value;
			}
			return total;

		} else {
			operacio = true;
			valor1 = Integer.parseInt(num);
			total = String.valueOf(valor1);
			return total;
		}
	}
}
