package com.abcew.model.isp.lession2;

import com.abcew.model.isp.lession1.IPettyGril;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         星探
 */
public class Searcher extends AbstractSearcher {

  public Searcher(IGoodBodyGril _goodBodyGirl) {
    super(_goodBodyGirl);
  }

  public Searcher(IGreatTemperamentGirl _gretTemperamentGirl) {
    super(_gretTemperamentGirl);
  }

  //展示美女的信息
  public void show() {
    System.out.println("--------美女的信息如下：---------------");
    if (super.goodBodyGirl != null) { //展示外形美的美女
      super.goodBodyGirl.goodLooking();
      super.goodBodyGirl.niceFigure();
    }

    if (super.greatTemperamentGirl != null) {
      super.greatTemperamentGirl.greatTemperament();
    }
  }
}
