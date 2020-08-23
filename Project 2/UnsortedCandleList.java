//UnsortedCandleList method
public class UnsortedCandleList extends CandleList{ 
	public UnsortedCandleList(){ //using constructor from CandleList because this method extends from it  
		super();
	}
	public void add(Candle c) { //Add method that will append candles to list; not sorted
		append(c);
	}

}
