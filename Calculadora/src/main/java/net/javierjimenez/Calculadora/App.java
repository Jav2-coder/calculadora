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

	private double valor, n = 0;

	private boolean igual = false;

	private String total, num = "0";

	private String operacio = "";

	private JLabel lblCalculadora = new JLabel("0");

	/**
	 * Launch the applicationn.
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

		actionButtonNum(button7);

		JButton button8 = new JButton("8");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 1;
		frame.getContentPane().add(button8, g);

		actionButtonNum(button8);

		JButton button9 = new JButton("9");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 1;
		frame.getContentPane().add(button9, g);

		actionButtonNum(button9);

		JButton button4 = new JButton("4");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 2;
		frame.getContentPane().add(button4, g);

		actionButtonNum(button4);

		JButton button5 = new JButton("5");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 2;
		frame.getContentPane().add(button5, g);

		actionButtonNum(button5);

		JButton button6 = new JButton("6");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 2;
		frame.getContentPane().add(button6, g);

		actionButtonNum(button6);

		JButton button1 = new JButton("1");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 3;
		frame.getContentPane().add(button1, g);

		actionButtonNum(button1);

		JButton button2 = new JButton("2");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 1;
		g.gridy = 3;
		frame.getContentPane().add(button2, g);

		actionButtonNum(button2);

		JButton button3 = new JButton("3");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 2;
		g.gridy = 3;
		frame.getContentPane().add(button3, g);

		actionButtonNum(button3);

		JButton button0 = new JButton("0");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 2;
		g.gridheight = 1;

		g.gridx = 0;
		g.gridy = 4;
		frame.getContentPane().add(button0, g);

		actionButtonNum(button0);

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
				if (!num.contains(".")) {
					num = num + ".";
					total = lblCalculadora.getText() + e.getActionCommand();
					lblCalculadora.setText(total);
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

		operacioMat(buttonMns);

		JButton buttonEq = new JButton("=");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 1;

		g.gridx = 3;
		g.gridy = 4;
		frame.getContentPane().add(buttonEq, g);

		buttonEq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (operacio) {
				case "+":
					n = Double.parseDouble(num);
					if ((valor + n) != (double) 666) {
						total = String.valueOf(valor + n);
						operacio = "";
						num = "";
						lblCalculadora.setText(total);
						igual = true;
					} else {
						lblCalculadora.setText("ES EL DIMONI!! ERROR )_:");
						operacio = "";
						num = "";
						igual = true;
					}
					break;
				case "-":
					n = Double.parseDouble(num);
					if ((valor - n) != (double) 666) {
						total = String.valueOf(valor - n);
						operacio = "";
						num = "";
						lblCalculadora.setText(total);
						igual = true;
					} else {
						lblCalculadora.setText("ES EL DIMONI!! ERROR )_:");
						operacio = "";
						num = "";
						igual = true;
					}
					break;
				case "":
					n = Double.parseDouble(num);
					if ((valor + n) != (double) 666) {
						total = String.valueOf(n);
						lblCalculadora.setText(total);
						igual = true;
					} else {
						lblCalculadora.setText("ES EL DIMONI!! ERROR )_:");
						operacio = "";
						num = "";
						igual = true;
					}
					break;
				}
			}
		});

		JButton buttonPls = new JButton("+");
		g.fill = GridBagConstraints.BOTH;

		g.weightx = 0.5;
		g.weighty = 0.5;

		g.gridwidth = 1;
		g.gridheight = 2;

		g.gridx = 3;
		g.gridy = 2;
		frame.getContentPane().add(buttonPls, g);

		operacioMat(buttonPls);
	}

	private void actionButtonNum(JButton button) {

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!igual) {
					num = num + e.getActionCommand();
					total = lblCalculadora.getText() + e.getActionCommand();
					lblCalculadora.setText(total);
				} else {
					lblCalculadora.setText("");
					num = e.getActionCommand();
					total = lblCalculadora.getText() + e.getActionCommand();
					lblCalculadora.setText(total);
					igual = false;
				}
			}
		});
	}

	private void operacioMat(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operacio != "") {
					switch (operacio) {
					case "+":
						valor = valor + Double.parseDouble(num);
						num = "0";
						total = total + e.getActionCommand();
						lblCalculadora.setText(total);
						operacio = e.getActionCommand();
						break;
					case "-":
						valor = valor - Double.parseDouble(num);
						num = "0";
						total = total + e.getActionCommand();
						lblCalculadora.setText(total);
						operacio = e.getActionCommand();
						break;
					}
				} else {
					valor = Double.parseDouble(num);
					num = "0";
					total = total + e.getActionCommand();
					lblCalculadora.setText(total);
					operacio = e.getActionCommand();
				}
			}
		});
	}
}
