/**
 * 
 */
package br.com.buscape.teste.viagemfundomar;

/**
 * @author Rubens
 *
 */
public class Ponto {
	
	//
	// o submarino sempre começará no ponto (0, 0, 0, NORTE)
	//
	private int x = 0;
	private int y = 0;
	private int z = 0;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		if (z > 0) {
			z = 0;
			System.out.println("Submarino atingiu a superficie!");
		}
		this.z = z;
	}
	
	@Override
	public String toString() {
		return String.format("%d %d %d", x,y,z);
	}

}
