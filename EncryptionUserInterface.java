package EncryptionProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EncryptionUserInterface {

	private JFrame frmPsbEncryptionTool;
	private JTextField txtEnterYourMessage;
	private JTextField txtYourEncryptedMessage;
	private JTextField txtEnterYourMessage_1;
	private JTextField txtYourDecryptedMessage;

	/**
	 * Launch the application.
	 */
	public JTextField getEncryptingMessage()
	{
	return txtEnterYourMessage; 
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncryptionUserInterface window = new EncryptionUserInterface();
					window.frmPsbEncryptionTool.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EncryptionUserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPsbEncryptionTool = new JFrame();
		frmPsbEncryptionTool.getContentPane().setForeground(new Color(0, 0, 0));
		frmPsbEncryptionTool.getContentPane().setBackground(new Color(224, 255, 255));
		frmPsbEncryptionTool.setBackground(SystemColor.textHighlight);
		frmPsbEncryptionTool.setTitle("PSB Encryption Tool");
		frmPsbEncryptionTool.setBounds(100, 100, 450, 300);
		frmPsbEncryptionTool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPsbEncryptionTool.getContentPane().setLayout(null);
		
		JLabel lblPsbEncryptionTool = new JLabel("PSB Encryption Tool");
		lblPsbEncryptionTool.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblPsbEncryptionTool.setBounds(52, -12, 351, 66);
		lblPsbEncryptionTool.setBackground(Color.ORANGE);
		frmPsbEncryptionTool.getContentPane().add(lblPsbEncryptionTool);
		
		txtEnterYourMessage = new JTextField();
		txtEnterYourMessage.setText("Enter your message here");
		txtEnterYourMessage.setBounds(12, 56, 153, 22);
		frmPsbEncryptionTool.getContentPane().add(txtEnterYourMessage);
		txtEnterYourMessage.setColumns(10);
		
		txtYourEncryptedMessage = new JTextField();
		txtYourEncryptedMessage.setEditable(false);
		txtYourEncryptedMessage.setText("Your encrypted message will appear here");
		txtYourEncryptedMessage.setBounds(12, 91, 262, 22);
		frmPsbEncryptionTool.getContentPane().add(txtYourEncryptedMessage);
		txtYourEncryptedMessage.setColumns(10);
		
		txtEnterYourMessage_1 = new JTextField();
		txtEnterYourMessage_1.setText("Enter your message here");
		txtEnterYourMessage_1.setBounds(12, 163, 153, 22);
		frmPsbEncryptionTool.getContentPane().add(txtEnterYourMessage_1);
		txtEnterYourMessage_1.setColumns(10);
		
		txtYourDecryptedMessage = new JTextField();
		txtYourDecryptedMessage.setText("Your decrypted message will appear here");
		txtYourDecryptedMessage.setEditable(false);
		txtYourDecryptedMessage.setBounds(12, 198, 262, 22);
		frmPsbEncryptionTool.getContentPane().add(txtYourDecryptedMessage);
		txtYourDecryptedMessage.setColumns(10);
		
		Button button = new Button("Encrypt");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Message m = new Message(txtEnterYourMessage);
				EncryptDecrypt d = new EncryptDecrypt();
				String encryptified;
				encryptified = d.Encrypt(m.getMessage());
				txtYourEncryptedMessage.setText(encryptified); 		  
			 	
			}
		});
				
		button.setBounds(176, 54, 98, 24);
		frmPsbEncryptionTool.getContentPane().add(button);
	
		
		Button button_1 = new Button("Decrypt");
		button_1.setBackground(new Color(127, 255, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//	Message m = new Message(txtEnterYourMessage_1);
		//	EncryptDecrypt dd = new EncryptDecrypt();
			String decryptified;
		//	decryptified = dd.Decrypt(m.getMessage());
			decryptified = txtEnterYourMessage.getText();  
			  txtYourDecryptedMessage.setText(decryptified);
			}
		});
		
		
		
		
		button_1.setBounds(176, 163, 98, 24);
		frmPsbEncryptionTool.getContentPane().add(button_1);
	}
}
