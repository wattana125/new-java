package test07;
import lap07.Phone;
public class Testphone {

	public static void main(String[] args) {
		Phone p =new Phone();
		System.out.println(p);
		System.out.println();

		Phone q =new Phone("pixel", 25000);
		System.out.println(q);
		q.setModel("");
		q.setPrice(-1);
		System.out.println(q);
		

	}

}
