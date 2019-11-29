/**
 * 
 */
package lab1.tool;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;

/**
 * @author SARFO PHILIP
 *
 */
public class EraseTool implements Tool {

	protected Graphics offscreen;

	@Override
	public void mousePressed(MouseEvent event, ScribbleCanvas canvas) {
		Point p = event.getPoint();
		canvas.setMouseButtonDown(true);
		canvas.setX(p.x);
		canvas.setY(p.y);
		offscreen = canvas.getOffScreenGraphics();
		offscreen.setColor(Color.white);
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent, ScribbleCanvas canvas) {
		canvas.setMouseButtonDown(false);
		canvas.setPenColor(canvas.getPenColor());
	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent, ScribbleCanvas canvas) {
		Point p = mouseEvent.getPoint();
		if (canvas.getMouseButtonDown()) {
			canvas.getOffScreenGraphics().drawLine(canvas.getX(), canvas.getY(),  p.x, p.y);
			int xs = Math.min(canvas.getX(), p.x);
			int ys = Math.min(canvas.getY(), p.y);
			int dx = Math.abs(p.x - canvas.getX()) + 1;
			int dy = Math.abs(p.y - canvas.getY()) + 1;
			canvas.repaint(xs, ys, dx, dy);
			canvas.setX(p.x);
			canvas.setY(p.y);
		}

	}

}
