/**
 * 
 * @author Harjit Liyal
 * Project 2 - Candle Class
 * Date: 11/12/19
 * Lab Section 11D: Cuiyuan Wang
 */

//candle class 
public class Candle {
    private int height;            //declare variables
    private int width;
    private float price;
    private boolean isLit;
	private static int count = 0;

    public Candle(int theHeight, int theWidth, float thePrice) { //candle constructor
        isLit = false; // we assume that a candle is not lit
        height = theHeight;
        width = theWidth;
        price = thePrice;
		count++;
    }

    public int getHeight() { //get the height value
        return height;
    }

    public void setHeight(int newHeight) { //set the height value
        height = newHeight;
    }

    public int getWidth() { // get the width value
        return width;
    }

    public void setWidth(int newWidth) { //set the width value
        width =newWidth;
    }

    public Float getPrice() { //get the price value
        return price;
    }

    public void setPrice(float newPrice) { //set the price value
        price = newPrice;
    }

    public String toString() { //will output our values in a string
        return height + " " + width + " " + price; 
    }
	
	public static int count(){
		return count;
	}
}

