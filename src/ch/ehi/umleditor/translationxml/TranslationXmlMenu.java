package ch.ehi.umleditor.translationxml;

import java.io.File;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.view.FileChooser;
import ch.ehi.umleditor.application.LauncherView;
import ch.softenvironment.view.BaseDialog;

public class TranslationXmlMenu {
    public static void doImport() {
        LauncherView editor = LauncherView.getInstance();
        String xmlFile = doImportFileSelector();
        if (xmlFile != null) {
            try {
                EhiLogger.logState("[Translation-XML Import] " + xmlFile);
                TransferFromXml trsf = new TransferFromXml();
                trsf.merge(editor.getModel(), new File(xmlFile));
                EhiLogger.logState("[Translation-XML Import] done");
            } catch (Exception e) {
                EhiLogger.logError("Import of " + xmlFile + " failed", e);
            }
        }

    }

    public static void doExport() {
        LauncherView editor = LauncherView.getInstance();
        String file = doExportFileSelector();
        if (file != null) {
            try {
                EhiLogger.logState("[Translation-XML Export] " + file);
                TransferToXml trsf = new TransferToXml();
                trsf.export(editor.getModel(), new java.io.File(file));
                EhiLogger.logState("[Translation-XML Export] done");
            } catch (Exception e) {
                EhiLogger.logError("Export of " + file + " failed", e);
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