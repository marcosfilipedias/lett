package model;

import javax.swing.JOptionPane;

public class Cow extends Mammals{

	public Cow(int age, float size, String color) {
		super(age, size, color);
	}

	@Override
	public void song() {
		int action = JOptionPane.showConfirmDialog(null, "Escutar barulho da vaca");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Mugido!");
	}
}
