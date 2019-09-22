package model;

import javax.swing.JOptionPane;

public abstract class Ave extends Animal {

	private String corPenas;

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	
	public void botarOvos() {
		int acao = JOptionPane.showConfirmDialog(null, "Botar ovos");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Botou!");
	};

	public Ave(int idade, float tamanho, String corPenas) {
		super(idade, tamanho);
		this.setCorPenas(corPenas);
	}
}
