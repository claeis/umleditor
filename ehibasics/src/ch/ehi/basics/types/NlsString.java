// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:22:03 $
// $Revision: 1.1.1.1 $
//

                            // -beg- preserve=no 3CE107270322 package "NlsString"
package ch.ehi.basics.types;
                            // -end- 3CE107270322 package "NlsString"

                            // -beg- preserve=no 3CE107270322 autoimport "NlsString"
                            import ch.ehi.basics.tools.AbstractVisitor;
                            // -end- 3CE107270322 autoimport "NlsString"

                            // import declarations
                            // please fill in/modify the following section
                            // -beg- preserve=no 3CE107270322 import "NlsString"

                            // -end- 3CE107270322 import "NlsString"

                            /** National language support string.
                             */
public final class NlsString implements java.io.Serializable
                            {
                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=yes 3CE107270322 detail_begin "NlsString"
  static transient private String defaultLanguage="";
  private java.util.Map entries=null;
                              // -end- 3CE107270322 detail_begin "NlsString"

                              // -beg- preserve=no 3CE109D302D6 head3CE107270322 "NlsString"
                              public NlsString()
                              // -end- 3CE109D302D6 head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE109D302D6 throws3CE107270322 "NlsString"

                                // -end- 3CE109D302D6 throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE109D302D6 body3CE107270322 "NlsString"
    entries=new java.util.HashMap();
    return;
                                // -end- 3CE109D302D6 body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A0002EE head3CE107270322 "NlsString"
                              public NlsString(String value)
                              // -end- 3CE10A0002EE head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A0002EE throws3CE107270322 "NlsString"

                                // -end- 3CE10A0002EE throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A0002EE body3CE107270322 "NlsString"
    entries=new java.util.HashMap();
    entries.put(defaultLanguage,value);
    return;
                                // -end- 3CE10A0002EE body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A0D01C1 head3CE107270322 "NlsString"
                              public NlsString(String language, String value)
                              // -end- 3CE10A0D01C1 head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A0D01C1 throws3CE107270322 "NlsString"

                                // -end- 3CE10A0D01C1 throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A0D01C1 body3CE107270322 "NlsString"
    entries=new java.util.HashMap();
    entries.put(language!=null ? language : defaultLanguage,value);
    return;
                                // -end- 3CE10A0D01C1 body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A1F01C6 head3CE107270322 "NlsString"
                              public NlsString(NlsString src)
                              // -end- 3CE10A1F01C6 head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A1F01C6 throws3CE107270322 "NlsString"

                                // -end- 3CE10A1F01C6 throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A1F01C6 body3CE107270322 "NlsString"
    if(src==null){
      entries=new java.util.HashMap();
    }else{
      entries=new java.util.HashMap(src.entries);
    }
    return;
                                // -end- 3CE10A1F01C6 body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A3001DF head3CE107270322 "NlsString"
                              public NlsString(NlsString src, String value)
                              // -end- 3CE10A3001DF head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A3001DF throws3CE107270322 "NlsString"

                                // -end- 3CE10A3001DF throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A3001DF body3CE107270322 "NlsString"
    if(src==null){
      entries=new java.util.HashMap();
    }else{
      entries=new java.util.HashMap(src.entries);
    }
    entries.put(defaultLanguage,value);
    return;
                                // -end- 3CE10A3001DF body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A4100F3 head3CE107270322 "NlsString"
                              public NlsString(NlsString src, String language, String value)
                              // -end- 3CE10A4100F3 head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A4100F3 throws3CE107270322 "NlsString"

                                // -end- 3CE10A4100F3 throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A4100F3 body3CE107270322 "NlsString"
    if(src==null){
      entries=new java.util.HashMap();
    }else{
      entries=new java.util.HashMap(src.entries);
    }
    entries.put(language!=null ?language : defaultLanguage,value);
    return;
                                // -end- 3CE10A4100F3 body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A5302F8 head3CE107270322 "NlsString"
                              public NlsString(java.util.Map allValues)
                              // -end- 3CE10A5302F8 head3CE107270322 "NlsString"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A5302F8 throws3CE107270322 "NlsString"

                                // -end- 3CE10A5302F8 throws3CE107270322 "NlsString"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A5302F8 body3CE107270322 "NlsString"
    entries=new java.util.HashMap(allValues);
    return;
                                // -end- 3CE10A5302F8 body3CE107270322 "NlsString"
                                }

                              // -beg- preserve=no 3CE10A670260 head3CE107270322 "getValue"
                              public String getValue()
                              // -end- 3CE10A670260 head3CE107270322 "getValue"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A670260 throws3CE107270322 "getValue"

                                // -end- 3CE10A670260 throws3CE107270322 "getValue"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A670260 body3CE107270322 "getValue"
    return getBestEntry(defaultLanguage);
                                // -end- 3CE10A670260 body3CE107270322 "getValue"
                                }

                              // -beg- preserve=no 3CE10A70032B head3CE107270322 "getValue"
                              public String getValue(String language)
                              // -end- 3CE10A70032B head3CE107270322 "getValue"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A70032B throws3CE107270322 "getValue"

                                // -end- 3CE10A70032B throws3CE107270322 "getValue"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A70032B body3CE107270322 "getValue"
    return getBestEntry(language!=null ?language : defaultLanguage);
                                // -end- 3CE10A70032B body3CE107270322 "getValue"
                                }

                              // -beg- preserve=no 3CE10A84003B head3CE107270322 "getAllValues"
                              public java.util.Map getAllValues()
                              // -end- 3CE10A84003B head3CE107270322 "getAllValues"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A84003B throws3CE107270322 "getAllValues"

                                // -end- 3CE10A84003B throws3CE107270322 "getAllValues"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A84003B body3CE107270322 "getAllValues"
    java.util.Map ret=new java.util.HashMap();
    ret.putAll(entries);
    return ret;
                                // -end- 3CE10A84003B body3CE107270322 "getAllValues"
                                }

                              // -beg- preserve=no 3CE10A900133 head3CE107270322 "getDefaultLanguage"
                              public static String getDefaultLanguage()
                              // -end- 3CE10A900133 head3CE107270322 "getDefaultLanguage"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10A900133 throws3CE107270322 "getDefaultLanguage"

                                // -end- 3CE10A900133 throws3CE107270322 "getDefaultLanguage"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10A900133 body3CE107270322 "getDefaultLanguage"
    return defaultLanguage;
                                // -end- 3CE10A900133 body3CE107270322 "getDefaultLanguage"
                                }

                              // -beg- preserve=no 3CE10AA403E4 head3CE107270322 "setDefaultLanguage"
                              public static void setDefaultLanguage(String language)
                              // -end- 3CE10AA403E4 head3CE107270322 "setDefaultLanguage"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10AA403E4 throws3CE107270322 "setDefaultLanguage"

                                // -end- 3CE10AA403E4 throws3CE107270322 "setDefaultLanguage"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10AA403E4 body3CE107270322 "setDefaultLanguage"
    defaultLanguage = language!=null ? language : "";
                                // -end- 3CE10AA403E4 body3CE107270322 "setDefaultLanguage"
                                }

                              // -beg- preserve=no 3CE10E5D0395 head3CE107270322 "getBestEntry"
                              private String getBestEntry(String language)
                              // -end- 3CE10E5D0395 head3CE107270322 "getBestEntry"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3CE10E5D0395 throws3CE107270322 "getBestEntry"

                                // -end- 3CE10E5D0395 throws3CE107270322 "getBestEntry"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=yes 3CE10E5D0395 body3CE107270322 "getBestEntry"

    if(entries.size()==0)return "";

    if(entries.containsKey(language)){
      return (String)entries.get(language);
    }
    // find approximate entry
    // rm -> de -> fr -> en
    if(language.equals("rm")){
      if(entries.containsKey("de")) return (String)entries.get("de");
      if(entries.containsKey("fr")) return (String)entries.get("fr");
      if(entries.containsKey("en")) return (String)entries.get("en");
    }
    // it -> fr -> de -> rm -> en
    if(language.equals("it")){
      if(entries.containsKey("fr")) return (String)entries.get("fr");
      if(entries.containsKey("de")) return (String)entries.get("de");
      if(entries.containsKey("rm")) return (String)entries.get("rm");
      if(entries.containsKey("en")) return (String)entries.get("en");
    }
    // fr -> de -> it -> rm -> en
    if(language.equals("fr")){
      if(entries.containsKey("de")) return (String)entries.get("de");
      if(entries.containsKey("it")) return (String)entries.get("it");
      if(entries.containsKey("rm")) return (String)entries.get("rm");
      if(entries.containsKey("en")) return (String)entries.get("en");
    }
    // en -> de -> fr -> it -> rm
    if(language.equals("en")){
      if(entries.containsKey("de")) return (String)entries.get("de");
      if(entries.containsKey("fr")) return (String)entries.get("fr");
      if(entries.containsKey("it")) return (String)entries.get("it");
      if(entries.containsKey("rm")) return (String)entries.get("rm");
    }
    // de -> fr -> it -> rm -> en
    if(language.equals("de")){
      if(entries.containsKey("fr")) return (String)entries.get("fr");
      if(entries.containsKey("it")) return (String)entries.get("it");
      if(entries.containsKey("rm")) return (String)entries.get("rm");
      if(entries.containsKey("en")) return (String)entries.get("en");
    }
    if(entries.containsKey(defaultLanguage)){
      return (String)entries.get(defaultLanguage);
    }
    // return any entry
    return (String)entries.values().iterator().next();
                                // -end- 3CE10E5D0395 body3CE107270322 "getBestEntry"
                                }

                              // -beg- preserve=no 3D4FA21C0194 head3CE107270322 "unlinkAll"
                              public void unlinkAll()
                              // -end- 3D4FA21C0194 head3CE107270322 "unlinkAll"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3D4FA21C0194 throws3CE107270322 "unlinkAll"

                                // -end- 3D4FA21C0194 throws3CE107270322 "unlinkAll"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=no 3D4FA21C0194 body3CE107270322 "unlinkAll"
                                return;
                                // -end- 3D4FA21C0194 body3CE107270322 "unlinkAll"
                                }

                              // -beg- preserve=no 3D4FA21C019E head3CE107270322 "enumerateChildren"
                              public void enumerateChildren(AbstractVisitor visitor)
                              // -end- 3D4FA21C019E head3CE107270322 "enumerateChildren"
                                // declare any checked exceptions
                                // please fill in/modify the following section
                                // -beg- preserve=no 3D4FA21C019E throws3CE107270322 "enumerateChildren"

                                // -end- 3D4FA21C019E throws3CE107270322 "enumerateChildren"
                                {
                                // please fill in/modify the following section
                                // -beg- preserve=no 3D4FA21C019E body3CE107270322 "enumerateChildren"
                                return;
                                // -end- 3D4FA21C019E body3CE107270322 "enumerateChildren"
                                }

                              // declare/define something only in the code
                              // please fill in/modify the following section
                              // -beg- preserve=yes 3CE107270322 detail_end "NlsString"
  public boolean equals(Object obj)
  {
    if(obj==null)return false;
    if(obj==this)return true;
    if(!(obj instanceof NlsString))return false;
    NlsString other=(NlsString)obj;
    if(!other.entries.equals(entries))return false;
    return true;
  }
  public String toString()
  {
    // add default value to ease debugging
    return super.toString() + "(" + getValue() + ")";
  }
                              // -end- 3CE107270322 detail_end "NlsString"

                            }

