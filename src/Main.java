import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gryffindor[] studentFacultyGryffindor = {
                new Gryffindor("Гарри", "Поттер", 100, 90, 67, 45, 89),
                new Gryffindor("Гермиона", "Грейнджер", 78, 100, 45, 67, 89),
                new Gryffindor("Рон", "Уизли", 56, 78, 34, 56, 92),
        };
        Puffenduy[] studentFacultyPuffenduy = {
                new Puffenduy("Захария", "Смит", 92, 77, 67, 45, 89),
                new Puffenduy("Седрик", "Диггори", 45, 85, 45, 67, 89),
                new Puffenduy("Джастин", "Финч-Флетчли", 98, 56, 34, 56, 92),
        };
        Coctevran[] studentFacultyCoctevran = {
                new Coctevran("Чжоу", "Чанг", 100, 90, 67, 45, 89, 98),
                new Coctevran("Падма", "Патил", 45, 85, 45, 67, 89, 77),
                new Coctevran("Маркус", "Белбой", 56, 78, 34, 56, 92, 55),
        };
        Slytherin[] studentFacultySlytherin = {
                new Slytherin("Драко", "Малфой", 83, 93, 67, 45, 89, 45, 85),
                new Slytherin("Грэхэм", "Монтегю", 73, 63, 45, 67, 89, 56, 78),
                new Slytherin("Грегори", "Гойл", 67, 56, 34, 56, 92, 89, 98),
        };
        PrintStudent printStudent = new PrintStudent();
        printStudent.print(studentFacultyGryffindor[0]);
        printStudent.print(studentFacultyPuffenduy[1]);
        printStudent.print(studentFacultyCoctevran[2]);
        printStudent.print(studentFacultySlytherin[0]);
        System.out.println();
        ComparisonStudent comparisonStudent = new ComparisonStudent();
        comparisonStudent.comparisonStudentFacuity(studentFacultyGryffindor[0], studentFacultyGryffindor[1]);
        comparisonStudent.comparisonStudentFacuity(studentFacultyPuffenduy[0], studentFacultyPuffenduy[1]);
        comparisonStudent.comparisonStudentFacuity(studentFacultyCoctevran[0], studentFacultyCoctevran[1]);
        comparisonStudent.comparisonStudentFacuity(studentFacultySlytherin[0], studentFacultySlytherin[1]);
        System.out.println();
        comparisonStudent.comparisonPowerMagic(studentFacultyGryffindor[0], studentFacultySlytherin[0]);
    }
}