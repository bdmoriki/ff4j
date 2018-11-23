package org.ff4j.property;

/*-
 * #%L
 * ff4j-core
 * %%
 * Copyright (C) 2013 - 2018 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Arrays;
import java.util.List;

import org.ff4j.property.PropertyLogLevel.LogLevel;

/**
 * Load property as list of {@link LogLevel }.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class PropertyListLogLevel extends PropertyList<LogLevel  , PropertyLogLevel> {
    
    /** Serial Number. */
    private static final long serialVersionUID = 8808039388183628746L;
    
    public PropertyListLogLevel(String uid) {
        super(uid);
    }
    public PropertyListLogLevel(String uid, String valueAsString) {
        super(uid, valueAsString);
    }
    public PropertyListLogLevel(String uid, List< LogLevel  > value) {
        super(uid, value);
    }
    public PropertyListLogLevel(String uid, LogLevel  ... value) {
        super(uid, Arrays.asList(value));
    }
  

}
