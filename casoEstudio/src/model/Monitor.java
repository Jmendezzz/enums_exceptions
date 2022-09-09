package model;

public class Monitor extends Persona{
    private int supportHours;
    private  String carreer;
    public Monitor(String name, int age, int documentId, String email, String cellphoneNumber, String career) {
        super(name, age, documentId, email, cellphoneNumber);
        this.carreer=career;
    }

    public int getSupportHours() {
        return supportHours;
    }

    public void setSupportHours(int supportHours) {
        this.supportHours = supportHours;
    }
}
