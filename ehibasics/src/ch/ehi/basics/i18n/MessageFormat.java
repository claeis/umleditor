package ch.ehi.basics.i18n;

import java.util.ResourceBundle;

public class MessageFormat {

  private MessageFormat() {
  }
  public static String format(ResourceBundle rsrc,String resourceName,String param0)
  {
    return java.text.MessageFormat.format(rsrc.getString(resourceName),new String[]{param0});
  }
  public static String format(ResourceBundle rsrc,String resourceName,String param0,String param1)
  {
    return java.text.MessageFormat.format(rsrc.getString(resourceName),new String[]{param0,param1});
  }

}