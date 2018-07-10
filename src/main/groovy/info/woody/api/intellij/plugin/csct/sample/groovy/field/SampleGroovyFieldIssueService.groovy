package info.woody.api.intellij.plugin.csct.sample.groovy.field;

import info.woody.api.intellij.plugin.csct.sample.java.documentation.SampleJavaDocumentationIssue;

import java.util.logging.Logger;

public class SampleGroovyFieldIssueService {
    private Logger logger = Logger.getLogger(SampleJavaDocumentationIssue.class.getName());
    public String test;
    public static final int testGo = 123;

    private SampleGroovyFieldIssueService issueService;

    public SampleGroovyFieldIssueService(String test) {
        this.test = test;
    }

}
