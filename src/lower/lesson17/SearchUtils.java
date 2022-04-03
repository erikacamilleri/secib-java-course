package lower.lesson17;

import java.util.List;
import java.util.ListIterator;

public class SearchUtils {

    public static int linear(List<Object> haystack, Object needle) throws SearchUtilsException {
        boolean isFound = false;
        int pos = -1;

        // TODO: Write a suitable comment so that you can understand what is going on
        // when you look at me in the future
        ListIterator<Object> iterator = haystack.listIterator();

        // TODO: Comment
        while(iterator.hasNext() && !isFound) {
            pos++;
            // TODO: Comment
            Object visited = iterator.next();
            if (visited.equals(needle)) {
                // TODO: What is missing here?
            }
        }

        if (isFound = false) throw new SearchUtilsException("There is no such needle in haystack.");
        
        return pos;
    }
    
}
