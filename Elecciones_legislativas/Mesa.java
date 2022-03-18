package Elecciones_legislativas;

public class Mesa {
    private Urna urna;
    private String presidente;
    private String vicepresidente;
    private String vocal1;
    private String vocal2;

    public Mesa(Urna urna_aux,String presidente_aux,String vicepresidente_aux,String vocal1_aux, String vocal2_aux){
        this.urna = urna_aux;
        this.presidente = presidente_aux;
        this.vicepresidente = vicepresidente_aux;
        this.vocal1 = vocal1_aux;
        this.vocal2 = vocal2_aux;

    }
}
