/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;





public class Javasingleton {

    
    public static void main(String[] args) {
        // java singletonexample
        singletonexample obj=singletonexample.methodforsingleton();
        singletonexample obj2=singletonexample.methodforsingleton();
<<<<<<< Updated upstream
		singletonexample obj4=singletonexample.methodforsingleton();
		obj4.showMessage();
=======
		singletonexample obj3=singletonexample.methodforsingleton();
>>>>>>> Stashed changes
        obj.showMessage();
         obj2.showMessage();
		      obj3.showMessage();
         System.out.println(obj);
         System.out.println(obj2);
<<<<<<< Updated upstream
		  System.out.println(obj4);
=======
		  System.out.println(obj3);
>>>>>>> Stashed changes
    }
}
