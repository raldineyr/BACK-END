package EstruturasDeControle;
import javax.swing.JOptionPane;

// If e Else
public class EstruturasDeControle03 {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0){
			System.out.printf("%d É um numrero par",numero);
		}
		else{
			System.out.printf("%d É um numero ímpar",numero);
		}
		
	}

}
