class Bank{
    String name;
    int age;
    public Bank(){
        name="unknown";

    }
    public Bank(String name){
       this.name = name;
        this.age = 3;
    }
    public Bank(String name,int age ){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name + "  Welcome Nellore "+ age) ;

    }


public static void main(String[] args){
    Bank s = new Bank();
    Bank s1 = new Bank("Thrisha");
    Bank s2 = new Bank("Thrisha",21);
     
    s.display();
    s1.display();
    s2.display();
}
}