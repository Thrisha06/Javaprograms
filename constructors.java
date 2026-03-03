class constructors{
    String name;
    int phno;
    String email;

    public  constructors(){

    }
    public  constructors(int a){
        System.out.println(name+" has email id as"+email);

    }



    public static void main(String[] args){
        constructors obj = new constructors();
        obj.name="Thrisha";
        obj.phno=1245;
        obj.email="thrisha@gmail.com";

       System.out.println(obj.name + " From mits clg");


    }
}
