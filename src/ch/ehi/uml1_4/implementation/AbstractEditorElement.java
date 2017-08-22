// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:50 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3D746BAC0281 package "AbstractEditorElement"
package ch.ehi.uml1_4.implementation;
// -end- 3D746BAC0281 package "AbstractEditorElement"

// -beg- preserve=no 3D746BAC0281 autoimport "AbstractEditorElement"
import ch.ehi.basics.tools.Visitable;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D746BAC0281 autoimport "AbstractEditorElement"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D746BAC0281 import "AbstractEditorElement"

// -end- 3D746BAC0281 import "AbstractEditorElement"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:50 $
 */
public abstract class AbstractEditorElement implements Visitable, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3D746BAC0281 detail_begin "AbstractEditorElement"
	private String oid = null;
	static private long nextid = 1;
	// -end- 3D746BAC0281 detail_begin "AbstractEditorElement"

	// -beg- preserve=no 3D747806035A head3D746BAC0281 "getOid"
	public String getOid()
	// -end- 3D747806035A head3D746BAC0281 "getOid"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D747806035A throws3D746BAC0281 "getOid"

	// -end- 3D747806035A throws3D746BAC0281 "getOid"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D747806035A body3D746BAC0281 "getOid"
		if (oid == null) {
			// oid=org.doomdark.uuid.UUIDGenerator.getInstance().generateRandomBasedUUID().toString();
			oid = Long.toString(nextid++);
		}
		return oid;
		// -end- 3D747806035A body3D746BAC0281 "getOid"
	}

	// -beg- preserve=no 3D747810014B head3D746BAC0281 "_setOid"
	public void _setOid(String oid)
	// -end- 3D747810014B head3D746BAC0281 "_setOid"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D747810014B throws3D746BAC0281 "_setOid"

	// -end- 3D747810014B throws3D746BAC0281 "_setOid"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D747810014B body3D746BAC0281 "_setOid"
		this.oid = oid;
		// -end- 3D747810014B body3D746BAC0281 "_setOid"
	}

	// -beg- preserve=no 3D747A5D024D head3D746BAC0281 "unlinkAll"
	public void unlinkAll()
	// -end- 3D747A5D024D head3D746BAC0281 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D747A5D024D throws3D746BAC0281 "unlinkAll"

	// -end- 3D747A5D024D throws3D746BAC0281 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D747A5D024D body3D746BAC0281 "unlinkAll"

		// -end- 3D747A5D024D body3D746BAC0281 "unlinkAll"
	}

	// -beg- preserve=no 3D747A600157 head3D746BAC0281 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D747A600157 head3D746BAC0281 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D747A600157 throws3D746BAC0281 "enumerateChildren"

	// -end- 3D747A600157 throws3D746BAC0281 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D747A600157 body3D746BAC0281 "enumerateChildren"
		java.util.Iterator it = null;

		// -end- 3D747A600157 body3D746BAC0281 "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D746BAC0281 detail_end "AbstractEditorElement"

	// -end- 3D746BAC0281 detail_end "AbstractEditorElement"
	private NlsString metaAttrb = null;

	public NlsString getMetaAttrb() {
		return metaAttrb;
	}

	public void setMetaAttrb(NlsString value) {
		if (metaAttrb != value && (metaAttrb == null || !metaAttrb.equals(value))) {
			metaAttrb = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaAttrb"));
		}
	}
	
	private NlsString metaName = null;
	
	public NlsString getMetaName() {
		return metaName;
	}

	public void setMetaName(NlsString value) {
		if (metaName != value && (metaName == null || !metaName.equals(value))) {
			metaName = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaName"));
		}
	}

	
	private NlsString metaMsg = null;
	
	public NlsString getMetaMsg() {
		return metaMsg;
	}

	public void setMetaMsg(NlsString value) {
		if (metaMsg != value && (metaMsg == null || !metaMsg.equals(value))) {
			metaMsg = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaMsg"));
		}
	}
	
}
