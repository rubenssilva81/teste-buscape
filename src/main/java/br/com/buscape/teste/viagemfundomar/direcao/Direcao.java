/**
 * 
 */
package br.com.buscape.teste.viagemfundomar.direcao;

import br.com.buscape.teste.viagemfundomar.Ponto;

/**
 * @author Rubens
 *
 */
public interface Direcao {
	
	public abstract void mover(Ponto ponto);
	
	public abstract Direcao girarEsqueda();
	
	public abstract Direcao girarDireita();
	
}
