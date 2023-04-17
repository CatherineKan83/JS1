import java.util.Scanner;

public class task3 {
    public static void main(String[]args){
        int stop = 1;
        while(stop!=0){
            Scanner input = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = input.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();
            int a=num1+num2;
            int b=num1-num2;
            double c=(double)num1/(double)num2;
            int d= num1*num2;
            System.out.print("Какую математическую операцию хотите осуществить?\n1)+\n2)-\n3)/\n4)*\n");
            int operation = input.nextInt();
            if(operation==1){
                System.out.println(a);
            }
            if(operation==2){
                System.out.println(b);
            }
            if(operation==3){
                System.out.println(c);
            }
            if(operation==4){
                System.out.println(d);
            }
        System.out.println("Для завершения операций введите '0'. Чтобы продолжить нажмите '1'.");
        stop = input.nextInt();
        if(stop ==0){
            input.close(); 
        }

    }

}
}