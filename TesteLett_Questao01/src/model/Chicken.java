package model;
import javax.swing.JOptionPane;

public class Chicken extends Bird{

	public Chicken(int age, float size, String feather) {
		super(age, size, feather);
	}
	
	@Override
	public void song() {
		int action = JOptionPane.showConfirmDialog(null, "Escutar barulho da galinha?");
		if(action == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "Cacarejo!");
	}
}
