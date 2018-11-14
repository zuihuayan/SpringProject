package com.yan.pattern.factory.abstractFactory;


//�ڱ�ʵ�������ǶԴ�������˴����򻯣�ʵ��ʹ��ʱ����������ĳ�ʼ�������Ϊ���ӣ�����Ҫʹ��JDK��һЩ�����࣬Ϊ��ͻ�����Ĵ��룬�ڴ�ֻ�ṩ��ܴ������ʾ�����

//��ť�ӿڣ������Ʒ

interface Button {

	public void display();

}



//Spring��ť�ࣺ�����Ʒ

class SpringButton implements Button {

	public void display() {

		System.out.println("��ʾǳ��ɫ��ť��");

	}

}



//Summer��ť�ࣺ�����Ʒ

class SummerButton implements Button {

	public void display() {

		System.out.println("��ʾǳ��ɫ��ť��");

	}	

}



//�ı���ӿڣ������Ʒ

interface TextField {

	public void display();

}



//Spring�ı����ࣺ�����Ʒ

class SpringTextField implements TextField {

	public void display() {

		System.out.println("��ʾ��ɫ�߿��ı���");

	}

}



//Summer�ı����ࣺ�����Ʒ

class SummerTextField implements TextField {

	public void display() {

		System.out.println("��ʾ��ɫ�߿��ı���");

	}	

}



//��Ͽ�ӿڣ������Ʒ

interface ComboBox {

	public void display();

}



//Spring��Ͽ��ࣺ�����Ʒ

class SpringComboBox implements ComboBox {

	public void display() {

		System.out.println("��ʾ��ɫ�߿���Ͽ�");

	}

}



//Summer��Ͽ��ࣺ�����Ʒ

class SummerComboBox implements ComboBox {

	public void display() {

		System.out.println("��ʾ��ɫ�߿���Ͽ�");

	}	

}



//����Ƥ�������ӿڣ����󹤳�

interface SkinFactory {

	public Button createButton();

	public TextField createTextField();

	public ComboBox createComboBox();

}



//SpringƤ�����������幤��

class SpringSkinFactory implements SkinFactory {

	public Button createButton() {

		return new SpringButton();

	}



	public TextField createTextField() {

		return new SpringTextField();

	}



	public ComboBox createComboBox() {

		return new SpringComboBox();

	}

}



//SummerƤ�����������幤��

class SummerSkinFactory implements SkinFactory {

	public Button createButton() {

		return new SummerButton();

	}



	public TextField createTextField() {

		return new SummerTextField();

	}



	public ComboBox createComboBox() {

		return new SummerComboBox();

	}

}
