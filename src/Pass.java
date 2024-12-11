abstract class Pass {
    protected String fullName;
    protected String faculty;

    public Pass(String fullName, String faculty) {
        this.fullName = fullName;
        this.faculty = faculty;
    }

    public abstract void displayInfo();
}

class TeacherPass extends Pass {
    private String department;

    public TeacherPass(String fullName, String faculty, String department) {
        super(fullName, faculty);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Пропуск учителя: " + fullName + ", Факультет: " + faculty + ", Департамент: " + department);
    }
}

class StudentPass extends Pass {
    private int yearOfAdmission;

    public StudentPass(String fullName, String faculty, int yearOfAdmission) {
        super(fullName, faculty);
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public void displayInfo() {
        System.out.println("Пропуск студента: " + fullName + ", Факультет: " + faculty + ", Год поступления: " + yearOfAdmission);
    }
}