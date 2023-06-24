package entities.abstractEntities;

import java.time.LocalDate;

import entities.enumeratedEntities.Genero;
import entities.enumeratedEntities.HabAlimentar;

public class Animal {
// Declaração das variáveis.
	private String especie, id, nome;
	private Genero genero;
	private HabAlimentar dieta;
	private Boolean statusVacinado;
	private LocalDate birthdate;

// Método Default Animal.
	public Animal() {
	}

// Método Animal recebendo input e definindo valores.
	public Animal(String id, String especie, String nome, Genero genero, LocalDate birthdate, HabAlimentar dieta,
			Boolean statusVacinado) {
		setId(id);
		setEspecie(especie);
		setNome(nome);
		setGenero(genero);
		setBirthDate(birthdate);
		setDieta(dieta);
		setStatusVacinado(statusVacinado);
	}
	// Getters & Setters.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getBirthDate() {
		return birthdate;
	}

	public void setBirthDate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public HabAlimentar getDieta() {
		return dieta;
	}

	public void setDieta(HabAlimentar dieta) {
		this.dieta = dieta;
	}

	public Boolean getStatusVacinado() {
		return statusVacinado;
	}

	public void setStatusVacinado(Boolean statusVacinado) {
		this.statusVacinado = statusVacinado;
	}

	public String getEstadoDeVacina() {
		if (statusVacinado == false) {
			return "Não";
		} else {
			return "Sim";
		}
	}

// Sobrescrição do método toString de Objetos.
	@Override
	public String toString() {
		String formattedId = String.format("%-4s", id);
		String formattedEspecie = String.format("%-16s", especie);
		String formattedBirthdate = String.format("%-12s", birthdate);
		String formattedNome = String.format("%-10s", nome);
		String formattedDieta = String.format("%-11s", dieta);
		String formattedVacinado = String.format("%-5s", getEstadoDeVacina());

		return "║ ID: " + formattedId + "║ Especie: " + formattedEspecie + "║ Nome: " + formattedNome
				+ "║ Data de nascimento: " + formattedBirthdate + "║ Dieta: " + formattedDieta + "║ Está Vacinado: "
				+ formattedVacinado;
	}
}
