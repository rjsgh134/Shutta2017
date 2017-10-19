import java.util.ArrayList;
import java.util.List;

 class Dealer {
    private static Dealer dealer = new Dealer();
    List<Card> cards = new ArrayList<Card>();
    int _bettedMoney;

    private Dealer() {
        for (int i = 1; i <= 10; i++) {
            cards.add(new Card(i, false));
            cards.add(new Card(i, false));
        }
        cards.get(0)._gwang = true;
        cards.get(4)._gwang = true;
        cards.get(14)._gwang = true;
    }

    static Dealer getDealer() {
        return dealer;
    }

     private void shuffleCards(int[] randomNum) {
       // randomNum[0] = (int) (Math.random() * 20 );
        for(int i=0; i<randomNum.length; i++){
            randomNum[i] = (int)(Math.random()*20);
            for(int j=0; j<i; j++){
                if(randomNum[i] ==randomNum[j]){
                    i--;
                    break;
                }
            }
        }
    }

     void giveCard(Player p1,Player p2) {
        int[] randomNum = new int[4];
        shuffleCards(randomNum);

        p1.card1=cards.get(randomNum[0]);
        p1.card2=cards.get(randomNum[1]);
        p2.card1=cards.get(randomNum[2]);
        p2.card2=cards.get(randomNum[3]);
    }

     void getMoney(Player p1,Player p2,int bettingMoney){
        p1.money-=bettingMoney;
        p2.money-=bettingMoney;
        _bettedMoney=bettingMoney*2;
    }

    void giveMoney(Player winner){
        winner.money+=_bettedMoney;
    }

}
