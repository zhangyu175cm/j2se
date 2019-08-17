package j2se;

import charactor.ADAPHero;
import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
import charactor.Hero.HeroType;
import property.Item;
import property.Weapon;

public class Run {

	public static void main(String[] args) {
//		Hero h1=new Hero("东皇太一");
//		Hero h2=new Hero("安淇拉", 10, 20, 30);
//		Support s=new Support("盾山", 230, 2310, 12);
//		
//		Hero teemo = new Hero("提莫", 383);
//        Hero garen = new Hero("盖伦", 616);
//        garen.attack(teemo, 100);
//        Hero garen =  new Hero();
//        garen.name = "盖伦";
//         
//        Hero.copyright = "版权由Riot Games公司所有";
//         
//        System.out.println(garen.name);
//        System.out.println(garen.copyright);
//         
//        Hero teemo =  new Hero();
//        teemo.name = "提莫";
//        System.out.println(teemo.name);    
//        System.out.println(teemo.copyright);
//        garen.copyright = "Blizzard Entertainment Enterprise";
//        System.out.println(teemo.copyright);
//		   Hero h1=Hero.returnInstance();
//		   Hero h2=Hero.returnInstance();
//		   if(h1==h2){
//			   System.out.println("fafd");
//		   }
//		   HeroType a = HeroType.TANK;
//		   switch(HeroType.values()[1]){
//		   
//		   }
//		ADHero ad = new ADHero();
//        APHero ap = new APHero();
//         
//        Hero h1= ad;
//        Hero h2= ap;
//         
//        //判断引用h1指向的对象，是否是ADHero类型
//        System.out.println(h1 instanceof ADHero);
//         
//        //判断引用h2指向的对象，是否是APHero类型
//        System.out.println(h2 instanceof APHero);
//         
//        //判断引用h1指向的对象，是否是Hero的子类型
//        System.out.println(h1 instanceof ADAPHero);
//        ADHero adapHero=(ADHero)h1;
		
		Hero garen = new ADAPHero();
		ADHero ad= new ADHero();
		APHero ap = new APHero();
		garen.kill(ad);
		garen.kill(ap);
		   
	}
}
