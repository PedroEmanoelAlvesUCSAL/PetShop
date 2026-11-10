package Entidades;

public class Cachorro extends Animal{
     private String porte;

    public Cachorro(Integer id, String nome, String especie, Integer idade, String raca, Double peso, String porte) {
        super(id, nome, especie, idade, raca, peso);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
