package property;

public class Weapon  {
	int damage = 1;
	static int test = 10;
	
	{
		System.out.println(damage);
		System.out.println(test);
		this.damage=2;
		System.out.println(damage);
		System.out.println(test);
	}
	
	
	
	public Weapon(int damage) {
		super();
		System.out.println(this.damage);
		System.out.println(this.test);
		this.damage = damage;
		System.out.println(this.damage);
		System.out.println(this.test);
	}



	static{
		
		System.out.println(test);
		Weapon.test=20;
		System.out.println(test);
	}

	
}
