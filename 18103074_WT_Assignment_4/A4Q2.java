public class FirstProgram {
    public static void main(String[] args) {
        int n = -1;
        byte b = (byte) n;
        char c = (char) b;
        int out = (int) c;
        System.out.println("Initial int: "+ n);
        System.out.println("Byte value is "+b);
        System.out.println("Char value is "+c);
        System.out.println("Final value "+out);
    }
}

/*
 * -1 is in the range of byte
 * ? has unicode of 65535
 */