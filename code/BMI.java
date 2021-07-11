import java.text.DecimalFormat;
import java.util.Scanner;

class BMICalc{
    //BMI formula - (weight)/(height*height)
    private static DecimalFormat df = new DecimalFormat("0.00");
    static void bmicalculate(int weight,int height){
        double n = height/100.0;
        double bmi = weight/(n*n);
        Results(Double.parseDouble(df.format(bmi)));
    }

    static void Results(Double bmi){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Your BMI is:"+bmi);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

}

public class Main extends BMICalc{
    static {
        System.out.println("--------------------------------------------");
        System.out.println("Moderate Thinness : 16.0  - 17.0");
        System.out.println("Mild Thinness     : 17.0  - 18.50");
        System.out.println("Normal            : 18.50 - 24.90");
        System.out.println("Overweight        : 25.0  - 30.0");
        System.out.println("--------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^BMI CALCULATOR^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Enter your weight in kgs:");
        int weight = sc.nextInt();
        System.out.print("Enter your height in cms:");
        int height = sc.nextInt();
        bmicalculate(weight,height);
    }
}
