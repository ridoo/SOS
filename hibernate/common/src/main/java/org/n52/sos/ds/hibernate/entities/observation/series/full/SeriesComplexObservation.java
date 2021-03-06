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
package org.n52.sos.ds.hibernate.entities.observation.series.full;

import java.util.Set;

import org.n52.sos.ds.hibernate.entities.observation.Observation;
import org.n52.sos.ds.hibernate.entities.observation.ObservationVisitor;
import org.n52.sos.ds.hibernate.entities.observation.ValuedObservationVisitor;
import org.n52.sos.ds.hibernate.entities.observation.VoidObservationVisitor;
import org.n52.sos.ds.hibernate.entities.observation.VoidValuedObservationVisitor;
import org.n52.sos.ds.hibernate.entities.observation.full.ComplexObservation;
import org.n52.sos.ds.hibernate.entities.observation.series.AbstractSeriesObservation;
import org.n52.sos.ogc.ows.OwsExceptionReport;

/**
 * Implementation of a full {@link Observation} for the series observation
 * concept, that holds a complex value.
 *
 * @author Christian Autermann
 */
public class SeriesComplexObservation
        extends AbstractSeriesObservation<Set<Observation<?>>>
        implements ComplexObservation {
    private static final long serialVersionUID = 2125008522781603131L;
    private Set<Observation<?>> value;

    @Override
    public Set<Observation<?>> getValue() {
        return this.value;
    }

    @Override
    public void setValue(Set<Observation<?>> value) {
        this.value = value;
    }

    @Override
    public boolean isSetValue() {
        return this.value != null && !this.value.isEmpty();
    }

    @Override
    public void accept(VoidObservationVisitor visitor)
            throws OwsExceptionReport {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(ObservationVisitor<T> visitor)
            throws OwsExceptionReport {
        return visitor.visit(this);
    }

    @Override
    public void accept(VoidValuedObservationVisitor visitor)
            throws OwsExceptionReport {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(ValuedObservationVisitor<T> visitor)
            throws OwsExceptionReport {
        return visitor.visit(this);
    }

}
