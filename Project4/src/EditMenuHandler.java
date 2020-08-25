import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener { //implements actionlistener 
	private CandleGUI abc;       //declare candle gui
	   public EditMenuHandler (CandleGUI a) { //constructor 
	      this.abc = a; 
	   }
    @Override
   public void actionPerformed(ActionEvent e) { 
      String menuName = e.getActionCommand();
      if (menuName.equals("Search")) { //if search is clicked
         String input = JOptionPane.showInputDialog(null, "Enter a Candle's price "); //prompt to enter price
         float price = Float.parseFloat(input); //parses information
         this.abc.searchPrices(price); //calls search prices method to search textfile
      }
   }

}


