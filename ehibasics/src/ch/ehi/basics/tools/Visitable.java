// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:22:01 $
// $Revision: 1.1.1.1 $
//

                            // -beg- preserve=no 3CAA00C70295 package "Visitable"
package ch.ehi.basics.tools;
                            // -end- 3CAA00C70295 package "Visitable"

                            // -beg- preserve=no 3CAA00C70295 autoimport "Visitable"
                            import ch.ehi.basics.tools.AbstractVisitor;
                            // -end- 3CAA00C70295 autoimport "Visitable"

                            // import declarations
                            // please fill in/modify the following section
                            // -beg- preserve=no 3CAA00C70295 import "Visitable"

                            // -end- 3CAA00C70295 import "Visitable"

                            /** classes to be processed by a concrete visitor should implement this interface
                             */
public interface Visitable
                            {
                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=no 3CAA00C70295 detail_begin "Visitable"

                              // -end- 3CAA00C70295 detail_begin "Visitable"

                              /** process any children by calling visitor.
                               */
                              // -beg- preserve=no 3CAA00FE0135 head3CAA00C70295 "enumerateChildren"
                              public void enumerateChildren(AbstractVisitor visitor)
                              // -end- 3CAA00FE0135 head3CAA00C70295 "enumerateChildren"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CAA00FE0135 throws3CAA00C70295 "enumerateChildren"

                                // -end- 3CAA00FE0135 throws3CAA00C70295 "enumerateChildren"
                                ; // empty

                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=no 3CAA00C70295 detail_end "Visitable"

                              // -end- 3CAA00C70295 detail_end "Visitable"

                            }

