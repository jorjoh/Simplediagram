package uml.model;

import figure.graphics.LineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 24.04.2016.
 */
public class ClassSymbol extends Figuremodel {

	// Figuren plasseres p� en virtuell flate p� 1000X1000
	// Figurens m�l er innenfor en ny virtuell flate p� 1000X1000
	// Alle posisjoner og st�rrelser er i virtuelle m�l

	public ClassSymbol(int x, int y) {
		figureName = "Actor";
		start = new Point(x, y);
		reference = new Point(500, 180);
		Point arm = new Point(500, 220);
		Point venstre = new Point(150, 700);
		Point bunn = new Point(700, 700);
		Point hoyreside = new Point(700, 100);
		Point topp = new Point(700, 100);
		virtual = new Dimension(200, 200);


		// venstreside
		elements.add(new LineElement(venstre, new Point(150, 100), Hold.END));
		// bunn
		elements.add(new LineElement(bunn, new Point(150, 700), Hold.NONE));
		// hoyreside
		elements.add(new LineElement(hoyreside, new Point(700, 700), Hold.END));
		// topp
		elements.add(new LineElement(topp, new Point(150, 100), Hold.NONE));

		// venstre bein
		//elements.add(new LineElement(side2, new Point(100, 700), Hold.NONE));
		// h�yre bein
		//elements.add(new LineElement(side2, new Point(100, 700), Hold.NONE));

		elements.add(new TextElement("ClassSymbol", LabelAlign.BOTTOM));
	}

	protected Figuremodel instance(int x, int y) {
		return new ClassSymbol(x, y);
	}

}

