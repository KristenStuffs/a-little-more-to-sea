package alittlemoretosea.mod.entity;

import alittlemoretosea.mod.entity.rod.obsidianhook.EntityObsidianHook;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities

{
    public static void registerEntities()
    {

        registerEntity("obsidianhook", EntityObsidianHook.class, 200, 64, 5533056, 2243405);

    }
   
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(alittlemoretosea.mod.util.Reference.MODID + ":" + name), entity, name, id, alittlemoretosea.mod.Main.instance, range, 1, true, color1, color2);
    }
}