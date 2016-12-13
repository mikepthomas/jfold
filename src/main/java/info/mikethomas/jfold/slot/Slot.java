/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2015 Michael Thomas (mikepthomas@outlook.com)
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

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Slot class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.4.4
 */
@ApiModel(value = "Folding@home Slot")
@XmlRootElement(name = "slot")
public class Slot implements Serializable {
// <editor-fold defaultstate="collapsed" desc="Member Variables">
    /**
     * Identifier.
     */
    @ApiModelProperty(value = "Identifier", required = true)
    @XmlElement(name = "id")
    private String id;
    /**
     * Status.
     */
    @XmlElement(name = "status")
    private String status;
    /**
     * Description.
     */
    @XmlElement(name = "description")
    private String description;
    /**
     * SlotOptions.
     */
    @XmlElement(name = "options")
    private SlotOptions options;
    /**
     * Reason.
     */
    @XmlElement(name = "reason")
    private String reason;
    /**
     * Idle.
     */
    @XmlElement(name = "idle")
    private boolean idle;
// </editor-fold>

// <editor-fold desc="Accessors">
    /**
     * Get the value of <code>id</code>.
     *
     * @return the <code>id</code> from <code>slot-info</code>
     */
    public final String getId() {
        return id;
    }

    /**
     * Get the value of <code>status</code>.
     *
     * @return the <code>status</code> from <code>slot-info</code>
     */
    public final String getStatus() {
        return status;
    }

    /**
     * Get the value of <code>description</code>.
     *
     * @return the <code>description</code> from <code>slot-info</code>
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Get the value of <code>options</code>.
     *
     * @return the <code>options</code> from <code>slot-info</code>
     */
    public final SlotOptions getOptions() {
        return options;
    }

    /**
     * Get the value of <code>reason</code>.
     *
     * @return the <code>reason</code> from <code>slot-info</code>
     */
    public final String getReason() {
        return reason;
    }

    /**
     * Get the value of <code>idle</code>.
     *
     * @return the <code>idle</code> from <code>slot-info</code>
     */
    public final boolean getIdle() {
        return idle;
    }
// </editor-fold>

    /** {@inheritDoc} */
    @Override
    public final String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
