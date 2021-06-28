package POO10;

import java.util.Random;

public class Luta {
	// Atributos
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	// Metódos acessores e modificadores
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDedafiado(Lutador desafiado) {
		this.desafiado = desafiado;	
		
	}
	
	
	// Metódos especiais e públicos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else{
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	
	public void lutar() {
		
		if (this.aprovada) {
			
			System.out.println("### DESAFIADO ###\n");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###\n");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3); 
			
			switch(vencedor) {
			
			case 0:
				
				System.out.println("Resultado:\nEMPATE TÉCNICO!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1:
				
				System.out.println("Resultado:\nVitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:
				
				System.out.println("Resultado:\nVitória do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			
		}else {
			
			System.out.println("A luta não pode acontecer!");
		}
		
	}
	

}
