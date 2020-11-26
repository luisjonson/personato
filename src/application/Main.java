package application;

import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quartos = 10;
		Estudante[] estudante = new Estudante[quartos];

		System.out.println("Digite a quantidade de estudante ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			
			System.out.println(estudante[i]);

			System.out.print("Digite o numero do quarto ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();

			if (estudante[numeroQuarto] == null) {

				System.out.println("Digite o nome: ");
				String nome = sc.nextLine();
				System.out.println("Digite o email: ");
				String email = sc.nextLine();

				estudante[numeroQuarto] = new Estudante(nome, email);
			}

		}

		for (int i = 0; i < estudante.length; i++) {

			if (estudante[i] != null) {

				System.out.println(estudante[i].getNome());
				System.out.println(estudante[i].getEmail());
				System.out.println("Room " + i);
			}

		}
		System.out.println("FIM");
	}

}
