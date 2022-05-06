import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	Jogador jogador = new Jogador();
	
	
	System.out.println("Entre com o seu nome: ");
	jogador.nome = leia.nextLine();
	System.out.println("Qual o seu peso: ");
	jogador.peso = leia.nextDouble();
	System.out.println("Qual a sua idade ?: ");
	jogador.idade = leia.nextInt();
	System.out.println("Quantos cartões você já levou (verm ou amare...): ");
	jogador.qcartoes = leia.nextInt();
	System.out.println("Quantos gols fez nessa temporada ?: ");
	jogador.qgols = leia.nextInt();
	System.out.println("Qual o seu salário ?: ");
	jogador.salario = leia.nextDouble();
	
	System.out.println(jogador);

	leia.close();
	}

}
