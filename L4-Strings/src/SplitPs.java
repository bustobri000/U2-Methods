import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word with the letter p: ");
        JOptionPane.showMessageDialog(null, pPlusThree(word));
    }
    public static String pPlusThree(String word){
        String lowerWord = word.toLowerCase();
        int pIndex = lowerWord.indexOf('p');
        return word.substring(pIndex, pIndex + 4);
    }
}
