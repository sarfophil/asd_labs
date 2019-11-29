/**
 * 
 */
package lab1.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;

/**
 * @author SARFO PHILIP
 *
 */
public class RectShape implements TwoEndShape{

	protected Graphics onscreen,offscreen;
    protected int xStart, yStart; 

	

	@Override
	public void drawShape(MouseEvent event, ScribbleCanvas canvas) {
		Point p = event.getPoint();
		canvas.setMouseButtonDown(true);
		int x = canvas.getX();
		xStart = x = p.x;
		int y = canvas.getY();
		yStart = y= p.y;
		onscreen = canvas.getGraphics();
		onscreen.setXORMode(Color.darkGray);
		onscreen.setColor(Color.lightGray);
		onscreen.drawRect(xStart, yStart, 1, 1);
		
	}



	@Override
	public void drawOutline(MouseEvent event, ScribbleCanvas canvas) {
		Point p = event.getPoint();
		 canvas.setMouseButtonDown(false);
         onscreen.setPaintMode();
         offscreen = canvas.getOffScreenGraphics(); 
         offscreen.drawRect(xStart, yStart, p.x-xStart+1, p.y-yStart+1); 
         canvas.repaint(); 
		
	}

}
