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
package org.n52.sos.ogc.om.values;

import org.n52.sos.ogc.om.values.visitor.ValueVisitor;
import org.n52.sos.ogc.om.values.visitor.VoidValueVisitor;
import org.n52.sos.ogc.ows.OwsExceptionReport;
import org.n52.sos.util.StringHelper;

/**
 * Boolean measurement representation for observation
 *
 * @since 4.0.0
 *
 */
public class BooleanValue implements Value<Boolean> {
    /**
     *
     */
    private static final long serialVersionUID = 3752649909580561689L;

    /**
     * Measurement value
     */
    private Boolean value;

    /**
     * Unit of measure
     */
    private String unit;

    /**
     * constructor
     *
     * @param value
     *              Measurement value
     */
    public BooleanValue(Boolean value) {
        this.value = value;
    }

    @Override
    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return String
                .format("BooleanValue [value=%s, unit=%s]", getValue(), getUnit());
    }

    @Override
    public boolean isSetValue() {
        return value != null;
    }

    @Override
    public boolean isSetUnit() {
        return StringHelper.isNotEmpty(getUnit());
    }

    @Override
    public <X> X accept(ValueVisitor<X> visitor)
            throws OwsExceptionReport {
        return visitor.visit(this);
    }

    @Override
    public void accept(VoidValueVisitor visitor)
            throws OwsExceptionReport {
        visitor.visit(this);
    }
}
