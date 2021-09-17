package pl.infoshare;

public class Main {

    public static void main(String[] args) {
        BaseOfStudents mainStudentBase = new BaseOfStudents();

        Exercise ex1 = new Exercise("Exercise 1 CALCULATOR", "Calculator making", 5);
        Exercise ex2 = new Exercise("Exercise 2 BOOTCAMP", "Bootcamp making", 10);

        Student student1 = new Student("Mateusz", "Kowalski", "mateusz-kowalski");
        Student student2 = new Student("Robert", "Golaczynski", "robert-golaczynski");

        student1.listOfScores.add(new ScoreOfTask(ex1, 5, "Well done! Nothing to add."));
        student2.listOfScores.add(new ScoreOfTask(ex1, 3, "Method 1 bot working"));

        student1.listOfScores.add(new ScoreOfTask(ex2, 9, "Little mistakes in formatting"));
        student2.listOfScores.add(new ScoreOfTask(ex2, 10, "Well done!"));

        mainStudentBase.listOfStudents.add(student1);
        mainStudentBase.listOfStudents.add(student2);

        for (int i = 0; i < mainStudentBase.listOfStudents.size(); i++){
            for (int j = 0; j < mainStudentBase.listOfStudents.get(i).listOfScores.size(); j++){
                System.out.println(mainStudentBase.listOfStudents.get(i).getFullName()
                        + " za zadanie "
                        + mainStudentBase.listOfStudents.get(i).listOfScores.get(j).getParticularExercise().getNumberOfExercise()
                        + " otrzymal "
                        + mainStudentBase.listOfStudents.get(i).listOfScores.get(j).getNumberOfPointsScored()
                        + " pkt."
                );
            }
        }

    }
}
