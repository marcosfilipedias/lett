package model;
import javax.swing.JOptionPane;

public class Morcego extends Mamifero{
	
	public Morcego(int idade, float tamanho, String corPelos) {
		super(idade, tamanho, corPelos);
	}

	@Override
	public void somEmitido() {
		int acao = JOptionPane.showConfirmDialog(null, "Escutar barulho do morcego");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "farfalho");
	}

	public void voar() {
		int acao = JOptionPane.showConfirmDialog(null, "Deixar o morcego voar?");
		if(acao == JOptionPane.YES_OPTION) {
			int metros = Integer.parseInt(JOptionPane.showInputDialog("A qual altura o morcego vooa"));
			JOptionPane.showMessageDialog(null, "O morcego voou "+metros+"m");
		}
	}
}
