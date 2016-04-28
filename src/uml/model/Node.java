package uml.model;

import figure.graphics.LineElement;
import figure.graphics.SquareElement;
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

		/**Start punkter for øverste del av noden**/
		Point venstre = new Point(340, 110);
		Point ovrehoyreside = new Point(750, 100);
		Point overtopp = new Point(730, 100);
		Point overbunn = new Point(600, 250);
		virtual = new Dimension(150, 150);
		/**Slutt på startpunkter på øverste del av noden**/

		/**Startpunkter for frontdelen av noden**/
		Point mainVenstre = new Point(200,250);
		Point mainHoyre = new Point(600,250);
		Point mainBunn = new Point(600,560);
		Point mainBunnSide= new Point(750,450);
		Point mainKantHoyreSide= new Point(750,120);
		/**Slutt får start punkter for fronten**/

		/** Øverste del av noden **/
		// venstreside
		elements.add(new LineElement(venstre, new Point(200, 250), Hold.NONE));
		// Øverhoyreside
		elements.add(new LineElement(ovrehoyreside, new Point(600, 250), Hold.NONE));
		// Øvretopp
		elements.add(new LineElement(overtopp, new Point(340, 100), Hold.TRACE));
		//Øvrebunn
		elements.add(new LineElement(overbunn, new Point(200, 250), Hold.NONE));
		/** Slutt på øverste del av node**/
		/**Framsiden av noden**/
		//Hoved Venstreside
		elements.add(new LineElement(mainVenstre, new Point(200,560), Hold.TRACE));
		//Hoved Høyreside
		elements.add(new LineElement(mainHoyre, new Point(600,560), Hold.NONE));
		//Hoved Bunn
		elements.add(new LineElement(mainBunn, new Point(210,560),Hold.TRACE));
		//Hoved BunnSide
		elements.add(new LineElement(mainBunnSide, new Point(610,560),Hold.NONE));
		//Hoved kanten høyreside
		elements.add(new LineElement(mainKantHoyreSide, new Point(750,450),Hold.TRACE));
		/**Slutt på framsiden av noden**/



		elements.add(new TextElement("Node", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new Node(x, y);
	}
}
