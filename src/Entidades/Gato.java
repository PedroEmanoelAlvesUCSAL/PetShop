package Entidades;

public class Gato extends Animal{
    private Boolean indoor;

    public Gato(Integer id, String nome, String especie, Integer idade, String raca, Double peso, Boolean indoor) {
        super(id, nome, especie, idade, raca, peso);
        this.indoor = indoor;
    }

    public Boolean getIndoor() {
        return indoor;
    }

    public void setIndoor(Boolean indoor) {
        this.indoor = indoor;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                "\nTipo: Gato" +
                "\nIdade: "+ getIdade() +" anos" +
                "\nEspécie: " + getEspecie() +
                "\nRaça: " + getRaca() +
                "\nPeso: " + getPeso() + " kg" +
                "\nIndoor: " + indoor;
    }
}
