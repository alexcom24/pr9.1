import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        Comparator[] a = new Student[]{new Student("Олег","Пак",23),new Student("Алексей","Егоров",45), new Student("Улан","Петров",4), new Student("Лев","Дивев",851)};
        int L=0;
        int R=3;
        Student.r1((Student[]) a,L,R);
        Student.r2((Student[]) a);
        StudentSolution.Solution((Student[])a);



    }

}
