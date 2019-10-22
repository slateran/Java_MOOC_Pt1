
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        if (this.guessedLetters.contains(letter)) {
            //do nothing
        } else if (!this.word.contains(letter)) {
            this.numberOfFaults++;
            guessedLetters = guessedLetters + letter;
        } else {
            guessedLetters = guessedLetters + letter;
        }
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        String cunt = "";
        String hide = "";
        String letters = this.guessedLetters;
        String word = this.word;

        for (int i = 0; i < word.length(); i++){


            char c = word.charAt(i);
            hide = "" + c;

            if(letters.contains(hide)){
                cunt += c;
            }
            else {
                cunt += "_";
            }




        }





        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return cunt;
    }
}
