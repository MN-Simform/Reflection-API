public class Student {
    private final String name;
    private int rollno;

    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public String getName(){
        return name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public int getRollno(){
        return rollno;
    }
    public void studentDisp(){
        System.out.println("Student Display Method");
    }
    private void privateMethod(){
        System.out.println("This is private method");
    }
    public static void publicStaticMethod(){
        System.out.println("This is public static method");
    }
    private static void privateStaticMethod(){
        System.out.println("This is private static method");
    }
}
