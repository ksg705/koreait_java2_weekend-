package com.kita.second.level3;

public class AnonymousObject {
	public static void main(String[] args) {
		ParentAO p = new ChildAO();
		childAO c = (ChildAO)p;
		c.childMethod();
		p.parentMethod();
		
		ParentAO p2 = new ParentAO() {
			int childField;
			@Override
			void parentMethod() {}
			
			void childMethod() {}
			
		};
	}
}
	
	


class ParentAO {
	int parentField;
	
	
	void parentMethod() {}
}


class ChildAO extends ParentAO{
	int childField;
	@Override
	void parentMethod() {}
	
	void childMethod() {}
}
