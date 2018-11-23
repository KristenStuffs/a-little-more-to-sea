package alittlemoretosea.mod;

import alittlemoretosea.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ALittleMoreToSeaTab extends CreativeTabs
{
	public ALittleMoreToSeaTab(String label) { super("alittlemoretoseatab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.ROD_NULL);}
}
