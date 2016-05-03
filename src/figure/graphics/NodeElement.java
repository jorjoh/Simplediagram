package figure.graphics;


import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 28.04.2016.
 */
public class NodeElement extends LineElement {

	public NodeElement(Point a, Point b, Hold c) {
		super(a,b,c);
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;
	//	System.out.println("Virtualstart:" +a.x);
		//System.out.println("Virtualstop:" +b.y);
	}


	public void realpixels(Scaler figscaler) {
		super.realpixels(figscaler);
		((Line2D.Double) element).setLine(realstart, realstop);
	}


	public void recalculate(){
		System.out.println("Realstart x = "+(realstart.x));
		System.out.println("Realstart y = "+(realstart.y));
		System.out.println("---------------------------");
		System.out.println("Realstopp x = "+(realstop.x));
		System.out.println("Realstopp y = "+(realstop.y));
	}

	public boolean isHot(Point d) {
		return ((Line2D.Double) element).ptLineDist(d) < HOTDISTANCE;
	}

	protected ArrayList<Point> traceresult() {
		//recalculate();
		//System.out.println("NodeElement");
		ArrayList<Point> q = new ArrayList<Point>();
		if (connectionrule == Hold.TRACE){

			q.add(new Point(((realstart.x - realstop.x)+realstart.x),realstop.y-realstart.y));
			q.add(new Point((((realstart.x - realstop.x)+realstart.x)/4),realstop.y-realstart.y));
			q.add(new Point((((realstart.x - realstop.x)+realstart.x)/4),(realstop.y-realstart.y)+realstart.y));
			q.add(new Point((((realstart.x - realstop.x)+realstart.x)/4),(realstop.y-realstart.y)+realstart.y+realstart.y));



		}
		return q;
	}

}
