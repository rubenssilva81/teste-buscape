/**
 * 
 */
package br.com.buscape.teste.viagemfundomar;

import br.com.buscape.teste.viagemfundomar.comandos.Command;
import br.com.buscape.teste.viagemfundomar.comandos.DescerCommand;
import br.com.buscape.teste.viagemfundomar.comandos.GirarDireitaCommand;
import br.com.buscape.teste.viagemfundomar.comandos.GirarEsquerdaCommand;
import br.com.buscape.teste.viagemfundomar.comandos.MoverSubmarinoCommand;
import br.com.buscape.teste.viagemfundomar.comandos.SubirCommand;

/**
 * Não é a implementação literal do padrão factory method tao pouco do abstract factory.
 * Apenas uma abstração para isolamento dos if's...
 *
 * @author Rubens
 * 
 */
public class CommandFactory {
	
	public Command createCommand(String command) {
		
		if ("L".equalsIgnoreCase(command)) {
			return new GirarEsquerdaCommand();
		} if ("R".equalsIgnoreCase(command)) {
			return new GirarDireitaCommand();
		} else if (command.equalsIgnoreCase("M")) {
			return new MoverSubmarinoCommand();
		} else if ("U".equalsIgnoreCase(command)) {
			return new SubirCommand();
		} else if ("D".equalsIgnoreCase(command)) {
			return new DescerCommand();
		}
		throw new IllegalArgumentException(String.format("Comando inválido: %s", command));
	}

}
