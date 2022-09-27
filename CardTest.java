import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardTest {

        public static void main(String args[] ) {

            ArrayList<Card> hand = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                Card c = Card.getCard();
                hand.add(c);
            }

            ArrayList<Card> hand2 = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                Card d = Card.getCard2();
                hand2.add(d);
            }

            System.out.println("\n-- Manos sin ordenar:");
            System.out.println("mano 1: ");
            System.out.print("   " + hand);
            System.out.println("\nmano 2: ");
            System.out.println("   " + hand2);

            //mano1
            Card min = Collections.min(hand);
            Card max = Collections.max(hand);

            //mano2
            Card min2 = Collections.min(hand2);
            Card max2 = Collections.max(hand2);

            System.out.println("\n-- Mínimo y máximo:");

            System.out.println("mano 1:");

            System.out.println("   " + min);
            System.out.println("   " + max);

            System.out.println("mano 2:");

            System.out.println("   " + min2);
            System.out.println("   " + max2);

            //jngkjsngrakgkajrgjangñjnrñgnñsrjlngjlrngrañslgñlajrnglnarlgra
            Collections.sort(hand);
            Collections.sort(hand2);

            System.out.println("\n-- Manos ordenadas");
            System.out.println("mano1: ");
            System.out.println("   " + hand);
            System.out.println("mano2: ");
            System.out.println("   " + hand2);

            System.out.println();

            System.out.println("mano1:");
            int c = 0;
            int n = hand.size();
            for (int i = 0; i < n-1; i++) {
                int resta = hand.get(i + 1).getRank() -  hand.get(i).getRank();
                if (resta == 1) {
                    c++;
                }
            }
            if (EScalera(hand)) {
                System.out.println("-- escalera");
                int y ;
            }else {
                System.out.println("-- no escalera");
            }

            // carta MÁS ALTA mano 1
            for (int i = 0; i < n-1; i++) {
                int resta = hand.get(i + 1).getRank();
                if (resta == 1) {
                    c++;
                }
            }
            if (esMASalta(hand)) {
                System.out.println("-- carta más alta");
                int y = 1;
            }else {
                System.out.println("-- carta no alta");
            }

// escalera REAL mano 1
            for (int i = 0; i < n+-1; i++) {
                int resta = hand.get(i + 1).getRank() - hand.get(i).getRank();
                int res = hand.get(i+1).getSuit() - hand.get(i).getSuit();
                if (resta == 1 && res ==1) {
                    c++;
                }
            }
            if (EScREAL(hand)) {
                System.out.println("-- escalera real");
            }else {
                System.out.println("-- no escalera real");
            }
            System.out.println();

            //movimientos mano2

            System.out.println("mano2:");
            int n2 = hand2.size();
            for (int i = 0; i < n2-1; i++) {
                int resta = hand2.get(i + 1).getRank() -  hand2.get(i).getRank();
                if (resta == 1) {
                    c++;
                }
            }
            if (EScalera(hand2)) {
                System.out.println("-- escalera");
            }else {
                System.out.println("-- no escalera");
            }

            // carta MÁS ALTA mano 2
            for (int i = 0; i < n2-1; i++) {
                int resta = hand2.get(i + 1).getRank();
                if (resta == 1) {
                    c++;
                }
            }
            if (esMASalta(hand2)) {
                System.out.println("-- carta más alta");
                int y = 1;
            }else {
                System.out.println("-- carta no alta");
            }

            // escalera REAL mano 2
            for (int i = 0; i < n2+-1; i++) {
                int resta = hand2.get(i + 1).getRank() - hand2.get(i).getRank();
                int res = hand2.get(i+1).getSuit() - hand2.get(i).getSuit();
                if (resta == 1 && res ==1) {
                    c++;
                }
            }
            if (EScREAL(hand2)) {
                System.out.println("-- escalera real");
            }else {
                System.out.println("-- no escalera real");
            }

            /*
            int a[] = {3, 4, 5, 6};
            int c = 0;
            for (int i = 0; i < a.length - 1; i++) {
                int resta = a[i + 1] - a[i];
                if (resta == 1) {
                    c++;
                }
            }*/
        }

        public static boolean EScREAL(List<Card> mano){
            int c=0;
            int n = mano.size();
            for (int i = 0; i < n+-1; i++) {
                int resta = mano.get(i + 1).getRank() - mano.get(i).getRank();
                boolean res = mano.get(i+1).getSuit() == mano.get(i).getSuit();
                if (resta == 1 && res) {
                    c++;
                }
            }
            return (c == 4);
        }

        public static boolean EScalera(List<Card> mano){
            int c=0;
            int n = mano.size();
            for (int i = 0; i < n+-1; i++) {
                int resta = mano.get(i + 1).getRank() - mano.get(i).getRank();
                if (resta == 1) {
                    c++;
                }
            }
            return (c == 4);
        }

    public static boolean tercia(List<Card> mano){
        int c=0;
        int n = mano.size();
        for (int i = 0; i < n+-1; i++) {
            int resta = mano.get(i + 1).getRank() - mano.get(i).getRank();
            if (resta == 1) {
                c++;
            }
        }
        return (c == 4);
    }

    public static boolean esMASalta(List<Card> mano){
        int c=0;
        int n = mano.size();
        for (int i = 0; i < n+-1; i++) {
            int resta = mano.get(i + 1).getRank();
            if (resta == 1) {
                c++;
            }
        }
        return (c == 4);
    }
}