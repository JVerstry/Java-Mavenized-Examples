
package com.jverstry.json.pojo;

import java.util.ArrayList;
import java.util.List;

public class PojoItem {
	
	private int id = 123456;
	private String title;
	private List<String> references = new ArrayList<String>() {{
		add("Reference A"); add("Reference B");	}
	};

	public int getId() { 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getReferences() {
		return references;
	}

	public void setReferences(List<String> references) {
		this.references = references;
	}
	
}
