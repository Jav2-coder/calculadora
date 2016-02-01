package net.javierjimenez.Calculadora;

import java.awt.EventQueue;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class App {

	//private static String IMATGE = "/senbei.png";
	
	private JFrame frame;

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
		
		//ImageIcon icon = createImageIcon(IMATGE);
		
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
		
		JButton buttonMinus = new JButton("-");
		g.fill = GridBagConstraints.BOTH;
		
		g.weightx = 0.5;
		g.weighty = 0.5;
		
		g.gridwidth = 1;
		g.gridheight = 1;
		
		g.gridx = 4;
		g.gridy = 1;
		frame.getContentPane().add(buttonMinus, g);
		
		JButton buttonPlus = new JButton("+");
		g.fill = GridBagConstraints.BOTH;
		
		g.weightx = 0.5;
		g.weighty = 0.5;
		
		g.gridwidth = 1;
		g.gridheight = 2;
		
		g.gridx = 4;
		g.gridy = 2;
		frame.getContentPane().add(buttonPlus, g);
		
		JButton buttonPls = new JButton("N");
		g.fill = GridBagConstraints.BOTH;
		
		g.weightx = 0.5;
		g.weighty = 0.5;
		
		g.gridwidth = 1;
		g.gridheight = 1;
		
		g.gridx = 2;
		g.gridy = 2;
		frame.getContentPane().add(buttonPls, g);
		
		JButton buttonPlt = new JButton("N");
		g.fill = GridBagConstraints.BOTH;
		
		g.weightx = 0.5;
		g.weighty = 0.5;
		
		g.gridwidth = 1;
		g.gridheight = 1;
		
		g.gridx = 2;
		g.gridy = 3;
		frame.getContentPane().add(buttonPlt, g);
		
	}

	/*private ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}*/
}
