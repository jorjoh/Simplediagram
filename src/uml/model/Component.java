package uml.model;

import figure.graphics.SquareElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 28.04.2016.
 */
public class Component extends Figuremodel {

	public Component(int x, int y) {
		figureName = "Component";
		start = new Point(x, y);
		reference = new Point(500, 180);

		Point venstre = new Point(50, 800);
		Point hoyreside = new Point(900, 200);

		Point bunn = new Point(900, 800);
		Point topp = new Point(900, 200);
		virtual = new Dimension(500, 150);

		// venstreside
		elements.add(new SquareElement(venstre, new Point(50, 200), Hold.TRACE));
		// hoyreside
		elements.add(new SquareElement(hoyreside, new Point(900, 800), Hold.TRACE));
		// bunn
		elements.add(new SquareElement(bunn, new Point(50, 800), Hold.TRACE));
		// topp
		elements.add(new SquareElement(topp, new Point(50, 200), Hold.TRACE));

		elements.add(new TextElement("Component", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Component(x, y);
	}



}
