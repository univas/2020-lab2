package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Game;
import br.edu.univas.vo.Team;

public class StartApp {

	public static Scanner scanner = new Scanner(System.in);
	public static int max = 50;
	public static Team[] teams = new Team[max];
	public static Game[] games = new Game[max];
	
	public static void main(String[] args) {
		int option = 1;
		
		do {
			printMenu();
			option = readIntegerValue();
			chooseOption(option);
			
		} while(option != 9);
	}
	
	public static void printMenu() {
		System.out.println("\n\n");
		System.out.println("*******************************");
		System.out.println("*****CAMPEONATO DE FUTEBOL*****");
		System.out.println("*******************************");
		System.out.println("\n");
		System.out.println("1 – Cadastrar Time"); 
		System.out.println("2 – Editar Time");
		System.out.println("3 – Excluir Time"); 
		System.out.println("4 – Cadastrar Jogo"); 
		System.out.println("5 – Editar Jogo"); 
		System.out.println("6 – Excluir Jogo"); 
		System.out.println("7 – Listar Classificação do Campeonato"); 
		System.out.println("9 – Sair");
		System.out.print("\n\nDigite sua opção:");
	}
	
	public static int readIntegerValue() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
	
	public static void chooseOption(int option) {
		switch (option) {
		case 1:
			saveNewTeam();
			break;
		case 2:
			editTeam();
			break;
		case 3: 
			deleteTeam();
			break;
		case 4:
			saveNewGame();
			break;
		case 5:
			editGame();
			break;
		case 6:
			deleteGame();
			break;
		case 7: 
			printStanding();
			break;
		case 9:
			printExitMessage();
			break;
		default:
			printIllegalOptionMessage();
		}
	}
	
	public static void saveNewTeam() {
		Team newTeam = new Team();
				
		System.out.println("\nCadastrar novo time\n");
		System.out.println("Digite o nome do time:");
		newTeam.name = scanner.nextLine();
		
		System.out.println("Digite o estado do time:");
		newTeam.state = scanner.nextLine();
		
		int index = findNextNullValueTeamSlot();
		teams[index] = newTeam;
		
		System.out.println("\nTime cadastrado com sucesso!");
	}
	
	public static void editTeam() {
		System.out.println("\nEditar time\n");
		printTeams();
		
		System.out.print("Digite o número do time que você quer editar:");
		int indexFromTeam = readIntegerValue() - 1;
		
		Team team = teams[indexFromTeam];
		
		System.out.println("Digite o nome do time:");
		team.name = scanner.nextLine();
		
		System.out.println("Digite o estado do time:");
		team.state = scanner.nextLine();
		
		System.out.println("\nTime editado com sucesso!");
	}
	
	public static void deleteTeam() {
		System.out.println("\nRemover time\n");
		printTeams();
		
		System.out.print("Digite o número do time que você quer remover:");
		int indexFromTeam = readIntegerValue() - 1;
		
		Team team = teams[indexFromTeam];
		deleteGameFromTeam(team);
		
		teams[indexFromTeam] = null;
		moveNullTeamToTheEnd();
		
		System.out.println("\nTime removido com sucesso!");
	}
	
	public static void saveNewGame() {
		Game newGame = new Game();
		
		System.out.println("\nCadastrar novo jogo\n");
		printTeams();
		
		System.out.print("Digite o número do time mandante:");
		int homeIndexFromTeam = readIntegerValue() - 1;
		newGame.home = teams[homeIndexFromTeam];
		
		System.out.print("Digite a quantidade de gol(s) do time mandante:");
		newGame.homeGoal = readIntegerValue();
		
		System.out.print("Digite o número do time visitante:");
		int guestIndexFromTeam = readIntegerValue() - 1;
		newGame.guest = teams[guestIndexFromTeam];

		System.out.print("Digite a quantidade de gol(s) do time visitante:");
		newGame.guestGoal = readIntegerValue();
		
		int index = findNextNullValueGameSlot();
		games[index] = newGame;
		
		System.out.println("\nJogo cadastrado com sucesso!");
	}
	
	public static void editGame() {
		System.out.println("\nEditar jogo\n");
		printGames();
		
		System.out.print("Digite o número do jogo que você quer editar:");
		int indexFromGame = readIntegerValue() - 1;
		
		Game game = games[indexFromGame];
		printTeams();
		
		System.out.print("Digite o número do time mandante:");
		int homeIndexFromTeam = readIntegerValue() - 1;
		game.home = teams[homeIndexFromTeam];
		
		System.out.print("Digite a quantidade de gol(s) do time mandante:");
		game.homeGoal = readIntegerValue();
		
		System.out.print("Digite o número do time visitante:");
		int guestIndexFromTeam = readIntegerValue() - 1;
		game.guest = teams[guestIndexFromTeam];

		System.out.print("Digite a quantidade de gol(s) do time visitante:");
		game.guestGoal = readIntegerValue();
		
		System.out.println("\nJogo editado com sucesso!");
	}
	
