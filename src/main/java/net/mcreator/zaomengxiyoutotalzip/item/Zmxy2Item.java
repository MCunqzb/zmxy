
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

@ZaomengxiyouModElements.ModElement.Tag
public class Zmxy2Item extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:zmxy_2")
	public static final Item block = null;
	public Zmxy2Item(ZaomengxiyouModElements instance) {
		super(instance, 923);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ZaomengxiyouModElements.sounds.get(new ResourceLocation("zaomengxiyou:zmxy2")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("zmxy_2");
		}
	}
}
