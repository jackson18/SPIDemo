package com.qijiabin.test;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.qijiabin.op.DivisionOperationImpl;
import com.qijiabin.op.IOperation;
import com.qijiabin.op.PlusOperationImpl;

/**
 * ========================================================
 * 日 期：2016年7月5日 下午6:21:11
 * 作 者：qijiabin
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("通过实现类调用：");
		IOperation plus = new PlusOperationImpl();
		IOperation division = new DivisionOperationImpl();
		System.out.println(plus.operation(5, 3));
		System.out.println(division.operation(9, 3));
		
		System.out.println("通过SPI机制调用：");
		ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);
		Iterator<IOperation> operationIterator = operations.iterator();
		while (operationIterator.hasNext()) {
			IOperation operation = operationIterator.next();
			System.out.println(operation.operation(6, 3));
		}
	}
}
