/*
 * #%L
 * This file is part of jFold.
 * %%
 * Copyright (C) 2012 - 2024 Mike Thomas <mikepthomas@outlook.com>
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

import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;

import lombok.experimental.UtilityClass;

/**
 * <p>JacksonUtil class.</p>
 *
 * @author Michael Thomas (mikepthomas@outlook.com)
 * @version 7.6.21
 */
@UtilityClass
public class JacksonUtil {

    private ObjectMapper mapper;

    /**
     * <p>getObjectMapper.</p>
     *
     * @return a {@link com.fasterxml.jackson.databind.ObjectMapper} object
     */
    public ObjectMapper getObjectMapper() {
        if (mapper == null) {
            setupMapper();
        }
        return mapper;
    }

    private void setupMapper() {
        mapper = new ObjectMapper();
        mapper.configure(JsonReadFeature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.mappedFeature(), true);
        mapper.registerModule(new JakartaXmlBindAnnotationModule());
        mapper.setDateFormat(DateAdapter.DATE_FORMAT);
    }
}
