
public class Hand {
	Card [] cards;
	public Hand (Card[] cards){
		this.cards = new Card[5];
		this.cards = cards;
		Card temp;
		for(int i=0;i<5;i++){
			for(int j=i;j<5;j++){
				if(cards[i].rawValue()>cards[j].rawValue()){
					temp=cards[i];
					cards[i]=cards[j];
					cards[j]=temp;
				}
			}
		}
	}//remember to put something in for full houses two pair and pair eg 22444 beats 33344
	//public int handValue(){
		
	//}
	public boolean straightFlush(){
		return this.straight()&&this.flush();
	}
	public boolean quads(){
		if(cards[0].rawValue()==cards[1].rawValue()&&cards[1].rawValue()==cards[2].rawValue()&&cards[2].rawValue()==cards[3].rawValue()){
			return true;
		}
		else if(cards[3].rawValue()==cards[4].rawValue()&&cards[1].rawValue()==cards[2].rawValue()&&cards[2].rawValue()==cards[3].rawValue()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean fullHouse(){
		if(cards[0].rawValue()==cards[1].rawValue()&&cards[1].rawValue()==cards[2].rawValue()&&cards[3].rawValue()==cards[4].rawValue()){//kkkaa
			return true;
		}
		else if(cards[0].rawValue()==cards[1].rawValue()&&cards[2].rawValue()==cards[3].rawValue()&&cards[3].rawValue()==cards[4].rawValue()){
			return true;//kkaaa
		}
		else{
			return false;
		}
	}
	public boolean flush(){
		if(cards[0].suit()==cards[1].suit()&&cards[0].suit()==cards[2].suit()&&cards[0].suit()==cards[3].suit()&&cards[0].suit()==cards[4].suit()){
			return true;
		}
		return false;
	}
	
	public boolean straight(){
		if(cards[0].rawValue()==cards[1].rawValue()-1
				&&cards[0].rawValue()==cards[2].rawValue()-2
				&&cards[0].rawValue()==cards[3].rawValue()-3
				&&cards[0].rawValue()==cards[4].rawValue()-4){
			return true;
		}
		else if(cards[0].rawValue()==14
				&&cards[1].rawValue()==2
				&&cards[2].rawValue()==3
				&&cards[3].rawValue()==4
				&&cards[4].rawValue()==5){//wheel a2345
			return true;
			
		}
		else{
			return false;
		}
	}
	public boolean threeOfAKind(){
		if(cards[0].rawValue()==cards[1].rawValue()&&cards[1].rawValue()==cards[2].rawValue()){
			return true;
		}
		else if(cards[2].rawValue()==cards[3].rawValue()&&cards[3].rawValue()==cards[4].rawValue()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean twoPair(){
		if(cards[0].rawValue()==cards[1].rawValue()&&cards[2].rawValue()==cards[3].rawValue()){
			return true;
		}
		else if(cards[0].rawValue()==cards[1].rawValue()&&cards[3].rawValue()==cards[4].rawValue()){
			return true;
		}
		else if(cards[1].rawValue()==cards[2].rawValue()&&cards[3].rawValue()==cards[4].rawValue()){
			return true;
		}
		else return false;
	}
	public boolean pair(){
		for (int i=0;i<4;i++){
			if(cards[i].rawValue()==cards[i+1].rawValue()){
				return true;
			}
		}
		return false;
		
	}
	
}

