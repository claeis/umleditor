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
package ch.ehi.umleditor.interlis.modelcheck;

import ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.config.GenerateOutputKind;

public class CheckModel {
	public static void checkAll() {
		TransferFromUmlMetamodel writer = new TransferFromUmlMetamodel();
		try {
			ch.ehi.basics.settings.Settings settings = ch.ehi.umleditor.application.LauncherView.getIli2cSettings();
			Configuration ili2cConfig = new Configuration();
			ili2cConfig.setAutoCompleteModelList(true);
			ili2cConfig.setOutputKind(GenerateOutputKind.NOOUTPUT);
			writer.runCompiler(ch.ehi.umleditor.application.LauncherView.getInstance().getModel(), ili2cConfig,
					settings);
		} catch (java.io.IOException ex) {
			ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(), ex.getLocalizedMessage());
		}
		return;
	}

}
