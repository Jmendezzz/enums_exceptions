package enums;

public enum Materiales {
    FICHAS("Ensamble","A1"),
    PIEZAS_METAL("Estructura","C1"),
    ESFERAS ("Movimiento","C1"),
    RUEDAS("Movimiento","C1");

    private String use;
    private String location;

    private Materiales(String use, String location) {
        this.use = use;
        this.location = location;
    }
    public String getUse(){
        return this.use;
    }


}
