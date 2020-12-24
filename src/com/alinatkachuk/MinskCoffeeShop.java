package com.alinatkachuk;

public class MinskCoffeeShop extends CoffeeShop implements Biscuits {
	
	@Override
	public void makeLatte() {
		System.out.println ("Thanks for your order from MINSK! Take your Latte :) Bye");
		
	}

	@Override
	public void makeCappuccino() {
		System.out.println ("Thanks for your order from MINSK! Take your Cappuccino :) Bye");
		
	}

	@Override
	public void makeAmericano() {
		System.out.println ("Thanks for your order from MINSK! Take your Americano :) Bye");
		
	}

	@Override
	public void makeRaf() {
		System.out.println ("Thanks for your order from MINSK! Take your Raf :) Bye");
		
	}

}
