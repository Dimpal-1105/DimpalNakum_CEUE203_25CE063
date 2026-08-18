public class Card {
    private String rank;
    private String suit;
    Card(String rank,String suit)
    {
        this.rank=rank;
        this.suit=suit;
    }
    
public  String toString() {
        return rank+" of "+suit;
    }
 public boolean equals(Object obj)
 {
        Card c = (Card) obj;
        return rank == c.rank && suit == c.suit;
 }
}