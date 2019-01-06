/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2019 Mike Thomas <mikepthomas@outlook.com>
 * %%
 * jFold is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * %
 * jFold is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * %
 * You should have received a copy of the GNU General Public License
 * along with jFold.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package info.mikethomas.jfold.slot;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>Slot class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
@Getter
@ToString
@XmlRootElement(name = "slot")
public class Slot implements Serializable {

    /**
     * Identifier.
     *
     * @return the <code>id</code> from <code>slot-info</code>
     */
    @XmlElement
    private String id;

    /**
     * Status.
     *
     * @return the <code>status</code> from <code>slot-info</code>
     */
    @XmlElement
    private String status;

    /**
     * Description.
     *
     * @return the <code>description</code> from <code>slot-info</code>
     */
    @XmlElement
    private String description;

    /**
     * Slot Options.
     *
     * @return the <code>options</code> from <code>slot-info</code>
     */
    @XmlElement
    private SlotOptions options;

    /**
     * Reason.
     *
     * @return the <code>reason</code> from <code>slot-info</code>
     */
    @XmlElement
    private String reason;

    /**
     * Idle.
     *
     * @return the <code>idle</code> from <code>slot-info</code>
     */
    @XmlElement
    private Boolean idle;
}
