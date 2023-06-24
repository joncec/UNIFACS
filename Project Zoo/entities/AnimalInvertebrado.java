// Declaração do pacote.
package entities;

import java.time.LocalDate;

// Importação de pacotes utilizados.
import entities.abstractEntities.Animal;
import entities.enumeratedEntities.*;

public class AnimalInvertebrado extends Animal {
// Declaração das variáveis utilizadas.
	private boolean isRadial;
	private FiloInvertebrados filoInv;

// Método Default AnimalInvertebrado.
	public AnimalInvertebrado() {
		super();
	}

// Método Sobrecarregado AnimalInvertebrado.
	public AnimalInvertebrado(String id, String especie, String nome, Genero genero, LocalDate birthdate,
			HabAlimentar dieta, Boolean statusVacinado, Boolean isRadial, FiloInvertebrados filoInv) {
		super(id, especie, nome, genero, birthdate, dieta, statusVacinado);
		setRadial(isRadial);
		setFiloInv(filoInv);
	}

// Getters & Setters.
	public boolean isRadial() {
		return isRadial;
	}

	public void setRadial(boolean isRadial) {
		this.isRadial = isRadial;
	}

	public boolean getRadial() {
		return isRadial;
	}

	public FiloInvertebrados getFiloInv() {
		return filoInv;
	}

	public void setFiloInv(FiloInvertebrados filoInv) {
		this.filoInv = filoInv;
	}

	public String getAnsRadial() {
		if (isRadial == false) {
			return "Não";
		} else {
			return "Sim";
		}
	}

	// Método toString para exibição de objetos instanciados.
	@Override
	public String toString() {
		String formattedRadial = String.format("%-8s", getAnsRadial());
		String formattedFiloInv = String.format("%-14s", filoInv);
		return super.toString() + "║ Radial: " + formattedRadial + "║ Filo: " + formattedFiloInv + "║";
	}

}