package info.woody.api.intellij.plugin.csct.sample.java.comment;

public class SampleJavaCommentAndCurlyBraceIssue {

    public void test()
    {
        //Pei!
        // System.out.println();

        // test failure case
        this.testFailureCase();
    }

    private void testFailureCase() {
        System.out.println();
    }
}
