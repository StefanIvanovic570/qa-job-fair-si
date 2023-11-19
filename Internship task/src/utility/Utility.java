package utility;

import java.util.ArrayList;
import java.util.List;

import cards.*;

public class Utility {
    public static List<Card> generateCards() {          //definise generateCards metodu koja ocekuje List<Card> kao povratnu informaciju.
    List<Card> cards = new ArrayList<>();               //definise novu List<Card> cards kao praznu ArrayList.

    // Generate AttackCards (from 3 to 7)
    for (int i = 3; i <= 7; i++) {                //puni listu cards sa kartama napada od 3 do 7.
        cards.add(new AttackCard(i));               // dodace 10 karata ukupno, po dve od svake napadacke karte. (3,3,4,4,5,5,6,6,7,7)
        cards.add(new AttackCard(i));
    }

    // Generate 5 ProtectCards
    for (int i = 0; i < 5; i++) {
        cards.add(new ProtectCard()); // Using a higher ID range to distinguish from AttackCards
    }                                   // dodace 5 karti za odbranu sa indeksom 1.
    // Generate 10 BoostAttackCards
    for (int i = 0; i < 10; i++) {              // dodace 10 boost karti.
        cards.add(new BoostAttackCard()); // Using a higher ID range to distinguish from other cards
    }

    return cards; //vraca listu cards koja je deklarisana u desetom redu kao return od metode.
}
}
