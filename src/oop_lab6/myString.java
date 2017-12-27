package oop_lab6;

import com.sun.xml.internal.ws.message.stream.StreamHeader12;

import java.io.SyncFailedException;

public class myString {
    public static void main (String[] args) {
        char []c = {'H', 'e', 'l', 'l', 'o'};
        String strl = new String(c);
        System.out.println(strl);
        String str2 = "Thasawan Sungngam";
        System.out.println(str2);


        //String Concatenation
        //type 1 (+)
        String str3 = strl + " "+ Str2;
        System.out.println(str3);
        //type 2 (concat() method)
        String str4 = str3.concat(" RMUTSV");
        System.out.println(str4);


        //String Methode
        System.out.println(str4.length());
        System.out.println(str4.substring(10,20));
        System.out.println(str4.toLowerCase());
        str4.replace( oldChar:'r', newChar: 't' );
        System.out.println(str4.replace( oldChar: 'r', newChar: 't' ));




    }//main

}//class
