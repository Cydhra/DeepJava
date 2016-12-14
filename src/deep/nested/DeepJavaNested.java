package deep.nested;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * An example of reflection granting (no) access on enclosed classes
 */
public class DeepJavaNested {
    
    /**
     * A method, that holds an inner class
     */
    public void outerClassFoo() {
        
        /**
         * Class enclosed by method
         */
        class InnerClass {
            
            /**
             * Default constructor of InnerClass
             */
            public InnerClass() {
                System.out.println("Constructed instance of " + getClass().getName());
            }
            
            /**
             * Just to test the created object
             */
            public void foo() {
                System.out.println("Successfully invoked a pointless method!");
            }
        }
    }
    
    public static void main(String[] args) {
        Class<?> innerClass = null;
        
        try {
            innerClass = Class.forName("deep.nested.DeepJavaNested$1InnerClass");
        } catch (ClassNotFoundException e) {
            assert false;
        }
    
        try {
            // get the (obviously declared) default constructor for the inner class
            Constructor<?> innerClassConstructor = innerClass.getConstructor();
            // set it accessible, just in case, I am missing something, that would hide it
            innerClassConstructor.setAccessible(true);
            
            // invoke the constructor and get an instance of InnerClass
            Object instanceOfInnerClass = innerClassConstructor.newInstance();
            // invoke test method
            innerClass.getMethod("foo").invoke(instanceOfInnerClass);
        } catch (NoSuchMethodException e) {
            System.err.println("Reflection failed to find constructor: " + e.getMessage());
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    
        try {
            // invoke the default constructor using the evil way
            Object innerClassObj = innerClass.newInstance();
            // invoke test method
            innerClass.getMethod("foo").invoke(innerClassObj);
        } catch (InstantiationException e) {
            System.err.println("Reflection failed to instance class: " + e.getMessage());
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    
}
