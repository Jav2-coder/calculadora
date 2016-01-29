package net.javierjimenez.Calculadora;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class App {

	private static String IMATGE = "/senbei.png";
	
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
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCalculadora = new JLabel(" ");
		lblCalculadora.setBackground(Color.BLACK);
		lblCalculadora.setOpaque(true);
		GridBagConstraints g = new GridBagConstraints();
		g.fill = GridBagConstraints.BOTH;
		g.weightx = 1;
		g.weighty = 1;
		g.gridwidth = 3;
		g.gridx = 0;
		g.gridy = 0;
		frame.getContentPane().add(lblCalculadora, g);
		
		ImageIcon icon = createImageIcon(IMATGE);
		
		JButton button = new JButton(icon);
		g.fill = GridBagConstraints.BOTH;
		g.gridwidth = 1;
		g.gridx = 4;
		g.gridy = 1;
		frame.getContentPane().add(button, g);
		
		JButton button2 = new JButton("Button 2");
		g.fill = GridBagConstraints.BOTH;
		g.gridwidth = 1;
		g.gridx = 0;
		g.gridy = 1;
		frame.getContentPane().add(button2, g);
		
		JButton button3 = new JButton("Button 3");
		g.fill = GridBagConstraints.BOTH;
		g.gridwidth = 1;
		g.gridx = 1;
		g.gridy = 1;
		frame.getContentPane().add(button3, g);
		
		JButton button4 = new JButton("Button 4");
		g.fill = GridBagConstraints.BOTH;
		g.gridwidth = 1;
		g.gridx = 2;
		g.gridy = 1;
		frame.getContentPane().add(button4, g);
	}

	private ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
}
