package com.abcew.model.prototype.section1;

/**
 * Created by laputan on 16/11/27.
 */

public class Thing implements Cloneable{
  public Thing(){
    System.out.println("构造函数被执行了...");
  }

  @Override
  public Thing clone(){
    Thing thing=null;
    try {
      thing = (Thing)super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return thing;
  }
}
