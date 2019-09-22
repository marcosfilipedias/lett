package model;

import javax.swing.JOptionPane;

public class Vaca extends Mamifero{

	public Vaca(int idade, float tamanho, String corPelos) {
		super(idade, tamanho, corPelos);
	}

	@Override
	public void somEmitido() {
		int acao = JOptionPane.showConfirmDialog(null, "Escutar barulho da vaca");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Mugido!");
	}
}
