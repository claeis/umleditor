package ch.ehi.basics.tools;

/** String utilities
 *
 */
public class StringUtility {
  /** do not instantiate
   *
   */
  private StringUtility(){}

  /** Returns a string of the given length, consisting of a repetition of the specified filler character.
   *
   */
  public static String STRING(int length,char c)
  {
    StringBuffer buf=new StringBuffer(length);
    for(int i=0;i<length;i++){
      buf.append(c);
    }
    return buf.toString();
  }
}