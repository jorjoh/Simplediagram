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
		virtual = new Dimension(150, 150);

		Point left = new Point(130, 800);
		Point right = new Point(900, 200);
		Point bottom = new Point(900, 800);
		Point top = new Point(900, 200);

		elements.add(new PackageLineElement(left, new Point(130, 200), Hold.TRACE));
		elements.add(new PackageLineElement(right, new Point(900, 800), Hold.TRACE));
		elements.add(new PackageLineElement(bottom, new Point(150, 800), Hold.TRACE));
		elements.add(new PackageLineElement(top, new Point(150, 200), Hold.NONE));

		elements.add(new TextElement("Package", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Package(x, y);
	}

}