package DTO;

public class Coffee {
	int price;
	String itemName;
	boolean deCaffein;
	
	public Coffee(int price, String itemName, boolean deCaffein) {
		this.price = price;
		this.itemName = itemName;
		this.deCaffein = deCaffein;
		
	}
	
	@Override
	public String toString(){
		return price+"��, ��ǰ�� : "+itemName+", ��ī����? : "+(deCaffein? "��ī���� Ŀ��!" :"ī���� Ŀ��!");
	}
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public boolean isDeCaffein() {
		return deCaffein;
	}

	public void setDeCaffein(boolean deCaffein) {
		this.deCaffein = deCaffein;
	}


}
