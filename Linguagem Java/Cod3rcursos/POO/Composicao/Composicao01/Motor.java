package POO.Composicao01;
//POO Relacionamento um para um.

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros(){
		
		if (!ligado) return 0;
		else return (int)Math.round(fatorInjecao * 300);
	}
}
