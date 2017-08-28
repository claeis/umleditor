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

import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;
import ch.ehi.basics.view.FileChooser;
import ch.ehi.basics.view.GenericFileFilter;
import java.io.File;
import javax.swing.JOptionPane;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.config.FileEntry;
import ch.interlis.ili2c.config.GenerateOutputKind;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.ili2c.Ili2cException;
import ch.interlis.ili2c.Ili2cFailure;
import ch.interlis.ili2c.Main;

public class ExportInterlis {
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ExportInterlis.class);

	public static void writeFileset() {
		TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
		try {
			// get list of files, that will be created
			java.util.List fileList = writer
					.getFileList(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
			if(checkModels(fileList)){
				if (checkFiles(fileList, writer.getFuncDesc())) {
					// write the files
					JOptionPane.showMessageDialog(null, "File exported!", "Info", JOptionPane.INFORMATION_MESSAGE);
					writer.writeIliFiles(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
				}
			}
			
		} catch (java.io.IOException ex) {
			ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(), ex.getLocalizedMessage());
		}
		return;
	}

	public static void writeXSD() {
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		saveDialog.setDialogTitle("XML-Schema exportieren...");
		//saveDialog.addChoosableFileFilter(GenericFileFilter.createXmlSchemaFilter());
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
		//saveDialog.addChoosableFileFilter(new ch.ehi.basics.view.GenericFileFilter("ILI1 Format (*.fmt)", "fmt"));
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

	private static Boolean checkModels(java.util.List file){
		//ch.ehi.umleditor.interlis.modelcheck.CheckModel.checkAll();
		java.util.List apprv = new java.util.ArrayList();
		java.util.Iterator filei = file.iterator();
		
		TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
		Boolean confirm = false;
		
		try{
				ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
				Configuration ili2cConfig = new Configuration();
			
			while(filei.hasNext()){
				File selectedFile = (File) filei.next();
			
				ili2cConfig.addFileEntry(new ch.interlis.ili2c.config.FileEntry(selectedFile.getAbsolutePath(),
						ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));
				
			}

			ili2cConfig.setGenerateWarnings(false);
			ili2cConfig.setOutputKind(GenerateOutputKind.NOOUTPUT);
			ili2cConfig.setAutoCompleteModelList(true);
	
			writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(),ili2cConfig, settings);
			
			  if(writer.getErrors()){
				  //compiler not failed
				  confirm = true;
			  }
			  
		} catch(java.io.IOException ex){
			ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(), ex.getLocalizedMessage());
			JOptionPane.showMessageDialog(null,","+writer.getFuncDesc()+" "+ex.getLocalizedMessage());
		}
		return confirm;
	}
	/**
	 * Check if the files exist at current path and show a JoptionPane to confirm reemplace
	 * @param filev List of files to export
	 * @param funcdesc Description of current export mode
	 * @return a boolean value to confirm if the file exist
	 */
	private static boolean checkFiles(java.util.List filev, String funcdesc) {
		java.util.List apprv = new java.util.ArrayList();
		java.util.Iterator filei = filev.iterator();
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
}
