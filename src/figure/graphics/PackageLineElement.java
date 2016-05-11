package figure.graphics;

import figure.model.IFigure;
import figure.model.Scaler;
import javafx.scene.shape.Line;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Jørgen Johansen on 03.05.2016.
 */
public class PackageLineElement extends LineElement {

	public PackageLineElement(Point a, Point b, IFigure.Hold c) {
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
			q.add(new Point(realstop.x,((realstart.y+realstop.y)/2)));
		}

		if(y2-y1 == 0){
			q.add(new Point(((realstart.x+realstop.x)/2), realstop.y));

		}
		return q;
	}

}
