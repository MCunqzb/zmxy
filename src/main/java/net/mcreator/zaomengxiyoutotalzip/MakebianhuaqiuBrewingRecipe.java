
package net.mcreator.zaomengxiyoutotalzip;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.zaomengxiyoutotalzip.item.GuihuoItem;
import net.mcreator.zaomengxiyoutotalzip.item.GhostpalaceItem;
import net.mcreator.zaomengxiyoutotalzip.item.BianhuapollenItem;

@ZaomengxiyouModElements.ModElement.Tag
public class MakebianhuaqiuBrewingRecipe extends ZaomengxiyouModElements.ModElement {
	public MakebianhuaqiuBrewingRecipe(ZaomengxiyouModElements instance) {
		super(instance, 644);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == BianhuapollenItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == GuihuoItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(GhostpalaceItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
