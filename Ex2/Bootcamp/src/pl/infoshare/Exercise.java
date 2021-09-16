package pl.infoshare;

public class Exercise {
    private String numberOfExercise;
    private String descriptionOfExercise;
    private int highestScoreToGet;

    public String getNumberOfExercise() {
        return numberOfExercise;
    }

    public void setNumberOfExercise(String numberOfExercise) {
        this.numberOfExercise = numberOfExercise;
    }

    public String getDescriptionOfExercise() {
        return descriptionOfExercise;
    }

    public void setDescriptionOfExercise(String descriptionOfExercise) {
        this.descriptionOfExercise = descriptionOfExercise;
    }

    public int getHighestScoreToGet() {
        return highestScoreToGet;
    }

    public void setHighestScoreToGet(int highestScoreToGet) {
        this.highestScoreToGet = highestScoreToGet;
    }

    Exercise(){

    }

    Exercise(String numberOfExercise, String descriptionOfExercise, int highestScoreToGet){
        this.numberOfExercise = numberOfExercise;
        this.descriptionOfExercise = descriptionOfExercise;
        this.highestScoreToGet = highestScoreToGet;
    }
}
