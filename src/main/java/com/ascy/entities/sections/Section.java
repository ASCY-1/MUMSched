package com.ascy.entities.sections;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.ascy.entities.blocks.Block;
import com.ascy.entities.blocks.BlockRepository;

@Entity
public class Section {
	
	@Id
	private String sectionId;
	private String sectionName;
	private String blockId;
	


	//	@Embedded
	@ManyToOne
	private Block block;
	
//	@Autowired
//	private BlockRepository blockRepository; 
	
	public Section(){
		
	}
	
	public Section(String sectionId, String sectionName, String blockId) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		
		this.block = new Block(blockId, "Block X");
	}
	
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", block=" + block + "]";
	}

	
}
