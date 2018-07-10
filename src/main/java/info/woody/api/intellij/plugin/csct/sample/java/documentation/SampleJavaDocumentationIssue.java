package info.woody.api.intellij.plugin.csct.sample.java.documentation;

/**
 * This is wrong Format and includes codeStyleWord
 * @since
 */
public class SampleJavaDocumentationIssue {
    private String test;

    public SampleJavaDocumentationIssue(String test) {
        this.test = test;
    }

    /**
     */
    public String testMe1(String hi) {
        return hi + ", there";
    }

    /**
     *
     */
    public String testMe2(String hi) {
        return hi + ", there";
    }

    /**
     * @param hi
     * @return
     */
    public String testMe3(String hi) {
        return hi + ", there";
    }
}
