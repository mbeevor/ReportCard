package com.example.android.reportcard;


public class ReportCard {

    // This is a constant as it will not change for any pupil
    private static final String SCHOOL_NAME = "St. Paul's Secondary School";
    // These are all variables that can be changed
    private int mEnglishScore;
    private char mEnglishGrade;
    private int mScienceScore;
    private char mScienceGrade;
    private int mMathsScore;
    private char mMathsGrade;
    private String mStudentName;
    private String mClassName;
    private String mTeacherName;


    // This is the report card constructor
    public ReportCard(String studentName, String className, String teacherName, int englishScore, char englishGrade, int scienceScore, char scienceGrade, int mathsScore, char mathsGrade) {
        this.mStudentName = studentName;
        this.mClassName = className;
        this.mTeacherName = teacherName;
        this.mEnglishScore = englishScore;
        this.mEnglishGrade = englishGrade;
        this.mScienceScore = scienceScore;
        this.mScienceGrade = scienceGrade;
        this.mMathsScore = mathsScore;
        this.mMathsGrade = mathsGrade;
    }

    // This is the output of the class
    @Override
    public String toString() {
        return SCHOOL_NAME +
                "\n" + "Student Name: " + mStudentName +
                "\n" + "Class: " + mClassName +
                "\n" + "Teacher: " + mTeacherName +
                "\n" + "Subject Grades: " +
                "\n" + "  English - score of " + mEnglishScore + " which is graded " + mEnglishGrade + ".\n" +
                "  Science - score of " + mScienceScore + " which is graded " + mScienceGrade + ".\n" +
                "  Maths - score of " + mMathsScore + " which is graded " + mMathsGrade + ".\n";
    }

    // method to recall the student's name
    public String getStudentName() {
        return mStudentName;
    }

    // method to recall the teacher's name
    public String getTeacherName() {
        return mTeacherName;
    }

    // method to recall the class name
    public String getmClassName() {
        return mClassName;
    }

    // method to get the student's English score
    public int getEnglishScore() {
        return mEnglishScore;
    }

    // method to set the student's English score
    public void setEnglishScore(int englishScore) {
        this.mEnglishScore = englishScore;
    }

    // method to get the student's Science score
    public int getScienceScore() {
        return mScienceScore;
    }

    // method to set the student's Science score
    public void setScienceScore(int scienceScore) {
        this.mScienceScore = scienceScore;
    }

    // method to get the student's Maths score
    public int getMathsScore() {
        return mMathsScore;
    }

    // method to set the student's Maths score
    public void setMathsScore(int mathsScore) {
        this.mMathsScore = mathsScore;
    }

    // if/else methods to calculate grades for each subject
    public char setEnglishGrade(int englishScore) {
        if (englishScore >= 90) {
            return 'A';
        } else if (englishScore >= 80) {
            return 'B';
        } else if (englishScore >= 70) {
            return 'C';
        } else if (englishScore >= 60) {
            return 'D';
        } else if (englishScore >= 50) {
            return 'E';
        }
        return 'F';
    }

    public char setScienceGrade(int scienceScore) {
        if (scienceScore >= 90) {
            return 'A';
        } else if (scienceScore >= 80) {
            return 'B';
        } else if (scienceScore >= 70) {
            return 'C';
        } else if (scienceScore >= 60) {
            return 'D';
        } else if (scienceScore >= 50) {
            return 'E';
        }
        return 'F';
    }

    public char setMathsGrade(int mathsScore) {
        if (mathsScore >= 90) {
            return 'A';
        } else if (mathsScore >= 80) {
            return 'B';
        } else if (mathsScore >= 70) {
            return 'C';
        } else if (mathsScore >= 60) {
            return 'D';
        } else if (mathsScore >= 50) {
            return 'E';
        }
        return 'F';
    }
}