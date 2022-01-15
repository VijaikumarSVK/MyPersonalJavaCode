class stud{
	private int sid;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
}

public class TestStud {

	public static void main(String[] args) {
		
		stud obj= new stud();
		obj.setSid(10);
		System.out.println(obj.getSid());
		
		obj.setName("vijai");
		System.out.println(obj.getName());
		
	}

}


