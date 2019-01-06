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

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import lombok.experimental.UtilityClass;

/**
 * <p>JacksonUtil class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.5.1
 */
@UtilityClass
public class JacksonUtil {

    private ObjectMapper mapper;

    public ObjectMapper getObjectMapper() {
        if (mapper == null) {
            setupMapper();
        }
        return mapper;
    }

    private void setupMapper() {
        mapper = new ObjectMapper();
        mapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        mapper.registerModule(new JaxbAnnotationModule());
        mapper.setDateFormat(DateAdapter.DATE_FORMAT);
    }
}
