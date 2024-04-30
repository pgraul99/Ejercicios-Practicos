/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelretolevel01;

import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio481 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int entrada1, entrada2;
        
        do{
            entrada1=sc.nextInt();
            entrada2=sc.nextInt();
            if(entrada1 != 0 && entrada2 != 0){               
                System.out.println(transformar(entrada1)+entrada2);
            }
            
            
        }while(entrada1 != 0 && entrada2 != 0);
    }
    
    
    public static String transformar (int a){
        String str;
        String str2="";
        switch (a){
            case 1:
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "h");
                break;
            case 2: 
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "g");
                break;
            case 3:
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "f");
                break;
            case 4: 
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "e");
                break;
            case 5:
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "d");
                break;
            case 6: 
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "c");
                break;
            case 7:
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "b");
                break;
            case 8: 
                str = Integer.toString(a);
                str2 = str.replaceAll(str, "a");
                break;
            default: 
                break;
        }
        return str2;
    }
}
