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
		String xmlFile = doImportFileSelector();
		if (xmlFile != null) {
			try {
				TransferFromXml trsf = new TransferFromXml();
				trsf.merge(editor.getModel(), new File(xmlFile));
				EhiLogger.logState("[XML Imported] From File -> " + xmlFile);
			} catch (Exception e) {
				EhiLogger.logError("Import of Translation-XML failed", e);
			}
		}

	}

	public static void doExport() {
		EhiLogger.logState("doExport of Translation-XML");
		LauncherView editor = LauncherView.getInstance();
		String file = doExportFileSelector();
		if (file != null) {
			try {
				TransferToXml trsf = new TransferToXml();
				trsf.export(editor.getModel(), new java.io.File(file));
				EhiLogger.logState("[XML Exported] File Path -> " + file);
			} catch (Exception e) {
				EhiLogger.logError("Export of Translation-XML failed", e);
			}
		}
	}

	private static String doExportFileSelector() {
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle("Export File");
		ch.ehi.basics.view.GenericFileFilter iliFilter = LauncherView.createXmlFilter();
		importDialog.addChoosableFileFilter(iliFilter);
		if (importDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			if (!importDialog.getSelectedFile().getAbsolutePath().toString().contains(".xml")) {
			    importDialog.setSelectedFile(new File(importDialog.getSelectedFile().getAbsolutePath() + ".xml"));
			}
			return importDialog.getSelectedFile().getAbsolutePath();
		}
		return null;
	}

	public static String doImportFileSelector() {
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
		importDialog.setDialogTitle("Import File");
		ch.ehi.basics.view.GenericFileFilter ilcFilter = LauncherView.createXmlFilter();
		importDialog.addChoosableFileFilter(ilcFilter);

		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			return importDialog.getSelectedFile().getAbsolutePath();
		}
		return null;
	}
}