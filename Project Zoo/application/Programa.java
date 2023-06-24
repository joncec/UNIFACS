// Declaração do pacote.
package application;

import java.time.LocalDate;
// Importação de pacotes utilizados.
import java.util.ArrayList;
import java.util.Scanner;
import entities.Act;
import entities.AnimalInvertebrado;
import entities.AnimalVertebrado;
import entities.abstractEntities.Animal;
import entities.enumeratedEntities.*;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Animal> registros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

// Método que ja adiciona alguns objetos ao sistema.
		préRegistros(registros);

		int menuescolha = 0;
// Loop para exibição do menu.
		do {
// Exibe o menu e recebe a escolha do usuário.
			exibirMenu();
			if (scanner.hasNextInt()) {
				menuescolha = scanner.nextInt();

// Chama o método de entities.Act referente a opção escolhida.
				switch (menuescolha) {
				case 1:
					System.out.println("Opção 1 selecionada.");
					Act.register(registros);
					break;
				case 2:
					System.out.println("Opção 2 selecionada.");
					Act.printList(registros);
					break;
				case 3:
					System.out.println("Opção 3 selecionada.");
					Act.update(registros);
					break;
				case 4:
					System.out.println("Opção 4 selecionada.");
					Act.sort(registros);
					break;
				case 5:
					System.out.println("Opção 5 selecionada.");
					Act.delete(registros);
					break;
				case 6:
					System.out.println("Opção 6 selecionada.");
					Act.search(registros);
					break;
				case 7:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
			} else {
				System.out.println("Entrada inválida. Por favor, digite um número válido.");
				scanner.next();
			}
		} while (menuescolha != 7);

		scanner.close();
	}

// Menu a ser exibido.
	public static void exibirMenu() {
		System.out.println("╔══════════════════════════════════╗");
		System.out.println("║          MENU PRINCIPAL          ║");
		System.out.println("╠══════════════════════════════════╣");
		System.out.println("║[1] Registrar animal              ║");
		System.out.println("║[2] Vizualizar lista de registros ║");
		System.out.println("║[3] Atualizar registro            ║");
		System.out.println("║[4] Organizar registro            ║");
		System.out.println("║[5] Deletar registro              ║");
		System.out.println("║[6] Procurar registro             ║");
		System.out.println("║[7] Sair                          ║");
		System.out.println("╚══════════════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

// Objetos pré registrados.
	public static void préRegistros(ArrayList<Animal> registros) {
// Instanciação dos objetos Animal e adesão destes ao registro fornecido ao chamar esta função.

		Animal leao = new AnimalVertebrado("01", "Leão", "Colossal", Genero.Macho, LocalDate.of(2020, 05, 30),
				HabAlimentar.Carnívoro, true, true, FiloVertebrados.MAMÍFEROS);
		Animal lombriga = new AnimalInvertebrado("02", "Lombriga", "Carlos", Genero.Macho, LocalDate.of(2020, 05, 21),
				HabAlimentar.Onívoro, false, true, FiloInvertebrados.PLATELMINTOS);
		Animal aguaviva = new AnimalInvertebrado("03", "Agua-Viva", "Larry", Genero.Macho, LocalDate.of(2020, 05, 21),
				HabAlimentar.Carnívoro, false, true, FiloInvertebrados.CNIDÁRIOS);
		Animal polvo = new AnimalInvertebrado("04", "Polvo", "Octopus", Genero.Macho, LocalDate.of(2020, 05, 21),
				HabAlimentar.Carnívoro, true, true, FiloInvertebrados.MOLUSCO);
		Animal estrela = new AnimalInvertebrado("05", "Estrela-do-Mar", "Patrick", Genero.Hermafrodita,
				LocalDate.of(2020, 05, 21), HabAlimentar.Onívoro, false, false, FiloInvertebrados.EQUINODERMOS);
		Animal girafa = new AnimalVertebrado("06", "Girafa", "Melman", Genero.Macho, LocalDate.of(2020, 05, 21),
				HabAlimentar.Herbívoro, true, true, FiloVertebrados.MAMÍFEROS);
		Animal hipopotamo = new AnimalVertebrado("07", "Hipopótamo", "Glória", Genero.Femêa, LocalDate.of(2020, 05, 21),
				HabAlimentar.Herbívoro, true, true, FiloVertebrados.MAMÍFEROS);
		Animal aranha = new AnimalInvertebrado("08", "Aranha", "Rosie", Genero.Femêa, LocalDate.of(2020, 05, 21),
				HabAlimentar.Carnívoro, false, false, FiloInvertebrados.ARTRÓPEDES);
		Animal esponja = new AnimalInvertebrado("09", "Esponja", "Bob", Genero.Hermafrodita, LocalDate.of(2020, 05, 21),
				HabAlimentar.Carnívoro, false, false, FiloInvertebrados.PORÍFEROS);

		registros.add(leao);
		registros.add(lombriga);
		registros.add(aguaviva);
		registros.add(polvo);
		registros.add(estrela);
		registros.add(girafa);
		registros.add(hipopotamo);
		registros.add(aranha);
		registros.add(esponja);

	}

}
