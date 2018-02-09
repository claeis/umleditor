/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package ch.ehi.umleditor.interlis.iliexport;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import ch.ehi.basics.view.FileChooser;
import ch.ehi.basics.view.GenericFileFilter;
import ch.ehi.umleditor.application.LauncherView;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.config.GenerateOutputKind;
import ch.softenvironment.client.ResourceManager;

public class ExportInterlis {
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ExportInterlis.class);

	public static void writeFileset() {
		TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
		try {
			// get list of files, that will be created
			List fileList = writer
					.getFileList(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
			if (checkFiles(fileList, writer.getFuncDesc())) {
				// show possible errors 
				checkModels(fileList);
				// write the files
				writer.writeIliFiles(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
			}
		} catch (java.io.IOException ex) {
			ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(), ex.getLocalizedMessage());
		}
		return;
	}

	public static void writeXSD() {
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		saveDialog.setDialogTitle("XML-Schema exportieren...");
		saveDialog.setFileFilter(GenericFileFilter.createXmlSchemaFilter());

		if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			String xsdFileName = saveDialog.getSelectedFile().getAbsolutePath();
			TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
			try {
				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
				Configuration ili2cConfig = new Configuration();
				ili2cConfig.setAutoCompleteModelList(true);
				ili2cConfig.setOutputKind(GenerateOutputKind.XMLSCHEMA);
				ili2cConfig.setOutputFile(xsdFileName);
				writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(), ili2cConfig,
						settings);
			} catch (java.io.IOException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),
						ex.getLocalizedMessage());
			}
		}
		return;
	}
	

	public static void writeXmi() {
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		saveDialog.setDialogTitle("xmi export ...");
		saveDialog.setFileFilter(createXmiFilter());
		
		if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			
			String xmiFileName = saveDialog.getSelectedFile().getAbsolutePath();
			TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
			try {
				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
				Configuration ili2cConfig = new Configuration();
				ili2cConfig.setAutoCompleteModelList(true);
				ili2cConfig.setOutputKind(GenerateOutputKind.UML21);
				ili2cConfig.setOutputFile(xmiFileName);
				writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(), ili2cConfig,
						settings);
			} catch(java.io.IOException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),
						ex.getLocalizedMessage());
			}
		}
		return;
	}

	public static void writeGML() {
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		if (saveDialog.showOutputDirDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			String xsdFileName = saveDialog.getSelectedFile().getAbsolutePath();
			TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
			try {
				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
				Configuration ili2cConfig = new Configuration();
				ili2cConfig.setAutoCompleteModelList(true);
				ili2cConfig.setOutputKind(GenerateOutputKind.GML32);
				ili2cConfig.setOutputFile(xsdFileName);
				writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(), ili2cConfig,
						settings);
			} catch (java.io.IOException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),
						ex.getLocalizedMessage());
			}
		}
		return;
	}
	

	public static void writeIli1Fmt() {
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		saveDialog.setDialogTitle("INTERLIS 1-Format exportieren...");
		saveDialog.setFileFilter(new ch.ehi.basics.view.GenericFileFilter("ILI1 Format (*.fmt)", "fmt"));
		
		if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			String fmtFileName = saveDialog.getSelectedFile().getAbsolutePath();
			TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
			try {
				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
				Configuration ili2cConfig = new Configuration();
				ili2cConfig.setAutoCompleteModelList(true);
				ili2cConfig.setOutputKind(GenerateOutputKind.ILI1FMTDESC);
				ili2cConfig.setOutputFile(fmtFileName);
				writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(), ili2cConfig,
						settings);
			} catch (java.io.IOException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),
						ex.getLocalizedMessage());
			}
		}
		return;
	}

	/**
	 * Check if files exist to replace or not 
	 * @param filev
	 * @param funcdesc
	 * @return
	 */
	private static boolean checkFiles(List filev, String funcdesc) {
		List apprv = new ArrayList();
		Iterator filei = filev.iterator();
		while (filei.hasNext()) {
			File selectedFile = (File) filei.next();
			// file already exists?
			if (selectedFile.exists()) {
				apprv.add(selectedFile);
			}
		}

		if (apprv.size() == 0) {
			// all files are new; let's write them
			return true;
		}
		// let user approve to overwrite files
		// Post an option dialog
		apprv.add(0, rsrc.getString("CTfileexists"));
		int response = JOptionPane.showConfirmDialog(LauncherView.getInstance(), apprv.toArray(), funcdesc,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (response == JOptionPane.CLOSED_OPTION || response == JOptionPane.CANCEL_OPTION) {
			// Carry out the cancel action - drops the dialog
			return false;
		} else if (response == JOptionPane.YES_OPTION) {
			// ok, overwrite
			return true;
		}
		return false;
	}
	
	private static void checkModels(List file){
 		
  		List apprv = new ArrayList();		  		
  		Iterator filei = file.iterator();
  				  		
  		TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
 				  		
  		try{
 				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
 				Configuration ili2cConfig = new Configuration();
  				
 				while(filei.hasNext()){
 					File selectedFile = (File) filei.next();
 					ili2cConfig.addFileEntry(new ch.interlis.ili2c.config.FileEntry(selectedFile.getAbsolutePath(), ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));
 					}
 				
 				ili2cConfig.setGenerateWarnings(false);
 				ili2cConfig.setOutputKind(GenerateOutputKind.NOOUTPUT);
 				ili2cConfig.setAutoCompleteModelList(true);
 				 	
 				writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(),ili2cConfig, settings);
 				 			
 				 			  
 			} catch(java.io.IOException ex){
 		 			ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(), ex.getLocalizedMessage());
 		 			JOptionPane.showMessageDialog(null,","+writer.getFuncDesc()+" "+ex.getLocalizedMessage());
 			}
		}
	
	/**
	 * @return specific File-Filter
	 */
	public static GenericFileFilter createXmiFilter() {
		return new GenericFileFilter("Xmi format (*.xmi)", "xmi");
	}
}
