package ch.ehi.umleditor.interlis;

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

import ch.ehi.umleditor.application.LauncherView;

/** logging adapter to umleditor application
 * @author: ce
 * @version $Revision: 1.1 $ $Date: 2003-12-25 10:55:33 $
 */
public class EditorLoggingAdapter implements Logging {
  private LauncherView app=null;
  public EditorLoggingAdapter(LauncherView application){
    app=application;
  }
  public void log(String title, String logText){
    app.log(title,logText);
  }
  public void log(String modelElementId, String title, String logText){
    app.log(modelElementId,title,logText);
  }
}