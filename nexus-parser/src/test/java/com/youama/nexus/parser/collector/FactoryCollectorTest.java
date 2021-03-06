package com.youama.nexus.parser.collector;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author David Belicza <87.bdavid@gmail.com>
 * @since 2015.07.11.
 */
public class FactoryCollectorTest extends TestCase {

    @Test
    public void testGetCollector() {
        String source = "";
        ICollector linkCollector = FactoryCollector.getCollector(FactoryCollector.TYPE_LINK, source);
        assertTrue(linkCollector instanceof LinkCollector);
    }
}