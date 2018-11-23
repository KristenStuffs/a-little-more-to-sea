package alittlemoretosea.mod;

import alittlemoretosea.mod.proxy.CommonProxy;
import alittlemoretosea.mod.recipes.SmeltingRecipes;
import alittlemoretosea.mod.util.Reference;
import alittlemoretosea.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs ALITTLEMORETOSEATAB = new ALittleMoreToSeaTab("alittlemoretosea");

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{		
        RegistryHandler.preInitRegistries(event);
        }
	
    @EventHandler
    public static void init(FMLInitializationEvent event) { 
		SmeltingRecipes.addRecipes();
        RegistryHandler.initRegistries();
    }
    
    @EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
    	RegistryHandler.postInitRegisteries();
	}
    
    @EventHandler
	public static void serverInit(FMLServerStartingEvent event) {
    	RegistryHandler.serverRegisteries(event);
	}    

}
