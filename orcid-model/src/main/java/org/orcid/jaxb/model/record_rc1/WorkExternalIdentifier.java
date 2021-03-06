//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 11:03:27 AM BST 
//

package org.orcid.jaxb.model.record_rc1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "workExternalIdentifierType", "workExternalIdentifierId" })
@XmlRootElement(name = "workExternalIdentifier")
public class WorkExternalIdentifier extends ExternalIdentifierBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "external-identifier-type", namespace = "http://www.orcid.org/ns/work", required = true)
    protected WorkExternalIdentifierType workExternalIdentifierType;
    @XmlElement(name = "external-identifier-id", namespace = "http://www.orcid.org/ns/work", required = true)
    protected WorkExternalIdentifierId workExternalIdentifierId;

    public WorkExternalIdentifier() {

    }

    /**
     * Gets the value of the workExternalIdentifierType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public WorkExternalIdentifierType getWorkExternalIdentifierType() {
        return workExternalIdentifierType;
    }

    /**
     * Sets the value of the workExternalIdentifierType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWorkExternalIdentifierType(WorkExternalIdentifierType value) {
        this.workExternalIdentifierType = value;
    }

    /**
     * Gets the value of the workExternalIdentifierId property.
     * 
     * @return possible object is {@link WorkExternalIdentifierId }
     * 
     */
    public WorkExternalIdentifierId getWorkExternalIdentifierId() {
        return workExternalIdentifierId;
    }

    /**
     * Sets the value of the workExternalIdentifierId property.
     * 
     * @param value
     *            allowed object is {@link WorkExternalIdentifierId }
     * 
     */
    public void setWorkExternalIdentifierId(WorkExternalIdentifierId value) {
        this.workExternalIdentifierId = value;
    }
    
    @Override
    @JsonIgnore
    public String getGroupId() {
        String workIdVal = this.workExternalIdentifierId == null ? null : this.workExternalIdentifierId.getContent();
        String typeVal = this.workExternalIdentifierType == null ? null : this.workExternalIdentifierType.toString();
        return workIdVal + typeVal; 
    }

    @Override
    public String toString() {
        String result = "";
        if (workExternalIdentifierType != null)
            result += workExternalIdentifierType.toString() + "(";
        if (workExternalIdentifierId != null)
            result += workExternalIdentifierId.getContent();
        if (workExternalIdentifierType != null)
            result += ")";
        return result;
    }

    @Override
    public boolean isGroupAble() {
        // Perform general validations
        if (!super.isGroupAble())
            return false;

        // Dont groups works where the external id is empty
        if (workExternalIdentifierType == null
                && (workExternalIdentifierId == null || workExternalIdentifierId.getContent() == null || workExternalIdentifierId.getContent().isEmpty()))
            return false;

        // Dont work works by ISSN identifier
        if (WorkExternalIdentifierType.ISSN.equals(workExternalIdentifierType))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((workExternalIdentifierId == null) ? 0 : workExternalIdentifierId.hashCode());
        result = prime * result + ((workExternalIdentifierType == null) ? 0 : workExternalIdentifierType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        WorkExternalIdentifier other = (WorkExternalIdentifier) obj;

        if (workExternalIdentifierId == null) {
            if (other.workExternalIdentifierId != null) {
                return false;
            }
        } else if (!workExternalIdentifierId.equals(other.workExternalIdentifierId)) {
            return false;
        }
        if (workExternalIdentifierType != other.workExternalIdentifierType) {
            return false;
        }
        return true;
    }

    public static WorkExternalIdentifier fromMessageExtId(org.orcid.jaxb.model.message.WorkExternalIdentifier oldExtId) {
        WorkExternalIdentifier newExtId = new WorkExternalIdentifier();
        if (oldExtId.getWorkExternalIdentifierId() != null) {
            newExtId.setWorkExternalIdentifierId(new WorkExternalIdentifierId(oldExtId.getWorkExternalIdentifierId().getContent()));
        }
        if (oldExtId.getWorkExternalIdentifierType() != null) {
            newExtId.setWorkExternalIdentifierType(WorkExternalIdentifierType.fromValue(oldExtId.getWorkExternalIdentifierType().value()));
        }
        return newExtId;
    }

}
