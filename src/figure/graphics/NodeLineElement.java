package figure.graphics;


import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class NodeLineElement extends LineElement {

	public NodeLineElement(Point a, Point b, Hold c) {
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
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/4)));
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/4)*2));
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/4)*3));
		}

		if(y2-y1 == 0){
			q.add(new Point((realstart.x + realstop.x)/4, realstop.y));
			q.add(new Point(((realstart.x+realstop.x)/4)*2, realstop.y));
			q.add(new Point(((realstart.x+realstop.x)/4)*3, realstop.y));
		}
		return q;
	}

}
