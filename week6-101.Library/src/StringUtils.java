import java.util.*;


public class StringUtils {


    public static boolean included(String word, String searched) {


        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();

        if (word.contains(searched)) {
            return true;
        }

        return false;

    }
}
