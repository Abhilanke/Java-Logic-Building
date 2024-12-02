import com.sun.tools.javac.Main;

public class Privete1 {

    private String name="Abhi";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Privete1 a=new Privete1();
        //a.setName("Kunal");
        //System.out.println(a.getName());
        System.out.println(a.getName());
    }
}
