package com.abcew.model.ocp.lession1;

/**
 * Created by laputan on 16/11/26.
 */

public class ComputerlBook implements IComputerBook {

  private String name;
  private String scope;
  private String author;
  private int price;

  public ComputerlBook(String _name,int _price,String _author,String _scope){
    this.name=_name;
    this.price = _price;
    this.author = _author;
    this.scope = _scope;
  }

  public String getScope() {
    return this.scope;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }

}
