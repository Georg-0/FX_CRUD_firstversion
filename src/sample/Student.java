package sample;

public class Student {
    private String firstName;
    private String lastName;
    private String idStudent;
    private String studentSpecialty;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public void setStudentSpecialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String firstName, String lastName, String idStudent, String studentSpecialty, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idStudent = idStudent;
        this.studentSpecialty = studentSpecialty;
        this.gender = gender;
    }
}
