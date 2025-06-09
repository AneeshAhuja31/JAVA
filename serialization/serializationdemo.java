import java.io.*;
public class serializationdemo {
    public static class Employee implements java.io.Serializable{
        public String name;
        public String address;
        public transient int ssn;
        public int number;

        public void mailCheck(){
            System.out.println("Mailing a check to "+name+" "+address);
        }
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Aneesh Ahuja";
        e.address = "ATS Village";
        e.ssn = 111222333;
        e.number = 101;

        try{
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        }
        catch(IOException err){
            err.printStackTrace();
        }
    }
}
