// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:22:00 $
// $Revision: 1.1.1.1 $
//

                            // -beg- preserve=no 3CAA012D02A5 package "AbstractVisitor"
package ch.ehi.basics.tools;
                            // -end- 3CAA012D02A5 package "AbstractVisitor"

                            // -beg- preserve=yes 3CAA012D02A5 autoimport "AbstractVisitor"

                            // -end- 3CAA012D02A5 autoimport "AbstractVisitor"

                            // import declarations
                            // please fill in/modify the following section
                            // -beg- preserve=yes 3CAA012D02A5 import "AbstractVisitor"
import java.lang.reflect.*;
                            // -end- 3CAA012D02A5 import "AbstractVisitor"

                            /** A base class to derive concrete visitors from it.
                             */
public abstract class AbstractVisitor
                            {
                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=no 3CAA012D02A5 detail_begin "AbstractVisitor"

                              // -end- 3CAA012D02A5 detail_begin "AbstractVisitor"

                              /** process an object
                               */
                              // -beg- preserve=no 3CAA017C010E head3CAA012D02A5 "visit"
                              public void visit(Object object)
                              // -end- 3CAA017C010E head3CAA012D02A5 "visit"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA017C010E throws3CAA012D02A5 "visit"

                                // -end- 3CAA017C010E throws3CAA012D02A5 "visit"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CAA017C010E body3CAA012D02A5 "visit"
    if(object==null)return;
     Method method = getMethod(object.getClass());
     try{
       method.invoke(this, new Object[] {object});
     }catch(InvocationTargetException ex){
      // ex.getTargetException().printStackTrace();
      throw new java.lang.IllegalStateException(ex.getTargetException().getLocalizedMessage());
     }catch(IllegalAccessException ex){
      throw new java.lang.IllegalStateException(ex.getLocalizedMessage());
     }
     if (object instanceof Visitable)
     {
          callEnumerate((Visitable) object);
     }
                                // -end- 3CAA017C010E body3CAA012D02A5 "visit"
                                }

                              /** template method that is called if no other method matches
                               */
                              // -beg- preserve=no 3CAA01F401A7 head3CAA012D02A5 "defaultVisit"
                              public void defaultVisit(Object o)
                              // -end- 3CAA01F401A7 head3CAA012D02A5 "defaultVisit"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA01F401A7 throws3CAA012D02A5 "defaultVisit"

                                // -end- 3CAA01F401A7 throws3CAA012D02A5 "defaultVisit"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA01F401A7 body3CAA012D02A5 "defaultVisit"
                                return;
                                // -end- 3CAA01F401A7 body3CAA012D02A5 "defaultVisit"
                                }

                              /** helper to find a matching processing method
                               */
                              // -beg- preserve=no 3CAA020600E5 head3CAA012D02A5 "getMethod"
                              protected Method getMethod(Class c)
                              // -end- 3CAA020600E5 head3CAA012D02A5 "getMethod"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA020600E5 throws3CAA012D02A5 "getMethod"

                                // -end- 3CAA020600E5 throws3CAA012D02A5 "getMethod"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CAA020600E5 body3CAA012D02A5 "getMethod"
   Class newc = c;
   Method m = null;
   // Try the superclasses
   while (m == null && newc != Object.class) {
      String method = newc.getName();
      method = "visit" + method.substring(method.lastIndexOf('.') + 1);
      try {
         m = getClass().getMethod(method, new Class[] {newc});
      } catch (NoSuchMethodException e) {
         newc = newc.getSuperclass();
      }
   }
   // Try the interfaces.  If necessary, you
   // can sort them first to define 'visitable' interface wins
   // in case an object implements more than one.
   if (newc == Object.class) {
      Class[] interfaces = c.getInterfaces();
      for (int i = 0; i < interfaces.length; i++) {
         String method = interfaces[i].getName();
         method = "visit" + method.substring(method.lastIndexOf('.') + 1);
         try {
            m = getClass().getMethod(method, new Class[] {interfaces[i]});
         } catch (NoSuchMethodException e) {}
      }
   }
   if (m == null) {
      try {
         m = getClass().getMethod("defaultVisit", new Class[] {Object.class});
      } catch (Exception e) {
          // Can't happen
      }
   }
   return m;
                                // -end- 3CAA020600E5 body3CAA012D02A5 "getMethod"
                                }

                              /** template method to avoid the visitor calling enumerateChildren.
                               */
                              // -beg- preserve=no 3CAA025D01C6 head3CAA012D02A5 "callEnumerate"
                              public void callEnumerate(Visitable visitable)
                              // -end- 3CAA025D01C6 head3CAA012D02A5 "callEnumerate"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA025D01C6 throws3CAA012D02A5 "callEnumerate"

                                // -end- 3CAA025D01C6 throws3CAA012D02A5 "callEnumerate"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CAA025D01C6 body3CAA012D02A5 "callEnumerate"
    visitable.enumerateChildren(this);
                                // -end- 3CAA025D01C6 body3CAA012D02A5 "callEnumerate"
                                }

                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=no 3CAA012D02A5 detail_end "AbstractVisitor"

                              // -end- 3CAA012D02A5 detail_end "AbstractVisitor"

                            }

