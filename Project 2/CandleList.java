// Candle list method
public abstract class CandleList {
	protected CandleNode first = new CandleNode(null); //beginning is null
	protected CandleNode last = first;                 // last is null
	protected int length= 0;                           //counter to know size 

	public CandleList() { //no argument constructor
		first = new CandleNode(null); 
		last = first;
		length =0;
	}
	
	public int getLength() { //return length of CandleList
		return length;
	}
	//append method to add CandleNodes to the end of list
	public void append(Candle c) {
		CandleNode canNode = new CandleNode(c); //instantiate new candle
		last.next = canNode;                    //Candle put after last candle in list
		last = canNode;                         //Last candle node is last 
		canNode.next = null;                    //new null node is after last candle in list
		length++;                               //Length of list increased for every candle we add to list
		
	}
	
		
	}


