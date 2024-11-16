package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Formulario implements ActionListener {

	private JFrame form;
	private JPanel painel;
	private JLabel label, label2, label3, label4;
	private JTextField caixaDeTexto;
	private JTextField caixaDeTexto2;
	private JButton button;
	private JComboBox horario;
	private String texto, texto2;
	
	public Formulario() {
		
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		
		// instancia objeto do tipo JFrame
		form = new JFrame("Cadastrar cliente");
		// configura posição ("x" e "y") e tamanho ("width" e "height") 
		form.setBounds(400, 250, 500, 300);
		
		// define operação padrão que ocorre quando o formulário for fechado
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		form.setResizable(false);
		
		form.setLayout(new GridLayout(10, 1));
		
		button = new JButton("Cadastrar");
		button.setBounds(140, 190, 200, 70);
		button.setFont(new Font("Arial", Font.BOLD, 15));
		button.setForeground(null);
		button.setBackground(null);
		form.add(button);
		
		label= new JLabel("Nome:",SwingConstants.LEFT);
		label.setPreferredSize(new Dimension(50,50));
		label.setFont(new Font("Arial", Font.BOLD, 5));
		form.add(label);
		
		caixaDeTexto = new JTextField();
		caixaDeTexto.setBounds(200,190,100,30);
		form.add(caixaDeTexto);
		

		 label2= new JLabel("Data:",SwingConstants.LEFT);
		 label.setBounds(1,1,200,70);
		 label.setPreferredSize(new Dimension(200,50));
	     label.setFont(new Font("Arial", Font.BOLD, 20));
	     form.add(label2);
	     
		caixaDeTexto2 = new JTextField();
		caixaDeTexto2.setBounds(200,250,100,30);
		form.add(caixaDeTexto2);
		
	     label3 = new JLabel("Horário:",SwingConstants.LEFT);
	     label.setBounds(1,1,200,70);
		 label.setPreferredSize(new Dimension(200,50));
		 label.setFont(new Font("Arial", Font.BOLD, 20));
		 form.add(label3);
		 
		 horario= new JComboBox();
		 horario.setEditable(true);
		 form.add(horario);
		 
		 horario.addItem("14:00h");
		 horario.addItem("15:00h");
		 horario.addItem("16:00h");
		 horario.addItem("17:00h");
		 horario.addItem("18:00h");
		 
		 
		 button.addActionListener(this);

		 
		 form.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		texto = caixaDeTexto.getText();
		texto2 = caixaDeTexto2.getText();
		System.out.println(horario.getSelectedItem());
		System.out.println(texto);
		System.out.println(texto2);
		JOptionPane.showMessageDialog(null,"Cadastro confirmado","Status de cadastro",JOptionPane.INFORMATION_MESSAGE);
	}
	
}

















