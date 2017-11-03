// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:17 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C454D4A02A4 package "MetaModelListener"
package ch.ehi.uml1_4.changepropagation;
// -end- 3C454D4A02A4 package "MetaModelListener"

// -beg- preserve=no 3C454D4A02A4 autoimport "MetaModelListener"
import ch.ehi.uml1_4.changepropagation.MetaModelChange;
// -end- 3C454D4A02A4 autoimport "MetaModelListener"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C454D4A02A4 import "MetaModelListener"

// -end- 3C454D4A02A4 import "MetaModelListener"

/** Parties interested in changes to the metamodel should implement this interface and register it in changepropagation.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:17 $
 */
public interface MetaModelListener
{
<<<<<<< HEAD
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3C454D4A02A4 detail_begin "MetaModelListener"

  // -end- 3C454D4A02A4 detail_begin "MetaModelListener"

  /** This function gets called after a change to a metamodel object occured.
   */
  // -beg- preserve=no 3C454D9201D5 head3C454D4A02A4 "metaModelChanged"
  public void metaModelChanged(MetaModelChange event)
  // -end- 3C454D9201D5 head3C454D4A02A4 "metaModelChanged"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3C454D9201D5 throws3C454D4A02A4 "metaModelChanged"

    // -end- 3C454D9201D5 throws3C454D4A02A4 "metaModelChanged"
    ; // empty

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3C454D4A02A4 detail_end "MetaModelListener"

  // -end- 3C454D4A02A4 detail_end "MetaModelListener"

}

=======
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C454D4A02A4 detail_begin "MetaModelListener"

// -end- 3C454D4A02A4 detail_begin "MetaModelListener"

/** This function gets called after a change to a metamodel object occured.
 */
// -beg- preserve=no 3C454D9201D5 head3C454D4A02A4 "metaModelChanged"
public void metaModelChanged(MetaModelChange event)
// -end- 3C454D9201D5 head3C454D4A02A4 "metaModelChanged"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C454D9201D5 throws3C454D4A02A4 "metaModelChanged"

// -end- 3C454D9201D5 throws3C454D4A02A4 "metaModelChanged"
;     // empty

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C454D4A02A4 detail_end "MetaModelListener"

// -end- 3C454D4A02A4 detail_end "MetaModelListener"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
