package ch.ehi.umleditor.interlis.iliimport;

import ch.interlis.ili2c.metamodel.ErrorListener;
import ch.ehi.umleditor.application.LauncherView;

public class MyErrorListener implements ErrorListener {
  private LauncherView app=null;
  private String funcDesc=null;
  private int errc=0;
  public MyErrorListener(String funcDesc){
    this.funcDesc=funcDesc;
  }
  public void error(ErrorListener.ErrorEvent evt) {
    if(app==null){
      app=LauncherView.getInstance();
    }
    if(app!=null){
      app.log(funcDesc,evt.toString());
        //errOutput.append(evt.toString ());
        //errOutput.append("\n");
      }
    if(evt.getSeverity()==ErrorListener.ErrorEvent.SEVERITY_ERROR){
      errc++;
    }
  }
  /** get number of errors
   *
   */
  public int getErrorCount(){
    return errc;
  }
}