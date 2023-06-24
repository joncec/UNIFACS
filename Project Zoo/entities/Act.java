// Declaração do pacote.
package entities;

// Importação de pacotes utilizados.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import entities.abstractEntities.Animal;
import entities.enumeratedEntities.*;

public class Act {
	static Scanner scanner = new Scanner(System.in);

// Método register para registro de objetos herdeiros de Animal.
	public static void register(ArrayList<Animal> registros) {
		int idx = 1;

// Percorre a lista de animais existentes para obter o maior ID
		for (Animal animal : registros) {
			int currentId = Integer.parseInt(animal.getId());
			if (currentId >= idx) {
				idx = currentId + 1;
			}
		}
		String id = Integer.toString(idx);
		System.out.println("        ╔══════════════════════╗");
		System.out.println("╞═══════╣  Registro de Animal  ╠═══════╡");
		System.out.println("        ╚══════════════════════╝");

		String especie;
		do {
			System.out.print("Digite a espécie: ");
			especie = scanner.next();
			scanner.nextLine();
		} while (especie.isEmpty());

		Genero genero = null;
		int opcaogen = 0;
		do {
			generoMenu();
			try {
				opcaogen = scanner.nextInt();
				switch (opcaogen) {
				case 1: 
					System.out.println("O gênero é Femêa!");
					genero = Genero.Femêa;
					break;
				case 2:
					System.out.println("O gênero é Hermafrodita!");
					genero = Genero.Hermafrodita;
					break;
				case 3:
					System.out.println("O gênero é Macho!");
					genero = Genero.Macho;
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número válido.");
				scanner.nextLine(); // Limpa a entrada inválida do Scanner
			}
		} while (opcaogen < 1 || opcaogen > 3);

		String nome;
		do {
			System.out.print("Digite o Nome: ");
			nome = scanner.next();
			scanner.nextLine();
		} while (nome.isEmpty());

		LocalDate birthdate = null;
		do {
			System.out.print("Digite uma data (formato: ddMMyyyy): ");
			String input = scanner.nextLine();
// Remover quaisquer caracteres não numéricos.
			String numericInput = input.replaceAll("[^0-9]", "");
// Verificar se a entrada possui 8 dígitos (ddMMyyyy)
			if (numericInput.length() == 8) {
// Interpretar a string como data.
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
				try {
					birthdate = LocalDate.parse(numericInput, formatter);
					System.out.println("Data Inserida: " + birthdate);
				} catch (DateTimeParseException e) {
					System.out.println("Formato inválido! Digite uma data no formato ddMMyyyy.");
				}
			} else {
				System.out.println("Formato inválido! Digite uma data no formato ddMMyyyy.");
			}
		} while (birthdate == null);

		Boolean statusVacinado = null;
		int opcaoVac;
		do {
			vacMenu();
			try {
				opcaoVac = scanner.nextInt();
				switch (opcaoVac) {
				case 1:
					System.out.println("Animal vacinado!");
					statusVacinado = true;
					break;
				case 2:
					System.out.println("Animal não vacinado!");
					statusVacinado = false;
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número válido.");
// Limpa a entrada inválida do Scanner
				scanner.nextLine();
				opcaoVac = 0;
			}
		} while (opcaoVac != 1 && opcaoVac != 2);

		HabAlimentar dieta = null;
		int opcaoDieta = 0;
		do {
			dietaMenu();
			if (scanner.hasNextInt()) {
				opcaoDieta = scanner.nextInt();
				switch (opcaoDieta) {
				case 1:
					System.out.println("O animal é carnívoro!");
					dieta = HabAlimentar.Carnívoro;
					break;
				case 2:
					System.out.println("O animal é herbívoro!");
					dieta = HabAlimentar.Herbívoro;
					break;
				case 3:
					System.out.println("O animal é onívoro!");
					dieta = HabAlimentar.Onívoro;
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
					break;
				}
			} else {
				System.out.println("Entrada inválida. Por favor, digite um número válido.");
				scanner.next();
			}
		} while (opcaoDieta < 1 || opcaoDieta > 3);

// Declara variável de controle para seleção de classe filho (Invertebrado/Vertebrado).
		int tipoescolha = 0;
		do {
			diffMenu();
			if(scanner.hasNextInt()) {
			tipoescolha = scanner.nextInt();
			switch (tipoescolha) {
			case 1:
				System.out.println("Vertebrado ");
				Boolean isBilateral = null;
				int opcaoBil = 0;
				do {
					bilateralMenu();
					if (scanner.hasNextInt()) {
						opcaoBil = scanner.nextInt();
						switch (opcaoBil) {
						case 1:
							System.out.println("O animal é bilateral!");
							isBilateral = true;
							break;
						case 2:
							System.out.println("O animal não é bilateral!");
							isBilateral = false;
							break;
						default:
							System.out.println("Opção inválida. Por favor, escolha novamente.");
							break;
						}
					
					} else {
						System.out.println("Entrada inválida. Por favor, digite um número válido.");
						scanner.next();
					}
				} while (opcaoBil != 1 && opcaoBil != 2);

				int menuesc = 0;
				FiloVertebrados filoVert = null;
				do {

					menuVert();

					if (scanner.hasNextInt()) {
						menuesc = scanner.nextInt();

						switch (menuesc) {
						case 1:

							filoVert = FiloVertebrados.ANFÍBIOS;

							break;
						case 2:
							filoVert = FiloVertebrados.AVES;
							break;
						case 3:
							filoVert = FiloVertebrados.MAMÍFEROS;
							break;
						case 4:
							filoVert = FiloVertebrados.PEIXES;
							break;
						case 5:
							filoVert = FiloVertebrados.RÉPTEIS;
							break;
						default:
							System.out.println("Opção inválida. Por favor, escolha novamente.");
							break;
						}
					} else {
						System.out.println("Entrada inválida. Por favor, digite um número válido.");
						scanner.next();
					}
				} while (menuesc < 1 || menuesc > 5);

				AnimalVertebrado AnVert = new AnimalVertebrado(id, especie, nome, genero, birthdate, dieta,
						statusVacinado, isBilateral, filoVert);
				registros.add(AnVert);
				System.out.println("Animal Registrado com sucesso!");
				break;
			case 2:
				System.out.println("Invertebrado ");
				Boolean isRadial = null;
				int opcaoRad = 0;
				do {
					radialMenu();
					if (scanner.hasNextInt()) {
						opcaoRad = scanner.nextInt();
						switch (opcaoRad) {
						case 1:
							System.out.println("O animal é Radial!");
							isRadial = true;
							break;
						case 2:
							System.out.println("O animal não é Radial!");
							isRadial = false;
							break;
						default:
							System.out.println("Opção inválida. Por favor, escolha novamente.");
							break;
						}
					} else {
						System.out.println("Entrada inválida. Por favor, digite um número válido.");
						scanner.next();
					}
				} while (opcaoRad != 1 && opcaoRad != 2);

				int menuesco = 0;
				FiloInvertebrados filoInv = null;
				do {
					menuInvert();
					if (scanner.hasNextInt()) {
						menuesco = scanner.nextInt();

						switch (menuesco) {
						case 1:
							filoInv = FiloInvertebrados.ANELÍDEOS;
							break;
						case 2:
							filoInv = FiloInvertebrados.ARTRÓPEDES;
							break;
						case 3:
							filoInv = FiloInvertebrados.CNIDÁRIOS;
							break;
						case 4:
							filoInv = FiloInvertebrados.EQUINODERMOS;
							break;
						case 5:
							filoInv = FiloInvertebrados.MOLUSCO;
							break;
						case 6:
							filoInv = FiloInvertebrados.NEMATELMINTOS;
							break;
						case 7:
							filoInv = FiloInvertebrados.PLATELMINTOS;
							break;
						case 8:
							filoInv = FiloInvertebrados.PORÍFEROS;
							break;
						default:
							System.out.println("Opção inválida. Por favor, escolha novamente.");
							break;
						}
					} else {
						System.out.println("Entrada inválida. Por favor, digite um número válido.");
						scanner.next();
					}
				} while (menuesco < 1 || menuesco > 8);

				AnimalInvertebrado AnInvert = new AnimalInvertebrado(id, especie, nome, genero, birthdate, dieta,
						statusVacinado, isRadial, filoInv);
				registros.add(AnInvert);
				System.out.println("Animal Registrado com sucesso!");
				break;
			default:
				System.out.println("erro");
			}
			} else {
				System.out.println("Entrada inválida. Por favor, digite um número válido.");
				scanner.next();
			}

		} while (tipoescolha != 1 && tipoescolha != 2);

	}

	public static void vacMenu() {
		System.out.println("╔════════════════════╗");
		System.out.println("║  Animal vacinado:  ║");
		System.out.println("╠════════════════════╣");
		System.out.println("║[1] Sim             ║");
		System.out.println("║[2] Não             ║");
		System.out.println("╚════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void dietaMenu() {
		System.out.println("╔══════════════════════╗");
		System.out.println("║  Escolha uma dieta:  ║");
		System.out.println("╠══════════════════════╣");
		System.out.println("║[1] Carnívoro         ║");
		System.out.println("║[2] Herbívoro         ║");
		System.out.println("║[3] Onívoro           ║");
		System.out.println("╚══════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void bilateralMenu() {
		System.out.println("╔═══════════════════════╗");
		System.out.println("║  Animal é bilateral:  ║");
		System.out.println("╠═══════════════════════╣");
		System.out.println("║[1] Sim                ║");
		System.out.println("║[2] Não                ║");
		System.out.println("╚═══════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void radialMenu() {
		System.out.println("╔════════════════════╗");
		System.out.println("║  Animal é radial:  ║");
		System.out.println("╠════════════════════╣");
		System.out.println("║[1] Sim             ║");
		System.out.println("║[2] Não             ║");
		System.out.println("╚════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void diffMenu() {
		System.out.println("╔═════════════════╗");
		System.out.println("║   O animal é:   ║");
		System.out.println("╠═════════════════╣");
		System.out.println("║[1] Vertebrado   ║");
		System.out.println("║[2] Invertebrado ║");
		System.out.println("╚═════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void menuInvert() {
		System.out.println("╔══════════════════════════╗");
		System.out.println("║  Qual o filo do animal:  ║");
		System.out.println("╠══════════════════════════╣");
		System.out.println("║[1] Anelídeos             ║");
		System.out.println("║[2] Artrópodes            ║");
		System.out.println("║[3] Cnidários             ║");
		System.out.println("║[4] Equinodermos          ║");
		System.out.println("║[5] Molusco               ║");
		System.out.println("║[6] Nemaltelmintos        ║");
		System.out.println("║[7] Platelmintos          ║");
		System.out.println("║[8] Poríferos             ║");
		System.out.println("╚══════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void menuVert() {
		System.out.println("╔══════════════════════════╗");
		System.out.println("║  Qual o filo do animal:  ║");
		System.out.println("╠══════════════════════════╣");
		System.out.println("║[1] Anfíbios              ║");
		System.out.println("║[2] Aves                  ║");
		System.out.println("║[3] Mamíferos             ║");
		System.out.println("║[4] Peixes                ║");
		System.out.println("║[5] Repteis               ║");
		System.out.println("╚══════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

// Método printList para impressão de registros.
	public static void printList(ArrayList<Animal> registros) {
// Ordena a lista em ordem numérica (ID)
		bubbleSortByID(registros);

// Utiliza o método toString de cada classe para impressão de seus atributos
		System.out.println("\nRegistros:");
		for (Animal registro : registros) {
			System.out.println(registro.toString());
		}
	}

// Método update para atualização de registros.
	public static void update(ArrayList<Animal> registros) {
		System.out.println("        ╔════════════════════╗");
		System.out.println("╞═══════╣  Atualizar Animal  ╠═══════╡");
		System.out.println("        ╚════════════════════╝");
// Identificação do objeto Animal.
	
		System.out.print("ID do animal: ");
		String id = scanner.next();
		Animal animalEncontrado = null;
		for (Animal registro : registros) {
			if (registro.getId().equals(id)) {
				animalEncontrado = registro;
				break;
			}
		}
// Validação do input.
		if (animalEncontrado != null ) {
			int updtEsc = 0;
			do {
				menuUpdate();
				if(scanner.hasNextInt()) {
					updtEsc = scanner.nextInt();

				switch (updtEsc) {
				case 1:
					System.out.print("Novo nome: ");
					String novoNome = scanner.next();
					animalEncontrado.setNome(novoNome);
					System.out.println("Nome do animal atualizado com sucesso.");
					break;
				case 2:
					System.out.print("Nova data de nascimento: ");
					scanner.nextLine();
					String date = scanner.nextLine();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
					LocalDate novoBirthDate = LocalDate.parse(date, formatter);
					animalEncontrado.setBirthDate(novoBirthDate);
					System.out.println("Data de nascimento do animal atualizada com sucesso.");
					break;
				case 3:
					System.out.print("Novo status de vacina (Sim ou Não): ");
					String novoStatusStr = scanner.next().toLowerCase();
					Boolean novoStatus = null;
					if (novoStatusStr.equals("sim")) {
						novoStatus = true;
					} else if (novoStatusStr.equals("não")) {
						novoStatus = false;
					} else {
						System.out.println("Opção inválida. O status de vacinação permanecerá o mesmo.");
					}
					if (novoStatus != null) {
						animalEncontrado.setStatusVacinado(novoStatus);
						System.out.println("Status de vacinação do animal atualizado com sucesso.");
					}
					break;
				case 4:
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
					break;
				}
				
				}	 else {
					System.out.println("Entrada inválida. Por favor, digite um número válido.");
					scanner.next();
				}
				
			} while (updtEsc != 4);
		} else {
			System.out.println("Animal não encontrado.");
		}
	}

	public static void menuUpdate() {
		System.out.println("╔═══════════════════════════════════╗");
		System.out.println("║  Qual campo você deseja alterar:  ║");
		System.out.println("╠═══════════════════════════════════╣");
		System.out.println("║[1] Nome                           ║");
		System.out.println("║[2] Data de nascimento             ║");
		System.out.println("║[3] Status de vacina               ║");
		System.out.println("║[4] Voltar                         ║");
		System.out.println("╚═══════════════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void upvacMenu() {
		System.out.println("╔═════════════════════╗");
		System.out.println("║  Status de vacina:  ║");
		System.out.println("╠═════════════════════╣");
		System.out.println("║[1] Vacinado         ║");
		System.out.println("║[2] Não vacinado     ║");
		System.out.println("╚═════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void sort(ArrayList<Animal> registros) {
		int sortEscolha;
		do {
			sortMenu();
			sortEscolha = scanner.nextInt();

			switch (sortEscolha) {
			case 1:
				bubbleSortByID(registros);
				System.out.println("Registros ordenados por ID:");
				printRegistros(registros);
				break;
			case 2:
				bubbleSortByEspecie(registros);
				System.out.println("Registros ordenados por espécie:");
				printRegistros(registros);
				break;
			case 3:
				bubbleSortByStatusVacinado(registros);
				System.out.println("Registros ordenados por status de vacinação:");
				printRegistros(registros);
				break;
			case 4:
				System.out.println("Voltando...");
				break;
			default:
				System.out.println("Critério de ordenação inválido.");
				break;
			}
		} while (sortEscolha != 4);
	}

	private static void bubbleSortByID(ArrayList<Animal> registros) {
		int n = registros.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Animal animal1 = registros.get(j);
				Animal animal2 = registros.get(j + 1);
				if (animal1.getId().compareTo(animal2.getId()) > 0) {
					registros.set(j, animal2);
					registros.set(j + 1, animal1);
				}
			}
		}
	}

	private static void bubbleSortByEspecie(ArrayList<Animal> registros) {
		int n = registros.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Animal animal1 = registros.get(j);
				Animal animal2 = registros.get(j + 1);
				if (animal1.getEspecie().compareTo(animal2.getEspecie()) > 0) {
					registros.set(j, animal2);
					registros.set(j + 1, animal1);
				}
			}
		}
	}

	private static void bubbleSortByStatusVacinado(ArrayList<Animal> registros) {
		int n = registros.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				Animal animal1 = registros.get(j);
				Animal animal2 = registros.get(j + 1);
				if (Boolean.compare(animal1.getStatusVacinado(), animal2.getStatusVacinado()) < 0) {
					registros.set(j, animal2);
					registros.set(j + 1, animal1);
				}
			}
		}
	}

	private static void printRegistros(ArrayList<Animal> registros) {
		for (Animal registro : registros) {
			System.out.println(registro);
		}
	}

// Menu de usado no método sort.
	public static void sortMenu() {
// Menu exibido no método "sort".
		System.out.println("╔══════════════════════════╗");
		System.out.println("║  Selecione um critério:  ║");
		System.out.println("╠══════════════════════════╣");
		System.out.println("║[1] ID                    ║");
		System.out.println("║[2] Espécie               ║");
		System.out.println("║[3] Status da vacina      ║");
		System.out.println("║[4] Voltar                ║");
		System.out.println("╚══════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

// Método delete para remoção de registros.
	public static void delete(ArrayList<Animal> registros) {
		System.out.println("        ╔═════════════════════╗");
		System.out.println("╞═══════╣ Deleção de registro ╠═══════╡");
		System.out.println("        ╚═════════════════════╝");
		System.out.print("\nDigite o ID do registro a ser deletado: ");
		String id = scanner.nextLine();

		if (isValidId(id)) {
			Animal registroRemovido = null;
			for (Animal registro : registros) {
				if (registro.getId().equals(id)) {
					registroRemovido = registro;
					break;
// Encontrou o registro, não é necessário continuar o loop
				}
			}

			if (registroRemovido != null) {
				deleteMenu();
				int confirmacao = scanner.nextInt();
				scanner.nextLine();

				if (confirmacao == 1) {
					registros.remove(registroRemovido);
					System.out.println("Registro removido com sucesso!");
				} else {
					System.out.println("Operação de remoção cancelada.");
				}
			} else {
				System.out.println("Nenhum registro encontrado com o ID fornecido.");
			}
		} else {
			System.out.println("ID inválido. Por favor, digite um ID válido contendo apenas números.");
		}
	}

	public static boolean isValidId(String id) {
		return id.matches("\\d+");
	}

	public static void deleteMenu() {
// Menu exibido no método "delete".
		System.out.println("╔═════════════════════════════╗");
		System.out.println("║  Deseja confirmar deleção:  ║");
		System.out.println("╠═════════════════════════════╣");
		System.out.println("║[1] Sim                      ║");
		System.out.println("║[2] Não                      ║");
		System.out.println("╚═════════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

// Método search para buscar registros.
	public static void search(ArrayList<Animal> registros) {

		int critescolha;
		System.out.println("        ╔═════════════════════╗");
		System.out.println("╞═══════╣  Busca de registro  ╠═══════╡");
		System.out.println("        ╚═════════════════════╝");
		do {
			searchMenu();
// Exibição do menu e definição do valor "critescolha".
			critescolha = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Digite o valor de pesquisa: ");
			String valor = scanner.next();
// Criação de um ArrayList que será utilizado para conter objetos de Animal caso encontrados.
			ArrayList<Animal> resultados = new ArrayList<>();

			for (Animal registro : registros) {
				switch (critescolha) {
// Cases onde é rodado um loop que adiciona a "resultados" o valor caso encontrado correspondente.
				case 1:
					if (registro.getId().equalsIgnoreCase(valor)) {
						resultados.add(registro);
						scanner.nextLine();
					}
					break;

				case 2:
					if (registro.getEspecie().equalsIgnoreCase(valor)) {
						resultados.add(registro);
					}
					break;
				case 3:
					if (registro.getNome().equalsIgnoreCase(valor)) {
						resultados.add(registro);
					}
					break;

				default:
					System.out.println("Critério de pesquisa inválido.");
					return;
				}
			}

			if (resultados.isEmpty()) {
				System.out.println("Nenhum registro encontrado com base nos critérios de pesquisa fornecidos.");
			} else {
				System.out.println("Registros encontrados:");
				for (Animal resultado : resultados) {
					System.out.println(resultado);
				}
			}
		} while (critescolha != 1 && critescolha != 2 && critescolha != 3);
	}

// Menu de usado no método search.
	public static void searchMenu() {
// Menu utilizado em "search".
		System.out.println("╔═══════════════════════════╗");
		System.out.println("║  Selecione um críterio :  ║");
		System.out.println("╠═══════════════════════════╣");
		System.out.println("║[1] ID                     ║");
		System.out.println("║[2] Espécie                ║");
		System.out.println("║[3] Nome                   ║");
		System.out.println("║[4] Voltar                 ║");
		System.out.println("╚═══════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void generoMenu() {
		System.out.println("╔═════════════════════════════╗");
		System.out.println("║  Qual o gênero do animal :  ║");
		System.out.println("╠═════════════════════════════╣");
		System.out.println("║[1] Femêa                    ║");
		System.out.println("║[2] Hermafrodita             ║");
		System.out.println("║[3] Macho                    ║");
		System.out.println("╚═════════════════════════════╝");
		System.out.print("Escolha uma opção: ");
	}

	public static void vertMenu() {
		System.out.println("╔═══════════════════╗");
		System.out.println("║  Este animal é :  ║");
		System.out.println("╠═══════════════════╣");
		System.out.println("║[1] Vertebrado     ║");
		System.out.println("║[2] Invertebrado   ║");
		System.out.println("╚═══════════════════╝");
	}

}