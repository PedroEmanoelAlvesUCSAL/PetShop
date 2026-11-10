package Entidades;

public abstract class Animal {
    private Integer id;
    private String nome;
    private Integer idade;
    private String especie;
    private String raca;
    private Double peso;

    public Animal(Integer id, String nome, String especie, Integer idade, String raca, Double peso) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
