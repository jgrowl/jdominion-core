package jdominion.serialization.xml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class ListContainer<T> {
	
	@ElementList
	private List<T> list;
	
	@Attribute(required=false)
	private String id;

	public ListContainer(List<T> list) {
		this.list = list;
	}
	
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
