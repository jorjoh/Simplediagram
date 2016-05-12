package uml.model;

import figure.graphics.ClassSymbolLineElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

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

			elements.add(new ClassSymbolLineElement(left, new Point(150, 100), Hold.TRACE));
			elements.add(new ClassSymbolLineElement(right, new Point(700, 700), Hold.TRACE));
			elements.add(new ClassSymbolLineElement(bottom, new Point(150, 700), Hold.TRACE));
			elements.add(new ClassSymbolLineElement(top, new Point(150, 100), Hold.TRACE));

			elements.add(new TextElement("ClassSymbol", LabelAlign.BOTTOM));
		}

		protected Figuremodel instance(int x, int y) {
			return new ClassSymbol(x, y);
		}

	}