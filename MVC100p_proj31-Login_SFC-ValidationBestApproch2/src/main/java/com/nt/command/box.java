package com.nt.command;

import javax.validation.constraints.NotNull;

public class box {
	
	@NotNull(message="This is the mandatory fill")
	private boolean box;

	public boolean isBox() {
		return box;
	}

	public void setBox(boolean box) {
		this.box = box;
	}
	

}
