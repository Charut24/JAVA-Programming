package Pack_Cards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Deck_of_cards {

        private Card cards[];
        private int noOfCards;

        Deck_of_cards()
        {
            noOfCards=52;
            cards = new Card[52];
        }

        public void restart()
        {
            System.out.println("Restarting the game...");
            Arrays.fill(cards,null);
            noOfCards=0;
            Runtime.getRuntime().gc();
        }

        public int getHashCode()      ///test method to check if garbage collector was called,return unique hash code of object
        {
            return cards[0].hashCode();
        }

        public void createDeck()
        {
            int x=0;
            for(int s=0;s<4;s++)
            {
                for(int r=1;r<=13;r++)
                {
                    cards[x]=new Card(r,s);
                    x++;
                }
            }
            noOfCards=x;
        }
        /* this function finds the user specified card and returns true if found. Also it removes the card from the deck */
        public boolean findCard(String rank,String suit)
        {
            int r=Card.intRankFromStringRank(rank);
            int s=Card.intSuitFromStringSuit(suit);
            if(r==-1)
            {
                System.out.println("Invalid card rank specified!");
                return false;
            }
            if(s==-1)
            {
                System.out.println("Invalid suit specified!");
                return false;
            }

            Card temp=new Card(r,s);
            for(int i=0;i<noOfCards;i++)
            {
                if(cards[i]!=null)
                    if(cards[i].sameCard(temp)) {
                        cards[i]=null;
                        noOfCards--;
                        return true;
                    }
            }
            return false;
        }

        //compares within same suit, ace<2<3<....<queen<king
        public void compareCard(String rank1,String rank2,String suit)
        {
            if(!findCard(rank1,suit))
            {
                System.out.println("Card 1 not found in the deck!");
                if(!findCard(rank2,suit))
                {
                    System.out.println("Card 2 not found in the deck!");
                    return;
                }
                return;
            }

            int r1=Card.intRankFromStringRank(rank1);
            int r2=Card.intRankFromStringRank(rank2);

            if(r1 > r2)
            {
                System.out.println("Card 1 has higher value!");
            }
            else if(r1 < r2)
            {
                System.out.println("Card 2 has higher value!");
            }
            else
                System.out.println("Both cards are equal!");
        }

        public int getNoOfCards()
        {
            return noOfCards;
        }

        public void dealCards()
        {
            int i=0;
            while(i<5)
            {
                if(getNoOfCards()==0)
                {
                    System.out.println("\nCan't deal more cards! No more cards left!");
                    break;
                }
                Random generator = new Random();
                int index = generator.nextInt(cards.length);
                while(cards[index]==null)
                    index = generator.nextInt(cards.length);
                i++;
                System.out.print("Card " + i + " : ");
                cards[index].printCard();
                cards[index]=null;
                noOfCards--;
                System.out.println(" ");
            }
        }

        public void printDeck()
        {
            System.out.println("The Deck contains : " + getNoOfCards() + " cards");
            for(int i=0;i<cards.length;i++)
                if(cards[i]!=null)
                    cards[i].printCard();
        }

        public void sort()
        {
            Comparator<Card> bySuitThenRank = Comparator.nullsLast(Comparator.comparing(Card::getSuit,Comparator.nullsLast(Comparator.naturalOrder()))
                    .thenComparing(Card::getRank,Comparator.nullsLast(Comparator.naturalOrder())));
            Arrays.sort(cards,bySuitThenRank);
        }
        public void shuffleCards()
        {
            Card temp;
            Random generator = new Random();
            for (int i=0; i<cards.length; i++)
            {
                int index1 = generator.nextInt( cards.length - 1 );
                int index2 = generator.nextInt( cards.length - 1 );
                if(index1 == index2)
                    continue;
//            System.out.println("Iteration " + i + " Card index 1: " + cards[index_1]);
//            System.out.println("Card index 2: " + cards[index_2]);
                temp = cards[index2];
                cards[index2]=cards[index1];
                cards[index1]=temp;
//            System.out.println("Card index 1: " + cards[index_1]);
//            System.out.println("Card index 2: " + cards[index_2]);
            }

        }
}
