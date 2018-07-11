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
        List abcList = [10]
        this.test = test;
        println "constant"
        println "."
        abcList[0] = 1
        abcList[3] = 9
        def x
    }

    @Test
    public void hiTestMe() {
    }
}
