package uml.model;

import figure.graphics.LineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 24.04.2016.
 */
public class Node extends Figuremodel{

	public Node(int x, int y) {
		figureName = "Actor";
		start = new Point(x, y);
		reference = new Point(500, 180);

		Point nedrevenstre = new Point(450, 650);
		Point ovrehoyreside = new Point(450, 100);

		Point ovrevenstre = new Point(450, 100);
		Point nedrehoyre = new Point(650, 380);

		virtual = new Dimension(200, 200);

		// Ovre venstreside
		elements.add(new LineElement(nedrevenstre, new Point(200, 350), Hold.NONE));

		// Ovre hoyreside
		elements.add(new LineElement(ovrehoyreside, new Point(654, 385), Hold.TRACE));

		// Øvre venstreside
		elements.add(new LineElement(ovrevenstre, new Point(200, 350), Hold.NONE));

		// Nedre høyreside
		elements.add(new LineElement(nedrehoyre, new Point(450, 650), Hold.NONE));

		elements.add(new TextElement("Node", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Node(x, y);
	}
}