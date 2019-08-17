package property;

public class Item {
	String name;
	int price;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		
		System.out.println("正在被回收");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return name  + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 
		 if (obj instanceof Item) {
			Item i=(Item)obj;
			return (this.name==i.name && this.price==i.price);
		}
		return false;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void main(String[] args) {
		Item h1 = new Item();
		h1.name="123";
		h1.price=123;
		Item h2 = new Item();
		h2.name="123";
		h2.price=121;
		
		System.out.println(h1.equals(h2));
		
	}

}
