import java.util.Scanner;

public class ClassPassing {

    public static void main(String[] args) {
        int math,physics,turkish,chemistry,music,sum=0;
        Scanner scan =new Scanner(System.in);

        System.out.print("Your math grade: ");
        math=scan.nextInt();
        if (math>=0 && math<=100)
            sum+=math;

        System.out.print("Your physics grade: ");
        physics=scan.nextInt();
        if (physics>=0 && physics<=100)
            sum+=physics;

        System.out.print("Your turkish grade: ");
        turkish=scan.nextInt();
        if (turkish>=0 && turkish<=100)
            sum+=turkish;

        System.out.print("Your chemistry grade: ");
        chemistry=scan.nextInt();
        if (chemistry>=0 && chemistry<=100)
            sum+=chemistry;

        System.out.print("Your music grade: ");
        music=scan.nextInt();
        if (music>=0 && music<=100)
            sum+=music;

        double average=sum/5;

        if (average<=55)
            System.out.println("You failed the class.");

        else
            System.out.println("Congratulations!You passed the class.");

        System.out.println("Your average: "+average);

    }
}
