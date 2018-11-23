package org.ff4j.parser.yaml;

/*-
 * #%L
 * ff4j-utils-yaml
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

import java.io.FileNotFoundException;

import org.ff4j.parser.FF4jConfigFile;
import org.ff4j.parser.yaml.YamlParser;
import org.ff4j.test.FF4jTestDataSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Parsing sample files.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class YamlParserTest implements FF4jTestDataSet {
    
    @Test
    public void testParsing() throws FileNotFoundException {
        FF4jConfigFile configFile = new YamlParser().parse("test-ff4j-parser.yml");
        
        // roles
        Assert.assertNotNull(configFile.getRoles());
        Assert.assertEquals(3, configFile.getRoles().size());
        Assert.assertNotNull(configFile.getRoles().get("USER"));
        
        // users
        Assert.assertNotNull(configFile.getUsers());
        Assert.assertEquals(2, configFile.getUsers().size());
        Assert.assertEquals(1, configFile.getUsers().get("pierre").getRoles().size());

        // Properties
        Assert.assertNotNull(configFile.getProperties());
        Assert.assertEquals(7, configFile.getProperties().size());
        Assert.assertNotNull(configFile.getProperties().get("a"));
        
        // Features
        Assert.assertNotNull(configFile.getFeatures());
        Assert.assertEquals(4, configFile.getFeatures().size());
        
        System.out.println(configFile);
    }

}
