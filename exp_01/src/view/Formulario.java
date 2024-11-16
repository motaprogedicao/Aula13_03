package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import business.Dado;
import business.Jogador;

public class Formulario {
	
	private JFrame form;
	private JTextField texto;
	private JButton button;
	Dado umDado = new Dado();
	Jogador jogadorA = new Jogador("Guilherme", 0);
	
	public Formulario() {
		InicializarComponentes();
	}
	
	private void InicializarComponentes() {
		
		form = new JFrame("Teste");
		form.setBounds(500, 250, 450, 280);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);
		Container painel = form.getContentPane();
		
		
		texto = new JTextField();
		texto.setBounds(130, 40, 70, 25);
		painel.add(texto);
		
		button= new JButton();
		button.setBounds(130,70, 70, 25);
	    button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jogadorA.jogue(umDado);
		}
	    });
	    
		painel.add(button);
		
		form.setVisible(true);		
	}
}
	
	
