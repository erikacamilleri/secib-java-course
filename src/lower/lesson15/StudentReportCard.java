package lower.lesson15;

import java.util.Date;

import javax.swing.ImageIcon;

public class StudentReportCard {
    
    /**
     * --------- PROPERTIES -------------------------------
     */
    public String name;

    public Date date;

    public int term;

    public int grade;

   
    public int penalties;

    public int tardies;

    public int absences;

    public int earlyDismissals;


    public String address;

    public ImageIcon logo;

    // subjects and questionsGrades are parallel arrays
    public String[] subjects;

    public int[][] questionGrades;

    /**
     * --------- CONSTRUCTOR ------------------------------
     */
    public StudentReportCard(String[] subjects, int noOfQuestionGrades) {
        this.subjects = subjects;
        this.questionGrades = new int[noOfQuestionGrades][subjects.length];
    }

     /**
     * --------- METHODS ----------------------------------
     */
    public void editGrade(String subject, int question, int grade) {
        // first perform linear search on subjects to get particular column
        int subjectIndex = -1;

        for(int i = 0; i < this.subjects.length; i++) {
            if(this.subjects[i] == subject) {
                subjectIndex = i; // this is our column
            }
        }
        // if the subject exists in this report card
        if (subjectIndex != -1) {
            this.questionGrades[question - 1][subjectIndex] = grade;
        } else {
            // Kaboom!
            System.out.println("Need to specify some error here...");
        }
    }
    
    /**
     * This method is to sort the grades by subject name in ascending order
     * Here we are using selection sort
     */
    public void sortByGradeSubject() {
        for(int current = 0; current <= (this.subjects.length - 2); current++) {
            int smallestAlphabetically = current;
            for(int counter = current + 1; counter <= (this.subjects.length - 1); counter++) {
                int compare = this.subjects[counter].compareTo(this.subjects[smallestAlphabetically]);
                // if compareTo returns negative, it means that it is smaller
                if (compare < 0) {
                    smallestAlphabetically = counter;
                }
            }
            if (smallestAlphabetically != current) {
                // swap places
                String tempSubject = this.subjects[smallestAlphabetically];
                this.subjects[smallestAlphabetically] = this.subjects[current];
                this.subjects[current] = tempSubject;

                // we also need to perform the swap in questionGrades
                int rows = this.questionGrades.length;
                
                int[][] tempQuestionGrades = new int[rows][1];
                for (int i = 0; i < rows; i++) {
                    tempQuestionGrades[i][0] = this.questionGrades[i][smallestAlphabetically];
                    this.questionGrades[i][smallestAlphabetically] = this.questionGrades[i][current];
                    this.questionGrades[i][current] = tempQuestionGrades[i][0];
                }
            }
        }
        // E.g. Math      10    30     40
        for(int i = 0; i < this.subjects.length; i++) {
            System.out.print(this.subjects[i] + "      " ); // print in the same line
            for(int j = 0; j < this.questionGrades.length; j++) {
                System.out.print(this.questionGrades[j][i] + "    "); // print in the same line
            }
            System.out.println(""); // to start a new line
        }
    }
}