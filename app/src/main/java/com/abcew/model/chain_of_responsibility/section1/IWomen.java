package com.abcew.model.chain_of_responsibility.section1;

/**
 * Created by laputan on 16/11/27.
 */

public interface IWomen {
  //获得个人状况
  public int getType();

  //获得个人请示，你要干什么？出去逛街？约会?还是看电影
  public String getRequest();
}
