package uml.model;

import figure.graphics.TabLineElement;
import figure.model.Figuremodel;

import java.awt.*;

public class Tab extends Figuremodel {

	public Tab(int x, int y) {
		start = new Point(x, y);
		reference = new Point(500, 180);
		virtual = new Dimension(150, 150);

		Point left = new Point(130, 200);
		Point right = new Point(450, 100);
		Point bottom = new Point(450, 200);
		Point top = new Point(450, 100);

		elements.add(new TabLineElement(left, new Point(130, 100), Hold.TRACE));
		elements.add(new TabLineElement(right, new Point(450, 200), Hold.TRACE));
		elements.add(new TabLineElement(bottom, new Point(150, 200), Hold.NONE));
		elements.add(new TabLineElement(top, new Point(150, 100), Hold.TRACE));
	}

	protected Figuremodel instance(int x, int y) {
		return new Tab(x, y);
	}

}
