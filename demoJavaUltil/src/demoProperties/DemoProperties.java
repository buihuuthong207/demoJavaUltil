package demoProperties;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {

	public static void main(String[] args) throws IOException {
		Properties properties = System.getProperties();
        Set set = properties.entrySet();
        // show system properties
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
	}

}
