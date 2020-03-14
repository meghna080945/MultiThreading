package arrayListAddAndRemove;

public class Employee {
String name;
int age; 
int salary; 
String address;
public Employee(String name, int age, int salary, String address) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.address = address;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
}


}
