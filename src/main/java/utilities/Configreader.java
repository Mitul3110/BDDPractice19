package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

   private Properties prop;

  public  Properties initcromebrowser() throws IOException {
      prop = new Properties();
      FileInputStream ip = new FileInputStream("src/test/java/dataset/Config.properties");
      prop.load(ip);
      return prop;
  }

}
