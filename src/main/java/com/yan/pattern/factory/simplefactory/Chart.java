package com.yan.pattern.factory.simplefactory;


//����ͼ��ӿڣ������Ʒ��

interface Chart {

	public void display();

}

 

//��״ͼ�ࣺ�����Ʒ��

class HistogramChart implements Chart {

	public HistogramChart() {

		System.out.println("������״ͼ��");

	}

	

	public void display() {

		System.out.println("��ʾ��״ͼ��");

	}

}

 

//��״ͼ�ࣺ�����Ʒ��

class PieChart implements Chart {

	public PieChart() {

		System.out.println("������״ͼ��");

	}

	

	public void display() {

		System.out.println("��ʾ��״ͼ��");

	}

}

 

//����ͼ�ࣺ�����Ʒ��

class LineChart implements Chart {

	public LineChart() {

		System.out.println("��������ͼ��");

	}

	

	public void display() {

		System.out.println("��ʾ����ͼ��");

	}

}

 

//ͼ�����ࣺ������

class ChartFactory {

    //��̬��������

	public static Chart getChart(String type) {

		Chart chart = null;

		if (type.equalsIgnoreCase("histogram")) {

			chart = new HistogramChart();

			System.out.println("��ʼ��������״ͼ��");

		}

		else if (type.equalsIgnoreCase("pie")) {

			chart = new PieChart();

			System.out.println("��ʼ�����ñ�״ͼ��");

		}

		else if (type.equalsIgnoreCase("line")) {

			chart = new LineChart();

			System.out.println("��ʼ����������ͼ��");			

		}

		return chart;

	}

}
