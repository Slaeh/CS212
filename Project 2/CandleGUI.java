import javax.swing.*;
import java.awt.GridLayout;
//display contents of linked list in GUI
//grid layout
//1 row 2 columns
//left: display candles read from file
//right: candle in sorted order

public class CandleGUI extends JFrame {
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
        }

        // Make the GUI visible
        public void showGui(UnsortedCandleList a, SortedCandleList b){ //GUI method to append candles
            this.setVisible(true);
            for(CandleNode i = a.first.next; i != null; i=i.next) { //unsorted print
    			left.append(i.data.toString()+"\n");
    			
    		}
            for(CandleNode i = b.first.next; i != null; i=i.next) { //sorted print
    			right.append(i.data.toString()+"\n");
    			
    		}
    		
        }
     }

