/**
 * 
 */
package lab1.tool;

import java.awt.event.MouseEvent;

import lab1.ScribbleCanvas;
import lab1.shape.LineShape;
import lab1.shape.OvalShape;
import lab1.shape.RectShape;
import lab1.shape.TwoEndShape;

/**
 * @author SARFO PHILIP
 *
 */
public class TwoEndsTool implements Tool {

	private int toolType;
	private TwoEndShape twoEndShape;

	public TwoEndsTool(int toolType) {
		this.toolType = toolType;
	}

	@Override
	public void mousePressed(MouseEvent event, ScribbleCanvas canvas) {
		switch (toolType) {

		case 1: // handle mouse pressed for line tool
			twoEndShape = new LineShape();
			twoEndShape.drawOutline(event, canvas);
			break;
		case 2:// handle mouse pressed for rectangle tool
			twoEndShape = new RectShape();
			twoEndShape.drawOutline(event, canvas);
			break;
		case 3:// handle mouse pressed for oval tool
			twoEndShape = new OvalShape();
			twoEndShape.drawOutline(event, canvas);
			break;
		}
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent, ScribbleCanvas canvas) {
		switch (toolType) {
		case 1: // handle mouse pressed for line tool
			twoEndShape = new LineShape();
			twoEndShape.drawOutline(mouseEvent, canvas);
			break;
		case 2:// handle mouse pressed for rectangle tool
			twoEndShape = new RectShape();
			twoEndShape.drawOutline(mouseEvent, canvas);
			break;
		case 3:// handle mouse pressed for oval tool
			twoEndShape = new OvalShape();
			twoEndShape.drawOutline(mouseEvent, canvas);
			break;
		}

	}

	@Override
	public void mouseDragged(MouseEvent mouseEvent, ScribbleCanvas canvas) {
		switch (toolType) {
		case 1: // handle mouse pressed for line tool
			twoEndShape = new LineShape();
			twoEndShape.drawShape(mouseEvent, canvas);
			break;
		case 2:// handle mouse pressed for rectangle tool
			twoEndShape = new RectShape();
			twoEndShape.drawShape(mouseEvent, canvas);
			break;
		case 3:// handle mouse pressed for oval tool
			twoEndShape = new OvalShape();
			twoEndShape.drawShape(mouseEvent, canvas);
			break;
		}

	}

}
