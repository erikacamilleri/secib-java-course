package upper.lesson04;

import java.io.File;
import java.util.Properties;
import java.util.Scanner;

/** 
 * This class implements the Singleton Design Pattern
 * https://www.programiz.com/java-programming/singleton
 */
public class Environment {

    private static Environment singleton = null;

    private String FILE_NAME = "java-ib-sec/res/conf/env.txt";
    
    public Properties properties = null;

    private Environment () {
        this.properties = System.getProperties();
        this.loadProperties();
    }

    public static Environment instance() {
        if (singleton == null) {
            singleton = new Environment();
        }
        return singleton;
    }

    public void loadProperties() {
        try {
			File env = new File(this.FILE_NAME);
            Scanner sc = new Scanner(env);
            while (sc.hasNextLine()) {
               String data = sc.nextLine();
               String[] kv = data.split(" = ");
               this.properties.put(kv[0], kv[1]);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
