package com.ascy.entities.blocks;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ascy.entities.sections.Section;


@Entity
public class Block {
	
	@Id
	private String blockId;
	private String blockName;
	private String blockDetails;
	
//	private List<Section> sections;
	
	public Block(){
		
	}
	
	public Block(String blockId, String blockName) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
	}
	
	public String getBlockId() {
		return blockId;
	}
	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	
	public String getBlockDetails() {
		return blockDetails;
	}

	public void setBlockDetails(String blockDetails) {
		this.blockDetails = blockDetails;
	}

	@Override
	public String toString() {
		return "Block [blockId=" + blockId + ", blockName=" + blockName + "]";
	}

	
	
}
