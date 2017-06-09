/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.comandos;

import br.com.buscape.teste.viagemfundomar.Submarino;

/**
 * @author Rubens
 *
 */
public class MoverSubmarinoCommand extends Command {

	@Override
	public void execute(Submarino submarino) {
		submarino.moverSe();
	}

}
