/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.direcao;

import br.com.buscape.teste.viagemfundomar.Ponto;

/**
 * @author Rubens
 * 
 * Classe responsável pelo encapsulamento da regra quando o submarino está apontando para o oeste.
 * 
 * PREMISSSA: Se o submarino navega para o leste naruralmente poderá voltar para o oeste...
 *
 */
public class Oeste implements Direcao {

	public void mover(Ponto ponto) {
		ponto.setX( ponto.getX() - 1 );
	}

	public Direcao girarEsqueda() {
		return new Sul();
	}

	public Direcao girarDireita() {
		return new Norte();
	}
	
}
