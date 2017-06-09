package br.com.buscape.teste.viagemfundomar.comandos;

import br.com.buscape.teste.viagemfundomar.Submarino;

/**
 * @author Rubens
 */
public class GirarEsquerdaCommand extends Command {

	@Override
	public void execute(Submarino submarino) {
		submarino.girarEsqueda();		
	}

}
