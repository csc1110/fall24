package wk7;

public class Student {
    private String lastname;
    private String firstname;
    private final int id;
    private boolean teachersFavorite;
    private static int numberOfStudents = 0;

    public Student(String name) {
        id = ++numberOfStudents;
        lastname = name.substring(name.indexOf(' ') + 1);
        firstname = name.substring(0, name.indexOf(' '));
    }

}
