/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package appbanco;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leopoldo
 */
public class AppBanco {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, op = -1;
		double si, li;
		RepositorioContas repContas;
		Conta cc;
		ContaEspecial ce;
		ce = new ContaEspecial(970, 1000, 1000);
		ce.exibeConta();
		ce.debite(1500);
		ce.exibeConta();
		System.out.println("------------------------------");
		repContas = new RepositorioContas();
		for (int i = 0; i < 5; i++) {
			cc = new Conta(1000 + i, i * 100);
			repContas.insConta(cc);
		}

		repContas.insConta(ce);
		System.out.println(repContas);
		cc = repContas.buscaConta(1003);
		System.out.println(cc);
		cc.credite(1000);
		System.out.println("Foi creditado R$ 1000 na conta 1003...");
		cc.exibeConta();
		cc.debite(500);
		System.out.println(repContas);
		System.out.println("\n\n\n\n---===<< Sistema Banc�rio >>===---");
		do {
			System.out.println("==========Menu==========\n" + "[1] - Cadastrar conta\n" + "[2] - Consultar saldo\n"
					+ "[3] - Depositar\n" + "[4] - Relat�rio\n" + "[0] - Sair do sistema\n"
					+ "========================\n");
			System.out.print("Op��o: ");
			op = leia.nextInt();
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.print("==== Cadastro de Conta ====\n" + " Digite [C]- corrente ou [E]- especial:");
				char tipo = leia.nextLine().toUpperCase().charAt(0);
				if (tipo == 'C') {
					do {
						System.out.print("Dig. o n�mero da conta: ");
						num = leia.nextInt();
						cc = repContas.buscaConta(num);
						if (cc != null)
							System.out.println("Conta j� existe!");
					} while (cc != null);
					System.out.print("Dig. saldo inicial: ");
					si = leia.nextDouble();
					cc = new Conta(num, si);
					repContas.insConta(cc);
				} else {
					do {
						System.out.print("Dig. o n�mero da conta: ");
						num = leia.nextInt();
						cc = repContas.buscaConta(num);
						if (cc != null)
							System.out.println("Conta j� existe!");
					} while (cc != null);
					System.out.print("Dig. saldo inicial: ");
					si = leia.nextDouble();
					System.out.print("Dig. o limite dessa conta: ");
					li = leia.nextDouble();
					ce = new ContaEspecial(num, si, li);
					repContas.insConta(ce);
				}
				System.out.println("\n**** Conta cadastrada com sucesso! ****\n");
				break;

			case 2:
				System.out.println(
						"==== Consulta Saldo ====\n" + " Digite o n�mero da conta\n" + "========================\n");
				System.out.print("N�mero: ");
				num = leia.nextInt();
				cc = repContas.buscaConta(num);
				if (cc != null)
					System.out.println(cc);
				else
					System.out.println("Conta n�o consta!");
				break;
			case 4:
				System.out.println("==== Relat�rio ====");
				System.out.println(repContas);
				JOptionPane.showMessageDialog(null, repContas, "Relat�rio", JOptionPane.PLAIN_MESSAGE);
				break;

			default:
				break;
			}
		} while (op != 0);

		System.out.println(" --- Fim ---");
		leia.close();
	}
}