package ch.ehi.basics.tools;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TopoSort {
	//typedef T value_type;
	//typedef std::map<value_type,int> ts_count_container;
	//typedef std::list<value_type> ts_succ_ele_container;
	//typedef std::map<value_type, ts_succ_ele_container > ts_succ_container;
  //private  ts_count_container ts_count;
  private Map ts_count=new java.util.HashMap();
  //private  ts_succ_container ts_succ;
  private Map ts_succ=new java.util.HashMap();

  //std::vector<value_type> * resv, std::vector<int> * levv
  private List resv=new java.util.ArrayList();
  private List levv=new java.util.ArrayList();

public void addcond(Object j, Object k)
{
//''# @function add a relationship to the topoplogical sort modul
//''# @in j element before
//''# @in k element after
	// T3 record the relation j<k
	// init vertex j
	if(!ts_count.containsKey(j))ts_count.put( j,new Integer(0) );
	if(!ts_count.containsKey(k))ts_count.put( k,new Integer(0) );
	// increase ingoing edge counter of vertex k
	ts_count.put( k,new Integer(((Integer)ts_count.get( k )).intValue()+1) );

        if(!ts_succ.containsKey(j))ts_succ.put(j,new java.util.ArrayList());
        if(!ts_succ.containsKey(k))ts_succ.put(k,new java.util.ArrayList());
	// link vertex k to list of successors of vertex j
	((java.util.List)(ts_succ.get(j))).add(k);
  return;
}

public boolean sort()
{

//''# @function topological sort
//''# @out resv elements topological sorted. if failed: elements building the loop
//''# @return true: sort ok; false: sort failed
/*
	dump("ts_count",ts_count);
	dump2("ts_succ",ts_succ);
*/
	resv.clear();
	int ts_n=ts_count.size();
	// T4 scan for vertexes with zero ingoing edges
	//std::queue<value_type> out;
	java.util.List out=new java.util.ArrayList();
	for(Iterator p=ts_count.keySet().iterator(); p.hasNext(); ){
		Object v=p.next();
		// zero ingoing edge at vertex p
		int cnt=((Integer)ts_count.get(v)).intValue();
		if(cnt==0){
			// add vertex p to output queue
			out.add(v);
		}
	}
	// get head of output queue
	int level=0;
	int start=0;
	int end=0;
	while(!out.isEmpty()){
		while(!out.isEmpty()){
			// T5 output front of queue
			// add vertex f to result
			resv.add(out.get(0));
			levv.add(new Integer(level));
			out.remove(0);
			ts_n--;
			end++;
		}

		for(;start<end;start++){
			Object ts_f=resv.get(start);
			// T6 erase all outgoing edges from vertex f
			while(((java.util.List)(ts_succ.get(ts_f))).size()>0){
				// get successor of vertex f
				Object ts_j = ((java.util.List)(ts_succ.get(ts_f))).get(0);
				// decrease ingoing edge counter of vertex j
				ts_count.put(ts_j,new Integer(((Integer)ts_count.get(ts_j)).intValue()-1)); //  count(suc(p))--
				// zero ongoing edge at vertex j
				if(((Integer)ts_count.get(ts_j)).intValue()==0){
					// add vertex j to output queue
					out.add(ts_j);
				}
                                ((List)ts_succ.get(ts_f)).remove(0);
			}
		}
		level++;
	}
	// not all vertex visited?
	if(ts_n!=0){
/*
		dump("ts_count",ts_count);
		dump2("ts_succ",ts_succ);
*/
		// clear output list
		resv.clear();
		// T9
		// determine predecessors
		//typedef std::map<value_type,value_type> ts_pred_container;
		//ts_pred_container ts_pred;
                java.util.Map ts_pred=new java.util.HashMap();
		for(Iterator p = ts_count.keySet().iterator(); p.hasNext(); ){
			Object v=p.next();
			int cnt=((Integer)ts_count.get(v)).intValue();
			// has vertex v sucessors?
			if(((List)ts_succ.get(v)).size()>0){
				// for all sucessors of vertex v
				for(Iterator j = ((List)ts_succ.get(v)).iterator(); j.hasNext(); ){
                                        Object successor=j.next();
					// predecessor of vertex j yet defined?
					if(!ts_pred.containsKey(successor)){
						// set predecessor of vertex j
						ts_pred.put(successor,v);
					}
				}
			}
		}
/*
{
	ts_pred_container::const_iterator counti;
	EHI_TRACE(4,"ts_pred");
	for(counti=ts_pred.begin();counti!=ts_pred.end();counti++){
		EHI_TRACE(4,CString("  ")+dumpEle((*counti).second) +"<"+ dumpEle((*counti).first) );
	}
}
*/
		// find start of loop
		//typedef std::set<value_type> ts_pred_set;
		//ts_pred_set pred_set;
                java.util.Set  pred_set=new java.util.HashSet();
		Object i=ts_pred.keySet().iterator().next();
		while(i!=null){
			if(pred_set.contains(i)){
				// start of loop found
				break;
			}
			// add vertex v to set
			pred_set.add(i);
			// get predecessor to v
			i=ts_pred.get(i);
		}

		// T11
		// build list of vertexes in loop
		while(i != null){
			// add vertex i to result
			resv.add(i);
			// get predecessor to i
			Object v=ts_pred.get(i);
			// chek if predecessor of v is v
			if(v==i){
				break;
			}
			// remove i, to stop loop scan
			ts_pred.remove(i);
                        i=v;

		}
		return false; // topological sort failed
	}
	return true; // topological sort succeded
}


public void add(Object j)
{
	// init vertex j
	if(!ts_count.containsKey(j))ts_count.put( j,new Integer(0) );
        if(!ts_succ.containsKey(j))ts_succ.put(j,new java.util.ArrayList());
  return;
}

public void init()
{
  ts_count.clear();
  ts_succ.clear();
}
public int[] getLevel()
{
  int ret[]=new int[levv.size()];
  for(int i=0;i<ret.length;i++){
    ret[i]=((Integer)levv.get(i)).intValue();
  }
  return ret;
}
public List getResult()
{
  return resv;
}
/*
template <class T>CString TopoSort<T>::dumpEle(value_type ele)
{
	return ltoa((long)ele);
}
template <class T>void TopoSort<T>::dump(const char *name,const ts_count_container &countv)
{
	const char *ehi_method = "dump";
	ts_count_container::const_iterator counti;
	EHI_TRACE(4,name);
	for(counti=countv.begin();counti!=countv.end();counti++){
		EHI_TRACE(4,CString("  ")+dumpEle((*counti).first) +"("+ ltoa((*counti).second) +")" );
	}
}
template <class T>void TopoSort<T>::dump2(const char *name,const ts_succ_container &succv)
{
	const char *ehi_method = "dump2";
	ts_succ_container::const_iterator succi;
	EHI_TRACE(4,name);
	for(succi=succv.begin();succi!=succv.end();succi++){
		CString txt= "  "+dumpEle((*succi).first) +"(";
		ts_succ_ele_container::const_iterator elei;
		for(elei=(*succi).second.begin();elei!=(*succi).second.end();elei++){
			txt += " "+dumpEle(*elei);
		}
		txt+=")";
		EHI_TRACE(4,txt);
	}
}
*/

  static void main(java.lang.String[] args){
/* expected output
txt1 0
txt9 0
txt3 1
txt2 1
txt7 2
txt15 2
txt5 3
txt4 3
txt8 4
txt6 5
*/
    TopoSort ts=new TopoSort();
	String txt1="txt1";
	String txt2="txt2";
	String txt3="txt3";
	String txt4="txt4";
	String txt5="txt5";
	String txt6="txt6";
        String txt7="txt7";
	String txt8="txt8";
	String txt9="txt9";
	String txt10="txt10";
	String txt15="txt15";
	//TopoSort ts;
	ts.addcond(txt9,txt2);
	ts.addcond(txt3,txt7);
	ts.addcond(txt7,txt5);
	ts.addcond(txt5,txt8);
	ts.addcond(txt8,txt6);
	ts.addcond(txt4,txt6);
	ts.addcond(txt1,txt3);
	ts.addcond(txt7,txt4);
	ts.addcond(txt9,txt5);
	ts.addcond(txt2,txt8);
	ts.addcond(txt2,txt15);
/*
	// add loop
	ts.addcond(txt10,txt1);
	ts.addcond(txt6,txt10);
	ts.addcond(txt1,txt9);
*/
	if(!ts.sort()){
		System.out.println("loop");
                List res=ts.getResult();
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}else{
                List res=ts.getResult();
                int[] lev=ts.getLevel();
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i)+" "+Integer.toString(lev[i]));
		}
	}
  }
}

