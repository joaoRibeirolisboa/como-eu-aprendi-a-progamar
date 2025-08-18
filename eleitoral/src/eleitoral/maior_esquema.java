package eleitoral;
import java.util.Scanner;
import java.util.Scanner;

public class maior_esquema {
public static void main(String[] args) {
	poblic();
}
private static void poblic() {
	
	int idade;

	Scanner input = new Scanner(System.in);
	
	System.out.println("qual e a sua idade");
	idade = input.nextInt();
	//ele calcula se vc pode votar ou n
	if (idade<16) {
		System.out.println("ainda N");
		
	}else if (idade==16 || idade==17) {
		System.out.println("opiional ");
		
	}else if (idade>=18 && idade<=65) {
		System.out.println("obrigatorio ");
		
	}else {
		System.out.println("opicional");
	}
  }
}
 
