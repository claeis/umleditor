package ch.ehi.umleditor.translationxml;

import java.io.File;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.view.FileChooser;
import ch.ehi.umleditor.application.LauncherView;
import ch.softenvironment.view.BaseDialog;

public class TranslationXmlMenu {
    public static void doImport() {
        final String function="Import Translation-XML";
        LauncherView editor = LauncherView.getInstance();
        String xmlFile = doImportFileSelector();
        if (xmlFile != null) {
            try {
                TransferFromXml trsf = new TransferFromXml();
                trsf.merge(editor.getModel(), new File(xmlFile));
                editor.refreshModel();
                editor.log(function, "done");
            } catch (Exception e) {
                EhiLogger.logError(function + " failed", e);
            }
        }

    }

    public static void doExport() {
        final String function="Export Translation-XML";
        LauncherView editor = LauncherView.getInstance();
        String file = doExportFileSelector();
        if (file != null) {
            try {
                TransferToXml trsf = new TransferToXml();
                trsf.export(editor.getModel(), new java.io.File(file));
                editor.log(function,"done");
            } catch (Exception e) {
                EhiLogger.logError(function + " failed", e);
            }
        }
    }

    private static String doExportFileSelector() {
        FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
        importDialog.setDialogTitle("Export Translation-XML");
        ch.ehi.basics.view.GenericFileFilter xmlFilter = LauncherView.createXmlFilter();
        importDialog.setFileFilter(xmlFilter);
        if (importDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
            LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
            return importDialog.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

    public static String doImportFileSelector() {
        FileChooser importDialog = new FileChooser(LauncherView.getSettings().getImportDirectory());
        importDialog.setDialogTitle("Import Translation-XML");
        ch.ehi.basics.view.GenericFileFilter xmlFilter = LauncherView.createXmlFilter();
        importDialog.setFileFilter(xmlFilter);

        if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
            LauncherView.getSettings().setImportDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
            return importDialog.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

}