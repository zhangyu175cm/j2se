package inter;

public interface Mortal {
	 public void die();
	public default  void magicAttack(){
		System.out.println("ap");
	}
}
