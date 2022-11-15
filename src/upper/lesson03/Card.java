package upper.lesson03;

public class Card extends ListNode<Card> {

    public boolean isKnown;
    
    public String front;

    public String back;

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
    }

    @Override
    public Card getValue() {
        return this;
    }
}
