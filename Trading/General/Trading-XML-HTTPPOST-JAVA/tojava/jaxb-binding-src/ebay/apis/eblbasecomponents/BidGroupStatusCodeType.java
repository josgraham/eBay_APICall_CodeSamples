//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidGroupStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidGroupStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidGroupStatusCodeType")
@XmlEnum
public enum BidGroupStatusCodeType {


    /**
     * 
     * 						(out) Indicates that the bid group is open.
     * 					
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * 
     * 						(out) Indicates that the bid group is Closed.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidGroupStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidGroupStatusCodeType fromValue(String v) {
        for (BidGroupStatusCodeType c: BidGroupStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
