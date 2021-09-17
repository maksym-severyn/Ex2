package pl.infoshare;

public class ScoreOfTask {
    private Exercise particularExercise;
    private int numberOfPointsScored;
    private String feedback;

    public Exercise getParticularExercise() {
        return particularExercise;
    }

    public void setParticularExercise(Exercise particularExercise) {
        this.particularExercise = particularExercise;
    }


    public int getNumberOfPointsScored() {
        return numberOfPointsScored;
    }

    public void setNumberOfPointsScored(int numberOfPointsScored) {
        this.numberOfPointsScored = numberOfPointsScored;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    ScoreOfTask(){

    }

    ScoreOfTask(Exercise particularExercise, int numberOfPointsScored, String feedback) {
        this.particularExercise = particularExercise;
        this.numberOfPointsScored = numberOfPointsScored;
        this.feedback = feedback;
    }
}
