package com.fireboxtraining;

import javax.faces.bean.*;

@ManagedBean(name = "testbean1")
public class TestBean1 {
	private String name = "julie";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
