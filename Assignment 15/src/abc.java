import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Employee {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    private String name;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		List<Employee> l=new ArrayList();
		l.add(new Employee(1,"Rupesh", 5000));
		l.add(new Employee(5,"Rupesh", 9000));
		l.add(new Employee(2,"Rohit", 6000));
		l.add(new Employee(3,"Rajesh", 7000));
		l.add(new Employee(4,"Rajesh", 8000));		
		List list=l.stream().filter(m->m.getSalary()>7000).collect(Collectors.toList());
		System.out.println(list);
		
}
}

