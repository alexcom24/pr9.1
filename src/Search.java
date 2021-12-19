import java.util.Scanner;

public class Search {
    public static void S(Student [] a) throws EmptyStringException, StudentNotFoundException {
        System.out.println("Введите имя и фамилию студента: ");
        String name;
        String surname;
        boolean b=false;
        Scanner n = new Scanner(System.in);
        Scanner n1 = new Scanner(System.in);
        name=n.nextLine();
        surname=n1.nextLine();
        if ((name.equals(""))|| (surname.equals("")))
            throw new EmptyStringException("Имя и(или) фамилия не заполнены");
        else {
            for (int i = 0; i <= a.length - 1; i++)
                if ((name.equals(a[i].Name)) && (surname.equals(a[i].Surname))) {
                    System.out.print("Студент найден");
                    b = true;
                }
            if (b != true) throw new StudentNotFoundException("Студент не найден");
        }

    }
}
