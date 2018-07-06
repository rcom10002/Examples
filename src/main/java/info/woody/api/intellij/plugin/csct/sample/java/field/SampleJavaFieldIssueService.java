package info.woody.api.intellij.plugin.csct.sample.java.field;

import info.woody.api.intellij.plugin.csct.sample.java.documentation.SampleJavaDocumentationIssue;

import java.util.logging.Logger;

public class SampleJavaFieldIssueService {
    private Logger logger = Logger.getLogger(SampleJavaDocumentationIssue.class.getName());
    private String test;
    public static final int testGo = 123;

    private SampleJavaFieldIssueService issueService;

    public SampleJavaFieldIssueService(String test) {
        this.test = test;
    }

}
