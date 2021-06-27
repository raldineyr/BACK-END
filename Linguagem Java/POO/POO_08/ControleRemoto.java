package POO08;

public class ControleRemoto implements Controlador {
	
	//Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Metódo Construtor
	
	public ControleRemoto(){
		
		this.volume = 5;
		this.ligado = true;
		this.tocando = true;		
	}
	
	//Metódos acessores e modificadores

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	// Metodos Abstratos

	@Override
	public void ligar() {
		this.setLigado(true);
		System.out.println("Sitema iniciado!\n");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("Sistema finalizado!");
	}

	@Override
	public void abrirMenu() {
		System.out.println("Execução: " + this.getLigado());
		System.out.println("Audio: " + this.getTocando());
		System.out.println("Volume " + this.getVolume());
		
		for (int i = 1; i <= this.getVolume(); i+=1){
			System.out.print("|");
		}
	
	}

	@Override
	public void fecharMenu() {
		
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true){
			this.setVolume(this.getVolume() + 1);
		}	
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-1);
		}	
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0){
			this.setVolume(0);
			System.out.println("Sem som.");
		}else{
			System.out.println("Não foi possivel ativar o mudo.");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(5);
			System.out.println("Com som.");
		}else{
			System.out.println("Não foi possivel desativar o mudo.");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())){
			this.setTocando(true);
			System.out.println("Sistema Iniciado.");
		}
	}

	@Override
	public void pausa() {
		
		if (this.getLigado() && this.getTocando()) {
			setTocando(false);
			System.out.println("\nSistema pausado.");
		}
		
	}

}
