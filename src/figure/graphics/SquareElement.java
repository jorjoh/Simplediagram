package figure.graphics;

import figure.model.IFigure;
import figure.model.Scaler;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 26.04.2016.
 */
public class SquareElement extends ConnectElement {

	public SquareElement(Point a, Point b, IFigure.Hold c) {
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
		if (connectionrule == Hold.TRACE){
			//q.add(new Point(25,10));
			//Toppen
			q.add(new Point(20,10));
			q.add(new Point(60,10));
			//Høyreside
			q.add(new Point(70,20));
			q.add(new Point(70,60));
			//Venstre side
			q.add(new Point(20,20));
			q.add(new Point(20,60));
			//Bunnen
			q.add(new Point(20,70));
			q.add(new Point(60,70));

		}
		return q;
	}
}
