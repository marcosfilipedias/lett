package Layout;
import java.awt.event.*;
import javax.swing.*;
import model.*;

public class Painel extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton vacaBtn = new JButton("Vaca");
	JButton morcegoBtn = new JButton("Morcego");
	JButton patoBtn = new JButton("Pato");
	JButton galinhaBtn = new JButton("Galinha");
	JButton vacaAmamentar = new JButton("vaca Amamentar");
	JButton morcegoAmamentar = new JButton("morcego Amamentar");
		
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
		vacaBtn.setBounds(10,10,100,30);
		morcegoBtn.setBounds(120,10,100,30);
		patoBtn.setBounds(230,10,100,30);
		galinhaBtn.setBounds(340,10,100,30);
		
		vacaBtn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				Vaca vaca = new Vaca(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Vaca\nIdade: "+vaca.getIdade()+"\nTamanho: "+vaca.getTamanho()+"m" + "\nCor dos pelos: "+vaca.getCorPelos());
				vaca.amamentar();
				vaca.somEmitido();
			}
		});
		morcegoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Morcego morcego = new Morcego(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Morcego\nIdade: "+morcego.getIdade()+"\nTamanho: "+morcego.getTamanho()+"m" + "\nCor dos pelos: "+morcego.getCorPelos());
				morcego.amamentar();
				morcego.voar();
				morcego.somEmitido();
			}
		});
		patoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Pato pato = new Pato(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Pato\nIdade: "+pato.getIdade()+"\nTamanho: "+pato.getTamanho()+"m" + "\nCor das penas: "+pato.getCorPenas());
				pato.voar();
				pato.botarOvos();
				pato.somEmitido();
			}
		});
		galinhaBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Galinha galinha = new Galinha(Painel.idade(),Painel.tamanho(),Painel.cor());
				JOptionPane.showMessageDialog(null, "Galinha\nIdade: "+galinha.getIdade()+"\nTamanho: "+galinha.getTamanho()+"m" + "\nCor das penas: "+galinha.getCorPenas());
				galinha.botarOvos();
				galinha.somEmitido();
			}
		});
		
		add(vacaBtn);
		add(morcegoBtn);
		add(patoBtn);
		add(galinhaBtn);
	}
}
