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

		/**Startpunkter for frontdelen av noden**/
		Point frontvenstreside = new Point(200,250);
		Point fronthoyreside = new Point(600,250);
		Point frontbunn = new Point(600,560);
		Point sidebunn= new Point(750,450);
		Point sidehoyre= new Point(750,120);
		/**Slutt får start punkter for fronten**/

		/**Start punkter for øverste del av noden**/
		Point toppvenstre = new Point(340, 110);
		Point topphoyre = new Point(750, 100);
		Point overtopp = new Point(730, 100);
		Point overbunn = new Point(600, 250);
		virtual = new Dimension(150, 150);
		/**Slutt på startpunkter på øverste del av noden**/

		/**Framsiden av noden**/
		//Front Venstreside
		elements.add(new NodeLineElement(frontvenstreside, new Point(200,560), Hold.TRACE));
		//Front høyreside
		elements.add(new NodeLineElement(fronthoyreside, new Point(600,560), Hold.NONE));
		//Hoved Bunn
		elements.add(new NodeLineElement(frontbunn, new Point(210,560),Hold.TRACE));
		//Hoved BunnSide
		elements.add(new NodeLineElement(sidebunn, new Point(610,560),Hold.NONE));
		//Hoved kanten høyreside
		elements.add(new NodeLineElement(sidehoyre, new Point(750,450),Hold.TRACE));
		/**Slutt på framsiden av noden**/

		/** Øverste del av noden **/
		// venstreside
		elements.add(new NodeLineElement(toppvenstre, new Point(200, 250), Hold.NONE));
		// Øverhoyreside
		elements.add(new NodeLineElement(topphoyre, new Point(600, 250), Hold.NONE));
		// Øvretopp
		elements.add(new NodeLineElement(overtopp, new Point(340, 100), Hold.TRACE));
		//Øvrebunn
		elements.add(new NodeLineElement(overbunn, new Point(200, 250), Hold.NONE));
		/** Slutt på øverste del av node**/

		elements.add(new TextElement("Node", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Node(x, y);
	}

}
