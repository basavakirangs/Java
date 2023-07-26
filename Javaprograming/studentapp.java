
public class studentapp {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setdata(1, "", 100);
		System.out.println(s1.getid());
		System.out.println(s1.getname());
		System.out.println(s1.getmarks());
		s1.eat();
		s1.sleep();
		s1.study();

	}

}
