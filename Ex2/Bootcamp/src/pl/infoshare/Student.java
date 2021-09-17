package pl.infoshare;

import java.util.ArrayList;

public class Student {
    private String nameOfStudent;
    private String surnameOfStudent;
    private String gitHubLoginOfStudent;
    private ArrayList<ScoreOfTask> listOfScores = new ArrayList<>();


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

    public void addScoreOfTask(ScoreOfTask particularScore){
        listOfScores.add(particularScore);
    }

    public ScoreOfTask getScoreOfTaskByExerciseName(String particularNumberOfExercise ){
        for (int i = 0; i < listOfScores.size(); i++){
            if (listOfScores.get(i).getParticularExercise().getNumberOfExercise().equals(particularNumberOfExercise)){
                return listOfScores.get(i);
            }
        }
        return null;
    }


}
