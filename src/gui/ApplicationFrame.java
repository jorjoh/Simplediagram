package gui;

import controller.Controller;
import easylib.gui.Superframe;

import java.awt.event.ActionEvent;

public class ApplicationFrame extends Superframe  {

	private Centerpane centerpane = null;

	public ApplicationFrame() {
		Controller.init(this);
		setTitle("Figurer og forbindelser");
		add(centerpane = new Centerpane());
		setJMenuBar(new MenuController());
		setSize(900,580);
		setVisible(true);
	}

	public void about() {
		about("Diagram\nversjon 1.0");
	}
	
	public void insertFigure(ActionEvent e) {
		centerpane.insertFigure(e);
	}

	public void connect(ActionEvent object) {
		centerpane.connect(object);
	}

	public void setShadow(float d) {
		centerpane.setShadow(d);
	}

	public void deleteFigure(ActionEvent f) {
		centerpane.deleteFigure(f);
	}

	public void shadow(ActionEvent e) {
		centerpane.shadow(e);
	}

	public void storesvg() {
		centerpane.storesvg();
	}

	public void edtext(ActionEvent e) {
		centerpane.edtext(e);
	}

	public void finishConnection(Object e) {
		centerpane.finishConnection(e);
	}

}
