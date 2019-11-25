import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int quantidadeAlunos = 3;
		int altura[]= new int[quantidadeAlunos];
		String sexo[]= new String[quantidadeAlunos];
		Scanner entrada = new Scanner(System.in);
		int mediaAlturaMeninos=0;
		int quantidadeMeninos=0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a altura da "+(i+1)+"ª criança: " );
			altura[i]=entrada.nextInt();
			System.out.println("Digite o sexo da "+(i+1)+"ª criança: " );
			sexo[i]=entrada.next();
		}
		int menorAltura = altura[0];
		int maiorAltura = altura[0];
		String sexoMaiorAltura = "";
		for (int i = 0; i < 3; i++) {
			if (menorAltura>altura[i]) {
				menorAltura=altura[i];
			}
			if (maiorAltura<altura[i]) {
				maiorAltura=altura[i];
				sexoMaiorAltura=sexo[i];				
			}
			if(sexo[i].equals("m")||sexo[i].equals("M")) {
				mediaAlturaMeninos+=altura[i];
				quantidadeMeninos++;
			}
		}
		System.out.println("Menor Altura: "+ menorAltura);
		System.out.println("Media da Altura dos Meninos: "+ (mediaAlturaMeninos/quantidadeMeninos));
		System.out.println("A criança mais alta é do sexo "+ sexoMaiorAltura +" e mede "+maiorAltura);
		
	}

}
