/**
 * Created by Danial Goodwin on 2015-12-30.
 */
package com.anonsage;

import junit.framework.TestCase;

public class CsTopicGeneratorTest extends TestCase {

    public void testGetTopic() throws Exception {
        CsTopicGenerator generator = new CsTopicGenerator();
        assertTrue(!generator.getTopic().isEmpty());
    }

    public void testGetAdverb() throws Exception {
        CsTopicGenerator generator = new CsTopicGenerator();
        assertTrue(!generator.getAdverb().isEmpty());
    }

    public void testGetAdjective() throws Exception {
        CsTopicGenerator generator = new CsTopicGenerator();
        assertTrue(!generator.getAdjective().isEmpty());
    }

    public void testGetNoun() throws Exception {
        CsTopicGenerator generator = new CsTopicGenerator();
        assertTrue(!generator.getNoun().isEmpty());
    }

    public void testGetPhraseConnective() throws Exception {
        CsTopicGenerator generator = new CsTopicGenerator();
        assertTrue(!generator.getPhraseConnective().isEmpty());
    }

}