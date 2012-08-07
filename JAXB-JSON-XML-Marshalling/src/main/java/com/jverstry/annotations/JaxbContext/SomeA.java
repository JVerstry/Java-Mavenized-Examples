
package com.jverstry.annotations.JaxbContext;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class SomeA {
	
	private StaticallyReferenced sr;
	private StaticallyReferencedButTransient srbt;

	@XmlElement
	public StaticallyReferenced getSr() {
		return sr;
	}

	public void setSr(StaticallyReferenced sr) {
		this.sr = sr;
	}

	@XmlTransient
	public StaticallyReferencedButTransient getSrbt() {
		return srbt;
	}

	public void setSrbt(StaticallyReferencedButTransient srbt) {
		this.srbt = srbt;
	}
	
}