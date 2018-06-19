package ch.ehi.umleditor.translationxml;

import java.io.File;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.view.FileChooser;
import ch.ehi.umleditor.application.LauncherView;
import ch.softenvironment.view.BaseDialog;

public class TranslationXmlMenu {
	public static void doImport() {
		EhiLogger.logState("doImport of Translation-XML");
		LauncherView editor = LauncherView.getInstance();
		String xmlFile = readFileset();
		if (xmlFile != null) {
			try {
				TransferFromXml trsf = new TransferFromXml();
				trsf.merge(editor.getModel(), new File(xmlFile));
			} catch (Exception e) {
				EhiLogger.logError("import of Translation-XML failed", e);
			}
		}

	}

	public static void doExport() {
		EhiLogger.logState("doExport of Translation-XML");
		LauncherView editor = LauncherView.getInstance();
		String file = fileChooser();
		if (file != null) {
			try {
				TransferToXml trsf = new TransferToXml();
				trsf.export(editor.getModel(), new java.io.File(file));
			} catch (Exception e) {
				EhiLogger.logError("export of Translation-XML failed", e);
			}
		}
	}

	private static String fileChooser() {
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle("Select A File");
		ch.ehi.basics.view.GenericFileFilter iliFilter = LauncherView.createInterlisModelFilter();
		importDialog.addChoosableFileFilter(iliFilter);
		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			return importDialog.getSelectedFile().getAbsolutePath();
		}
		return null;
	}

	public static String readFileset() {
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle("Import File");
		ch.ehi.basics.view.GenericFileFilter ilcFilter = LauncherView.createInterlisCompilerFilter();
		importDialog.addChoosableFileFilter(ilcFilter);

		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			return importDialog.getSelectedFile().getAbsolutePath();
		}
		return null;
	}
}