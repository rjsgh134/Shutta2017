import java.util.ArrayList;
import java.util.List;

//
public class Main {
    public static void main(String[] args) {
        Dealer d1 = Dealer.getDealer();


        for (int i = 0; i < 20; i++) {
            System.out.print(d1.cards.get(i)._num);
            System.out.println("    " + d1.cards.get(i)._gwang);
        }

        Player p1 = new Player();
        Player p2 = new Player();

        d1.giveCard(p1,p2);

        d1.getMoney(p1,p2,100);
        System.out.println(p1.money+"   "+p2.money);
        d1.giveMoney(p1);
        System.out.println(p1.money);
        d1.getMoney(p1,p2,100);
        System.out.println(p1.money+"   "+p2.money);
        d1.giveMoney(p1);
        System.out.println(p1.money);
    }
}

