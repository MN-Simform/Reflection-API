import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        Student s = new Student("Nimit",101);
        Field[] field = s.getClass().getDeclaredFields();
        for(Field f : field){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(s,"Nim");
            }
        }
        System.out.println(s.getName());

        Method[] method = s.getClass().getDeclaredMethods();
        for(Method m : method){
            System.out.println(m.getName());
        }
        System.out.println();
        for(Method m : method){
            if(m.getName().equals("studentDisp")){
                m.invoke(s);
            }
        }
        System.out.println();
        for(Method m : method){
            if(m.getName().equals("privateMethod")){
                m.setAccessible(true);
                m.invoke(s);
            }
        }
        System.out.println();
        for(Method m : method){
            if(m.getName().equals("publicStaticMethod")){
                m.invoke(null);
            }
        }
        System.out.println();
        for(Method m : method){
            if(m.getName().equals("privateStaticMethod")){
                m.setAccessible(true);
                m.invoke(null);
            }
        }
    }
}