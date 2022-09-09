package model;

public class Profesor extends Persona{
    private int yearsAntiguaty;
    private  String studyProgram;
    public Profesor(String name, int age, int documentId, String email, String cellphoneNumber,int yearsAntiguaty, String studyProgram) {
        super(name, age, documentId, email, cellphoneNumber);
        this.yearsAntiguaty = yearsAntiguaty;
        this.studyProgram=studyProgram;
    }

    public int getYearsAntiguaty() {
        return yearsAntiguaty;
    }

    public void setYearsAntiguaty(int yearsAntiguaty) {
        this.yearsAntiguaty = yearsAntiguaty;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }
}
