
package com.jverstry.annotations.XmlListEnumAttributeValueMimeTypeInlineBinaryData;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum MyEnum {
	
	@XmlEnumValue("v1")
	VAL_1,
	
	@XmlEnumValue("v2")
	VAL_2;
	
}
