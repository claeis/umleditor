// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-06-14 14:12:10 $
// $Revision: 1.5 $
//

// -beg- preserve=no 3CD78E5B00EB package "ObjectCatalog"
package ch.ehi.umleditor.objectcatalog;
// -end- 3CD78E5B00EB package "ObjectCatalog"

import ch.ehi.umleditor.application.Documentation;

// -beg- preserve=no 3CD78E5B00EB autoimport "ObjectCatalog"

// -end- 3CD78E5B00EB autoimport "ObjectCatalog"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CD78E5B00EB import "ObjectCatalog"
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.OrganizationDialog;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import ch.ehi.basics.view.FileChooser;
import ch.ehi.basics.i18n.MessageFormat;
import ch.ehi.basics.view.GenericFileFilter;
// -end- 3CD78E5B00EB import "ObjectCatalog"

public class ObjectCatalog {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CD78E5B00EB detail_begin "ObjectCatalog"
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ObjectCatalog.class);

	// -end- 3CD78E5B00EB detail_begin "ObjectCatalog"

	// -beg- preserve=no 3CDA6B9802C8 head3CD78E5B00EB "writeAllHtml"
	public static void writeAllHtml()
	// -end- 3CDA6B9802C8 head3CD78E5B00EB "writeAllHtml"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CDA6B9802C8 throws3CD78E5B00EB "writeAllHtml"

	// -end- 3CDA6B9802C8 throws3CD78E5B00EB "writeAllHtml"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CDA6B9802C8 body3CD78E5B00EB "writeAllHtml"
		writeAllHtml(true);
		// -end- 3CDA6B9802C8 body3CD78E5B00EB "writeAllHtml"
	}

	// -beg- preserve=no 3D99B32502F8 head3CD78E5B00EB "writeStructureHtml"
	public static void writeStructureHtml()
	// -end- 3D99B32502F8 head3CD78E5B00EB "writeStructureHtml"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D99B32502F8 throws3CD78E5B00EB "writeStructureHtml"

	// -end- 3D99B32502F8 throws3CD78E5B00EB "writeStructureHtml"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D99B32502F8 body3CD78E5B00EB "writeStructureHtml"
		ch.ehi.umleditor.application.PackageSelectionDialog packageDialog = new ch.ehi.umleditor.application.PackageSelectionDialog(
				LauncherView.getInstance(), rsrc.getString("CTPackageSelector"), true,
				LauncherView.getInstance().getModel());
		if (packageDialog.isSaved()) {
			ch.ehi.uml1_4.foundation.core.Namespace apackage = packageDialog.getSelectedPackage();
			if (apackage == null) {
				apackage = LauncherView.getInstance().getModel();
			}
			FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
			saveDialog.setDialogTitle(rsrc.getString("CTstructFileSelector"));
			saveDialog.setFileFilter(GenericFileFilter.createHtmlFilter());

			if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
				LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
				String filename = saveDialog.getSelectedFile().getAbsolutePath();

				BufferedWriter out = null;
				try {
					out = new BufferedWriter(new FileWriter(filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTstructLog"), ex.getLocalizedMessage());
					return;
				}
				try {
					HtmlWriter writer = new HtmlWriter();
					writer.doStruct(apackage, out);
					out.close();
					LauncherView.getInstance().log(rsrc.getString("CTstructLog"),
							MessageFormat.format(rsrc, "CTstructDone", filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTstructLog"), ex.getLocalizedMessage());
				}
			}
		}
		return;
		// -end- 3D99B32502F8 body3CD78E5B00EB "writeStructureHtml"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CD78E5B00EB detail_end "ObjectCatalog"

	static public void writeDiagram(ch.ehi.umleditor.umldrawingtools.ClassDiagramView diag) {
		String diagName = ((ch.ehi.umleditor.umlpresentation.Diagram) diag.getDiagram()).getName().getValue();
		FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		saveDialog.setDialogTitle(rsrc.getString("CTdiagFileSelector"));
		GenericFileFilter jpegFilter = new GenericFileFilter("JPEG File Interchange Format (*.jpeg)", "jpeg");
		GenericFileFilter pngFilter = new GenericFileFilter("Portable Network Graphics (*.png)", "png");
		//GenericFileFilter svgFilter = new GenericFileFilter("Scalable Vector Graphics (*.svg)", "svg");
		GenericFileFilter emfFilter = new GenericFileFilter("Windows Meta File Format (*.wmf)", "wmf");
		saveDialog.setFileFilter(jpegFilter);
		saveDialog.addChoosableFileFilter(pngFilter);
		//saveDialog.addChoosableFileFilter(svgFilter);
		saveDialog.addChoosableFileFilter(emfFilter);
		saveDialog.setSelectedFile(new File(diagName));
		if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			String filename = saveDialog.getSelectedFile().getAbsolutePath();

			try {

				java.awt.Dimension diagDim = diag.getMinimumDimension();

				if (emfFilter.accept(saveDialog.getSelectedFile())) {
					// Properties p = new Properties();
					// p.setProperty("PageSize","A5");
					org.freehep.graphics2d.VectorGraphics g = new org.freehep.graphicsio.emf.EMFGraphics2D(
							new File(filename), diagDim);
					// g.setProperties(p);
					g.startExport();
					diag.printAll(g);
					g.endExport();
				} else if (jpegFilter.accept(saveDialog.getSelectedFile())) {
					java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(diagDim.width, diagDim.height,
							java.awt.image.BufferedImage.TYPE_INT_BGR);
					java.awt.Graphics2D g = img.createGraphics();
					diag.printAll(g);
					FileOutputStream os = new FileOutputStream(filename);
					ImageIO.write(img, "jpeg", os);
					
					os.close();
				} else if (pngFilter.accept(saveDialog.getSelectedFile())) {
					java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(diagDim.width, diagDim.height,
							java.awt.image.BufferedImage.TYPE_INT_BGR);
					java.awt.Graphics2D g = img.createGraphics();
					diag.printAll(g);
					FileOutputStream os = new FileOutputStream(filename);
					ImageIO.write(img, "png", os);
					// com.sun.image.codec.jpeg.JPEGImageEncoder
					os.close();
				}
			} catch (IOException ex) {
				LauncherView.getInstance().log("objectcatalog", ex.getLocalizedMessage());
			}
		}
		return;
	}
	
	public static void writeISOHtml() {
		ch.ehi.umleditor.application.PackageSelectionDialog packageDialog = new ch.ehi.umleditor.application.PackageSelectionDialog(
				LauncherView.getInstance(), rsrc.getString("CTPackageSelector"), true,
				LauncherView.getInstance().getModel());
		if (packageDialog.isSaved()) {
			ch.ehi.uml1_4.foundation.core.Namespace apackage = packageDialog.getSelectedPackage();
			if (apackage == null) {
				apackage = LauncherView.getInstance().getModel();
			}
			FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
			saveDialog.setDialogTitle(rsrc.getString("CTobjcatFileSelector"));
			saveDialog.setFileFilter(GenericFileFilter.createHtmlFilter());

			if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
				//setting organization information
				OrganizationDialog orgDialog = new OrganizationDialog(LauncherView.getInstance(), "Organization",true);
				Documentation docDialog = new Documentation(LauncherView.getInstance(),"Documentation", true);
				//write file
				LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
				String filename = saveDialog.getSelectedFile().getAbsolutePath();

				BufferedWriter out = null;
				try {
					out = new BufferedWriter(new FileWriter(filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"), ex.getLocalizedMessage());
					return;
				}
				try {
					HtmlISO writer = new HtmlISO();
					writer.doObjectCatalog(apackage, out, orgDialog, docDialog);
					out.close();
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"),
							MessageFormat.format(rsrc, "CTobjcatDone", filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"), ex.getLocalizedMessage());
				}
			}
		}
		return;
	}

	public static void writeAllHtml(boolean includeChapterNr) {
		ch.ehi.umleditor.application.PackageSelectionDialog packageDialog = new ch.ehi.umleditor.application.PackageSelectionDialog(
				LauncherView.getInstance(), rsrc.getString("CTPackageSelector"), true,
				LauncherView.getInstance().getModel());
		
		if (packageDialog.isSaved()) {
			ch.ehi.uml1_4.foundation.core.Namespace apackage = packageDialog.getSelectedPackage();
			if (apackage == null) {
				apackage = LauncherView.getInstance().getModel();
			}
			FileChooser saveDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
			saveDialog.setDialogTitle(rsrc.getString("CTobjcatFileSelector"));
			saveDialog.setFileFilter(GenericFileFilter.createHtmlFilter());

			if (saveDialog.showSaveDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
				LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
				String filename = saveDialog.getSelectedFile().getAbsolutePath();

				BufferedWriter out = null;
				try {
					out = new BufferedWriter(new FileWriter(filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"), ex.getLocalizedMessage());
					return;
				}
				try {
					HtmlWriter writer = new HtmlWriter();
					writer.setChapterNumbering(!includeChapterNr);
					writer.doObjectCatalog(apackage, out);
					out.close();
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"),
							MessageFormat.format(rsrc, "CTobjcatDone", filename));
				} catch (IOException ex) {
					LauncherView.getInstance().log(rsrc.getString("CTobjcatLog"), ex.getLocalizedMessage());
				}
			}
		}
		return;
	}
	// -end- 3CD78E5B00EB detail_end "ObjectCatalog"

}
