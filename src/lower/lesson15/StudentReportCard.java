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
     * TODO: Use the selection sort
     */
    public void sortByGradeSubject() {

    }
}