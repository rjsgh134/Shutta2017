 class Card {

    Card(int num,boolean gwang){
        _num=num;
        _gwang=gwang;
    }

    //region
    private int _num;
    public int getNum(){
        return _num;
    }
    public void setNum(int num){
        if (_num != num)
            _num = num;
    }
    //endregion

     //region
     private boolean _gwang;
     public boolean getGwang(){
         return _gwang;
     }
     public void setGwang(boolean gwang){
         if (_gwang != gwang)
             _gwang = gwang;
     }
     //endregion

}
