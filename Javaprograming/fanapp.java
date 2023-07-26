
public class fanapp {

	public static void main(String[] args) {
		fan f1 = new fan();
		f1.setdata(3, "Crompton", "White", 2500);
		System.out.println(f1.getNo_of_blades());
		System.out.println(f1.getBrand());
		System.out.println(f1.getColor());
		System.out.println(f1.getCost());
		f1.rotate();

	}

}
