package model;

import javax.swing.JOptionPane;

public abstract class Bird extends Animal {

	private String feather;
		
	public String getFeather() {
		return feather;
	}

	public void setFeather(String feather) {
		this.feather = feather;
	}

	public void layEggs() {
		int action = JOptionPane.showConfirmDialog(null, "Botar ovos");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Botou!");
	};

	public Bird(int age, float size, String feather) {
		super(age, size);
		this.setFeather(feather);
	}
}
