package sept.tasks._25092024;

import java.util.Scanner;

public class count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String name=sc.next();
        int vowcount=0;
        int concount=0;
        for(int i=0;i<name.length();i++){
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowcount+=1;
            }else{
                concount+=1;
            }

        }
        System.out.println("count of vowels " +vowcount);
        System.out.println("count of consonants "+ concount);
    }
}
