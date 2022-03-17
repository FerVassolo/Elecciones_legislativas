package Elecciones_legislativas;

public class Urna {
    private Boleta[] boletas;
    private int cantidad_de_varones;

    private int cant_de_votos;
    private Partido[] partidos;
    private int max_de_partidos;
    private int cant_de_partidos;


    public Urna(int cantidad_de_varones, int max_de_partidos) {
        // cantidad de varones es la cantidad inscripta al padrón
        this.cantidad_de_varones = cantidad_de_varones;
        this.max_de_partidos = max_de_partidos;

        boletas = new Boleta[this.cantidad_de_varones];
        // Cantidad de votos es la cantidad de personas que ya votaron
        cant_de_votos = 0;

        partidos = new Partido[this.max_de_partidos];
        cant_de_partidos = 0;
    }

    public void add_partido(Partido partido) {
        partidos[cant_de_partidos] = partido;
        cant_de_partidos++;
    }


    public void votar(Boleta boleta) {
        // Para poder meter la boleta en la urna chequea primero q no esté repetido el nro de boleta
        if (this.boletas[boleta.getNro_de_boleta() - 1] == null) {
            this.boletas[boleta.getNro_de_boleta() - 1] = boleta;
        }
    }

    public int nrodevotos() {
        // Lleva la cuenta de la cantidad de personas que votaron (Al instanciar limitamos la cantidad de varones (200))
        for (int i = 0; i < this.cantidad_de_varones; i++) {
            if (this.boletas[i] != null) {
                cant_de_votos++;
            }
        }
        return cant_de_votos;
    }

    public void conteo() {
        // por cada voto: añade el voto al objeto del partido q fue votado
        for (int i = 0; i < this.cantidad_de_varones; i++) {
            if (this.boletas[i] != null) {
                int voto = this.boletas[i].getPartido() - 1; //Frente de todos es 1 pero la lista empieza en 0
                partidos[voto].addVote();
            }
        }

    }

    public String partidoganador() {
        {

            int i;
            Partido ganador2 = partidos[0];
            Partido ganador = partidos[0];
            Partido[] lista_de_ganadores;

            for (i = 1; i < partidos.length; i++)
                if (partidos[i] != null && partidos[i].getVotes() > ganador.getVotes())
                    ganador = partidos[i];

                else if(partidos[i] != null && partidos[i].getVotes() == ganador.getVotes())
                    ganador2 = partidos[i]; // Habría un empate parcial

            if (ganador2 != ganador){
                if (ganador2.getVotes() > ganador.getVotes())
                {
                    return ganador2.getName();
                }
                else if(ganador2.getVotes() == ganador.getVotes())
                {
                    lista_de_ganadores = new Partido[]{ganador, ganador2};
                    return "Empate";
                }
            }
            return ganador.getName();

        }
    }
}

