import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// Input
		Deck deck = new Deck();
		Card[] cardArr = {deck.cards.get(1),deck.cards.get(3),deck.cards.get(2),deck.cards.get(4),deck.cards.get(11)};
		Hand hand = new Hand(cardArr); 
		System.out.println(hand.flush());
		Scanner inputScan = new Scanner(System.in);
		String[] handsStr = new String[9]; 
		String flopStr = inputScan.nextLine();
		for(int i = 0; i<9||!inputScan.hasNext();i++ ){
			handsStr[i] = inputScan.nextLine();
		}
		
	}

}
