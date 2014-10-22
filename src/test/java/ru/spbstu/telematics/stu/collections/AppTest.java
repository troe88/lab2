package ru.spbstu.telematics.stu.collections;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    
    public void addToVector(){
    	System.out.println("addToVector test");
    	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	assertEquals(3, v.size());
    }
 
    public void addToVectorByIndex(){
    	System.out.println("addToVectorByIndex test");
    	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	v.add("zxc", 1);
    	assertEquals("zxc", v.get(1));
    }
    
    public void getElemetn(){
    	System.out.println("getElemetn");
    	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	assertEquals("q", v.get(0));
    }
    
    public void removeElement(){
    	System.out.println("removeElement");
    	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	v.remove(0);
    	assertEquals(2, v.size());
    }
    
    public void findElement(){
    	System.out.println("findElement");
      	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	assertEquals(1, v.indexOf("w"));
    }
    
    public void foreachSycle(){
    	System.out.println("foreachSycle");
    	Vector v = new Vector();
    	v.add("q");
    	v.add("w");
    	v.add("3");
    	String a = new String();
    	for (Object object : v) {
			a += object;
		}
    	assertEquals("qw3", a);
    }
    
    public void testApp()
    {
    	System.out.println("Start tests. Its wrong test implementation, I must rewrite it yet...");
    	addToVector();
    	addToVectorByIndex();
    	getElemetn();
    	removeElement();
    	findElement();
    	foreachSycle();
    }
}
