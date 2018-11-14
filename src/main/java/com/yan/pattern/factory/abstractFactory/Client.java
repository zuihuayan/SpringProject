package com.yan.pattern.factory.abstractFactory;


class Client {

	public static void main(String args[]) {

        //ʹ�ó���㶨��

		SkinFactory factory;

		Button bt;

		TextField tf;

		ComboBox cb;

		factory = new SpringSkinFactory();

		bt = factory.createButton();

		tf = factory.createTextField();

		cb = factory.createComboBox();

		bt.display();

		tf.display();

		cb.display();

	}

}

