package Elecciones_legislativas;

public class Mesa {
    private Urna urna;
    private Presidente presidente;
    private Vicepresidente vicepresidente;
    private Vocal vocal1;
    private Vocal vocal2;

    public Mesa(Urna urna_aux,Presidente presidente_aux,Vicepresidente vicepresidente_aux,Vocal vocal1_aux, Vocal vocal2_aux){
        this.urna = urna_aux;
        this.presidente = presidente_aux;
        this.vicepresidente = vicepresidente_aux;
        this.vocal1 = vocal1_aux;
        this.vocal2 = vocal2_aux;

    }
}
