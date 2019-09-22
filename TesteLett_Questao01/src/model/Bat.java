package model;
import javax.swing.JOptionPane;

public class Bat extends Mammals{
	
	public Bat(int age, float size, String color) {
		super(age, size, color);
	}

	@Override
	public void song() {
		int action = JOptionPane.showConfirmDialog(null, "Escutar barulho do morcego");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "farfalho");
	}

	public void fly() {
		int action = JOptionPane.showConfirmDialog(null, "Deixar o morcego voar?");
		if(action == JOptionPane.YES_OPTION) {
			int h = Integer.parseInt(JOptionPane.showInputDialog("A qual altura o morcego vooa"));
			JOptionPane.showMessageDialog(null, "O morcego voou "+h+"m");
		}
	}
}
