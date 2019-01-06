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
package info.mikethomas.jfold.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import lombok.Synchronized;

/**
 * <p>DateAdapter class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    /**
     * Date format used by the Folding@Home client.
     */
    public static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    @Override
    @Synchronized
    public final String marshal(final Date value) throws Exception {
        return DATE_FORMAT.format(value);
    }

    @Override
    @Synchronized
    public final Date unmarshal(final String value) throws Exception {
        return DATE_FORMAT.parse(value);
    }
}
