package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    //présiser la classe à tester
    private Calcul calcul;
    @Test
    public void testSomme(){
        //on crée un sénario de teste
        calcul=new Calcul();
        double a=5; double b=4;
        double expected=9;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);

    }
}
