package Elecciones_legislativas;

public class Urna {
    private Boleta[] boletas;
    private int cantidad_de_varones;
    private int qty;
    private int cant;

    public Urna(int cantidad_de_varones) {
        this.cantidad_de_varones = cantidad_de_varones;
        boletas = new Boleta[this.cantidad_de_varones];
        cant = 0;
    }

    public void votar(Boleta boleta)
    {
        if (this.boletas[boleta.getNro_de_boleta() - 1] == null) {
            this.boletas[boleta.getNro_de_boleta()] = boleta;
        }
    }


    public int nrodevotos()
    {
        for (int i = 0; i < this.cantidad_de_varones; i++)
        {
            if (this.boletas[i] != null) {
                cant++;
            }
        }
        return cant;
    }

}
