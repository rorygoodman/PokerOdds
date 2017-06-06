
public class Card {
	private int value;
	private char suit;
	
	public Card(int value,char suit){
		this.value = value;
		this.suit = suit;
	}
	public char suit(){
		return this.suit;
	}
	public char strValue(){
		if(value==14){
			return 'A';
		}
		else if(value>1&&value<11){
			return (char)value;
		}
		else if(value==11){
			return 'J';
		}
		else if(value==12){
			return 'Q';
		}
		else{
			return 'K';
		}
	}
	public int rawValue(){
		return this.value;
	}
	
	
}
