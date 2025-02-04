package test07;
import lap07.SmartPhone;
public class TestSmartPhone {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("iPhone", 34000, "A3");
		System.out.println(s);
		System.out.printf("Payment: %,.2f/month\n",
		s.getPaymentPerMonth(10));
		System.out.println();
		SmartPhone t = new SmartPhone("");
		System.out.println(t);

	}

}
