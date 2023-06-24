// Declaração do pacote.
package entities;

// Importação de pacotes utilizados.
import java.time.LocalDate;
import entities.abstractEntities.Animal;
import entities.enumeratedEntities.*;

public class AnimalVertebrado extends Animal {
// Declaração das variáveis utilizadas.
	private boolean isBilateral;
	private FiloVertebrados filoVert;

// Método Default AnimalVertebrado.
	public AnimalVertebrado() {
		super();
	}

// Método Sobrecarregado AnimalVertebrado.
	public AnimalVertebrado(String id, String especie, String nome, Genero genero, LocalDate birthdate,
			HabAlimentar dieta, Boolean statusVacinado, Boolean isRadial, FiloVertebrados filoVert) {
		super(id, especie, nome, genero, birthdate, dieta, statusVacinado);
		setBilateral(isBilateral);
		setFiloVert(filoVert);
	}

// Getters & Setters.
	public boolean isBilateral() {
		return isBilateral;
	}

	public void setBilateral(boolean isBilateral) {
		this.isBilateral = isBilateral;
	}

	public boolean getBilateral() {
		return isBilateral;
	}

	public FiloVertebrados getFiloVert() {
		return filoVert;
	}

	public void setFiloVert(FiloVertebrados filoVert) {
		this.filoVert = filoVert;
	}

	public String getAnsBilateral() {
		if (isBilateral == false) {
			return "Não";
		} else {
			return "Sim";
		}
	}

// Método toString para exibição de objetos instanciados.
	@Override
	public String toString() {
		String formattedBilateral = String.format("%-5s", getAnsBilateral());
		String formattedFiloVert = String.format("%-14s", filoVert);
		return super.toString() + "║ Bilateral: " + formattedBilateral + "║ Filo: " + formattedFiloVert + "║";
	}

}