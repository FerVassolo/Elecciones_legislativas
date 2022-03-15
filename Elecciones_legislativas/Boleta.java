package Elecciones_legislativas;

public class Boleta {
    public int partido;
    public int nro_de_boleta;

    public Boleta(int partido_aux, int nro_de_boleta_aux)
    {
        this.partido = partido_aux;
        this.nro_de_boleta = nro_de_boleta_aux;
    }

    public int getPartido()
    {
        return this.partido;
    }

    public int getNro_de_boleta()
    {
        return this.nro_de_boleta;
    }
}
