package lap07;

public class SmartPhone extends Phone {
	Phone p =new Phone();
	private String cpu;
		public String getCpu() {
			if((cpu=="")||(cpu==null)) {
			setCpu(" undefined cpu");
			}
			return cpu;
	}
	
	
	public void setCpu(String newCpu) {
		this.cpu = newCpu;
	}
	public SmartPhone (String model) {
		setModel(model);
	}	
	public SmartPhone(String model, int price,String cpu) {
		setModel(model);
		setPrice(price);
		setCpu(cpu);
		
	}
	public float getPaymentPerMonth(int month) {
		return getPrice()/month;
	}
	public String toString() {
		return "SmartPhone [model="+getModel()+", price="+getPrice()+", cpu="+getCpu()+"]";
	}
}
