/**
 * 
 */
package lab1.tool;

import java.awt.Point;
import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;

/**
 * @author SARFO PHILIP
 *
 */
public class ScribbleTool implements Tool {

	

	@Override
	public void mousePressed(MouseEvent mouseEvent,ScribbleCanvas canvas) {
		Point p = mouseEvent.getPoint(); 
		canvas.setMouseButtonDown(true);
        canvas.setX(p.x);
        canvas.setY(p.y);
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent,ScribbleCanvas canvas) {
		 canvas.setMouseButtonDown(false);

	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent,ScribbleCanvas canvas) {
		// TODO Auto-generated method stub

	}

}
