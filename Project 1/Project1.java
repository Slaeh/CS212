import java.util.StringTokenizer;
// Include StringTokenizer to read in the text file
//parse 3 pieces of information using string token
//instantiate candle and store object in 2 arrays
//when file read + arrays filled, selection sort

/**
 * 
 * @author Harjit Liyal
 * Project 1 - Main 
 * Date: 10/18/19
 * Lab Section 11D: Cuiyuan Wang
 */
public class Project1 {
    public static void main(String[] args) {  //read candle information from a file
        TextFileInput input = new TextFileInput (args[0]);
        String line = input.readLine();
        int counter = 0; //set counter to 0
        while(line!= null) { //while the final input file is not read keep incrementing
            line = input.readLine();
            counter ++; //add to counter
        }
        Candle [] unsortedArray = new Candle[counter]; //declare two arrays of size counter
        Candle [] sortedArray = new Candle[counter];
            
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
                 unsortedArray[i] = new Candle(height,width,price);
                 sortedArray[i] = unsortedArray[i];
                 line2 = input2.readLine();
				 i++;
            }
            
        }
        selectionSort(sortedArray); //Call on selection sort function to sort the array   
		CandleGUI cgui = new CandleGUI("Candles");
		cgui.showGui();
		cgui.arrayDisplay(unsortedArray, sortedArray);	
    }
      
private static void selectionSort (Candle[] array) { //sorts the array given
   for ( int i = 0; i < Candle.count() - 1; i++ ) { 
      int indexLowest = i; 
         for ( int j = i + 1; j < Candle.count(); j++ ){ 
            if ( array[j].getPrice() < array[indexLowest].getPrice() ) 
               indexLowest = j;
         }  
		 Candle temp = array[indexLowest];
		 array[indexLowest] = array[i];
		 array[i] = temp;
   } 
} 
}