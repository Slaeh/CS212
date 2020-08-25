import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
   private CandleGUI abc;
   public FileMenuHandler (CandleGUI a) {
      this.abc = a;
   }
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open")) //if open is clicked, open the file
         openFile( ); 
      else if (menuName.equals("Quit"))    //if quit is clicked, exit 
         System.exit(0);
   } //actionPerformed

    private void openFile( ) { 
       JFileChooser chooser;
       int status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION) 
       this.abc.readFile(chooser.getSelectedFile());
       else 
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
  
   
    
}