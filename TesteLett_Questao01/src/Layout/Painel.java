package Layout;
import java.awt.event.*;
import javax.swing.*;
import model.*;

public class Painel extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton cowBtn = new JButton("Vaca");
	JButton batBtn = new JButton("Morcego");
	JButton duckBtn = new JButton("Pato");
	JButton chickenBtn = new JButton("Galinha");
		
	private static String cor() {
		String cor = JOptionPane.showInputDialog("Qual a cor do animal");
		return cor;
	}
	private static float tamanho() {
		float tamanho = Float.parseFloat(JOptionPane.showInputDialog("Qual o tamanho do animal?"));
		return tamanho;
	}
	private static int idade() {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do animal?"));
		return idade;
	}
	
	public Painel() {
		setTitle("Animais");
		setSize(460, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		cowBtn.setBounds(10,10,100,30);
		batBtn.setBounds(120,10,100,30);
		duckBtn.setBounds(230,10,100,30);
		chickenBtn.setBounds(340,10,100,30);
		
		cowBtn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				Cow cow = new Cow(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Vaca\nIdade: "+cow.getAge()+"\nTamanho: "+cow.getSize()+"m" + "\nCor dos pelos: "+cow.getColor());
				cow.breastfeed();
				cow.song();
			}
		});
		batBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Bat bat = new Bat(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Morcego\nIdade: "+bat.getAge()+"\nTamanho: "+bat.getSize()+"m" + "\nCor dos pelos: "+bat.getColor());
				bat.breastfeed();;
				bat.fly();
				bat.song();
			}
		});
		duckBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Duck duck = new Duck(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Pato\nIdade: "+duck.getAge()+"\nTamanho: "+duck.getSize()+"m" + "\nCor das penas: "+duck.getFeather());
				duck.fly();
				duck.layEggs();
				duck.song();
			}
		});
		chickenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Chicken chicken = new Chicken(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Galinha\nIdade: "+chicken.getAge()+"\nTamanho: "+chicken.getSize()+"m" + "\nCor das penas: "+chicken.getFeather());
				chicken.layEggs();
				chicken.song();
			}
		});
		
		add(cowBtn);
		add(batBtn);
		add(duckBtn);
		add(chickenBtn);
	}
}
