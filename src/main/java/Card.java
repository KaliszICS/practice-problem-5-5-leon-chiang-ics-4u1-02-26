import java.util.Arrays;

class Card implements Comparable<Card> {
    private String suit;
    private String name;
    String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Card(String name, String suit) {
        this.suit = suit;
        this.name = name;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getName() {
        return this.name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " of " + this.suit; 
    }

    public int compareTo(Card other) {
        if (Arrays.asList(names).indexOf(this.name) == Arrays.asList(names).indexOf(other.getName())) {
            return Arrays.asList(suits).indexOf(this.suit) - Arrays.asList(suits).indexOf(other.getSuit());
        }
        return Arrays.asList(names).indexOf(this.name) - Arrays.asList(names).indexOf(other.getName());
    }
}