package com.abcew.model.mediator.section1;

/**
 * Created by laputan on 16/11/27.
 */

public class Purchase extends AbstractColleague {
  public Purchase(AbstractMediator _mediator) {
    super(_mediator);
  }

  //采购IBM型号的电脑
  public void buyIBMcomputer(int number){
    super.mediator.execute("purchase.buy", number);
  }

  //不在采购IBM电脑
  public void refuseBuyIBM(){
    System.out.println("不再采购IBM电脑");
  }
}
