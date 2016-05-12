package uml.model;


import figure.graphics.ComponentLineElement;
import figure.graphics.EllipseElement;
import figure.graphics.TextElement;
import figure.model.Figuremodel;

import java.awt.*;

/**
 * Created by Jørgen Johansen on 28.04.2016.
 */
public class Component extends Figuremodel {

	public Component(int x, int y) {
		figureName = "Component";
		start = new Point(x, y);
		reference = new Point(150, 180);
		virtual = new Dimension(200, 200);

		Point outsideLeft = new Point(50, 800);
		Point outsideRight = new Point(900, 200);

		Point bottomHorizontal = new Point(900, 800);
		Point topHorizontal = new Point(900, 200);

		Point topLeftVertical = new Point(350,200);
		Point topRightVertical = new Point(650,200);
		Point bottomVertical = new Point(500,910);

		Point componentLeft = new Point(800, 300);
		Point componentRight = new Point(870, 300);
		Point componentBottom = new Point(800, 500);
		Point componentTop = new Point(800, 300);

		Point smallTopComponentLeft = new Point(830, 350);
		Point smallTopComponentRight = new Point(770, 350);
		Point smallTopComponentBottom = new Point(770, 380);
		Point smallTopComponentTop = new Point(770, 350);

		Point smallBottomComponentLeft = new Point(830, 430);
		Point smallBottomComponentRight = new Point(770, 430);
		Point smallBottomComponentBottom = new Point(770, 430);
		Point smallBottomComponentTop = new Point(770, 400);

		elements.add(new ComponentLineElement(outsideLeft, new Point(50, 200), Hold.TRACE));
		elements.add(new ComponentLineElement(outsideRight, new Point(900, 800), Hold.TRACE));
		elements.add(new ComponentLineElement(bottomHorizontal, new Point(50, 800), Hold.NONE));
		elements.add(new ComponentLineElement(topHorizontal, new Point(50, 200), Hold.NONE));

		elements.add(new ComponentLineElement(topLeftVertical, new Point(350, 110), Hold.NONE));
		elements.add(new ComponentLineElement(topRightVertical, new Point(650, 110), Hold.NONE));

		elements.add(new ComponentLineElement(bottomVertical, new Point(500, 800), Hold.NONE));
		elements.add(new EllipseElement(new Point(350, 100), new Point(70, 90), Hold.TRACE));
		elements.add(new EllipseElement(new Point(650, 100), new Point(70, 90), Hold.TRACE));
		elements.add(new EllipseElement(new Point(500, 1010), new Point(70, 90), Hold.NONE));

		elements.add(new ComponentLineElement(componentLeft,new Point(800,500),Hold.NONE));
		elements.add(new ComponentLineElement(componentRight,new Point(870,500),Hold.NONE));
		elements.add(new ComponentLineElement(componentBottom,new Point(870,500),Hold.NONE));
		elements.add(new ComponentLineElement(componentTop,new Point(870,300),Hold.NONE));

		elements.add(new ComponentLineElement(smallTopComponentLeft,new Point(830,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallTopComponentRight,new Point(770,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallTopComponentBottom,new Point(830,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallTopComponentTop,new Point(830,350),Hold.NONE));

		elements.add(new ComponentLineElement(smallBottomComponentLeft,new Point(830,400),Hold.NONE));
		elements.add(new ComponentLineElement(smallBottomComponentRight,new Point(770,400),Hold.NONE));
		elements.add(new ComponentLineElement(smallBottomComponentBottom,new Point(830,430),Hold.NONE));
		elements.add(new ComponentLineElement(smallBottomComponentTop,new Point(830,400),Hold.NONE));

		elements.add(new TextElement("Component", LabelAlign.CENTER));
	}

	protected Figuremodel instance(int x, int y) {
		return new Component(x, y);
	}

}
