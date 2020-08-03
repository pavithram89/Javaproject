package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class LoginFrame extends JFrame{
		JLabel lTitle, lUser,lPassword,lMessage,lRole;
		JTextField tUser;
		JPasswordField tPassword;
		JComboBox c1;
		JButton bLogin,bRegistration;
		public LoginFrame() {
			lTitle=new JLabel("Login Here");
			lTitle.setBounds(180, 20, 150, 25);
			
			lUser=new JLabel("User Id");
			lUser.setBounds(50, 80, 150, 25);
			tUser=new JTextField();
			tUser.setBounds(200, 80, 150, 25);
			
			lPassword=new JLabel("Password");
			lPassword.setBounds(50, 160, 150, 25);
			tPassword=new JPasswordField();
			tPassword.setBounds(200, 160, 150, 25);
			tPassword.setEchoChar('*');
			
			String[] values= {"NA","EMP","HR","PM"};
			lRole=new JLabel("Role");
			lRole.setBounds(50,200,150,25);
		    c1=new JComboBox (values);
			c1.setBounds(200,200,150,25);
			
			
			bLogin=new JButton("Login");
			bLogin.setBounds(120, 250,150, 25);
			bLogin.addActionListener((ActionListener) this);
			
			bRegistration=new JButton("Registration");
			bRegistration.setBounds(300, 250,150, 25);
			bRegistration.addActionListener((ActionListener) this);
			
			lMessage=new JLabel();
			lMessage.setBounds(120, 320, 320, 25);
			
			add(lTitle);
			add(lUser);
			add(lPassword);
			add(tUser);
			add(tPassword);
			add(bLogin);
			add(lMessage);
			add(lRole);
			add(c1);
			add(bRegistration);
			
			setSize(500,400);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		


	}
