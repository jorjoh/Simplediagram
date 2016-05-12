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
			figureName = "ClassSymbol";
			start = new Point(x, y);
			reference = new Point(500, 180);
			virtual = new Dimension(150, 150);

			Point left = new Point(150, 700);
			Point right = new Point(700, 100);
			Point bottom = new Point(700, 700);
			Point top = new Point(700, 100);

			elements.add(new SquareElement(left, new Point(150, 100), Hold.TRACE));
			elements.add(new SquareElement(right, new Point(700, 700), Hold.TRACE));
			elements.add(new SquareElement(bottom, new Point(150, 700), Hold.TRACE));
			elements.add(new SquareElement(top, new Point(150, 100), Hold.TRACE));

			elements.add(new TextElement("ClassSymbol", LabelAlign.BOTTOM));
		}

		protected Figuremodel instance(int x, int y) {
			return new ClassSymbol(x, y);
		}

	}