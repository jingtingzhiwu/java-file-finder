package com.cyl.xml;
import java.util.List;

import org.w3c.dom.NodeList;

public interface NodeParser<T> {
	void parser(NodeList list);

	void setTargetList(List<T> targetList);

	List<T> getTargetList();
}
