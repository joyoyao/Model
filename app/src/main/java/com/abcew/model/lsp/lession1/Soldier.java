package com.abcew.model.lsp.lession1;

/**
 * Created by laputan on 16/11/26.
 */

public class Soldier {
  //定义士兵的枪支
  private AbstractGun gun;
  //给士兵一支枪
  public void setGun(AbstractGun _gun){
    this.gun = _gun;
  }
  public void killEnemy(){
    System.out.println("士兵开始杀人...");
    gun.shoot();
  }

}
