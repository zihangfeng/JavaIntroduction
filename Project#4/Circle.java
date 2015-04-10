import java.awt.*;
import java.awt.geom.*;


	/**
	 * A circle that can be manipulated and that draws itself on a canvas.
	 * 
	 * @author theys
	 * @version (9/1/2012)
	 */
	public class Circle
	{
	    private int size;
	    private int xPosition;
	    private int yPosition;
	    private String color;
	    private boolean isVisible;

	    /**
	     * Create a new Circle at default position with default color.
	     */
	    public Circle()
	    {
	        size = 30;
	        xPosition = 60;
	        yPosition = 50;
	        color = "red";
	        isVisible = true;
	    }
	    
	   /**
	     * Create a new Circle with supplied position, size, color, and visibility
	     */
	    public Circle( int x, int y, int theSize, String theColor, 
	                   boolean visibility)
	    {
	        xPosition = x;
	        yPosition = y;
	        size = theSize;
	        color = theColor;
	        isVisible = visibility;
	        draw();     // Now actually draw it
	    }
	    
	    /**
	     * Get the color for this square
	     */
	    public String getColor()
	    {
	        return color;
	    }
	    
	    /**
	     * Get the xPosition for this square
	     */
	    public int getX()
	    {
	        return xPosition;
	    }
	    
	    /**
	     * Get the yPosition for this square
	     */
	    public int getY()
	    {
	        return yPosition;
	    }
	    
	    
	    /**
	     * Get the size for this square
	     */
	    public int getSize()
	    {
	        return size;
	    }
	    
	   
	    /**
	     * Get the visibility for this square
	     */
	    public boolean getVisibility()
	    {
	        return isVisible;   
	    }
	    
	    /**
	     * Make this Circle visible. If it was already visible, do nothing.
	     */
	    public void makeVisible()
	    {
	        isVisible = true;
	        draw();
	    }
	    
	    /**
	     * Make this Circle invisible. If it was already invisible, do nothing.
	     */
	    public void makeInvisible()
	    {
	        erase();
	        isVisible = false;
	    }    

	    /**
	     * Change the position of the square on the canvas.
	     */
	    public void setPosition(int newX, int newY)
	    {
	        erase();
	        xPosition = newX;
	        yPosition = newY;
	        draw();
	    }
	    
	    
	    /**
	     * Change the color. Valid colors are "red", "yellow", "blue", "green",
	     * "magenta", "black", "cyan", "darkGray", "gray", "lightGray", "orange",
	     * "pink", "white"
	     */
	    public void setColor(String newColor)
	    {
	        color = newColor;
	        draw();
	    }

	     
	    
	    /*
	     * Draw the Square with current specifications on screen.
	     */
	    private void draw()
	    {
	        if(isVisible) {
	            Canvas canvas = Canvas.getCanvas();
	            canvas.draw(this, color, 
                        new Ellipse2D.Double(xPosition, yPosition, size, size));
	            canvas.wait(15);
	       
	        }
	    }

	    /*
	     * Erase the Square on screen.
	     */
	    private void erase()
	    {       
	        if(isVisible) {
	            Canvas canvas = Canvas.getCanvas();
	            canvas.erase(this);
	        }
	}

	    public void doIt()
	    {
	    	
	    }
	    
	    

}
