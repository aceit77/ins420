import java.util.*;

class RailFence {

    String Encryption(String plainText, int depth) throws Exception {
        int r = depth, len = plainText.length();
        int c = len / depth;
        c = c + 1;
        char mat[][] = new char[r][c];
        int k = 0;

        String cipherText = "";
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (k != len) {
                    mat[j][i] = plainText.charAt(k++);
                    System.out.println("mat[" + j + "][" + i + "]=" + mat[j][i]);

                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cipherText += mat[i][j];

            }
        }
        return cipherText;

    }

    String Decryption(String cipherText, int depth) throws Exception {
        int r = depth, len = cipherText.length();
        int c = len / depth;
        char mat[][] = new char[r][c];
        int k = 0;
        String plainText = "";

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = cipherText.charAt(k++);
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                plainText += mat[i][j];
            }

        }
        return plainText;
    }
}

class RailFenceCipher {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int depth;

        String plainText, cipherText, decryptedText;

        System.out.println("Enter plain Text");
        plainText = sc.nextLine();

        System.out.println("Enter Depth(No. of Rails) for Encryption: ");
        depth = sc.nextInt();

        RailFence rf = new RailFence();

        cipherText = rf.Encryption(plainText, depth);
        System.out.println("Encrypted Text is: " + cipherText);

        decryptedText = rf.Decryption(cipherText, depth);
        System.out.println("Decrypted Text is: " + decryptedText);

    }

}