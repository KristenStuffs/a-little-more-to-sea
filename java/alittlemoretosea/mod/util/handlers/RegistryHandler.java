package alittlemoretosea.mod.util.handlers;

import alittlemoretosea.mod.Main;
import alittlemoretosea.mod.init.BlockInit;
import alittlemoretosea.mod.init.ItemInit;
import alittlemoretosea.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
{
		for(Item item : ItemInit.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
				
			{
				((IHasModel)block).registerModels();
			}
		}
		
		
}
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		
		
		

                }
	
	public static void initRegistries()
	{
	}
	
	public static void postInitRegisteries() 
	{
	}
	
	public static void serverRegisteries(FMLServerStartingEvent event) 
	{
	}
}