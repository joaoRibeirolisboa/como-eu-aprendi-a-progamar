package BancoDeDados;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
import model.Aluno;

public class javaoo {

	public static void main(String[] args) {
 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("nome do aluno");
		nome = ler next();
		System.out.println("cpf");
		cpf = ler next();
		System.out.println("nota 1");
		nota1 = ler next();
		System.out.println("nota 2");
		nota2 = ler next();
		System.out.println("nota 3")
		nota3 = ler next();
		System.out.println("nota 4");
		nota4 = ler next();
		
		aluno1.setNome(nome);
		aluno1.setCpf(cpf);
		aluno1.setNota1(nota1);
		aluno1.setNota2(nota2);
		aluno1.setNota3(nota3);
		aluno1.setNota4(nota4);
		
		System.out.println("aluno: " +aluno1.getNome());
		System.out.println("idade: " +aluno1.getIdade());
		System.out.println("pais: " +aluno1.getNomedospais());
		System.out.println("nota 1: " +aluno1.getNota1());
		System.out.println("nota 2: " +aluno1.getNota2());
		System.out.println("nota 3: " +aluno1.getNota3());
		System.out.println("nota 4: " +aluno1.getNota4());
		
		System.out.println("media do aluno" +aluno1.calcularmediaaluno());
		System.out.println("situaçao do aluno" +(aluno1.alunoAprovado() ? "aprovado" : "reprovado"));
		
		/*Aluno aluno = new Aluno();
		aluno.setNome("maria");
		aluno.setIdade(23);
		aluno.setNomedospais("pauloelaura");
		aluno.getNota1(6.7);
		aluno.getNota2(7);
		aluno.getNota3(8);
		aluno.getNota4(9);
		

										
		System.out.println(aluno.getNome());
		System.out.println(aluno.getIdade());
		System.out.println(aluno.getNomedospais());
		System.out.println(aluno.getNota1());
		System.out.println(aluno.getNota2());
		System.out.println(aluno.getNota3());
		System.out.println(aluno.getNota4());
		Aluno aluno2 = new Aluno("joao", 18);
		*/
		
	}

}
