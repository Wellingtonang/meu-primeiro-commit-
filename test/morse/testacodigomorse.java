package Morse;

import morse.Morse;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class testacodigomorse {
private Morse morse;

@Before
public void inicializa(){
morse = new Morse();


}
@Test 
public void testaSOS(){
    morse.setMensagem("SOS");
    assertEquals("*** --- ***", morse.codifica());

}
@Test
public void testaWellington(){
morse.setMensagem("wellington");
 assertEquals("*-- * *-** *-** ** -* --* - --- -*", morse.codifica());
}
@Test
public void testaAniversario(){
morse.setMensagem("24 01 2000");
 assertEquals("**--- ****-  ----- *----  **--- ----- ----- -----", morse.codifica());
}
}