import java.io.*;
public class deserializedemo {
    public static void main(String[] args) {
        serializationdemo.Employee e = null;
        try{
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (serializationdemo.Employee) in.readObject(); // Cast to the original class
            in.close();
            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch(ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        
        if (e != null) {
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + e.name);
            System.out.println("Address: " + e.address);
            System.out.println("SSN: " + e.ssn); // This will be 0 because it was marked transient
            System.out.println("Number: " + e.number);
        }
    }
}