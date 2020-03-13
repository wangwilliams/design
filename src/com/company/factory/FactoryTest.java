package com.company.factory;


import com.company.factory.impl.AbstractFactory;
import com.company.factory.impl.Product;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class FactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory1 = (AbstractFactory) ReadXML.getObject();
        Product product1 =factory1.newProduct();
        AbstractFactory factory2 = new ConcreteFactory1();
        Product product2 = factory2.newProduct();
        product1.show();
        product2.show();
    }
}
