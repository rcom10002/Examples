package info.woody.api.intellij.plugin.csct.sample.java.documentation;

/**
 * This is wrong Format and includes codeStyleWord
 * Created by tester, on 10/13/2018.
 *
 *
 */
public class SampleJavaDocumentationIssue {
    private String test;
    private static int DECLARATION_ORDER_ISSUE1 = 0;
    private static final int DECLARATION_ORDER_ISSUE2 = 0;

    /**
     */
    public String testMe1(String hi) {
        ;
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

    public SampleJavaDocumentationIssue(String test) {
        this.test = test;
    }
}
