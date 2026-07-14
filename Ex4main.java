import java.util.Scanner;

public class Ex4main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("nome: ");
	String nome = sc.next();

	System.out.print("cpf: ");
	String cpf = sc.next();

	System.out.print("UF: ");
	String uf = sc.next();

	System.out.print("Renda Anual: ");
	double rendaAnual = sc.nextDouble();
	
	
	Ex4 bro = new Ex4(nome=nome,cpf=cpf,uf=uf,rendaAnual-rendaAnual);
	}


}