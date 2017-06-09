/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.comandos;

import br.com.buscape.teste.viagemfundomar.Submarino;

/**
 * @author Rubens
 * 
 * PREMISSA: Se o submarino possui um método para descer, naturalmente precisará de um método correspondente para subir...
 * 
 */
public class SubirCommand extends Command {

	@Override
	public void execute(Submarino submarino) {
		submarino.subir();
	}

}
