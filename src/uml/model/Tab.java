package uml.model;

import figure.graphics.TabLineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 28.04.2016.
 */
public class Tab extends Package {

	public Tab(int x, int y) {
		super(x,y);
		figureName = "Package";
		start = new Point(x, y);
		reference = new Point(500, 180);

		Point venstre = new Point(130, 200);
		Point hoyreside = new Point(450, 100);

		Point bunn = new Point(450, 200);
		Point topp = new Point(450, 100);
		virtual = new Dimension(150, 150);

		elements.add(new TabLineElement(venstre, new Point(130, 100), Hold.TRACE));
		elements.add(new TabLineElement(hoyreside, new Point(450, 200), Hold.TRACE));
		elements.add(new TabLineElement(bunn, new Point(150, 200), Hold.NONE));
		elements.add(new TabLineElement(topp, new Point(150, 100), Hold.TRACE));

		elements.add(new TextElement("", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Tab(x, y);
	}

}
