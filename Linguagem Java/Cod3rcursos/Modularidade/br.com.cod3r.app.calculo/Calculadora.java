package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
}
