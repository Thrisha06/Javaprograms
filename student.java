class student{
    String name;
    int phno;


    public student(){

    }

    public student(String name,int phno){
        this.name = name;
        this.phno=phno;

    }

    public static void main(String[] args){
        student obj = new student("Thrisha",1234);
        

        System.out.println(obj.name+ " from nelllore");
    }

}
