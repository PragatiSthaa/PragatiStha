import java.util.Scanner;

public class Assignment1Qno8 {
    public static void main(String[] args) {
        float BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight : ");
        float weight = sc.nextFloat();
        System.out.println("Enter your height : ");
        float height = sc.nextFloat();
        BMI = (weight / (height * height));
        System.out.println("Your BMI " + BMI + "kg/m sqr");
    }
}
