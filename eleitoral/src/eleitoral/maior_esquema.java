package eleitoral;
import java.util.Scanner;
import java.util.Scanner;

public class maior_esquema {
public static void main(String[] args) {
	int idade;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("qual e a sua idade");
	idade = input.nextInt();
	
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
