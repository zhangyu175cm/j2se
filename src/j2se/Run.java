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
//		Hero h1=new Hero("����̫һ");
//		Hero h2=new Hero("�����", 10, 20, 30);
//		Support s=new Support("��ɽ", 230, 2310, 12);
//		
//		Hero teemo = new Hero("��Ī", 383);
//        Hero garen = new Hero("����", 616);
//        garen.attack(teemo, 100);
//        Hero garen =  new Hero();
//        garen.name = "����";
//         
//        Hero.copyright = "��Ȩ��Riot Games��˾����";
//         
//        System.out.println(garen.name);
//        System.out.println(garen.copyright);
//         
//        Hero teemo =  new Hero();
//        teemo.name = "��Ī";
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
//        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
//        System.out.println(h1 instanceof ADHero);
//         
//        //�ж�����h2ָ��Ķ����Ƿ���APHero����
//        System.out.println(h2 instanceof APHero);
//         
//        //�ж�����h1ָ��Ķ����Ƿ���Hero��������
//        System.out.println(h1 instanceof ADAPHero);
//        ADHero adapHero=(ADHero)h1;
		
		Hero garen = new ADAPHero();
		ADHero ad= new ADHero();
		APHero ap = new APHero();
		garen.kill(ad);
		garen.kill(ap);
		   
	}
}
