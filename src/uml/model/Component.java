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

		Point venstre = new Point(50, 800);
		Point hoyreside = new Point(900, 200);

		Point bunn = new Point(900, 800);
		Point topp = new Point(900, 200);

		Point strek1 = new Point(350,200);
		Point strek2 = new Point(650,200);
		Point strek3under = new Point(500,910);

		Point compvenstre = new Point(800, 300);
		Point comphoyre = new Point(870, 300);
		Point compbunn = new Point(800, 500);
		Point comptopp = new Point(800, 300);

		Point smallcompvenstre = new Point(830, 350);
		Point smallcomphoyre = new Point(770, 350);
		Point smallcompbunn = new Point(770, 380);
		Point smallcomptopp = new Point(770, 350);

		Point smallcomp2venstre = new Point(830, 430);
		Point smallcomp2hoyre = new Point(770, 430);
		Point smallcomp2bunn = new Point(770, 430);
		Point smallcomp2topp = new Point(770, 400);


		virtual = new Dimension(200, 200);

		elements.add(new ComponentLineElement(venstre, new Point(50, 200), Hold.TRACE));
		elements.add(new ComponentLineElement(hoyreside, new Point(900, 800), Hold.TRACE));
		elements.add(new ComponentLineElement(bunn, new Point(50, 800), Hold.NONE));
		elements.add(new ComponentLineElement(topp, new Point(50, 200), Hold.NONE));

		elements.add(new ComponentLineElement(strek1, new Point(350, 110), Hold.NONE));
		elements.add(new ComponentLineElement(strek2, new Point(650, 110), Hold.NONE));

		elements.add(new ComponentLineElement(strek3under, new Point(500, 800), Hold.NONE));
		elements.add(new EllipseElement(new Point(350, 100), new Point(70, 90), Hold.TRACE));
		elements.add(new EllipseElement(new Point(650, 100), new Point(70, 90), Hold.TRACE));
		elements.add(new EllipseElement(new Point(500, 1010), new Point(70, 90), Hold.NONE));

		elements.add(new ComponentLineElement(compvenstre,new Point(800,500),Hold.NONE));
		elements.add(new ComponentLineElement(comphoyre,new Point(870,500),Hold.NONE));
		elements.add(new ComponentLineElement(compbunn,new Point(870,500),Hold.NONE));
		elements.add(new ComponentLineElement(comptopp,new Point(870,300),Hold.NONE));

		elements.add(new ComponentLineElement(smallcompvenstre,new Point(830,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallcomphoyre,new Point(770,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallcompbunn,new Point(830,380),Hold.NONE));
		elements.add(new ComponentLineElement(smallcomptopp,new Point(830,350),Hold.NONE));

		elements.add(new ComponentLineElement(smallcomp2venstre,new Point(830,400),Hold.NONE));
		elements.add(new ComponentLineElement(smallcomp2hoyre,new Point(770,400),Hold.NONE));
		elements.add(new ComponentLineElement(smallcomp2bunn,new Point(830,430),Hold.NONE));
		elements.add(new ComponentLineElement(smallcomp2topp,new Point(830,400),Hold.NONE));

		elements.add(new TextElement("Component", LabelAlign.CENTER));
	}

	protected Figuremodel instance(int x, int y) {
		return new Component(x, y);
	}

}
