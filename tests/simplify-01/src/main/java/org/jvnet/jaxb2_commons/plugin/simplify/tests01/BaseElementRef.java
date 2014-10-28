package org.jvnet.jaxb2_commons.plugin.simplify.tests01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BaseElementRef
    extends JAXBElement<BaseType>
{

    protected final static QName NAME = new QName("urn:test", "baseElement");

    public BaseElementRef(BaseType value) {
        super(NAME, ((Class) BaseType.class), null, value);
    }

    public BaseElementRef() {
        super(NAME, ((Class) BaseType.class), null, null);
    }

}
