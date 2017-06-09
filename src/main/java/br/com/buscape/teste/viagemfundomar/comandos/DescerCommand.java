package br.com.buscape.teste.viagemfundomar.comandos;

import br.com.buscape.teste.viagemfundomar.Submarino;

/**
 * @author Rubens
 *
 * REQ: Todo movimento para baixo diminuirá 1 do eixo Z
 */

public class DescerCommand extends Command {

	@Override
	public void execute(Submarino submarino) {
		submarino.descer();
	}

}
