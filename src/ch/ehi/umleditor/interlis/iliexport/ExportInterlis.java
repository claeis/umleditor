// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-06-14 14:46:34 $
// $Revision: 1.2 $
//

// -beg- preserve=no 3CDA3ECD02D3 package "ExportInterlis"
package ch.ehi.umleditor.interlis.iliexport;
// -end- 3CDA3ECD02D3 package "ExportInterlis"

// -beg- preserve=no 3CDA3ECD02D3 autoimport "ExportInterlis"

// -end- 3CDA3ECD02D3 autoimport "ExportInterlis"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CDA3ECD02D3 import "ExportInterlis"
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.basics.view.FileChooser;
import java.io.File;
import javax.swing.JOptionPane;

// -end- 3CDA3ECD02D3 import "ExportInterlis"

public class ExportInterlis
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CDA3ECD02D3 detail_begin "ExportInterlis"
  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ExportInterlis.class);

  // -end- 3CDA3ECD02D3 detail_begin "ExportInterlis"

  // -beg- preserve=no 3CFE03D10168 head3CDA3ECD02D3 "writeFileset"
  public static void writeFileset()
  // -end- 3CFE03D10168 head3CDA3ECD02D3 "writeFileset"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CFE03D10168 throws3CDA3ECD02D3 "writeFileset"

    // -end- 3CFE03D10168 throws3CDA3ECD02D3 "writeFileset"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE03D10168 body3CDA3ECD02D3 "writeFileset"
    TransferFromUmlMetamodel writer=new TransferFromUmlMetamodel();
    try{
       // get list of files, that will be created
       writer.setCreateFileList(true);
       writer.visitNamespace(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
       if(checkFiles(writer.getFileList(),writer.getFuncDesc())){
         // write the files
         writer.setCreateFileList(false);
         writer.visitNamespace(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
       }
    }catch(java.io.IOException ex){
      ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),ex.getLocalizedMessage());
    }
    return;
    // -end- 3CFE03D10168 body3CDA3ECD02D3 "writeFileset"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CDA3ECD02D3 detail_end "ExportInterlis"
  public static void writeXSD(){
	FileChooser saveDialog =  new FileChooser(LauncherView.getSettings().getWorkingDirectory());
	saveDialog.setDialogTitle("XML-Schema exportieren...");
	saveDialog.addChoosableFileFilter(LauncherView.createXmlSchemaFilter());

	if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
		LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
                String xsdFileName=saveDialog.getSelectedFile().getAbsolutePath();
                TransferFromUmlMetamodel writer=new TransferFromUmlMetamodel();
                try{
                   writer.setCheckModel(true);
                   writer.setXsdFile(xsdFileName);
                   writer.visitNamespace(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
                }catch(java.io.IOException ex){
                  ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),ex.getLocalizedMessage());
                }
        }
    return;
  }
  public static void writeIli1Fmt(){
	FileChooser saveDialog =  new FileChooser(LauncherView.getSettings().getWorkingDirectory());
	saveDialog.setDialogTitle("INTERLIS 1-Format exportieren...");
	saveDialog.addChoosableFileFilter(new ch.ehi.basics.view.GenericFileFilter("ILI1 Format (*.fmt)","fmt"));

	if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
		LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
				String fmtFileName=saveDialog.getSelectedFile().getAbsolutePath();
				TransferFromUmlMetamodel writer=new TransferFromUmlMetamodel();
				try{
				   writer.setCheckModel(true);
				   writer.setFmtFile(fmtFileName);
				   writer.visitNamespace(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
				}catch(java.io.IOException ex){
				  ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),ex.getLocalizedMessage());
				}
		}
	return;
  }

  private static boolean checkFiles(java.util.List filev,String funcdesc){
    java.util.List apprv=new java.util.ArrayList();
    java.util.Iterator filei=filev.iterator();
    while(filei.hasNext()){
      File selectedFile=(File)filei.next();
      // file already exists?
      if(selectedFile.exists()){
        apprv.add(selectedFile);
      }
    }

    if(apprv.size()==0){
      // all files are new; let's write them
      return true;
    }
    // let user approve to overwrite files
    // Post an option dialog
    apprv.add(0,rsrc.getString("CTfileexists"));
    int response = JOptionPane.showConfirmDialog(LauncherView.getInstance(),
	apprv.toArray(),
	funcdesc, JOptionPane.YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE);

   if (response == JOptionPane.CLOSED_OPTION ||
	response == JOptionPane.CANCEL_OPTION) {
	// Carry out the cancel action - drops the dialog
	return false;
   }else if (response == JOptionPane.YES_OPTION){
        // ok, overwrite
        return true;
   }
   return false;
  }
  // -end- 3CDA3ECD02D3 detail_end "ExportInterlis"

}

