package io.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Helper {

    public static Properties getConfig() throws IOException
    {
        FileInputStream fis = null;
        Properties prop = null;
        try {
                try {
                    fis = new FileInputStream("src/test/resources/Config.properties");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                prop = new Properties();
                prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

}
