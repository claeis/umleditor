package ch.softenvironment.view;

/* 
 *This file is part of the UML/INTERLIS-Editor.
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
 */
 
/**
 * Define any behaviour for User Interface Handling (CUA).
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public interface CommonUserAccess {
	static java.util.ResourceBundle _resourceBundle_CUA = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/CommonUserAccess");

	static String MENU_FILE = _resourceBundle_CUA.getString("MnuFile_text");
	static String MENU_FILE_NEW = _resourceBundle_CUA.getString("MnuFileNew_text");
	static String MENU_FILE_NEW_WINDOW = _resourceBundle_CUA.getString("MnuFileNewWindow_text");
	static String MENU_FILE_SAVE = _resourceBundle_CUA.getString("MnuFileSave_text");
	static String MENU_FILE_SAVEAS = _resourceBundle_CUA.getString("MnuFileSaveAs_text");
	static String MENU_FILE_OPEN_WINDOW = _resourceBundle_CUA.getString("MniFileOpenWindow_text");
	static String MENU_FILE_PRINT_WINDOW = _resourceBundle_CUA.getString("MnuFilePrintWindow_text");
	static String MENU_FILE_IMPORT = _resourceBundle_CUA.getString("MniFileImport_text");
	static String MENU_FILE_EXPORT = _resourceBundle_CUA.getString("MniFileExport_text");
	static String MENU_FILE_EXIT = _resourceBundle_CUA.getString("MnuFileExit");
	
	static String MENU_EDIT = _resourceBundle_CUA.getString("MnuEdit_text");
	static String MENU_EDIT_CUT = _resourceBundle_CUA.getString("MnuEditCut_text");
	static String MENU_EDIT_COPY = _resourceBundle_CUA.getString("MnuEditCopy_text");
	static String MENU_EDIT_PASTE = _resourceBundle_CUA.getString("MnuEditPaste_text");
	static String MENU_EDIT_SELECT_ALL = _resourceBundle_CUA.getString("MnuEditSelectAll_text");
	static String MENU_EDIT_RENAME = _resourceBundle_CUA.getString("MnuEditRename_text");
	static String MENU_EDIT_REMOVE = _resourceBundle_CUA.getString("MnuEditRemove_text");
	static String MENU_EDIT_CHANGE_WINDOW = _resourceBundle_CUA.getString("MnuEditChangeWindow_text");
	static String MENU_EDIT_CHANGE = _resourceBundle_CUA.getString("MnuEditChange_text");
	static String MENU_EDIT_ASSIGN = _resourceBundle_CUA.getString("MnuEditAssign");
	static String MENU_EDIT_ASSIGN_WINDOW = _resourceBundle_CUA.getString("MnuEditAssignWindow");
	static String MENU_EDIT_UNDO = _resourceBundle_CUA.getString("MniEditUndo_text");
	static String MENU_EDIT_REDO = _resourceBundle_CUA.getString("MniEditRedo_text");
	static String MENU_EDIT_FIND_REPLACE_WINDOW = _resourceBundle_CUA.getString("MniEditFindReplaceWindow_text");

	static String MENU_VIEW = _resourceBundle_CUA.getString("MnuView_text");
	static String MENU_VIEW_SYMBOLLISTS = _resourceBundle_CUA.getString("MnuViewSymbollists_text");
	static String MENU_VIEW_SYMBOLLIST_STANDARD = _resourceBundle_CUA.getString("MniViewSymbollistStandard_text");
	static String MENU_VIEW_STATUSBAR = _resourceBundle_CUA.getString("MniViewStatusbar_text");
	static String MENU_VIEW_LOOK_FEEL = _resourceBundle_CUA.getString("MnuViewLookAndFeel_text");

	static String MENU_FORMAT = _resourceBundle_CUA.getString("MnuFormat_text");
	static String MENU_FORMAT_FONT = _resourceBundle_CUA.getString("MnuFormatFont_text");
	static String MENU_FORMAT_FG_COLOR = _resourceBundle_CUA.getString("MnuFormatForegroundColor_text");
	static String MENU_FORMAT_BG_COLOR = _resourceBundle_CUA.getString("MnuFormatBackgroundColor_text");
	static String MENU_FORMAT_LINE_COLOR = _resourceBundle_CUA.getString("MnuFormatLineColor_text");
	static String MENU_FORMAT_FILL_COLOR = _resourceBundle_CUA.getString("MnuFormatFillColor_text");
	
	static String MENU_TOOLS = _resourceBundle_CUA.getString("MnuTools_text");

	static String MENU_REPORTS = _resourceBundle_CUA.getString("MnuReports_text");
	
	static String MENU_HELP = _resourceBundle_CUA.getString("MnuHelp_text");
	static String MENU_HELP_ABOUT = _resourceBundle_CUA.getString("MniHelpAbout_text");

	static String MENU_WINDOW = _resourceBundle_CUA.getString("MnuWindow_text");
	static String MENU_WINDOW_ORDER_AUTOMATICALLY = _resourceBundle_CUA.getString("MnuWindowOrderAutomatically");
	static String MENU_WINDOW_CASCADE = _resourceBundle_CUA.getString("MniWindowCascade_text");
	static String MENU_WINDOW_TILE = _resourceBundle_CUA.getString("MniWindowTile_text");

	static String MENU_EXTRAS = _resourceBundle_CUA.getString("MnuExtras_text");
	static String MENU_EXTRAS_OPTIONS_WINDOW = _resourceBundle_CUA.getString("MniExtrasOptionsWindow_text");

	static String CTSAVE_CHANGES = _resourceBundle_CUA.getString("CTSaveChanges");
	static String CQSAVE_CHANGES = _resourceBundle_CUA.getString("CQSaveChanges");
	static String CTFILE_OPEN = _resourceBundle_CUA.getString("CTFileOpen"); 
}
