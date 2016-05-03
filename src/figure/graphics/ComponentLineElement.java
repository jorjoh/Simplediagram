package figure.graphics;

import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 03.05.2016.
 */
public class ComponentLineElement extends LineElement {


	public ComponentLineElement(Point a, Point b, Hold c) {
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
		//recalculate();
		ArrayList<Point> q = new ArrayList<Point>();
		//Hvis verktikal :
		if(x2-x1 == 0){
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/3)));
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/3)*2));
			//System.out.println("vertikallinje");
		}
		//Hvis horisontal
		if(y2-y1 == 0){
			q.add(new Point(((realstart.x+realstop.x)/3), realstop.y));
			q.add(new Point(((realstart.x+realstop.x)/3)*2, realstop.y));
			//System.out.println("horisontallinje");
		}
		return q;
	}
}
