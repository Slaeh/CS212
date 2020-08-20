import javax.swing.*;
import java.awt.GridLayout;
//display contents of array in GUI
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
        public void showGui()
        {
            this.setVisible(true);
        }
        public void arrayDisplay(Candle[] array, Candle[] sorted){ //display the given candles to the columns
            for (int i = 0; i < Candle.count(); i++){
                this.LSB.append(array[i] + "\n");
                this.RSB.append(sorted[i] + "\n");
            }
            this.left.setText(this.LSB.toString());
            this.right.setText(this.RSB.toString());
        }
}
