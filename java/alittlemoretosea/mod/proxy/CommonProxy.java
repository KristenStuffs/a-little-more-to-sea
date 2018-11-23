package alittlemoretosea.mod.proxy;

import alittlemoretosea.mod.entity.ModEntities;
import net.minecraft.item.Item;

public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
    public void preInit() {ModEntities.registerEntities();}
		
	}


