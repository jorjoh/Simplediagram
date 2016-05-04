package uml.model;

import figure.graphics.NodeLineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 24.04.2016.
 */
public class Node extends Figuremodel{

	public Node(int x, int y) {
		figureName = "Node";
		start = new Point(x, y);
		reference = new Point(500, 180);
		virtual = new Dimension(200, 200);

		Point frontvenstreside = new Point(50, 800);
		Point overbunn = new Point(50, 200);
		Point fronthoyreside = new Point(500, 800);
		Point frontbunn = new Point(500, 800);
		Point toppvenstre = new Point(50, 200);
		Point overtopp = new Point(150, 30);
		Point topphoyre = new Point(500, 200);
		Point sidebunn = new Point(500, 800);
		Point sidehoyre = new Point(600, 30);

		/**Framsiden av noden**/
		//Front Venstreside
		elements.add(new NodeLineElement(frontvenstreside, new Point(50, 200), Hold.TRACE));
//		//Front høyreside
		elements.add(new NodeLineElement(fronthoyreside, new Point(500,200), Hold.NONE));
//		//Hoved Bunn
		elements.add(new NodeLineElement(frontbunn, new Point(50,800), Hold.TRACE));
//		//Hoved BunnSide
		elements.add(new NodeLineElement(sidebunn, new Point(600,560),Hold.NONE));
//		//Hoved kanten høyreside
		elements.add(new NodeLineElement(sidehoyre, new Point(600,560),Hold.TRACE));
//		/**Slutt på framsiden av noden**/
//
//		/** Øverste del av noden **/
//		// venstreside
		elements.add(new NodeLineElement(toppvenstre, new Point(150, 30), Hold.NONE));
//		// Øverhoyreside
		elements.add(new NodeLineElement(topphoyre, new Point(600, 30), Hold.NONE));
//		// Øvretopp
		elements.add(new NodeLineElement(overtopp, new Point(600, 30), Hold.TRACE));
//		//Øvrebunn
		elements.add(new NodeLineElement(overbunn, new Point(500, 200), Hold.NONE));
//		/** Slutt på øverste del av node**/

		elements.add(new TextElement("Node", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Node(x, y);
	}

}
