package gui.domain;

import figure.graphics.Figure;
import figure.model.IFigure;
import svg.Svg;
import uml.graphics.Thing;
import uml.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionEvent;

public class Domainview extends JPanel implements IFigure {

	private Diagram diagram = new Diagram("Brukstilfeller og akt�rer");
	private Shadow sh = new Shadow();

	public Domainview() {
		setLayout(new BorderLayout());
		add(diagram);
		add(sh, BorderLayout.SOUTH);
		diagram.addFigure(new Actormodel(10, 10));
		diagram.addFigure(new Usecasemodel(10, 65));
		diagram.addFigure(new Business(10, 115));
		diagram.addFigure(new ClassSymbol(10,160));
		diagram.addFigure(new Node(10,245));
		diagram.addFigure(new Tab(10,330));
		diagram.addFigure(new uml.model.Component(10,420));
		setShadow(Shadows.LOW.f());
		setBackground(Color.WHITE);
	}
	
	private Figure figureSource(ActionEvent e) {
		Component c = (Component) e.getSource();
		JComponent jc = (JComponent) c.getParent();
		return (Figure) ((JPopupMenu) jc).getInvoker();
	}
	
	public void insertFigure(ActionEvent e) {
		diagram.addFigure(figureSource(e).newInstance());
		repaint();
	}

	public void connect(ActionEvent object) {
		diagram.connect((Thing) figureSource(object));
		repaint();
	}

	public void setShadow(float d) {
		diagram.setShadow(d);
	}

	public void deleteFigure(ActionEvent e) {
		diagram.deleteFigure(figureSource(e));
	}

	public void shadow(ActionEvent e) {
		sh.setVisible(((AbstractButton)e.getSource()).isSelected());		
	}

	public void storesvg() {
		new Svg().store(diagram);
	}
	
	public void edtext(ActionEvent e) {
		diagram.edtext((Thing) figureSource(e));
	}

	public void finishConnection(Object e) {
		diagram.finishConnection((Thing) e);
	}

}
