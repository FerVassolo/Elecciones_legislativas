package Elecciones_legislativas;

public class main {
    public static void main(String[] args){

        Partido FdT = new Partido("Frente de Todos");
        Partido JxC = new Partido("Juntos por el Cambio");

        Urna urna = new Urna(200, 4);
        urna.add_partido(FdT);
        urna.add_partido(JxC);

        Boleta miboleta1= new Boleta (1, 12);
        Boleta miboleta1bis= new Boleta (1, 12);
        Boleta miboleta2= new Boleta (2, 12);
        Boleta miboleta3= new Boleta (1, 1);
        Boleta miboleta4= new Boleta (2, 13);

        urna.votar(miboleta1);
        urna.votar(miboleta1bis);
        urna.votar(miboleta2); // no se va a añadir a la urna porque es un voto con numero de boleta repetido
        urna.votar(miboleta3);
        urna.votar(miboleta4);

        urna.conteo();
        System.out.println(FdT.getVotes());
        System.out.println(JxC.getVotes());

        System.out.println(urna.nrodevotos());
        System.out.println(urna.partidoganador());


    }

}
