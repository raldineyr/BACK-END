package POO14;

public class Principal {
	
	public static void main(String[] args){
		
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();
		Professor p1 = new Professor();
		
		a1.setNome("Raldiney R");
		a1.setMatricula(00007);
		a1.setCurso("Sistema da informação");
		a1.setIdade(27);
		a1.setGenero("M");
		a1.pagarMensalidade();
		
		System.out.println(a1.toString());
		
		b1.setNome("Januario G");
		b1.setMatricula(79862);
		b1.setCurso("ADS");
		b1.setIdade(55);
		b1.setGenero("M");
		b1.pagarMensalidade();
		
		System.out.println(b1.toString());
		
		t1.setNome("Akin Oluwafemi");
		t1.setMatricula(13467);
		t1.setCurso("Engenharia de Software");
		t1.setIdade(30);
		t1.setGenero("M");
		t1.setRegistroProfissional(9874562);
		t1.praticar();
		t1.pagarMensalidade();
		
		System.out.println(t1.toString());
		
		p1.setNome("Siro Gamas");
		p1.setIdade(99);
		p1.setGenero("M");
		p1.setSalario(6000);
		p1.receberAumento(500);
		System.out.println(p1.toString());
	}

}
