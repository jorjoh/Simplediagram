package figure.graphics;

import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import figure.model.Scaler;

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
	protected ArrayList<Point> traceresult() {
		ArrayList<Point> q = new ArrayList<Point>();
		if (connectionrule == Hold.TRACE){
			//q.add(new Point(25,10));
			q.add(new Point(35,10));
			q.add(new Point(45,10));
			//q.add(new Point(55,10));

		}
		return q;
	}

	public boolean isHot(Point d) {
		return ((Line2D.Double) element).ptLineDist(d) < HOTDISTANCE;
	}

}
