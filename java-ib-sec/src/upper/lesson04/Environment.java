package upper.lesson04;

import java.util.HashMap;

public class Environment {

    private HashMap<String, String> variables;

    public Environment () {

    }

    public String getEnvironmentVariable(String key, String defaultValue) {
        if (variables.containsKey(key)) {
            return variables.get(key);
        }
        return defaultValue;
    }
}
