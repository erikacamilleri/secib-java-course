package lower.lesson19;

import java.util.Iterator;
import java.util.List;

public class SearchUtils {

    public static int linear(List<Object> haystack, Object needle) throws SearchUtilsException {

        boolean isFound = false; // flag
        int pos = -1;

        // Get the object that will help me iterate through the nodes in the list
        Iterator<Object> iterator = haystack.iterator();

        // Since it is dynamic we are using a while loop here
        while(iterator.hasNext() && !isFound) {
            pos++;
            // Get the next node in the list
            Object visited = iterator.next();
            if (visited.equals(needle)) {
                // reset the iterator (optional)
                iterator = haystack.iterator();
                // set the flag
                isFound = true;
            }
        }

        if (isFound = false) throw new SearchUtilsException("There is no such needle in haystack.");
        
        return pos;
    }
    
}
