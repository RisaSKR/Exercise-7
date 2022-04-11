import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Task1
{
    public static void main(String[] args) throws IOException {
        staff obj = new staff();
        obj.initialize1();
        obj.print1();
    }
}
class Person {
    String surnameSirisa56482, firstNameSirisa56482, streetSirisa56482, zipCodeSirisa56482, citySirisa56482;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Surname");
        surnameSirisa56482 = br.readLine();
        System.out.println("Enter your Firstname");
        firstNameSirisa56482 = br.readLine();
        System.out.println("Enter your Street");
        streetSirisa56482 = br.readLine();
        System.out.println("Enter your zip code");
        zipCodeSirisa56482 = br.readLine();
        System.out.println("Enter your City");
        citySirisa56482 = br.readLine();

    }

    public void print() {
        System.out.println(surnameSirisa56482);
        System.out.println(firstNameSirisa56482);
        System.out.println(streetSirisa56482);
        System.out.println(zipCodeSirisa56482);
        System.out.println(citySirisa56482);
    }
}
class staff extends Person {
    String educationSirisa56482, positionSirisa56482;
    public void initialize1() throws IOException{
        initialize();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter education");
        educationSirisa56482 = br.readLine();
        System.out.println("Enter position");
        positionSirisa56482 = br.readLine();
    }
    public void print1(){
        print();
        System.out.println(educationSirisa56482);
        System.out.println(positionSirisa56482);
    }
}


