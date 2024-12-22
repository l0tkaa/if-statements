import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public String checkAge(int age){
        if (age >=18) {
            return "You are an adult.";
        }
        return "You are a minor.";
    }

    public String checkEligibility(int age){
        if(age>=18) {
            return "You are eligible";
        }
        else{
            return "You are not elible";
        }
    }











}