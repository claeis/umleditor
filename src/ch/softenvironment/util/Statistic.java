package ch.softenvironment.util;

import java.io.*;
import java.util.*;

/**
 * Register performance times for any tasks.
 * @author: Peter Hirzel (©2002)
 */
public final class Statistic 
{
	public String m_name;
	public int m_cnt;
	public int m_max;
	public int m_min;
	public int m_tot;

	private static TreeMap s_map = new TreeMap();

public Statistic(String name) {
    m_name = name;
    clear();
    synchronized (s_map) {
        s_map.put(name, this);
    }
}
public final void add(int sampleValue) {
    if (sampleValue > m_max)
        m_max = sampleValue;
    if (sampleValue < m_min)
        m_min = sampleValue;
    m_tot += sampleValue;
    m_cnt++;
}
public void clear() {
    m_cnt = 0;
    m_max = Integer.MIN_VALUE;
    m_min = Integer.MAX_VALUE;
    m_tot = 0;
}
public final static void clear_all() {
    for (Iterator i = s_map.entrySet().iterator(); i.hasNext();) {
        Map.Entry e = (Map.Entry) i.next();
        ((Statistic) e.getValue()).clear();
    }
}
public final static void dump(PrintStream out) {
    for (Iterator i = s_map.entrySet().iterator(); i.hasNext();) {
        Map.Entry e = (Map.Entry) i.next();
        Statistic s = (Statistic) e.getValue();
        if (s.m_cnt == 0)
            continue;
        out.print(s.m_name);
        out.print(": cnt=");
        out.print(s.m_cnt);
        out.print(", min=");
        out.print(s.m_min);
        out.print(", max=");
        out.print(s.m_max);
        out.print(", avg=");
        out.print(s.m_tot / s.m_cnt);
        out.print(", tot=");
        out.println(s.m_tot);
    }
}
}
