/* This file is part of the umleditor project.
 * For more information, please see <http://www.umleditor.ch>.
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
package ch.ehi.umleditor.application;

import java.util.ArrayList;
import java.util.Iterator;
import ch.ehi.basics.logging.LogEvent;

/**
 * @author ce
 * @version $Revision: 1.2 $ $Date: 2006-07-07 06:47:19 $
 */
public class LogListener extends ch.ehi.basics.logging.AbstractStdListener {
	LogView out=null;
	public LogListener(LogView out1){
		out=out1;
	}
	public void outputMsgLine(int kind, int level, String msg) {
		out.appendText(msg);
	}

}
