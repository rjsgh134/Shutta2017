 class Player {
     private int _money=1000;
     private Card _card1;
     private Card _card2;
     private int _winCount=0;

    //region
    public int getMoney(){
        return _money;
    }
    public void setMoney(int money){
        if (_money != money)
            _money = money;
    }
    //endregion

     //region
     public Card getCard1(){
         return _card1;
     }
     public void setCard1(Card card1){
         if (_card1 != card1)
             _card1 = card1;
     }
     //endregion

     //region
     public Card getCard2(){
         return _card2;
     }
     public void setCard2(Card card2){
         if (_card2 != card2)
             _card2 = card2;
     }
     //endregion

     //region
     public int getWinCount(){
         return _winCount;
     }
     public void setWinCount(int winCount){
         if (_winCount != winCount)
             _winCount = winCount;
     }
     //endregion
}
