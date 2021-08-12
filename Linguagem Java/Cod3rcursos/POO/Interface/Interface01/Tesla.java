package POO.Interface.Interface01;

public class Tesla extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	Tesla(){
		this(300);		
	}
	
	Tesla(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(50);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	} 
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public String toString(){
		
		return "Tesla: " + velocidadeAtual + " KM/H";
	}
	
	public int getDelta(){
		if (ligarTurbo && !ligarAr) return 35;
		else if (ligarTurbo && ligarAr) return 30;
		else if (!ligarTurbo && !ligarAr) return 20;
		else return 15;
	}
}
