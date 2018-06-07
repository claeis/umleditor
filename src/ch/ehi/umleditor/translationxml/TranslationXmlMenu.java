package ch.ehi.umleditor.translationxml;

import java.io.File;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.view.FileChooser;
import ch.ehi.umleditor.application.LauncherView;

public class TranslationXmlMenu {
	public static void doImport() {
		EhiLogger.logState("doImport of Translation-XML");
		TransferFromXml trsf=new TransferFromXml();
		File xmlfile=null;
		LauncherView editor=LauncherView.getInstance();
		trsf.merge(editor.getModel(),xmlfile);
	}
	public static void doExport() {
		EhiLogger.logState("doExport of Translation-XML"); 
	    LauncherView editor=LauncherView.getInstance();
	    
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
	    importDialog.setDialogTitle("Select A File");
	    importDialog.setMultiSelectionEnabled(true);
	    ch.ehi.basics.view.GenericFileFilter iliFilter = LauncherView.createInterlisModelFilter();
	    importDialog.addChoosableFileFilter(iliFilter);

	    if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
	    	LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
	    	File filev[] = importDialog.getSelectedFiles();
	    	for (File file : filev) {
	        	try {
	    			TransferToXml trsf=new TransferToXml();
	    			trsf.export(editor.getModel(),new java.io.File(file.getPath()));	    	
	    	    } catch (Exception e) {
	    			e.getMessage();
	    		}
	    	}
	    } 
	}
}
