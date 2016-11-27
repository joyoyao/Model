package com.abcew.model.proxy.section4;

/**
 * @author cbf4Life cbf4life@126.com
 *         I'm glad to share my knowledge with you all.
 *         场景类
 */
public class Client {

  public static void main(String[] args) {    //定义个游戏的角色
    //定义一个痴迷的玩家
    IGamePlayer player = new GamePlayer("张三");

    //开始打游戏，记下时间戳
    System.out.println("开始时间是：2009-8-25 10:45");

    //获得类的class loader
    ClassLoader cl = player.getClass().getClassLoader();


    IGamePlayer proxy = DynamicProxy.newProxyInstance(cl,new Class[] {IGamePlayer.class}, new MyIvocationHandler(player));

    //登陆
    proxy.login("zhangSan", "password");
    //开始杀怪
    proxy.killBoss();
    //升级
    proxy.upgrade();

    //记录结束游戏时间
    System.out.println("结束时间是：2009-8-26 03:40");
  }
}
