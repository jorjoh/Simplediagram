package uml.model;

import figure.graphics.LineElement;
import figure.graphics.SquareElement;
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

		// venstreside
		elements.add(new LineElement(venstre, new Point(130, 100), Hold.FRONT));
		// hoyreside
		elements.add(new LineElement(hoyreside, new Point(450, 200), Hold.FRONT));
		// bunn
		elements.add(new LineElement(bunn, new Point(150, 200), Hold.NONE));
		// topp
		elements.add(new LineElement(topp, new Point(150, 100), Hold.FRONT));

		elements.add(new TextElement("", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Tab(x, y);
	}

}
