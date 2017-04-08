package com.ascy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.blocks.Block;
import com.ascy.entities.blocks.BlockService;

@RestController
public class BlockController {
	
	@Autowired
	private BlockService blockService;
	
	@RequestMapping("/block")
	public List<Block> getAllBlock(){
		return blockService.getAllBlock();
	}
	@RequestMapping("/block/{blockId}")
	public Block getBlock(@PathVariable("blockId") String blockId){
		return blockService.getBlock(blockId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="block")
	public void addBlock(@RequestBody Block block){
		blockService.addBlock(block);
	}
	@RequestMapping(method=RequestMethod.PUT, value="block")
	public void updateBlock(@RequestBody Block block){
		blockService.updateBlock(block);
	}

}
