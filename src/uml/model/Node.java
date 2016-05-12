package uml.model;

import figure.graphics.NodeLineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

public class Node extends Figuremodel{

	public Node(int x, int y) {
		figureName = "Node";
		start = new Point(x, y);
		reference = new Point(500, 180);
		virtual = new Dimension(200, 200);

		Point frontLeft = new Point(50, 800);
		Point frontRight = new Point(500, 800);
		Point frontBottom = new Point(500, 800);
		Point topLeft = new Point(50, 200);
		Point topHorizontal = new Point(150, 30);
		Point topRight = new Point(500, 200);
		Point topBottom = new Point(50, 200);
		Point sideRight = new Point(600, 30);
		Point sideBottom = new Point(500, 800);

		elements.add(new NodeLineElement(frontLeft, new Point(50, 200), Hold.TRACE));
		elements.add(new NodeLineElement(frontRight, new Point(500,200), Hold.NONE));
		elements.add(new NodeLineElement(frontBottom, new Point(50,800), Hold.TRACE));
		elements.add(new NodeLineElement(sideBottom, new Point(600,560),Hold.NONE));
		elements.add(new NodeLineElement(sideRight, new Point(600,560),Hold.TRACE));

		elements.add(new NodeLineElement(topLeft, new Point(150, 30), Hold.NONE));
		elements.add(new NodeLineElement(topRight, new Point(600, 30), Hold.NONE));
		elements.add(new NodeLineElement(topHorizontal, new Point(600, 30), Hold.TRACE));
		elements.add(new NodeLineElement(topBottom, new Point(500, 200), Hold.NONE));

		elements.add(new TextElement("Node", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Node(x, y);
	}

}
