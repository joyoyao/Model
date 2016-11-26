package com.abcew.model.isp.lession2;

import com.abcew.model.isp.lession1.IPettyGril;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 星探，搜索美女
 */
public abstract class AbstractSearcher {
	protected IGoodBodyGril goodBodyGirl;
	protected IGreatTemperamentGirl greatTemperamentGirl;

	//外形美的美女
	public AbstractSearcher(IGoodBodyGril _goodBodyGirl){
		this.goodBodyGirl = _goodBodyGirl;
	}

	//气质美的美女
	public AbstractSearcher(IGreatTemperamentGirl _gretTemperamentGirl){
		this.greatTemperamentGirl = _gretTemperamentGirl;
	}


	//搜索美女，列出美女信息
	public abstract void show();
}
