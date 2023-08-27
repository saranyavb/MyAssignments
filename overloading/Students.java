package overloading;

public class Students {

	public void getStudentInfo() {
		System.out.println("Students Information");
	}
	public int getStudentInfo( int id) {
		
		return id;
	}
	public String getStudentInfo( int id,String name) {
		
		return name;
	}
	public String getStudentInfo( String email,long Phno) {
	
		return email;
	}
	
	
	public static void main(String[] args) {
		Students now=new Students();
		
		now.getStudentInfo();
		
		System.out.println(now);
	}

}
