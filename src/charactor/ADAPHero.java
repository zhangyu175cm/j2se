package charactor;

import inter.AD;
import inter.AP;
import inter.Mortal;

public class ADAPHero extends Hero implements AD, AP ,Mortal{

	@Override 
	public void magicAttack() {
		// TODO Auto-generated method stub
		System.out.println("����ħ������");
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("ADAPӢ������");
	}

}
