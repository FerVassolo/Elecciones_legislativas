package Elecciones_legislativas;

public class main {
    public static void main(String[] args){
        // En primer lugar creamos los partidos (por conveniencia cada partido es una instancia de una clase llamada Partido):
        Partido FdT = new Partido("Frente de Todos");
        Partido JxC = new Partido("Juntos por el Cambio");
        Partido AvanzaLibertad = new Partido("Avanza Libertad");
        Partido FrenteDeIzquierda = new Partido("Frente de Izquierda");

        Urna miurna = new Urna(200, 4);
        miurna.add_partido(FdT);
        miurna.add_partido(JxC);
        miurna.add_partido(AvanzaLibertad);
        miurna.add_partido(FrenteDeIzquierda);


        // Aqui empiezan las instrucciones obligatorias del enunciado (menos la parte agragada de conteo):

        // instancio una boleta con código 12 del “Frente de todos”:
        Boleta miboleta1= new Boleta (1, 12);
        // instancio una boleta con código 15 de “Avanza libertad”:
        Boleta miboleta2= new Boleta (3, 15);
        Boleta miboleta3= new Boleta (3, 19);
        Boleta miboleta4= new Boleta (2, 22);

        miurna.votar(miboleta1);
        miurna.votar(miboleta3);

        // cantidad de boletas dentro de la urna:
        System.out.println(miurna.nrodevotos());

        //al terminar las votaciones contamos los votos:
        miurna.conteo();

        // el partido más votado en esta urna:
        System.out.println(miurna.partidoganador());



    }

}
