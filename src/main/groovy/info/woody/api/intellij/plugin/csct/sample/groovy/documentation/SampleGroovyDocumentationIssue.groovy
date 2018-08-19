package info.woody.api.intellij.plugin.csct.sample.groovy.documentation

public class SampleGroovyDocumentationIssue {
    public String test;
    public int snake_name_field;

    SampleGroovyDocumentationIssue(test) {
        this.test = test
    }

    public int snake_name_method() {
        int snake_name_variable = 100
        return snake_name_variable
    }

    public boolean badNaming(String test) {
        if (test != null && "".equals(test)) {
            test = "100"
        }
        if (test != null && "abc".equals(test)) {
            test = "abc"
        }
        return null == test
    }
}
