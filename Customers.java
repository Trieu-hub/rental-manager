public class Customers {
    private String name;
    private int age;
    private int g;

    public Customers (String name, int age, int g){
        this.name=name;
        this.age=Math.abs(age);
        this.g=g;
    }

    public String Gender(){
        if(g==1) return "Male";
        else if(g==0) return "Female";
        return "Unknown"; 
    }

    public String getInfo(){
        return "Name: " + name + "; Age: " + age + ", Gender: " + Gender();
    }
}
