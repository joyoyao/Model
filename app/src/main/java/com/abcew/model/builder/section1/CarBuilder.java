package com.abcew.model.builder.section1;

import java.util.ArrayList;

/**
 * Created by laputan on 16/11/27.
 */

public abstract class CarBuilder {
  //建造一个模型，你要给我一个顺序要，就是组装顺序
  public abstract void setSequence(ArrayList<String> sequence);

  //设置完毕顺序后，就可以直接拿到这个这两模型
  public abstract CarModel getCarModel();

}
