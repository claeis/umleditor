// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:42 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3298F1A403BF package "StructuralFeature"
package ch.ehi.uml1_4.foundation.core;
// -end- 3298F1A403BF package "StructuralFeature"

import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3298F1A403BF import "StructuralFeature"

// -end- 3298F1A403BF import "StructuralFeature"

/** A structural feature refers to a static feature of a model element, such as an attribute.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:42 $
 */
public interface StructuralFeature extends Feature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298F1A403BF detail_begin "StructuralFeature"

// -end- 3298F1A403BF detail_begin "StructuralFeature"

/** get current value of multiplicity
 *  @see #setMultiplicity
 */
// -beg- preserve=no 32B6AEA8032B get_head3298F1A403BF "multiplicity"
Multiplicity getMultiplicity()
// -end- 32B6AEA8032B get_head3298F1A403BF "multiplicity"
;     // empty
/** set current value of multiplicity
 *  @see #getMultiplicity
 */
// -beg- preserve=no 32B6AEA8032B set_head3298F1A403BF "multiplicity"
void setMultiplicity(Multiplicity value1)
// -end- 32B6AEA8032B set_head3298F1A403BF "multiplicity"
;     // empty
/** get current value of changeability
 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
 *  @see #setChangeability
 */
// -beg- preserve=no 3163DE07014A get_head3298F1A403BF "changeability"
int getChangeability()
// -end- 3163DE07014A get_head3298F1A403BF "changeability"
;     // empty
/** set current value of changeability
 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
 *  @see #getChangeability
 */
// -beg- preserve=no 3163DE07014A set_head3298F1A403BF "changeability"
void setChangeability(int value1)
// -end- 3163DE07014A set_head3298F1A403BF "changeability"
;     // empty
/** get current value of targetScope
 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
 *  @see #setTargetScope
 */
// -beg- preserve=no 335A35E5028A get_head3298F1A403BF "targetScope"
int getTargetScope()
// -end- 335A35E5028A get_head3298F1A403BF "targetScope"
;     // empty
/** set current value of targetScope
 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
 *  @see #getTargetScope
 */
// -beg- preserve=no 335A35E5028A set_head3298F1A403BF "targetScope"
void setTargetScope(int value1)
// -end- 335A35E5028A set_head3298F1A403BF "targetScope"
;     // empty
/** get current value of ordering
 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
 *  @see #setOrdering
 */
// -beg- preserve=no 3A554D5703C8 get_head3298F1A403BF "ordering"
int getOrdering()
// -end- 3A554D5703C8 get_head3298F1A403BF "ordering"
;     // empty
/** set current value of ordering
 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
 *  @see #getOrdering
 */
// -beg- preserve=no 3A554D5703C8 set_head3298F1A403BF "ordering"
void setOrdering(int value1)
// -end- 3A554D5703C8 set_head3298F1A403BF "ordering"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298F1A403BF detail_end "StructuralFeature"

// -end- 3298F1A403BF detail_end "StructuralFeature"

}
