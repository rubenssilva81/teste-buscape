package br.com.buscape.teste.viagemfundomar;

import br.com.buscape.teste.viagemfundomar.direcao.Direcao;
import br.com.buscape.teste.viagemfundomar.direcao.Norte;

/**
 * @author Rubens
 *
 */
public class Submarino {
	
	private Direcao direcao;
	private Ponto ponto = new Ponto();

	public Submarino() {
		// Para simplificar, leve em consideração que o submarino sempre começará no ponto (0, 0, 0, NORTE) 
		this.direcao = new Norte(); 
	}
	
	public void moverSe() {
		this.direcao.mover(this.ponto);
	}

	public void girarEsqueda() {
		this.direcao = this.direcao.girarEsqueda();		
	}
	
	public void girarDireita() {
		this.direcao = this.direcao.girarDireita();		
	}
	
	public void subir() {
		ponto.setZ( ponto.getZ() + 1 );
	}

	public void descer() {
		ponto.setZ( ponto.getZ() - 1);
	}
	
	public Ponto getPonto() {
		return ponto;
	}
	
	public String getDirecao() {
		return direcao.getClass().getSimpleName();
	}
	
	@Override
	public String toString() {
		// A saída deverá conter a coordenada final do submarino junto com sua direção, como no exemplo:
		// -1 2 0 NORTE
		return ponto.toString() + " " + getDirecao();
	}

}
