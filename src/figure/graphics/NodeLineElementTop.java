package figure.graphics;

import figure.model.IFigure;
import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 03.05.2016.
 */
public class NodeLineElementTop extends NodeLineElement {

	public NodeLineElementTop(Point a, Point b, Hold c) {
		super(a, b, c);
		virtualstart = a;
		virtualstop = b;
		connectionrule = c;
	}
	public void realpixels(Scaler figscaler) {
		super.realpixels(figscaler);
		((Line2D.Double) element).setLine(realstart, realstop);
	}
	public void recalculate(){
		System.out.println("Realstart x = "+(realstart.x)); //x1
		System.out.println("Realstopp x = "+(realstop.x)); //x2
		System.out.println("---------------------------");
		System.out.println("Realstart y = "+(realstart.y)); //y1
		System.out.println("Realstopp y = "+(realstop.y));  //y2
	}

	public boolean isHot(Point d) {
		return ((Line2D.Double) element).ptLineDist(d) < HOTDISTANCE;
	}

	protected ArrayList<Point> traceresult() {
		ArrayList<Point> q = new ArrayList<Point>();
		//recalculate();

		//Hvis horisontal
		if(y2-y1 == 0){
			q.add(new Point(((realstart.x+realstop.x+realstop.x)/4), realstop.y));
			q.add(new Point(((realstart.x+realstop.x)/4)*2, realstop.y));
			q.add(new Point(((realstart.x+realstop.x-realstop.x)/4)*3, realstop.y));
			//System.out.println("horisontallinje");
		}
		return q;

	}


}

