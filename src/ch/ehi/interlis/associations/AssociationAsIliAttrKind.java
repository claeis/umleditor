// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2005-01-17 11:23:04 $
// $Revision: 1.2 $
//

              // -beg- preserve=no 3D46C0510377 package "AssociationAsIliAttrKind"
package ch.ehi.interlis.associations;
              // -end- 3D46C0510377 package "AssociationAsIliAttrKind"

              // -beg- preserve=no 3D46C0510377 autoimport "AssociationAsIliAttrKind"

              // -end- 3D46C0510377 autoimport "AssociationAsIliAttrKind"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3D46C0510377 import "AssociationAsIliAttrKind"

              // -end- 3D46C0510377 import "AssociationAsIliAttrKind"

              /** An enumeration that denotes if and what kind of attribute an Association is.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.2 $ $Date: 2005-01-17 11:23:04 $
               */
public class AssociationAsIliAttrKind implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3D46C0510377 detail_begin "AssociationAsIliAttrKind"

                // -end- 3D46C0510377 detail_begin "AssociationAsIliAttrKind"

                /** not an INTERLIS attribute
                 * @deprecated use RoleDefUtility
                 */
                // -beg- preserve=no 3D46C0A0000A var3D46C0510377 "ASSOCIATION"
                public static final int ASSOCIATION = 1;
                // -end- 3D46C0A0000A var3D46C0510377 "ASSOCIATION"

                /** an INTERLIS structure attribute
                 * @deprecated use RoleDefUtility
                 */
                // -beg- preserve=no 3D46C0A8008E var3D46C0510377 "STRUCTURE"
                public static final int STRUCTURE = 2;
                // -end- 3D46C0A8008E var3D46C0510377 "STRUCTURE"

                /** an INTERLIS reference attribute
                 * @deprecated use RoleDefUtility
                 */
                // -beg- preserve=no 3D46C0B102D5 var3D46C0510377 "REFERENCE"
                public static final int REFERENCE = 3;
                // -end- 3D46C0B102D5 var3D46C0510377 "REFERENCE"

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3D46C0510377 detail_end "AssociationAsIliAttrKind"

                // -end- 3D46C0510377 detail_end "AssociationAsIliAttrKind"

              }

