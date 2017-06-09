/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.direcao;

import br.com.buscape.teste.viagemfundomar.Ponto;

/**
 * @author Rubens
 * 
 * Classe responsável pelo encapsulamento da regra quando o submarino está apontando para o norte. 
 * 
 * REQ: Todo movimento quando o submarino estiver apontada para o NORTE, somará 1 ao eixo Y.
 *
 */
public class Norte implements Direcao {

	public void mover(Ponto ponto) {
		ponto.setY( ponto.getY() + 1);
	}

	public Direcao girarEsqueda() {
		return new Oeste();
	}

	public Direcao girarDireita() {
		return new Leste();	
	}

}
