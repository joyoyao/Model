package com.abcew.model.mediator.section1;

/**
 * Created by laputan on 16/11/27.
 *  * 同事的抽象类

 */

public abstract class AbstractColleague {
  protected AbstractMediator mediator;
  public AbstractColleague(AbstractMediator _mediator){
    this.mediator = _mediator;
  }
}
