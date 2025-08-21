package notadealuno;

import java.util.Scanner;

public class reprovado {

	public static void main(String[] args) {
		niam();
	}

public static void niam() {
	

		float nota;
		float notadeprova; 
		float notatarefa; 
		float notacimulado; 
		float notarecuperação;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual e a foi a nota da sua prova de 0 a 5 ");
		notadeprova = input.nextInt();
		System.out.println("qual e sua nota de tarefa de 0 a 3 ");
		notatarefa = input.nextInt();
		System.out.println("qual e a foi a nota do seu cimulado de 0 a 2 ");
		notacimulado = input.nextInt();
		
		nota = notadeprova+notatarefa+notacimulado;
		
		if (nota>=6) {
			System.out.println("aprovado");
		

		else {
			System.out.println("fassa recuperação");
			
			System.out.println("qual e a foi a nota da sua recuperação de 0 a 10");
			notarecuperação = input.nextInt();
			
			nota = (notarecuperação/2)+notadeprova+notatarefa+notacimulado;
			
			if (nota>=6) {
				System.out.println("aprovado");
				
		else {
					System.out.println("reprovado");
				}
				
			}
			}
		}
		}

}
