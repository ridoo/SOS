/**
 * Copyright (C) 2012-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.iso;

public interface CodeList {
    
    String CODE_LIST_URL = "http://www.isotc211.org/2005/resources/Codelist/gmxCodelists.xml";
            
    String CI_ROLE_CODE_URL = CODE_LIST_URL + "#CI_RoleCode/";
           
    enum CiRoleCodes {
        CI_RoleCode_resourceProvider("resourceProvider"),
        CI_RoleCode_custodian("custodian"),
        CI_RoleCode_owner("owner"),
        CI_RoleCode_user("user"),
        CI_RoleCode_distributor("distributor"),
        CI_RoleCode_originator("originator"),
        CI_RoleCode_pointOfContact("pointOfContact"),
        CI_RoleCode_principalInvestigator("principalInvestigator"),
        CI_RoleCode_processor("processor"),
        CI_RoleCode_publisher("publisher"),
        CI_RoleCode_author("author");
        
        private String identifier;
        
        private CiRoleCodes(String identifier) {
            this.identifier = identifier;
        }
        
        public String getIdentifier() {
            return identifier;
        }
    }

    
}
