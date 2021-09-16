package pl.infoshare;

public class Student {
    private String nameOfStudent;
    private String surnameOfStudent;
    private String gitHubLoginOfStudent;

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurnameOfStudent() {
        return surnameOfStudent;
    }

    public void setSurnameOfStudent(String surnameOfStudent) {
        this.surnameOfStudent = surnameOfStudent;
    }

    public String getGitHubLoginOfStudent() {
        return gitHubLoginOfStudent;
    }

    public void setGitHubLoginOfStudent(String gitHubLoginOfStudent) {
        this.gitHubLoginOfStudent = gitHubLoginOfStudent;
    }

    Student() {

    }

    Student(String nameOfStudent, String surnameOfStudent, String gitHubLoginOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.surnameOfStudent = surnameOfStudent;
        this.gitHubLoginOfStudent = gitHubLoginOfStudent;
    }

}
