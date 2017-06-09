/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.direcao;

import br.com.buscape.teste.viagemfundomar.Ponto;

/**
 * @author Rubens
 * Classe responsável pelo encapsulamento da regra quando o submarino está apontando para o sul.
 * 
 * PREMISSA: Se o submarino navega para o norte naturalmente poderá navegar para o sul...
 *
 */
public class Sul implements Direcao {

	public void mover(Ponto ponto) {
		ponto.setY( ponto.getY() - 1);
	}

	public Direcao girarEsqueda() {
		return new Leste();
	}

	public Direcao girarDireita() {
		return new Oeste();
	}
	
}