	public static void deleteGame() {
		System.out.println("\nRemover jogo\n");
		printGames();
		
		System.out.print("Digite o número do jogo que você quer remover:");
		int indexFromGame = readIntegerValue() - 1;
		
		games[indexFromGame] = null;
		moveNullGameToTheEnd(indexFromGame);
		
		System.out.println("\nJogo removido com sucesso!");
	}
	
	public static void printStanding() {
		System.out.println("\nClassificação do campeonato\n");
		
		Team[] standing = calculateClassification();
		
		for (int i = 0; i < max; i++) {
			Team team = standing[i];
			if (team != null) {
				System.out.println((i + 1) + " - " + 
						team.name + " - " +
						team.point + " - " +
						team.goalDifference);
			} else {
				break;
			}
		}
	}
	
	public static void printExitMessage() {
		System.out.println("\nSaindo...");
	}
	
	public static void printIllegalOptionMessage() {
		System.out.println("\nOpção errada!\n");
	}
	
	public static int findNextNullValueTeamSlot() {
		for (int i = 0; i < max; i++) {
			if (teams[i] == null) {
				return i;
			}
		}
		
		//aqui deveríamos tratar esse caso de outra forma!
		return -1;
	}
	
	public static int findNextNullValueGameSlot() {
		for (int i = 0; i < max; i++) {
			if (games[i] == null) {
				return i;
			}
		}
		
		//aqui deveríamos tratar esse caso de outra forma!
		return -1;
	}
	
	public static void printTeams() {
		System.out.println("Times:");
		
		for (int i = 0; i < max; i++) {
			if (teams[i] != null) {
				System.out.println((i + 1) + " - " + teams[i].name);
			} else {
				break;
			}
		}
	}
	
	public static void printGames() {
		System.out.println("Jogos:");
		
		for (int i = 0; i < max; i++) {
			Game game = games[i];
			if (game != null) {
				System.out.println((i + 1) + " - " + 
						game.home.name + " " + game.homeGoal +
						" X " +
						game.guestGoal + " " + game.guest.name);
			} else {
				break;
			}

		}
	}
	
	public static void deleteGameFromTeam(Team team) {
		for (int i = 0; i < max; i++) {
			Game game = games[i];
			if (game != null && (game.home.name.equals(team.name) || game.guest.name.equals(team.name))) {
				games[i] = null;
				moveNullGameToTheEnd(i);
				i--;
			}
		}
	}
	
	public static Team[] calculateClassification() {
		for (int i = 0; i < max; i++) {
			Team team = teams[i];
			if (team != null) {
				team.point = 0;
				team.goalDifference = 0;
				calculatePointsByTeam(team);
			}
		}
		
		return orderTeams();
	}

	public static void calculatePointsByTeam(Team team) {
		for (int i = 0; i < max; i++) {
			Game game = games[i];
			if (game != null) {
				int point = 0;
				if (game.homeGoal == game.guestGoal) {
					point = 1;
				}
				
				if (game.home.name.equals(team.name)) {
					team.goalDifference += game.homeGoal - game.guestGoal;
					if (game.homeGoal > game.guestGoal) {
						point = 3;
					}
					team.point += point;
						
				} else if (game.guest.name.equals(team.name)) {
					team.goalDifference += game.guestGoal - game.homeGoal;
					if (game.guestGoal > game.homeGoal) {
						point = 3;
					}
					team.point += point;
				}
				
			}
		}
	}
	
	public static Team[] orderTeams() {
		Team[] orderedTeams = copyTeamArray();
		
		boolean changed = false;
		
		do {
			changed = false;
			for (int i = 0; i < max - 1; i++) {
				Team currentTeam = orderedTeams[i];
				Team nextTeam = orderedTeams[i + 1];
				
				if (nextTeam == null) {
					break;
				}
				
				if (currentTeam.point < nextTeam.point ||
				   (currentTeam.point == nextTeam.point && currentTeam.goalDifference < nextTeam.goalDifference)) {
					Team aux = currentTeam;
					orderedTeams[i] = nextTeam;
					orderedTeams[i + 1] = aux;
					changed = true;
				}
			}
			
		} while(changed);
		
		return orderedTeams;
	}
	
	public static Team[] copyTeamArray() {
		Team[] orderedTeams = new Team[max];
		for (int i = 0; i < max; i++) {
			orderedTeams[i] = teams[i];
		}
		return orderedTeams;
	}
	
	public static void moveNullTeamToTheEnd() {
		for (int i = 0; i < max - 1; i++) {
			Team currentTeam = teams[i];
			Team nextTeam = teams[i + 1];
			if (currentTeam == null && nextTeam != null) {
				Team aux = currentTeam;
				teams[i] = nextTeam;
				teams[i + 1] = aux;
			} else if (currentTeam == null && nextTeam == null) {
				break;
			}
		}
	}
	
	public static void moveNullGameToTheEnd(int index) {
		for (int i = index; i < max - 1; i++) {
			Game currentGame = games[i];
			Game nextGame = games[i + 1];
			if (currentGame == null && nextGame != null) {
				Game aux = currentGame;
				games[i] = nextGame;
				games[i + 1] = aux;
			} else if (currentGame == null && nextGame == null) {
				break;
			}
		}
	}
	
}
