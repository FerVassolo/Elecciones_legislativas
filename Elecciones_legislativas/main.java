package Elecciones_legislativas;

public class main {
    public static void main(String[] args){
        Boleta miboleta1= new Boleta (4, 12);
        Boleta miboleta2= new Boleta (3, 12);
        Boleta miboleta3= new Boleta (4, 1);

        Urna urna = new Urna(200);

        urna.votar(miboleta1);
        urna.votar(miboleta2);
        urna.votar(miboleta3);

        System.out.println(urna.nrodevotos());


    }

}
