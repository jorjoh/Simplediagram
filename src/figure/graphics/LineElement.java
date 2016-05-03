package figure.graphics;

import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;

public class LineElement extends ConnectElement {

	public LineElement(Point a, Point b, Hold c) {
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;
	}

	public void realpixels(Scaler figscaler) {
		super.realpixels(figscaler);
		((Line2D.Double) element).setLine(realstart, realstop);
	}

	public boolean isHot(Point d) {
		return ((Line2D.Double) element).ptLineDist(d) < HOTDISTANCE;
	}

}
