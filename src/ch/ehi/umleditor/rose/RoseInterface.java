// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:40:41 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3E0DAF43019B package "RoseInterface"
package ch.ehi.umleditor.rose;
// -end- 3E0DAF43019B package "RoseInterface"

// -beg- preserve=no 3E0DAF43019B autoimport "RoseInterface"

// -end- 3E0DAF43019B autoimport "RoseInterface"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3E0DAF43019B import "RoseInterface"
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.basics.view.FileChooser;

// -end- 3E0DAF43019B import "RoseInterface"

<<<<<<< HEAD
public class RoseInterface
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3E0DAF43019B detail_begin "RoseInterface"
  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(RoseInterface.class);

  // -end- 3E0DAF43019B detail_begin "RoseInterface"

  // -beg- preserve=no 3E0DAFB203CB head3E0DAF43019B "importXmi"
  public static void importXmi()
  // -end- 3E0DAFB203CB head3E0DAF43019B "importXmi"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3E0DAFB203CB throws3E0DAF43019B "importXmi"

    // -end- 3E0DAFB203CB throws3E0DAF43019B "importXmi"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3E0DAFB203CB body3E0DAF43019B "importXmi"
	FileChooser importDialog =  new FileChooser(LauncherView.getSettings().getWorkingDirectory());
	importDialog.setDialogTitle(rsrc.getString("CTfileSelector"));
	importDialog.addChoosableFileFilter(LauncherView.createXmlFilter());
	//importDialog.addChoosableFileFilter(LauncherView.createXmiFilter());

	if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
		LauncherView.getSettings().setWorkingDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
                String xmiFileName=importDialog.getSelectedFile().getAbsolutePath();
                TransferFromXmiRoseMetamodel reader=new TransferFromXmiRoseMetamodel();
                reader.doXmiFile(xmiFileName);
        }
    return;
    // -end- 3E0DAFB203CB body3E0DAF43019B "importXmi"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3E0DAF43019B detail_end "RoseInterface"

  // -end- 3E0DAF43019B detail_end "RoseInterface"

}

=======
public class RoseInterface {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3E0DAF43019B detail_begin "RoseInterface"
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(RoseInterface.class);

	// -end- 3E0DAF43019B detail_begin "RoseInterface"

	// -beg- preserve=no 3E0DAFB203CB head3E0DAF43019B "importXmi"
	public static void importXmi()
	// -end- 3E0DAFB203CB head3E0DAF43019B "importXmi"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0DAFB203CB throws3E0DAF43019B "importXmi"

	// -end- 3E0DAFB203CB throws3E0DAF43019B "importXmi"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0DAFB203CB body3E0DAF43019B "importXmi"
		FileChooser importDialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
		importDialog.setDialogTitle(rsrc.getString("CTfileSelector"));
		importDialog.setFileFilter(LauncherView.createXmlFilter());
		

		if (importDialog.showOpenDialog(LauncherView.getInstance()) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(importDialog.getCurrentDirectory().getAbsolutePath());
			String xmiFileName = importDialog.getSelectedFile().getAbsolutePath();
			TransferFromXmiRoseMetamodel reader = new TransferFromXmiRoseMetamodel();
			reader.doXmiFile(xmiFileName);
		}
		return;
		// -end- 3E0DAFB203CB body3E0DAF43019B "importXmi"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E0DAF43019B detail_end "RoseInterface"

	// -end- 3E0DAF43019B detail_end "RoseInterface"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
