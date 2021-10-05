
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

@ZaomengxiyouModElements.ModElement.Tag
public class Pig8StoneaxeItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:pig_8_stoneaxe")
	public static final Item block = null;
	public Pig8StoneaxeItem(ZaomengxiyouModElements instance) {
		super(instance, 827);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
		}.setRegistryName("pig_8_stoneaxe"));
	}
}
