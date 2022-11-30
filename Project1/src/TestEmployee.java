
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		System.out.println(employee1);
		employee1.setId(101);
		employee1.setName("John");
		employee1.setDept("IT");
		employee1.setDesg("Manager");
		employee1.setSal(500000);
		employee1.setEmailId("bapun00@gmail.com");
		
		System.out.println(employee1);
		
		Employee employee2 = new Employee(102,"Foo","foo@gmail.com","CI","Developer",200000);
		System.out.println(employee2);
		
		System.out.println("Employee-2 Name: "+employee2.getName());
		System.out.println("Employee-1 Name: "+employee1.getName());
		
	}

}
