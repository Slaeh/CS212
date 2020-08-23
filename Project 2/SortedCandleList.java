//SortedCandleList method
// Function to insert the given node into the correct sorted position in
// the given list sorted in increasing order
public class SortedCandleList extends CandleList{ 
	public SortedCandleList(){ //using constructor from CandleList because this method extends from it  
		super();
	}
	public void add(Candle c) {
		CandleNode can =this.first;
	    CandleNode location = new CandleNode(c); //instantiate new candle
	      while (can.next != null && can.next.data.getPrice() < c.getPrice()) { // Locate the node before the point of insertion
			can = can.next;
	      }
			location.next = can.next;
			can.next = location;
			if(can == this.last)
				this.last = location;
			this.length++;
			
		

		
	}
}
