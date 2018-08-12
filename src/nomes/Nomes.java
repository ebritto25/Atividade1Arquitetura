package nomes;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomes {

	private ArrayList<String> nomes = new ArrayList();

	public ArrayList<String> getNomes() {
		return nomes;
	}

	public void setNomes(ArrayList<String> nomes) {
		this.nomes = nomes;
	}
	
	private void addNome(String nome)
	{
		nomes.add(nome);
	}
	
	private void imprimeNomes()
	{
		for(String nome : nomes)
		{
			System.out.println(nome);
		}
	}
	
	public static void main(String[] args) 
	{
		Nomes n = new Nomes();
		Scanner ler = new Scanner(System.in);
				
		while(true)
		{
			System.out.println("\nO que gostaria de fazer:\n0-Sair\n1-Inserir novo nome\n2-Imprimir Nomes:");
			
			switch(ler.next()){
				case "0": 
					System.exit(0);
					break;
				case "1":
					System.out.println("\nDigite o nome a ser inserido:");
					n.addNome(ler.next());
					break;
				case "2":
					System.out.println("\nNomes armazenados:");
					n.imprimeNomes();
					break;
				default:
					System.out.println("\nOpção inválida!");
			}
		}
	}
	
}
