package com.cyl.xml;

public interface Command<T,E> {
	public E execute(T t);
}
