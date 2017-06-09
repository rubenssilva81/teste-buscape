/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.direcao;

import br.com.buscape.teste.viagemfundomar.Ponto;

/**
 * @author Rubens
 * 
 * Classe responsável pelo encapsulamento da regra quando o submarino está apontando para o leste. 
 * 
 * REQ: Todo movimento quando o submarino estiver apontada para o LESTE somará 1 ao eixo X.
 *
 */
public class Leste implements Direcao {

	public void mover(Ponto ponto) {
		ponto.setX( ponto.getX() + 1 );
	}

	public Direcao girarEsqueda() {
		return new Norte();
	}

	public Direcao girarDireita() {
		return new Sul();
	}

}
