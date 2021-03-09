public class StackTraceElementsExample {
    static int   elNo;
    public static void main(String[] args) {

        method1();
for (int i=0 ;i<2; i++) {
    StackTraceElement stack = Thread.currentThread().getStackTrace()[i];
    elNo = stack.getLineNumber(); //previosuly defined class static variable
    System.out.println(elNo);
}
    }

    public static void method1()
    {
      method2();

        StackTraceElement stack1 = Thread.currentThread().getStackTrace()[2];
        int lineNumber= stack1.getLineNumber();
        System.out.println(lineNumber);
        String methodName=stack1.getMethodName();
        System.out.println(methodName);
    }

    public static void method2()
    {
        StackTraceElement stack2 = Thread.currentThread().getStackTrace()[2];
        String methodName1=stack2.getMethodName();
        System.out.println(methodName1);
    }
}
