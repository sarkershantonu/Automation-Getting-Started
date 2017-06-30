import org.automation.xml.XMLCompare;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * Created by shantonu on 6/30/17.
 */
public class TestXmlCompare {


    @Test
    public void testXml() throws IOException, SAXException {
        XMLCompare.compare("","");
    }
}
