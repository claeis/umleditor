// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:47 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 39B9ADC0033C package "TagDefinition"
package ch.ehi.uml1_4.foundation.extensionmechanisms;
// -end- 39B9ADC0033C package "TagDefinition"

// -beg- preserve=no 39B9ADC0033C autoimport "TagDefinition"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 39B9ADC0033C autoimport "TagDefinition"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39B9ADC0033C import "TagDefinition"

// -end- 39B9ADC0033C import "TagDefinition"

/** A tag definition specifies the tagged values that can be attached to a kind of model element.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:47 $
 */
public interface TagDefinition extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39B9ADC0033C detail_begin "TagDefinition"

  // -end- 39B9ADC0033C detail_begin "TagDefinition"

  /** attaches a Owner.
   *  
   *  @see #detachOwner
   *  @see #getOwner
   *  @see #containsOwner
   */
  // -beg- preserve=no 3386129C003F attach_head39B9ADC0033C "TagDefinition::attachOwner"
  public void attachOwner(Stereotype owner1)
  // -end- 3386129C003F attach_head39B9ADC0033C "TagDefinition::attachOwner"
    ; // empty

  /** disconnect the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3386129C003F detach_head39B9ADC0033C "TagDefinition::detachOwner"
  public Stereotype detachOwner()
  // -end- 3386129C003F detach_head39B9ADC0033C "TagDefinition::detachOwner"
    ; // empty

  /** get the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3386129C003F get_head39B9ADC0033C "TagDefinition::getOwner"
  public Stereotype getOwner()
  // -end- 3386129C003F get_head39B9ADC0033C "TagDefinition::getOwner"
    ; // empty

  /** tests if there is a Owner attached.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3386129C003F test_head39B9ADC0033C "TagDefinition::containsOwner"
  public boolean containsOwner()
  // -end- 3386129C003F test_head39B9ADC0033C "TagDefinition::containsOwner"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3386129C003F _link_body39B9ADC0033C "TagDefinition::_linkOwner"
  public void _linkOwner(Stereotype owner1);
  // -end- 3386129C003F _link_body39B9ADC0033C "TagDefinition::_linkOwner"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3386129C003F _unlink_body39B9ADC0033C "TagDefinition::_unlinkOwner"
  public void _unlinkOwner(Stereotype owner1);
  // -end- 3386129C003F _unlink_body39B9ADC0033C "TagDefinition::_unlinkOwner"

  /** get current value of tagType
   *  In the general case, where the tag type is a data type, this specifiesthe range of values of the tagged values associated with the tagdefinition.
   *  @see #setTagType
   */
  // -beg- preserve=no 39B9ADD8000F get_head39B9ADC0033C "tagType"
   String getTagType()
  // -end- 39B9ADD8000F get_head39B9ADC0033C "tagType"
    ; // empty
  /** set current value of tagType
   *  @see #getTagType
   */
  // -beg- preserve=no 39B9ADD8000F set_head39B9ADC0033C "tagType"
   void setTagType(String value1)
  // -end- 39B9ADD8000F set_head39B9ADC0033C "tagType"
    ; // empty
  /** get current value of multiplicity
   *  @see #setMultiplicity
   */
  // -beg- preserve=no 39B9ADE30186 get_head39B9ADC0033C "multiplicity"
   Multiplicity getMultiplicity()
  // -end- 39B9ADE30186 get_head39B9ADC0033C "multiplicity"
    ; // empty
  /** set current value of multiplicity
   *  @see #getMultiplicity
   */
  // -beg- preserve=no 39B9ADE30186 set_head39B9ADC0033C "multiplicity"
   void setMultiplicity(Multiplicity value1)
  // -end- 39B9ADE30186 set_head39B9ADC0033C "multiplicity"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39B9ADC0033C detail_end "TagDefinition"

  // -end- 39B9ADC0033C detail_end "TagDefinition"

}

