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

// -beg- preserve=no 3C9086430360 package "ImportInterlis"
package ch.ehi.umleditor.interlis.iliimport;
// -end- 3C9086430360 package "ImportInterlis"

// -beg- preserve=no 3C9086430360 autoimport "ImportInterlis"

// -end- 3C9086430360 autoimport "ImportInterlis"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C9086430360 import "ImportInterlis"
import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.ili2c.Ili2cException;
import ch.interlis.ili2c.config.*;
import ch.interlis.ili2c.metamodel.TransferDescription;
import java.io.*;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.basics.view.FileChooser;
import ch.softenvironment.view.BaseDialog;
// -end- 3C9086430360 import "ImportInterlis"

/**
 * main entry point to INTERLIS import utility
 */
public class ImportInterlis {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3C9086430360 detail_begin "ImportInterlis"
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ImportInterlis.class);

	// -end- 3C9086430360 detail_begin "ImportInterlis"

	/**
	 * read a single INTERLIS model file.
	 */
	// -beg- preserve=no 3C90867502B8 head3C9086430360 "readIliFile"
	public static void readIliFile(File iliFiles[])
	// -end- 3C90867502B8 head3C9086430360 "readIliFile"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3C90867502B8 throws3C9086430360 "readIliFile"

	// -end- 3C90867502B8 throws3C9086430360 "readIliFile"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3C90867502B8 body3C9086430360 "readIliFile"
		LauncherView editor = LauncherView.getInstance();
		TransferFromIli2cMetamodel convert = new TransferFromIli2cMetamodel();
		Configuration config = new Configuration();
		for (int filei = 0; filei < iliFiles.length; filei++) {
			config.addFileEntry(new ch.interlis.ili2c.config.FileEntry(iliFiles[filei].getAbsolutePath(),
					ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));
		}
		config.setGenerateWarnings(false);
		config.setOutputKind(GenerateOutputKind.NOOUTPUT);
		config.setAutoCompleteModelList(true);

		ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();

		TransferDescription ili2cModel = ch.interlis.ili2c.Main.runCompiler(config, settings);
		if (ili2cModel != null) {
			// translate the compiler metamodel to our metamodel
			convert.visitTransferDescription(editor.getModel(), ili2cModel, null, config);
			// refresh view
			editor.refreshModel();
			editor.log(convert.getFuncDesc(), rsrc.getString("CIdone"));
		}
		// -end- 3C90867502B8 body3C9086430360 "readIliFile"
	}

	/**
	 * read a set of INTERLIS model files as specified in the given compiler
	 * configuration file.
	 */
	// -beg- preserve=no 3C908B140241 head3C9086430360 "readIlcFile"
	public static void readIlcFile(String ilcFileName)
	// -end- 3C908B140241 head3C9086430360 "readIlcFile"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3C908B140241 throws3C9086430360 "readIlcFile"

	// -end- 3C908B140241 throws3C9086430360 "readIlcFile"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3C908B140241 body3C9086430360 "readIlcFile"

		LauncherView editor = LauncherView.getInstance();
		TransferFromIli2cMetamodel convert = new TransferFromIli2cMetamodel();
		Configuration config = null;
		// read config file
		try {
			config = PersistenceService.readConfig(ilcFileName);
		} catch (FileNotFoundException ex) {
			EhiLogger.logError(ex);
		} catch (IOException ex) {
			EhiLogger.logError(ex);
		}
		// we need no output
		config.setOutputKind(GenerateOutputKind.NOOUTPUT);
		TransferDescription ili2cModel = ch.interlis.ili2c.Main.runCompiler(config);
		if (ili2cModel != null) {
			// translate the compiler metamodel to our metamodel
			convert.visitTransferDescription(editor.getModel(), ili2cModel, ilcFileName, config);
			// refresh view
			editor.refreshModel();
			editor.log(convert.getFuncDesc(), rsrc.getString("CIdone"));
		}
		// -end- 3C908B140241 body3C9086430360 "readIlcFile"
	}

	// -beg- preserve=no 3CD8DEC502A7 head3C9086430360 "readFileset"
	public static void readFileset()
	// -end- 3CD8DEC502A7 head3C9086430360 "readFileset"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CD8DEC502A7 throws3C9086430360 "readFileset"

	// -end- 3CD8DEC502A7 throws3C9086430360 "readFileset"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CD8DEC502A7 body3C9086430360 "readFileset"
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle(rsrc.getString("CTfileSelector"));
		ch.ehi.basics.view.GenericFileFilter ilcFilter = LauncherView.createInterlisCompilerFilter();
		importDialog.addChoosableFileFilter(ilcFilter);

		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			String newFile = importDialog.getSelectedFile().getAbsolutePath();
			if (ilcFilter.accept(importDialog.getSelectedFile())) {
				readIlcFile(newFile);
			} else {
				BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(), rsrc.getString("CTunkwFormat"),
						rsrc.getString("CIunkwFormat"));
			}
		}
		// -end- 3CD8DEC502A7 body3C9086430360 "readFileset"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3C9086430360 detail_end "ImportInterlis"
	public static void doImport() {
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle(rsrc.getString("CTfileSelector"));
		importDialog.setMultiSelectionEnabled(true);
		ch.ehi.basics.view.GenericFileFilter iliFilter = LauncherView.createInterlisModelFilter();
		importDialog.addChoosableFileFilter(iliFilter);

		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			File filev[] = importDialog.getSelectedFiles();
			readIliFile(filev);
		}
	}

	static private void logIliFiles(ch.interlis.ili2c.config.Configuration config) {
		java.util.Iterator filei = config.iteratorFileEntry();
		while (filei.hasNext()) {
			ch.interlis.ili2c.config.FileEntry file = (ch.interlis.ili2c.config.FileEntry) filei.next();
			EhiLogger.logState("ilifile <" + file.getFilename() + ">");
		}
	}
	// -end- 3C9086430360 detail_end "ImportInterlis"

}
