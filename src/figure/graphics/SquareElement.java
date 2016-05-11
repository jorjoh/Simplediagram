package figure.graphics;

import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 26.04.2016.
 */
public class SquareElement extends LineElement {

	public SquareElement(Point a, Point b, Hold c) {
		super(a,b,c);
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

	protected ArrayList<Point> traceresult() {
		ArrayList<Point> q = new ArrayList<Point>();

		if(x2-x1 == 0){
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/3)));
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/3)*2));
		}

		if(y2-y1 == 0){
			q.add(new Point(((realstart.x+realstop.x)/3), realstop.y));
			q.add(new Point(((realstart.x+realstop.x)/3)*2, realstop.y));
		}
		return q;
	}
}
