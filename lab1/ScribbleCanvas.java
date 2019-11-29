package lab1;

import java.awt.*;
import javax.swing.*;

public class ScribbleCanvas extends JComponent {
	public void update(Graphics g) {
		if (im != null) {
			g.drawImage(im, 0, 0, this);
		}
	}

	public void paint(Graphics g) {
		update(g);
	}

	public Graphics getOffScreenGraphics() {
		return offscreen;
	}

	public void setBounds(int x, int y, int width, int height) {
		this.width = width;
		this.height = height;
		if (width > 0 && height > 0) {
			Image newim = createImage(width, height);
			offscreen = newim.getGraphics();
			clearCanvas();
			if (im != null) {
				offscreen.drawImage(im, 0, 0, this);
			}
			im = newim;
		}
		super.setBounds(x, y, width, height);
		repaint();
	}

	public void setPenColor(Color c) {
		penColor = c;
		offscreen.setColor(penColor);
	}
	
	public Color getPenColor() {
		return penColor;
	}

	public void clearCanvas() {
		offscreen.setColor(Color.white);
		offscreen.fillRect(0, 0, width, height);
		offscreen.setColor(penColor);
	}
	
	public boolean getMouseButtonDown() {
		return mouseButtonDown;
	}
	
	public void setMouseButtonDown(Boolean isMouseButtonDown) {
		mouseButtonDown = isMouseButtonDown;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	protected Image im;
	protected int width, height;
	protected Graphics offscreen;
	protected Color penColor = Color.black;
	protected boolean mouseButtonDown = false;
	protected int x, y;
}
