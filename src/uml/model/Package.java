package uml.model;

import figure.graphics.*;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 28.04.2016.
 */
public class Package extends Figuremodel {

	public Package(int x, int y) {
		figureName = "Package";
		start = new Point(x, y);
		reference = new Point(500, 180);

		Point venstre = new Point(130, 800);
		Point hoyreside = new Point(900, 200);

		Point bunn = new Point(900, 800);
		Point topp = new Point(900, 200);
		virtual = new Dimension(150, 150);

		// venstreside
		elements.add(new LineElement(venstre, new Point(130, 200), Hold.FRONT));
		// hoyreside
		elements.add(new LineElement(hoyreside, new Point(900, 800), Hold.FRONT));
		// bunn
		elements.add(new LineElement(bunn, new Point(150, 800), Hold.FRONT));
		// topp
		elements.add(new LineElement(topp, new Point(150, 200), Hold.FRONT));

		elements.add(new TextElement("Package", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Package(x, y);
	}
}
