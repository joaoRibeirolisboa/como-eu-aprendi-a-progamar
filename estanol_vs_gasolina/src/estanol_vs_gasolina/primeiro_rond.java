package estanol_vs_gasolina;

import java.util.Scanner;

import estanol_vs_gasolina.Menu;

public class primeiro_rond {

public static void main(String[] args) {
	plublic();
}
private static void plublic() {
    Scanner input = new Scanner(System.in);

  
	int recebe;
	System.out.println("vc quer o percentual do que");
	System.out.println("1=gasolia e etanol");
    System.out.println("2=gasolina e disel");
    System.out.println("3=disel e etanol");
    System.out.println("4=tudo");
    System.out.println("0=sair");
    recebe = input.nextInt();
    
    
    float percentual;
	float percentualdd;
	 Menu menu = Menu.getFromCodigo(recebe);
	 System.out.println(menu);
	
		 if (menu.equals(Menu.ETANOLeGASOLINA)) {
		
				float etanol = 0;
				float gasolina = 0;
			    System.out.println("informe o valor do gasolina");
			    gasolina = input.nextFloat();
				System.out.println("informe o valor do etanol");
			    etanol = input.nextFloat();
			    percentual = etanol/gasolina*100;
			     System.out.println("o percentual é : "+percentual+"%");
		 }
		 if (menu.equals(Menu.GASOLINAeDISEL)) {
				float gasolina = 0;
				 float disel = 0;
				 System.out.println("informe o valor do disel");
				    disel = input.nextFloat();
			    System.out.println("informe o valor do gasolina");
			    gasolina = input.nextFloat();
			    percentual = disel/gasolina*100;
			     System.out.println("o percentual é : "+percentual+"%");
		 }
     
		 if (menu.equals(Menu.DISELeETANOL)) {
			 float disel = 0;
				float etanol = 0;

			 System.out.println("informe o valor do disel");
			    disel = input.nextFloat();
			    System.out.println("informe o valor do etanol");
			    etanol = input.nextFloat();
			    percentual = etanol/disel*100;
			     System.out.println("o percentual é : "+percentual+"%");
		 }
		 if (menu.equals(Menu.TUDO)) {
			 float disel = 0;
			 float gasolina = 0;
				float etanol = 0;
			 System.out.println("informe o valor do etanol");
			    etanol = input.nextFloat();
			    System.out.println("informe o valor do disel");
			    disel = input.nextFloat();
			    System.out.println("informe o valor do gasolina");
			    gasolina = input.nextFloat();
			     percentual = etanol/gasolina*100;
			     percentualdd = disel/gasolina*100;
			     System.out.println("o percentual é : "+percentual+ "%  "+percentualdd+"%");
		 }
	    
	     
	}


}
