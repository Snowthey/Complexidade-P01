public class VerificaPalavra1 {
    boolean VerificaPalavra1(String palavra) {
        int length = palavra.length();
        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
