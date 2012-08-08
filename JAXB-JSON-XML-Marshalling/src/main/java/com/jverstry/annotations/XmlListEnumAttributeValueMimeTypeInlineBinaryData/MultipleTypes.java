
package com.jverstry.annotations.XmlListEnumAttributeValueMimeTypeInlineBinaryData;

import java.awt.Image;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlInlineBinaryData;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MultipleTypes {
	
	@XmlElement
	private MyEnum myEnum;
	
	@XmlElement
    @XmlList
    private List<String> data;
	
	@XmlElement
	private List<SpecialItem> specialItems;
	
	@XmlMimeType("image/jpeg")
	private Image image;
	
	@XmlInlineBinaryData
	private byte[] byteArray;

	public MyEnum getMyEnum() {
		return myEnum;
	}

	public void setMyEnum(MyEnum myEnum) {
		this.myEnum = myEnum;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public List<SpecialItem> getSpecialItems() {
		return specialItems;
	}

	public void setSpecialItems(List<SpecialItem> specialItems) {
		this.specialItems = specialItems;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public byte[] getByteArray() {
		return byteArray;
	}

	public void setByteArray(byte[] byteArray) {
		this.byteArray = byteArray;
	}
	
}
