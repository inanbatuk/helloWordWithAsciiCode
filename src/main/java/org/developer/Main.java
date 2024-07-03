package org.developer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    char x  = 72;
    char y = 101;
    char z= 108;
    char q = 108;
    char d=111;
    char f= 32;
    char g= 87;
    char h= 111;
    char i = 114;
    char k = 108;
    char j = 100;
    char u= 33;
    char c = 10;

        System.out.println("Asci kodla yazdım !=>"+asciiToChar(x)+asciiToChar(y)+asciiToChar(z)+asciiToChar(q)+asciiToChar(d)+asciiToChar(f)+asciiToChar(g)+asciiToChar(h)+
                asciiToChar(i)+asciiToChar(k)+asciiToChar(j)+asciiToChar(u)+asciiToChar(c));

        for(int index = 1 ; index<127 ; index++){
            System.out.print((char) index+", ");
        }

    }

    public static char asciiToChar(int asciiCode) {
        if (asciiCode < 0 || asciiCode > 127) {
            throw new IllegalArgumentException("Geçersiz ASCII kodu: " + asciiCode);
        }
        return (char) asciiCode;
    }
}