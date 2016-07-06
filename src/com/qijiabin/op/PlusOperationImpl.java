package com.qijiabin.op;

/**
 * ========================================================
 * 日 期：2016年7月5日 下午6:16:54
 * 作 者：qijiabin
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class PlusOperationImpl implements IOperation {
	
  @Override
  public int operation(int numberA, int numberB) {
    return numberA + numberB;
  }
  
}