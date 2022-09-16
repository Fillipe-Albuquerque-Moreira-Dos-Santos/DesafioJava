package br.com.senaibrasilia.projetoinicial;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;

	private JTextField usuario;
	private JPasswordField senha;
	private JLabel user, pass;

	public Login() {

		super("SENAI BRASILIA – JAVA");
		layout = new FlowLayout();
		container = getContentPane();

		user = new JLabel("Usuário: ");
		add(user);

		usuario = new JTextField(15);
		add(usuario);

		pass = new JLabel("Senha: ");
		add(pass);

		senha = new JPasswordField(15);
		add(senha);

		btnLogar = new JButton("Logar");
		add(btnLogar);
		setLayout(layout);
		btnLogar.addActionListener(this);
		setSize(800, 600);

	}

	public void actionPerformed(ActionEvent e) {

		if (user.getText().equals("123") && pass.getText().equals("123")) {

			JOptionPane.showMessageDialog(null, "Parabéns"  + user +  "você foi logado com sucesso");

		} else {
			JOptionPane.showMessageDialog(null, "errado");
		}

	}

}
