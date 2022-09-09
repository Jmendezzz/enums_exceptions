package model;

public class Persona {
    private String name;
    private int age;
    private int documentId;
    private  String email;
    private String cellphoneNumber;

    public Persona(String name, int age, int documentId, String email, String cellphoneNumber) {
        this.name = name;
        this.age = age;
        this.documentId = documentId;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
