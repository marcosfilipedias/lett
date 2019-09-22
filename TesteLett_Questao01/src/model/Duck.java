package model;

import javax.swing.JOptionPane;

public class Duck extends Bird{

	public Duck(int age, float size, String feather) {
		super(age, size, feather);
	}

	@Override
	public void song() {
		int action = JOptionPane.showConfirmDialog(null, "Escutar barulho do pato?");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Grasnido!");
	}

	public void fly() {
		int action = JOptionPane.showConfirmDialog(null, "Deixar o pato voar?");
		if(action == JOptionPane.YES_OPTION) {
			int h = Integer.parseInt(JOptionPane.showInputDialog("A qual altura o pato vooa?"));
			JOptionPane.showMessageDialog(null, "O pato voou "+h+"m");
		}
	}
}
