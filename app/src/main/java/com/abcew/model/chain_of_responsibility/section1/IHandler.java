package com.abcew.model.chain_of_responsibility.section1;

/**
 * Created by laputan on 16/11/27.
 */

public interface  IHandler {
  //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
  public void HandleMessage(IWomen women);
}
