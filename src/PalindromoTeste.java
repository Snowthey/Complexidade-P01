import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Nested
public class PalindromoTeste {
    @Test
    void teste1(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("abba");
        boolean retorno2 = objeto2.VerificaPalavra2("abba");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste2(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("aaaaaaa");
        boolean retorno2 = objeto2.VerificaPalavra2("aaaaaaa");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste3(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("ababa");
        boolean retorno2 = objeto2.VerificaPalavra2("ababa");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste4(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("bbbbbbbbbbbbbb");
        boolean retorno2 = objeto2.VerificaPalavra2("bbbbbbbbbbbbbb");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste5(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("baaab");
        boolean retorno2 = objeto2.VerificaPalavra2("baab");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste6(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("baaaaaaaaaaab");
        boolean retorno2 = objeto2.VerificaPalavra2("baaaaaaaaaaab");
        assertEquals(true, retorno1);
        assertEquals(true, retorno2);
    }

    @Test
    void teste7(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("bba");
        boolean retorno2 = objeto2.VerificaPalavra2("bba");
        assertEquals(false, retorno1);
        assertEquals(false, retorno2);
    }

    @Test
    void teste8(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("abbb");
        boolean retorno2 = objeto2.VerificaPalavra2("abbb");
        assertEquals(false, retorno1);
        assertEquals(false, retorno2);
    }

    @Test
    void teste9(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("bbbaaa");
        boolean retorno2 = objeto2.VerificaPalavra2("bbbaaa");
        assertEquals(false, retorno1);
        assertEquals(false, retorno2);
    }

    @Test
    void teste10(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("aabbbb");
        boolean retorno2 = objeto2.VerificaPalavra2("aabbbb");
        assertEquals(false, retorno1);
        assertEquals(false, retorno2);
    }

    @Test
    void teste11(){
        VerificaPalavra1 objeto1 = new VerificaPalavra1();
        VerificaPalavra2 objeto2 = new VerificaPalavra2();

        boolean retorno1 = objeto1.VerificaPalavra1("babababa");
        boolean retorno2 = objeto2.VerificaPalavra2("babababa");
        assertEquals(false, retorno1);
        assertEquals(false, retorno2);
    }


}
