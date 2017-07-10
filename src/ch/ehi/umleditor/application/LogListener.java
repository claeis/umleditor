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
import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.ili2c.CompilerLogEvent;

/**
 * @author ce
 * @version $Revision: 1.3 $ $Date: 2006-08-10 16:25:41 $
 */
public class LogListener extends ch.ehi.basics.logging.AbstractStdListener {
	private LogView out=null;
	private LogListenerCompilerMsgMapper compilerMapper=null;
	public LogListener(LogView out1){
		out=out1;
	}
	public void outputMsgLine(int kind, int level, String msg) {
		out.appendText(msg);
	}

	public void logEvent(LogEvent event) {
		if(event instanceof CompilerLogEvent && compilerMapper!=null){
			CompilerLogEvent ie=(CompilerLogEvent)event;
			if(ie.getRawEventMsg()!=null){
				String id=compilerMapper.getId(ie);
				if(id!=null){
					//EhiLogger.debug("raw msg "+ie.getRawEventMsg());
					out.appendText(id,compilerMapper.getTitle(),ie.getRawEventMsg());
					return;
				}
			}
		}
		super.logEvent(event);
	}
	public void setCompilerMsgMapper(LogListenerCompilerMsgMapper mapper)
	{
		compilerMapper=mapper;
	}
}
