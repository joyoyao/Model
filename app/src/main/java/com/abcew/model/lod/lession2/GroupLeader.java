package com.abcew.model.lod.lession2;

import java.util.List;

/**
 * Created by laputan on 16/11/26.
 */

public class GroupLeader {
  //有清查女生的工作
  private List<Gril> listGirls;
  //传递全班的女生进来
  public GroupLeader(List<Gril> _listGirls){
    this.listGirls = _listGirls;
  }

  //有清查女生的工作
  public void countGirls(){

    System.out.println("女生数量是："+this.listGirls.size());
  }}
