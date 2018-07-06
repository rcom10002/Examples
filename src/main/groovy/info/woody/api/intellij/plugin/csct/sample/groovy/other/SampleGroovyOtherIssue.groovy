package info.woody.api.intellij.plugin.csct.sample.groovy.other;

import org.junit.Test;

/**
 * This is wrong Format and includes codeStyleWord
 * @since
 */
public class SampleGroovyOtherIssue {
    private static final String KEY_VALUE = "The constant should be left operand.";

    private String test;

    /**
     * @param test This is testParam.
     */
    public SampleGroovyOtherIssue(String test) {
        this.test = test;
        println "constant"
    }

    @Test
    public void hiTestMe() {
    }
}
