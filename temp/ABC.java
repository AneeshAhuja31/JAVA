import java.io.*;
public class ABC {
    public static void main(String[] args) {
        byte a = 1;
        Byte byteobj = Byte.valueOf(a);
        int b = 10;
        Integer intobj = Integer.valueOf(b);
        float c = 18.6f;
        Float floatobj = Float.valueOf(c);
        double d = 250.5;
        Double doubleobj = Double.valueOf(d);
        char e = 'X';
        Character charobj = Character.valueOf(e);
        // Printing Wrapper Class objects
        System.out.println("Values of Wrapper objects:");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Integer object: " + intobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);

        // Unwrapping (Auto-unboxing)
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        // Printing Unwrapped (primitive) values
        System.out.println("\nUnwrapped values:");
        System.out.println("byte value: " + bv);
        System.out.println("int value: " + iv);
        System.out.println("float value: " + fv);
        System.out.println("double value: " + dv);
        System.out.println("char value: " + cv);
    }
}
