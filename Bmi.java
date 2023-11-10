import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {


            System.out.println("身長(m)を入力");
            double height = sc.nextDouble() / 100;

            System.out.println("体重(kg)を入力");
            double weight = sc.nextDouble();

            double BMI = calcBMI(weight, height);
            System.out.printf("BMI: %.2f", BMI);

            evalbmi(BMI);
        }
    }

    public static double calcBMI(double weight, double height) {
        return weight / (height * height);
    }


    public static double evalbmi(double BMI) {
        if (BMI >= 40.0) {
            System.out.println("太りすぎ");
        } else if (BMI >= 35.0) {
            System.out.println("太ってる");
        } else if (BMI >= 30.0) {
            System.out.println("少し太り");
        } else if (BMI >= 25.0) {
            System.out.println("ちょい太");
        } else if (BMI >= 18.5) {
            System.out.println("普通");
        } else {
            System.out.println("痩せ");
        }
        return BMI;
    }
}



