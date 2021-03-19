package Pack_Cards;

public class Card {
        private int rank;
        private int suit;

        final private static String[] Suits = { "CLUBS" , "DIAMONDS" , "HEARTS" , "SPADES" };
        final private static String[] Ranks = { null , "ACE" , "1" , "2", "3" , "4" , "5" , "6" , "7" , "8" , "9" , "JACK", "QUEEN" , "KING" };

        Card(int rank,int suit) //constructor
        {
            this.rank=rank;
            this.suit=suit;
        }

        protected void printCard()
        {
            System.out.println(Ranks[rank] + " of " + Suits[suit]);

        }

        protected int getRank()
        {
            return rank;
        }

        protected int getSuit()
        {
            return suit;
        }

        protected static int intRankFromStringRank(String rank)
        {
            for(int i=1;i<Ranks.length;i++)
                if (rank.equalsIgnoreCase(Ranks[i]))
                    return i;
            return -1;
        }

        protected static int intSuitFromStringSuit(String suit)
        {
            for(int i=0;i<Suits.length;i++)
                if (suit.equalsIgnoreCase(Suits[i]))
                    return i;
            return -1;
        }

        protected boolean sameCard(Card that)
        {

            return this.rank==that.rank && this.suit==that.suit;
        }
}

