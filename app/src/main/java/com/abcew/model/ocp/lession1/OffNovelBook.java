package com.abcew.model.ocp.lession1;

/**
 * Created by laputan on 16/11/26.
 */

public class OffNovelBook extends NovelBook {

  public OffNovelBook(String _name, int _price, String _author) {
    super(_name, _price, _author);
  }

  //获得书籍的价格
  public int getPrice() {
    //原价
    int selfPrice = super.getPrice();
    int offPrice=0;
    if(selfPrice>4000){  //原价大于40元，则打9折
      offPrice = selfPrice * 90 /100;
    }else{
      offPrice = selfPrice * 80 /100;
    }

    return offPrice;  }
}
