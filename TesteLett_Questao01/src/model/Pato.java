package model;

import javax.swing.JOptionPane;

public class Pato extends Ave{

	public Pato(int idade, float tamanho, String corPenas) {
		super(idade, tamanho, corPenas);
	}

	@Override
	public void somEmitido() {
		int acao = JOptionPane.showConfirmDialog(null, "Escutar barulho do pato?");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Grasnido!");
	}

	public void voar() {
		int acao = JOptionPane.showConfirmDialog(null, "Deixar o pato voar?");
		if(acao == JOptionPane.YES_OPTION) {
			int metros = Integer.parseInt(JOptionPane.showInputDialog("A qual altura o pato vooa?"));
			JOptionPane.showMessageDialog(null, "O pato voou "+metros+"m");
		}
	}
}
