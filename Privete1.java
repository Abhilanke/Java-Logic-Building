package logicbuilding;

public class Privete1 {
     
	private String name="jonny";
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Privete1 a=new Privete1();
		
		System.out.println(a.getName());
		//a.setName("abhi");
		//System.out.println(a.getName());

	}

}
