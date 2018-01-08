/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.jaxb.model.v3.dev1.record.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "services", namespace = "http://www.orcid.org/ns/activities")
public class Services extends Affiliations<ServiceSummary> implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5138824260612086887L;

    public Services() {

    }

    public Services(List<ServiceSummary> summaries) {
        super();
        this.summaries = summaries;
    }

    @Override
    public List<ServiceSummary> getSummaries() {
        if (this.summaries == null) {
            this.summaries = new ArrayList<ServiceSummary>();
        }
        return this.summaries;
    }
}
