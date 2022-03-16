package Elecciones_legislativas;

public class Partido {
    private String name;
    private int votos;


    public Partido(String name){
        this.name = name;
        votos = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getVotes(){
        return votos;
    }
    public void addVote(){
        votos++;
    }
}
