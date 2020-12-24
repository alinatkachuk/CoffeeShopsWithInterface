package com.alinatkachuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoToDrinkCoffee {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		MinskCoffeeShop minsk = new MinskCoffeeShop();
		VitebskCoffeeShop vitebsk = new VitebskCoffeeShop();
		GrodnoCoffeeShop grodno = new GrodnoCoffeeShop();
		MogilevCoffeeShop mogilev = new MogilevCoffeeShop();
		BrestCoffeeShop brest = new BrestCoffeeShop();
		GomelCoffeeShop gomel = new GomelCoffeeShop();
		
		Biscuits biscuitsFromMinsk = new MinskCoffeeShop();
		Biscuits biscuitsFromVitebsk = new VitebskCoffeeShop();
		
		String town; 
		String typeOfCoffee;
				
		do {
		    do {
		    	System.out.print("What city would you like to visit a coffee shop? "
		    			+ "\n" + "    |1.Minsk 2.Vitebsk 3.Grodno 4.Mogilev 5.Brest 6.Gomel|"
		    			+ "\n" + "Please choose a number: ");
		    	town = reader.readLine();
		    } while (Integer.parseInt(town)<=0);
		} while (Integer.parseInt(town)>6);   
		
		System.out.println();
		
		do {
		    do {
		    	System.out.print("What kind of coffee do you want?"
		    			+ "\n" + "    |1.Latte 2.Cappuccino 3.Americano 4.Raf|"
		    			+ "\n" + "Please choose a number: ");
		    	typeOfCoffee = reader.readLine();
		    } while (Integer.parseInt(typeOfCoffee)<=0);
		} while (Integer.parseInt(typeOfCoffee)>4);   
				
		System.out.println();
		
		switch (Integer.parseInt(town)) {
        case 1:
        	biscuitsFromMinsk.sellBiscuits();
        	break;
        case 2:
        	biscuitsFromVitebsk.sellBiscuits();
        	break;
		}
		
		System.out.println();
		
		minsk.Wait();
		switch (Integer.parseInt(town)) {
        case 1:
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		minsk.makeLatte();
        		break;
        	case 2:
        		minsk.makeCappuccino();
        		break;	
        	case 3:
        		minsk.makeAmericano();
        		break;
        	case 4:
        		minsk.makeRaf();
        		break;	
         	}
        	break;
        case 2:
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		vitebsk.makeLatte();
        		break;
        	case 2:
        		vitebsk.makeCappuccino();
        		break;	
        	case 3:
        		vitebsk.makeAmericano();
        		break;
        	case 4:
        		vitebsk.makeRaf();
        		break;	
         	}
            break;
        case 3:
           	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		grodno.makeLatte();
        		break;
        	case 2:
        		grodno.makeCappuccino();
        		break;	
        	case 3:
        		grodno.makeAmericano();
        		break;
        	case 4:
        		grodno.makeRaf();
        		break;	
         	}
            break;
        case 4:
          	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		mogilev.makeLatte();
        		break;
        	case 2:
        		mogilev.makeCappuccino();
        		break;	
        	case 3:
        		mogilev.makeAmericano();
        		break;
        	case 4:
        		mogilev.makeRaf();
        		break;	
         	}
            break;
        case 5:
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		brest.makeLatte();
        		break;
        	case 2:
        		brest.makeCappuccino();
        		break;	
        	case 3:
        		brest.makeAmericano();
        		break;
        	case 4:
        		brest.makeRaf();
        		break;	
         	}
            break;
        case 6:
        	switch (Integer.parseInt(typeOfCoffee)) {
        	case 1:
        		gomel.makeLatte();
        		break;
        	case 2:
        		gomel.makeCappuccino();
        		break;	
        	case 3:
        		gomel.makeAmericano();
        		break;
        	case 4:
        		gomel.makeRaf();
        		break;	
         	}
            break;
		}

	}

}

