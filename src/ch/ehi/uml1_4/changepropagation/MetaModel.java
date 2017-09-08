// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2005-02-21 15:55:35 $
// $Revision: 1.5 $
//

// -beg- preserve=no 3C454ADA00E4 package "MetaModel"
package ch.ehi.uml1_4.changepropagation;
// -end- 3C454ADA00E4 package "MetaModel"

// -beg- preserve=no 3C454ADA00E4 autoimport "MetaModel"
import ch.ehi.uml1_4.changepropagation.MetaModelListener;
import ch.ehi.uml1_4.changepropagation.MetaModelChange;
// -end- 3C454ADA00E4 autoimport "MetaModel"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C454ADA00E4 import "MetaModel"
import ch.ehi.basics.logging.EhiLogger;
// -end- 3C454ADA00E4 import "MetaModel"

/** This class implements a singleton pattern and is the subject in an oberver pattern.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.5 $ $Date: 2005-02-21 15:55:35 $
 */
public class MetaModel {
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 3C454ADA00E4 detail_begin "MetaModel"
static MetaModel instance=null;
// -end- 3C454ADA00E4 detail_begin "MetaModel"

/** get unique instance
 */
// -beg- preserve=no 3C454B7101C8 head3C454ADA00E4 "getInstance"
public static MetaModel getInstance()
// -end- 3C454B7101C8 head3C454ADA00E4 "getInstance"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C454B7101C8 throws3C454ADA00E4 "getInstance"

// -end- 3C454B7101C8 throws3C454ADA00E4 "getInstance"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C454B7101C8 body3C454ADA00E4 "getInstance"
        if(instance==null) {
                instance=new MetaModel();
        }
        return instance;
        // -end- 3C454B7101C8 body3C454ADA00E4 "getInstance"
}

// -beg- preserve=no 3C454B9A03C5 head3C454ADA00E4 "MetaModel"
private MetaModel()
// -end- 3C454B9A03C5 head3C454ADA00E4 "MetaModel"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C454B9A03C5 throws3C454ADA00E4 "MetaModel"

// -end- 3C454B9A03C5 throws3C454ADA00E4 "MetaModel"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3C454B9A03C5 body3C454ADA00E4 "MetaModel"
        return;
        // -end- 3C454B9A03C5 body3C454ADA00E4 "MetaModel"
}

// -beg- preserve=no 3C47EB26012C head3C454ADA00E4 "notifyChange"
public void notifyChange(MetaModelChange change)
// -end- 3C47EB26012C head3C454ADA00E4 "notifyChange"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C47EB26012C throws3C454ADA00E4 "notifyChange"

// -end- 3C47EB26012C throws3C454ADA00E4 "notifyChange"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C47EB26012C body3C454ADA00E4 "notifyChange"
        // no change propagation?
        if(!doChangePropagation) {
                return;
        }
        // log change?
        if(doEventLogging) {
                EhiLogger.traceState(change.toString());
        }
        // notify change
        java.util.Iterator it=iteratorMetaModelListener();
        while(it.hasNext()) {
                MetaModelListener listener=(MetaModelListener)it.next();
                listener.metaModelChanged(change);
        }
        return;
        // -end- 3C47EB26012C body3C454ADA00E4 "notifyChange"
}

// -beg- preserve=no 3C454D7C030A code3C454ADA00E4 "metaModelListener"
private java.util.Set metaModelListener = new java.util.HashSet();
// -end- 3C454D7C030A code3C454ADA00E4 "metaModelListener"

