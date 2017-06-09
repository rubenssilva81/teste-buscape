package br.com.buscape.teste.viagemfundomar;

import java.util.Scanner;

import br.com.buscape.teste.viagemfundomar.comandos.Command;

/**
 * @author Rubens
 */
public class Navegacao {

	public static void main(String[] args) {
		
		CommandFactory factory = new CommandFactory();
		
		Submarino submarino = new Submarino();
		
		System.out.println("Informe a sequencia de comandos para a navegacao: ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input);
		
		char[] chars = input.toCharArray();
		for (char c : chars) 
		{
			Command command = factory.createCommand( String.valueOf(c) );
			command.execute(submarino);
		}
		
		scanner.close();
		
		System.out.println(submarino.toString());		
		
	}

}
