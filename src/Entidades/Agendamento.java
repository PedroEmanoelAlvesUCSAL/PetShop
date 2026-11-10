package Entidades;

import Services.Agendavel;

import java.time.LocalDate;

public class Agendamento<LocalTime> implements Agendavel {
    private Integer id;
    private LocalDate data;
    private LocalTime horario;
    private Status status;
    private Animal animal;
    private Veterinario veterinario;
    private Servico servico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    @Override
    public Void confirmar() {
        return null;
    }

    @Override
    public Void cancelar() {
        return null;
    }

    @Override
    public Void concluir() {
        return null;
    }
}
