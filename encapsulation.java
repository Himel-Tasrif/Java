//encapsilation
// Tasrif Nur Himel
class main{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
        //this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
    public class encapsulation{
        public static void main(String[] args){
            main obj1 = new main();
            
            obj1.setName("Himel");
            obj1.setAge(21);
            
            System.out.println("My name is: "+obj1.getName()+"\nMy age is: "+obj1.getAge());
        }
    }
