import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sayıları küçükten büyüğe sıralama programı");
        System.out.println("------------------------------------------");

        System.out.print("1.Sayıyı giriniz :");
        int num1=scanner.nextInt();

        System.out.print("2.Sayıyı giriniz :");
        int num2=scanner.nextInt();

        System.out.print("3.Sayıyı giriniz :");
        int num3=scanner.nextInt();

        if(num1<num2 && num1<num3){
            if(num2>num3)
                System.out.println(""+num1+"<"+num3+"<"+num2);
            else
                System.out.println(""+num1+"<"+num2+"<"+num3);
        }

        if(num2<num1 && num2<num3){
            if (num1>num3)
                System.out.println(""+num2+"<"+num3+"<"+num1);
            else
                System.out.println(""+num2+"<"+num1+"<"+num3);
        }

        else
        {
            if(num1>num2)
                System.out.println(""+num3+"<"+num2+"<"+num1);
            else
                System.out.println(""+num3+"<"+num1+"<"+num2);
        }
    }
}