/** add a MetaModelListener.
 *
 *  @see #removeMetaModelListener
 *  @see #containsMetaModelListener
 *  @see #iteratorMetaModelListener
 *  @see #clearMetaModelListener
 *  @see #sizeMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A add_head3C454ADA00E4 "MetaModel::addMetaModelListener"
public void addMetaModelListener(MetaModelListener metaModelListener1)
// -end- 3C454D7C030A add_head3C454ADA00E4 "MetaModel::addMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A add_body3C454ADA00E4 "MetaModel::addMetaModelListener"
        metaModelListener.add(metaModelListener1);

        return;
        // -end- 3C454D7C030A add_body3C454ADA00E4 "MetaModel::addMetaModelListener"
}

/** disconnect a MetaModelListener.
 *  @see #addMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A remove_head3C454ADA00E4 "MetaModel::removeMetaModelListener"
public MetaModelListener removeMetaModelListener(MetaModelListener metaModelListener1)
// -end- 3C454D7C030A remove_head3C454ADA00E4 "MetaModel::removeMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A remove_body3C454ADA00E4 "MetaModel::removeMetaModelListener"
        MetaModelListener ret=null;
        if(metaModelListener1==null || !metaModelListener.contains(metaModelListener1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = metaModelListener1;
        metaModelListener.remove(metaModelListener1);

        return ret;
        // -end- 3C454D7C030A remove_body3C454ADA00E4 "MetaModel::removeMetaModelListener"
}

/** tests if a given MetaModelListener is connected.
 *  @see #addMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A test_head3C454ADA00E4 "MetaModel::containsMetaModelListener"
public boolean containsMetaModelListener(MetaModelListener metaModelListener1)
// -end- 3C454D7C030A test_head3C454ADA00E4 "MetaModel::containsMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A test_body3C454ADA00E4 "MetaModel::containsMetaModelListener"
        return metaModelListener.contains(metaModelListener1);
        // -end- 3C454D7C030A test_body3C454ADA00E4 "MetaModel::containsMetaModelListener"
}

/** used to enumerate all connected MetaModelListeners.
 *  @see #addMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A get_all_head3C454ADA00E4 "MetaModel::iteratorMetaModelListener"
public java.util.Iterator iteratorMetaModelListener()
// -end- 3C454D7C030A get_all_head3C454ADA00E4 "MetaModel::iteratorMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A get_all_body3C454ADA00E4 "MetaModel::iteratorMetaModelListener"
        return metaModelListener.iterator();
        // -end- 3C454D7C030A get_all_body3C454ADA00E4 "MetaModel::iteratorMetaModelListener"
}

/** disconnect all MetaModelListeners.
 *  @see #addMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A remove_all_head3C454ADA00E4 "MetaModel::clearMetaModelListener"
public void clearMetaModelListener()
// -end- 3C454D7C030A remove_all_head3C454ADA00E4 "MetaModel::clearMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A remove_all_body3C454ADA00E4 "MetaModel::clearMetaModelListener"
        if(sizeMetaModelListener()>0) {
                metaModelListener.clear();

        }
        // -end- 3C454D7C030A remove_all_body3C454ADA00E4 "MetaModel::clearMetaModelListener"
}

/** returns the number of MetaModelListeners.
 *  @see #addMetaModelListener
 */
// -beg- preserve=no 3C454D7C030A size_head3C454ADA00E4 "MetaModel::sizeMetaModelListener"
public int sizeMetaModelListener()
// -end- 3C454D7C030A size_head3C454ADA00E4 "MetaModel::sizeMetaModelListener"
{
        // -beg- preserve=no 3C454D7C030A size_body3C454ADA00E4 "MetaModel::sizeMetaModelListener"
        return metaModelListener.size();
        // -end- 3C454D7C030A size_body3C454ADA00E4 "MetaModel::sizeMetaModelListener"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 3C454ADA00E4 detail_end "MetaModel"
private boolean doEventLogging=false;
/** enable/disable change event logging
 * @returns old status
 */
static public boolean setEventLogging(boolean doIt)
{
        boolean ret=getInstance().doEventLogging;
        getInstance().doEventLogging=doIt;
        return ret;
}
private boolean doChangePropagation=true;
/** enable/disable change propagation
 * @returns old status
 */
static public boolean setChangePropagation(boolean doIt)
{
        boolean ret=getInstance().doChangePropagation;
        getInstance().doChangePropagation=doIt;
        return ret;
}

// -end- 3C454ADA00E4 detail_end "MetaModel"

}
