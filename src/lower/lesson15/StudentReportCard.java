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
    public void editGrade(String subject, String grade, int question) {
        // TODO: edit grade
    }

    public void sortByGradeSubject() {

    }
}