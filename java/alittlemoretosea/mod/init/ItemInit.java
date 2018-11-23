package alittlemoretosea.mod.init;

import java.util.ArrayList;

import java.util.List;

import alittlemoretosea.mod.objects.items.ItemBase;
import alittlemoretosea.mod.objects.items.tools.rods.ItemNullRod;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	

	public static final Item ROD_NULL = new ItemNullRod("rod_null");
	public static final Item ROD_OBSIDIAN = new ItemNullRod("rod_obsidian");

	}
