package ch.ehi.basics.view;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

/**
 *    JFileChooser fc = new JFileChooser();
 *    fc.addChoosableFileFilter(new GenericFileFilter("INTERLIS models (*.ili)","ili"));
 */
public class GenericFileFilter extends FileFilter {
    private String description;
    private String extension;
    public GenericFileFilter(String description,String extension){
      this.description=description;
      this.extension=extension;
    }
    /** Accept all directories and all files with given extension
     *
     */
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String ext = getFileExtension(f);
	if (ext != null) {
            if (ext.equalsIgnoreCase(extension)) {
                    return true;
            } else {
                return false;
            }
    	}

        return false;
    }

    /** The description of this filter
     *
     */
    public String getDescription() {
        return description;
    }

    /** The file extension used by this filter
     *
     */
    public String getExtension() {
        return extension;
    }
    /** Get the extension of a file.
     *
     */
    public static String getFileExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i >= 0 &&  i < s.length()) {
            ext = s.substring(i+1);
        }
        return ext;
    }
}
