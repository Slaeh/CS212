
import java.util.StringTokenizer;
	// Include StringTokenizer to read in the text file
	//parse 3 pieces of information using string token
	//instantiate candle and store object in 2 arrays
	//when file read + arrays filled, selection sort

	/**
	 * 
	 * @author Harjit Liyal
	 * Project 2 - Main 
	 * Date: 11/12/19
	 * Lab Section 11D: Cuiyuan Wang
	 */
	public class Project2 {
	    public static void main(String[] args) {  //read candle information from a file
	        TextFileInput input = new TextFileInput (args[0]);
	        String line = input.readLine();
	        int counter = 0; //set counter to 0
	        while(line!= null) { //while the final input file is not read keep incrementing
	            line = input.readLine();
	            counter ++; //add to counter
	        }
	         UnsortedCandleList unsorted = new UnsortedCandleList(); //declare two arrays of size counter
	        SortedCandleList sorted = new SortedCandleList();
	            
	        TextFileInput input2 = new TextFileInput (args[0]);
	         String line2 =input2.readLine();
	         StringTokenizer t = new StringTokenizer(line2, ",");
	         int i =0;
	         while(line2 != null) { //while line is not null, keep reading
	           t= new StringTokenizer(line2, ",");            
	              if(t.countTokens() != 3) {     //if elements not equal to 3, print to console
	                System.out.println(line2);
	                line2 = input2.readLine();
	            }
	            else { //else parse + store in arrays
	                 int height = Integer.parseInt(t.nextToken());
	                 int width = Integer.parseInt(t.nextToken());
	                 float price = Float.parseFloat(t.nextToken());
	                 Candle c = new Candle(height,width,price);
	                 unsorted.add(c);
	                 sorted.add(c);
	                 line2 = input2.readLine();
					 i++;
	            }
	              CandleGUI CGUI = new CandleGUI("");
	              CGUI.showGui(unsorted,sorted);
	            
	        }
}
	}
