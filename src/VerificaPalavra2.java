public class VerificaPalavra2 {
    boolean VerificaPalavra2(String palavra) {
        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            char charEsquerda = palavra.charAt(i);
            char charDireita = palavra.charAt(comprimento - i - 1);

            if (charEsquerda != 'a' && charEsquerda != 'b') {
                i++;
                continue;
            }
            if (charDireita != 'a' && charDireita != 'b') {
                continue;
            }

            if (charEsquerda != charDireita) {
                return false;
            }
        }

        return true;
    }
}
