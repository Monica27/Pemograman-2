package belajar.autotest;

import junit.framework.TestCase;
import junit.framework.Assert;

public class HaloTest extends TestCase{
public HaloTest(String testName){
super(testName);
}
protected void setUp() throws Exception{
super.setUp();
System.out.println("hello");
}
protected void tearDown()  throws Exception{
super.tearDown();
System.out.println("world");
}
//method test ini harus diawali dengan kata'test'
public void testApp(){
System.out.println("hello world");
}
public void  testAritmetic(){
int a=7;
int b=4;
Assert.assertEquals(10, a+b);
}
}