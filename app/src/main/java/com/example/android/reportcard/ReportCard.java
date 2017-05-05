package com.example.android.reportcard;


public class ReportCard {

    private static final String SCHOOL_NAME = "St. Paul's Secondary School";
    int mEnglishScore;
    char englishGrade;
    int mScienceScore;
    char scienceGrade;
    int mMathsScore;
    char mathsGrade;
    String mStudentName;
    String mClassName;
    String mTeacherName;

    public ReportCard(String studentName, String className, String teacherName, int englishScore, int scienceScore, int mathsScore) {
        this.mStudentName = studentName;
        this.mClassName = className;
        this.mTeacherName = teacherName;
        this.mEnglishScore = englishScore;
        this.mScienceScore = scienceScore;
        this.mMathsScore = mathsScore;
    }

    @Override
    public String toString() {
        return SCHOOL_NAME + "\n" +
                "Student Name: " + mStudentName + "\n" +
                "Class: " + mClassName + "\n" +
                "Teacher: " + mTeacherName + "\n" +
                "Subject Grades: " + "\n" +
                "  English - score of " + mEnglishScore + " which is graded " + englishGrade + ".\n" +
                "  Science - score of " + mScienceScore + " which is graded " + scienceGrade + ".\n" +
                "  Maths - score of " + mMathsScore + " which is graded " + mathsGrade + ".\n";
    }

    public String getStudentName() {
        return mStudentName;
    }

    public String getTeacherName() {
        return mTeacherName;
    }

    public String getmClassName() {
        return mClassName;
    }

    public int getEnglishScore() {
        return mEnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.mEnglishScore = englishScore;
    }

    public int getScienceScore() {
        return mScienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.mScienceScore = scienceScore;
    }

    public int getMathsScore() {
        return mMathsScore;
    }

    public void setMathsScore(int mathsScore) {
        this.mMathsScore = mathsScore;
    }

    public char englishGrade(int englishScore) {
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

    public char getScienceGrade(int scienceScore) {
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

    public char getMathsGrade(int mathsScore) {
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

    ReportCard card = new ReportCard("Matthew Beevor", "Vianney", "Mr Small", 55, 79, 90);

}
