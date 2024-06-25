package oop11.inner11;

public class Button {
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}

}
