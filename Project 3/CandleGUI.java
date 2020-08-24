/**
 * User is able to select a txt file and a unsorted and sorted output will be displayed on the GUI. 
 */
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
//display contents of linked list in GUI
//grid layout
//1 row 2 columns
//left: display candles read from file
//right: candle in sorted order

public class CandleGUI extends JFrame {
	static Candle c;
	static UnsortedCandleList UnsortedCandleList;
	static SortedCandleList SortedCandleList;
    private JTextArea left,right;
    private StringBuilder LSB,RSB;
    
    public CandleGUI(String title){
            super(title);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //can exit GUI
            this.setSize(100, 100);                              // set the layout of GUI
            this.setLocation(200, 200);
            this.setLayout(new  GridLayout(1, 2));
            this.LSB = new StringBuilder("Unsorted Candles (height, width, price):\n"); //unsorted candles
			this.RSB = new StringBuilder("Sorted Candles (height, width, price):\n");   //sorted candles
	        this.left = new JTextArea(this.LSB.toString(),Candle.count(),1);
			this.right = new JTextArea(this.LSB.toString(),Candle.count(),1);
			this.getContentPane().add(this.left);
			this.getContentPane().add(this.right);
			
			// Create file menu objects
            JMenuItem open = new JMenuItem("Open"); //Open option on screen
            JMenuItem quit = new JMenuItem("Quit"); //Quit option on screen
            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");     //File option on screen
            FileMenuHandler fmh = new FileMenuHandler(this); //FileMenu
            
            // Add the action listener to the menu items 
            open.addActionListener(fmh);
            quit.addActionListener(fmh);
            
            
         // Add the menu items to the file menu
            fileMenu.add(open);
            fileMenu.addSeparator();
            fileMenu.add(quit);
            
            // Add file menu to the menu bar, and set this gui's
            // menu bar to the menuBar we created above
            menuBar.add(fileMenu);
            this.setJMenuBar(menuBar);
        }

        // Make the GUI visible
        public void showGui(UnsortedCandleList a, SortedCandleList b){ //GUI method to append candles
            this.setVisible(true);
            left.setText(null); //make GUI blank
            right.setText(null);
            for(CandleNode i = a.first.next; i != null; i=i.next) { //unsorted print
    			left.append(i.data.toString()+"\n");
    		}
            for(CandleNode i = b.first.next; i != null; i=i.next) { //sorted print
    			right.append(i.data.toString()+"\n");
    		}
    	}
        
        public void readFile(File file) //Read file method
        {
        	String line = null;
    		StringTokenizer myTokens;
    		UnsortedCandleList unsorted = new UnsortedCandleList(); //unsorted
    		SortedCandleList sorted = new SortedCandleList(); //sorted
            Scanner reader = null;
            try
            {
                reader = new Scanner(file); //scanner
                while (reader.hasNextLine()) { //while there is a next line, continue 
                line = reader.nextLine();
    			myTokens = new StringTokenizer(line, ","); 
    			
    			if(myTokens.countTokens() != 3) { //If not equal to three parameters, print 
    				System.out.println(line); 
    			}
    			else {
    				int height = Integer.parseInt(myTokens.nextToken()); //parse information to be added to GUI
	                int width = Integer.parseInt(myTokens.nextToken());
	                float price = Float.parseFloat(myTokens.nextToken());
	                Candle c = new Candle(height,width,price);
	                unsorted.add(c); //add to unsorted 
	                sorted.add(c);   //add to sorted
	                }
    			}
            }
            catch (FileNotFoundException e)
            {
            	e.printStackTrace();
            }
            showGui(unsorted,sorted);
          }
        public void showGui(){ //GUI method to append candles
            this.setVisible(true);
            left.setText(null); //make GUI blank
            right.setText(null);
        }
}


     

