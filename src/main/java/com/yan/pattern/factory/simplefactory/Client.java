package com.yan.pattern.factory.simplefactory;

public class Client {
	public static void main(String[] args) {
		Product productA = Factory.factoryMethod("a");
		productA.methodSame();
		productA.methodDiff();
		
		Product productB = Factory.factoryMethod("B");
		productB.methodSame();
		productB.methodDiff();
		
		Chart chart;
		chart = ChartFactory.getChart("histogram"); //ͨ����̬��������������Ʒ
		chart.display();

		
	}
}
