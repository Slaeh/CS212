//Candle node
public class CandleNode {
   protected Candle data;
   protected CandleNode next;
   
   public CandleNode(Candle c) { //constructor
	   data = c;
	   next = null;
	   
   }
   public String toString() {
	   return this.data.toString();
   }
}
