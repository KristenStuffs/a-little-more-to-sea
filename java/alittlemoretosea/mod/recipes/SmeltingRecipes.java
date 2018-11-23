package alittlemoretosea.mod.recipes;

import alittlemoretosea.mod.init.BlockInit;
import alittlemoretosea.mod.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public SmeltingRecipes()
	{
		
	}
		public static void addRecipes() 
		{
			
			// Ores
			GameRegistry.addSmelting(BlockInit.BASE_BLOCK, new ItemStack(BlockInit.BASE_BLOCK), 0.0f);
		}
	}