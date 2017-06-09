/**
 * 
 */
package br.com.buscape.teste.viagemfundomar;

import org.junit.Test;

import br.com.buscape.teste.viagemfundomar.comandos.Command;
import junit.framework.Assert;

/**
 * @author Rubens
 *
 */
public class NavegacaoTest {
	
	@Test
	public void cenario1Test() {
		
		CommandFactory factory = new CommandFactory();
		Submarino submarino = new Submarino();

		String entrada = "LMRDDMMUU";
		char[] chars = entrada.toCharArray();
		for (char c : chars) 
		{
			Command command = factory.createCommand( String.valueOf(c) );
			command.execute(submarino);
		}
		
		Assert.assertEquals(submarino.getPonto().getX(), -1);
		Assert.assertEquals(submarino.getPonto().getY(), 2);
		Assert.assertEquals(submarino.getPonto().getZ(), 0);
		Assert.assertEquals(submarino.getDirecao(), "Norte");
		
		System.out.println(submarino.toString());
	}
	
	@Test
	public void cenario2Test() {
		
		CommandFactory factory = new CommandFactory();
		Submarino submarino = new Submarino();

		String entrada = "RMMLMMMDDLL";
		char[] chars = entrada.toCharArray();
		for (char c : chars) 
		{
			Command command = factory.createCommand( String.valueOf(c) );
			command.execute(submarino);
		}
		
		Assert.assertEquals(submarino.getPonto().getX(), 2);
		Assert.assertEquals(submarino.getPonto().getY(), 3);
		Assert.assertEquals(submarino.getPonto().getZ(), -2);
		Assert.assertEquals(submarino.getDirecao(), "Sul");
		
		System.out.println(submarino.toString());
		
	}

}
