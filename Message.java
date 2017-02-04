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

public class Message {
	    private final boolean encrypted;
	    private final String message;
	 
	    
	    /**
	     * Default constructor
	     */
	    public Message() {
	        message = "";
	   
	        encrypted = false;
	    }
	    
	    /**
	     * Constructor with a given String parameter
	     */
	    public Message(JTextField message) {
	       this.message = message.getText();
	     
	       encrypted = false;
	    }
	    
	    /**
	     * Constructor with a given String and boolean input
	     */
	    public Message(String message, boolean encrypted) {
	        this.message = message;
	        
	        this.encrypted = encrypted;
	    }
	    
	    public Message(String message) {
	        this.message = message;
	        encrypted = false; 
	    }
	  
	    
	    
	 
	    /**
	     * Accessor method to return message reference
	     */
	    public String getMessage() {
	        return message;
	    }
	    
	    /**
	     * Accessor method to return message as a String
	     */
	    public String toString() {
	        return message;
	    }
	    
	    /**
	     * Boolean method to determine if the message is encrypted
	     */
	    public boolean isEncrypted() {
	        return encrypted;
	    }
	    
	   
	    
	}


