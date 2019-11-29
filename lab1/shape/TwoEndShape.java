/**
 * 
 */
package lab1.shape;

import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;

/**
 * @author SARFO PHILIP
 *
 */
public interface TwoEndShape {
	public void drawShape(MouseEvent event,ScribbleCanvas canvas);
	public void drawOutline(MouseEvent event,ScribbleCanvas canvas);
}
