package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] alturas = new double[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		System.out.println();

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += alturas[i];
		}
		double media = soma / n;

		System.out.printf("Altura média: %.2f\n", media);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				cont = cont + 1;
			}

		}
		double percentual = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
