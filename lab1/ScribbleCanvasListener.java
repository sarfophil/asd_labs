package lab1;



import java.awt.*;
import java.awt.event.*;

import lab1.tool.EraseTool;
import lab1.tool.ScribbleTool;
import lab1.tool.Tool;
import lab1.tool.TwoEndsTool;

public class ScribbleCanvasListener 
    implements MouseListener, MouseMotionListener {
        

  protected Lab1 drawframe;
  protected ScribbleCanvas canvas; 
  protected int xStart, yStart; 
  protected Graphics onscreen, offscreen; 
  protected Tool tool;

  public ScribbleCanvasListener(ScribbleCanvas canvas, Lab1 drawframe) {
    this.canvas = canvas;
    this.drawframe=drawframe;
  }
  
  

  public void mousePressed(MouseEvent e) {
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse pressed for scribble tool
            tool = new ScribbleTool();
            tool.mousePressed(e, canvas);
            break;
        case 4:// handle mouse pressed for eraser tool
        	tool = new EraseTool();
        	tool.mousePressed(e, canvas);
            break;
         default:
        	 tool = new TwoEndsTool(drawframe.getCurrentTool());
        	 tool.mousePressed(e, canvas);
        	 break;
    }
  } 

  public void mouseReleased(MouseEvent e) {
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse released for scribble tool
        	tool = new ScribbleTool();
            tool.mouseReleased(e, canvas);
            break;
        case 4:// handle mouse released for eraser tool
            tool = new EraseTool();
            tool.mouseReleased(e, canvas);
            break;
         default:
        	 tool = new TwoEndsTool(drawframe.getCurrentTool());
        	 tool.mousePressed(e, canvas);
        	 break;
    }       
  }    

  public void mouseDragged(MouseEvent e) {
    Point p = e.getPoint(); 
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse dragged for scribble tool
            if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y); 
            int xs = Math.min(canvas.x, p.x); 
            int ys = Math.min(canvas.y, p.y); 
            int dx = Math.abs(p.x-canvas.x) +1;
            int dy = Math.abs(p.y-canvas.y) +1; 
            canvas.repaint(xs, ys, dx, dy); 
            canvas.x = p.x; 
            canvas.y = p.y; 
            }       
            break;
        case 1:// handle mouse dragged for line tool
            if (canvas.mouseButtonDown) {
                onscreen.drawLine(xStart, yStart, canvas.x, canvas.y); 
                onscreen.drawLine(xStart, yStart, p.x, p.y);
            }
            canvas.x = p.x; 
            canvas.y = p.y; 
           break;
        case 2:// handle mouse dragged for rectangle tool
            if (canvas.mouseButtonDown) {
                onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);  
                onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1); 
            }
            canvas.x = p.x; 
            canvas.y = p.y; 
            break;
        case 3:// handle mouse dragged for oval tool
            if (canvas.mouseButtonDown) {
                onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1); 
                onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);  
            }
            canvas.x = p.x; 
            canvas.y = p.y; 
            break;
        case 4:// handle mouse dragged for eraser tool
        	 tool = new EraseTool();
             tool.mouseDragged(e, canvas);

    }       
  }

  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {}
  public void mouseMoved(MouseEvent e) {}     

  
}

