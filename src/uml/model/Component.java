package uml.model;


import figure.graphics.ComponentLineElement;
import figure.graphics.EllipseElement;
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

		Point strek1 = new Point(350,200);
		Point strek2 = new Point(650,200);
		Point strek3under = new Point(500,910);
		virtual = new Dimension(500, 200);

		// venstreside
		elements.add(new ComponentLineElement(venstre, new Point(50, 200), Hold.TRACE));
		// hoyreside
		elements.add(new ComponentLineElement(hoyreside, new Point(900, 800), Hold.TRACE));
		// bunn
		elements.add(new ComponentLineElement(bunn, new Point(50, 800), Hold.NONE));
		// topp
		elements.add(new ComponentLineElement(topp, new Point(50, 200), Hold.NONE));

		// strek1
		elements.add(new ComponentLineElement(strek1, new Point(350, 110), Hold.NONE));
		// strek2
		elements.add(new ComponentLineElement(strek2, new Point(650, 110), Hold.NONE));
		//strek 3 under
		elements.add(new ComponentLineElement(strek3under, new Point(500, 800), Hold.NONE));

		elements.add(new EllipseElement(new Point(350, 100), new Point(70, 90),
				Hold.TRACE));
		elements.add(new EllipseElement(new Point(650, 100), new Point(70, 90),
				Hold.TRACE));
		elements.add(new EllipseElement(new Point(500, 1010), new Point(70, 90),
				Hold.NONE));
		elements.add(new TextElement("Component", LabelAlign.CENTER));
	}

	protected Figuremodel instance(int x, int y) {
		return new Component(x, y);
	}

}
