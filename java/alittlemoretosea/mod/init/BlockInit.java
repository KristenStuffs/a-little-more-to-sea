package alittlemoretosea.mod.init;

import java.util.ArrayList;
import java.util.List;

import alittlemoretosea.mod.Main;
import alittlemoretosea.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BASE_BLOCK = new BlockBase("base_block", Material.ROCK, 1, "pickaxe").setHardness(2).setResistance(15);
	}
