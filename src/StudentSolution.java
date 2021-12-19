public class StudentSolution {
public static void Solution(Student[] a)  {
    Search b=new Search();
try {
b.S(a);
}
catch (EmptyStringException e)  {
    System.err.println(e.getMessage());
    }
catch (StudentNotFoundException e) {
    System.err.println(e.getMessage());
}
}
}
