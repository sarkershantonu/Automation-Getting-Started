package org.automation.xml;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLAssert;
import org.custommonkey.xmlunit.XMLUnit;
import org.custommonkey.xmlunit.examples.RecursiveElementNameAndTextQualifier;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * Created by shantonu on 6/30/17.
 */
public class XMLCompare {

    private XMLCompare(){}
    public static void compare(String expected_xml_path, String input_xml_path) throws IOException, SAXException {
        XMLUnit.setIgnoreWhitespace(true);
        XMLUnit.setIgnoreAttributeOrder(true);
        XMLUnit.setIgnoreComments(true);
        XMLUnit.setIgnoreDiffBetweenTextAndCDATA(true);
        InputSource expected = new InputSource(expected_xml_path);
        InputSource input = new InputSource(input_xml_path);
        DetailedDiff detailedDifferences = new DetailedDiff(new Diff(expected,input));
        detailedDifferences.overrideElementQualifier(new RecursiveElementNameAndTextQualifier());
        for(Object i : detailedDifferences.getAllDifferences()){
            System.out.println(i.toString());
        }
        XMLAssert.assertXMLEqual("MissMatch",detailedDifferences,true);
    }
}
