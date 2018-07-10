package info.woody.api.intellij.plugin.csct.sample.java.test.other;

import org.junit.Test;

/**
 * This is wrong Format and includes codeStyleWord
 * @since
 */
public class SampleJavaOtherIssueTest {
    private static final String KEY_VALUE = "The constant should be left operand.";

    private String test;

    /**
     * @param test This is testParam.
     */
    public SampleJavaOtherIssueTest(String test) {
        this.test = test;
    }

    @Test
    public void hiTestMe() {
        String redisKey= null; // FORMAT ERROR
        String badStringNaming =null; // FORMAT ERROR
        if (redisKey == null){ // FORMAT ERROR
            System.out.println("requestProperties");
        }
        if(redisKey.equals(KEY_VALUE)) { // FORMAT ERROR
            System.out.println();
        }
        if (redisKey.equalsIgnoreCase(SampleJavaOtherIssueTest.KEY_VALUE)) {
            System.out.println();
        }
        assert "".equals(redisKey);

        Object thisIsABIGDemo = new Object();

        int a = thisIsABIGDemo.hashCode();
        System.out.println(a);
        int b = thisIsABIGDemo.hashCode();
        System.out.println(b);

        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i ++) { // this is a very, very, very, very, very, very, very, very, very, very, very, very, very, very, very, very, very, very, very, very long comment.
            System.out.println(i);
            this.test = "100".concat("0000099989" +
                    "009");
        }

        boolean xyz = 1 > 2;
        if (xyz == true) {
            System.out.println(SampleJavaOtherIssueTest.TestTypeEnum.JAVA);
        }else if (SampleJavaOtherIssueTest.TestTypeEnum.JAVA.equals(100)) { // FORMAT ERROR
            System.out.println("test");
        }

        try{ // FORMAT ERROR
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    enum TestTypeEnum {
        JAVA, GROOVY;
    }
}
