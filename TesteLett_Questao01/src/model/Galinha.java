package model;
import javax.swing.JOptionPane;

public class Galinha extends Ave{

	public Galinha(int idade, float tamanho, String corPenas) {
		super(idade, tamanho, corPenas);
	}
	
	@Override
	public void somEmitido() {
		int acao = JOptionPane.showConfirmDialog(null, "Escutar barulho da galinha?");
		if(acao == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Cacarejo!");
	}
}
