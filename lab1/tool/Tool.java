/**
 * 
 */
package lab1.tool;

import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;

/**
 * @author SARFO PHILIP
 *
 */
public interface Tool {
	public void mousePressed(MouseEvent event,ScribbleCanvas canvas);
	public void mouseReleased(MouseEvent mouseEvent,ScribbleCanvas canvas);
	public void mouseDragged(MouseEvent mouseEvent,ScribbleCanvas canvas);
}
