package Pack_Cards;

import java.util.Scanner;

public class Main_Cards {

        final private static Scanner scanner= new Scanner(System.in);

        public static void main(String[] args)
        {

            Deck_of_cards deck=new Deck_of_cards();
            int choice;
            String suit,rank,rank2;
            System.out.println("Creating new deck to begin!");
            try {
                deck.createDeck();
                System.out.println("New Deck created!");
            }
            catch(Exception E)
            {
                System.out.println("Deck not created! Exception : " + E);
            }
            while (deck.getNoOfCards()!=0) {
                try {
                    System.out.println("\n\n\t\t\tMenu for Deck of Cards");
                    System.out.println("1.Print deck");
                    System.out.println("2.Find card");
                    System.out.println("3.Deal cards");
                    System.out.println("4.Shuffle deck");
                    System.out.println("5.Print number of cards in deck");
                    System.out.println("6.Compare two cards");
                    System.out.println("7.Sort cards");
                    System.out.println("8.Restart game");
                    System.out.println("9.Exit");
                    System.out.println("\n\nEnter your choice : ");
                    choice = scanner.nextInt();
                    switch(choice)
                    {
                        case 1:
                            deck.printDeck();
                            break;

                        case 2:
                            System.out.println("\nEnter suit of the card you want to find : ");
                            scanner.nextLine();
                            suit = scanner.nextLine();
                            System.out.println("\nEnter rank of the card in you want to find : ");
                            rank = scanner.nextLine();
                            if(deck.findCard(rank,suit))
                            {
                                System.out.println(rank + " of " + suit + " found in the deck!");
                            }
                            else
                            {
                                System.out.println(rank + " of " + suit + " not found in the deck!");
                            }
                            break;

                        case 3:
                            System.out.println("\nDealing any five random cards...");     //prints 5 random cards present from the deck
                            deck.dealCards();
                            break;

                        case 4:
                            System.out.println("\nShuffling the cards...");
                            deck.shuffleCards();
                            break;

                        case 5:
                            System.out.println("\nNumber of cards in the deck = " + deck.getNoOfCards());   //no of cards left in the deck
                            break;

                        case 6:
                            System.out.println("Enter suit from which you want to compare: ");
                            scanner.nextLine();
                            suit = scanner.nextLine();
                            if(Card.intSuitFromStringSuit(suit)==-1)
                            {
                                System.out.println("Invalid suit!");
                                continue;
                            }
                            System.out.println("\nEnter rank of card 1 : ");
                            rank=scanner.nextLine();
                            System.out.println("\nEnter rank of card 2 : ");
                            rank2=scanner.nextLine();
                            System.out.println("You are comparing these two cards: "
                                    + rank.toUpperCase() + " of " + suit.toUpperCase() + " and " + rank2.toUpperCase() + " of " + suit.toUpperCase());
                            deck.compareCard(rank,rank2,suit);   //compares the card if they are present in deck and a valid card
                            break;

                        case 7:
                            deck.sort();
                            System.out.println("Cards are now sorted in the deck!");
                            break;

                        case 8:
                            System.out.println("Unique id of first object of card before calling garbage collector: " + deck.getHashCode());
                            deck.restart();
                            deck.createDeck();
                            System.out.println("Unique id of first object of card after calling garbage collector: " + deck.getHashCode());
                            break;

                        case 9:
                            scanner.close();
                            System.exit(0);

                        default:
                            System.out.println("\n\nInvalid choice entered!");
                    }

                }catch(Exception E)
                {
                    System.out.println("Exception : " + E);
                }
            }
        }
    }
