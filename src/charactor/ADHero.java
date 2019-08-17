package charactor;

import inter.AD;
import inter.Mortal;

public class ADHero extends Hero implements Mortal{
	
	 public ADHero(String name) {
		
		// TODO Auto-generated constructor stub
	} 

	public ADHero() {
		// TODO Auto-generated constructor stub
	}

	int moveSpeed=400; //ÒÆ¶¯ËÙ¶È
	 
	    public void physicAttack() {
	        Mortal.super.magicAttack();
	    }
	     
	    public int getMoveSpeed(){
	        return this.moveSpeed;
	    }
	     
	   
	     
	    public static void main(String[] args) {
	        ADHero h= new ADHero();
	         h.magicAttack();
	       
	        
	    }

		@Override
		public void die() {
			// TODO Auto-generated method stub
			
		}
	
	
}
