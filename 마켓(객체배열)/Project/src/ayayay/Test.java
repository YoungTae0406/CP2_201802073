package ayayay;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market m= new Market();
		m.SetNamePriceProduct("DRInk", "Coke","Sprite","welchs","delmonte","cider","fanta");
		m.SetNamePriceProduct("RAmen", "sin","samyang","jin","6gyejang");
		m.SetNamePriceProduct("FrUit", "apple","mango","kiwi","banana","watermelon","melon","orange");
		m.SetNamePriceProduct("beEr", "cloud","hite","cass");
		m.SetNamePriceProduct("sNaCK", "jjanggu");
		m.print(m.getF(), m.getB(), m.getD(), m.getR(), m.getS());
	}

}
