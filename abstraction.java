// Tasrif Nur Himel

 abstract class mobileuser{
    abstract void sendmessage();
}

class rahim extends mobileuser{
    @Override
    void sendmessage(){
        System.out.println("Hi, I am Rahim");
    }
}

class karim extends mobileuser{
    @Override
    void sendmessage(){
        System.out.println("Hi, I am karim");
    }
}

public class abstraction {
    public static void main(String[] args) {
        mobileuser mu;
        mu = new rahim();
        mu.sendmessage();
        mu = new karim();
        mu.sendmessage();
    }
}
