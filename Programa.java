import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Jogo jogo = new Jogo();
		
		System.out.println("Entre com o time da casa: ");
		jogo.timedcasa = leia.nextLine();
		System.out.println("Entre com o tive visitante: ");
		jogo.timevisitante = leia.nextLine();
		System.out.println("Entre com o placar do primeito tempo: ");
		jogo.plcn1 = leia.nextInt();
		jogo.plcn2 = leia.nextInt();
		System.out.println("Entre com o placar do segundo tempo: ");
		jogo.plcn3 = leia.nextInt();
		jogo.plcn4 = leia.nextInt();
		
	System.out.println(jogo);

		
		
		leia.close();
	}

}
