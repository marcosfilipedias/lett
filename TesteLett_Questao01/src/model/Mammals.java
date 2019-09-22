package model;

import javax.swing.JOptionPane;

public abstract class Mammals extends Animal {

	private String color;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void breastfeed() {
		int action = JOptionPane.showConfirmDialog(null, "Deseja amamentar?");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Animal amamentado");
	};

	public Mammals(int age, float size, String color) {
		super(age, size);
		this.setColor(color);
	}
}
