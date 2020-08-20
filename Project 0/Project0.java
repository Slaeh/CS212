import javax.swing.*; //import library to use JOptionPane
/**
 * @author Harjit Liyal
 * Project 0
 *date: 9/21/19
 *Lab Section 11D: Cuiyuan Wang
 */
 
   public class Project0 {
      public static void main(String[] args) {
         while(true) { //while true, the program will continue to run
            String userInput= JOptionPane.showInputDialog("Type in a sentence");
            int lowerCaseE=0;
            int upperCaseE=0;
         if (userInput.equalsIgnoreCase("Stop")) { //if the user types in "stop", the program will end.
      return;
         }
//looks at the entire string for 'e' and 'E'. Adds upon previous values if more values are found.
      else for(int i =0; i < userInput.length(); i++) {
         if(userInput.charAt(i) == 'e') {  //if the program finds an 'e', then it will add to the counter.
            lowerCaseE++;
         }
         else if(userInput.charAt(i) == 'E') { // if the program finds an "E', then it will add to the counter.
      upperCaseE++;
         }
      }
//prints out how many 'e' or 'E' were found in the string.
   JOptionPane.showMessageDialog(null,"The number of e's:" + lowerCaseE + "\n The number of E's:" + upperCaseE  );
         }
      }
   }

