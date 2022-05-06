
public class Jogo {

	public String timedcasa;
	public String timevisitante;
	public int plcn1;
	public int plcn2; 
	public int plcn3;
	public int plcn4;
	
	public int PlacarTotal() {
		return plcn1 + plcn2 + plcn3 + plcn4;
	}
	@Override
	public String toString() {
		return "Resultado: " + " " + timedcasa + " " + timevisitante + " " + PlacarTotal();
		
	}
	
}
