package uml.model;

import figure.graphics.SquareElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 26.04.2016.
 */
public class ClassSymbol extends Figuremodel {

		// Figuren plasseres p� en virtuell flate p� 1000X1000
		// Figurens m�l er innenfor en ny virtuell flate p� 1000X1000
		// Alle posisjoner og st�rrelser er i virtuelle m�l

		public ClassSymbol(int x, int y) {
			figureName = "Actor";
			start = new Point(x, y);
			reference = new Point(500, 180);

			Point venstre = new Point(150, 700);
			Point hoyreside = new Point(700, 100);

			Point bunn = new Point(700, 700);
			Point topp = new Point(700, 100);
			virtual = new Dimension(200, 200);

			// venstreside
			elements.add(new SquareElement(venstre, new Point(150, 100), Hold.TRACE));
			// hoyreside
			elements.add(new SquareElement(hoyreside, new Point(700, 700), Hold.TRACE));
			// bunn
			elements.add(new SquareElement(bunn, new Point(150, 700), Hold.TRACE));
			// topp
			elements.add(new SquareElement(topp, new Point(150, 100), Hold.TRACE));

			elements.add(new TextElement("ClassSymbol", LabelAlign.BOTTOM));
		}

		protected Figuremodel instance(int x, int y) {
			return new ClassSymbol(x, y);
		}

	}




