/*
 * @(#)DrawApplet.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.applet;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.net.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.util.*;

class SleeperThread extends Thread {

	JApplet  fApplet;

	SleeperThread(JApplet applet) {
		fApplet = applet;
	}

	public void run() {
		try {
			for (;;) {
				fApplet.showStatus("loading icons...");
				sleep(50);
			}
		}
		catch (InterruptedException e) {
			return;
		}
	}

}

