package com.linkedList;

@FunctionalInterface
public interface Aplicable<T> {
	
	public void doAction(Node<T> temp);

}
