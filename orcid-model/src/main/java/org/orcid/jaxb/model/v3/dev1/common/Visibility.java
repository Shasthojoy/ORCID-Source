//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.18 at 10:32:14 AM GMT 
//

package org.orcid.jaxb.model.v3.dev1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * <p/>
 * Java class for visibility.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <p/>
 * 
 */
@XmlType(name = "visibility")
@XmlEnum
public enum Visibility implements Serializable {

    // Note the order of declaration is is significant! It is in order of
    // decreasing restrictiveness.

    /**
     * The SYSTEM are a special level of visibility whereby only the system will
     * be able to change it. The most notable of these is email address.
     */
    @XmlEnumValue("system")
    SYSTEM("system"),

    /**
     * The PRIVATE should only be used internally by ORCID.
     */
    @XmlEnumValue("private")
    PRIVATE("private"),

    /**
     * The PROTECTED should only be shared with systems that the researcher or
     * contributor has specifically granted authorization (using OAuth).
     */
    @XmlEnumValue("limited")
    LIMITED("limited"),

    /**
     * The org.orcid.test.data should be shared only with registered users.
     */
    @XmlEnumValue("registered-only")
    REGISTERED_ONLY("registered_only"),

    /**
     * The PUBLIC should be publically available.
     */
    @XmlEnumValue("public")
    PUBLIC("public");

    private final String value;

    Visibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
    
    public static Visibility fromValue(String v) {
        for (Visibility c : Visibility.values()) {
            if (c.value.equals(v.toLowerCase())) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public boolean isMoreRestrictiveThan(Visibility other) {
        return other == null ? true : this.declaredPosition() < other.declaredPosition();
    }

    private int declaredPosition() {
        for (int i = 0; i < Visibility.values().length; i++) {
            if (this.equals(Visibility.values()[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return value;
    }

}
