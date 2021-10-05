
package net.mcreator.zaomengxiyoutotalzip.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.zaomengxiyoutotalzip.item.JryxItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

@ZaomengxiyouModElements.ModElement.Tag
public class ZaomengxiyouItemGroup extends ZaomengxiyouModElements.ModElement {
	public ZaomengxiyouItemGroup(ZaomengxiyouModElements instance) {
		super(instance, 266);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabzaomengxiyou") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(JryxItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
