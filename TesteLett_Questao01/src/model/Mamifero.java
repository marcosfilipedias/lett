package model;

import javax.swing.JOptionPane;

public abstract class Mamifero extends Animal {

	private String corPelos;

	public String getCorPelos() {
		return corPelos;
	}

	public void setCorPelos(String corPelos) {
		this.corPelos = corPelos;
	}
	
	public void amamentar() {
		int acao = JOptionPane.showConfirmDialog(null, "Deseja amamentar?");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Animal amamentado");
	};

	public Mamifero(int idade, float tamanho, String corPelos) {
		super(idade, tamanho);
		this.setCorPelos(corPelos);
	}
}
