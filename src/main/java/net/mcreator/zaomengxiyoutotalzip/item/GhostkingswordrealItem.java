
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.zaomengxiyoutotalzip.procedures.GhostkingswordrealDangShiTiBeiGongJuJiZhongShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class GhostkingswordrealItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:ghostkingswordreal")
	public static final Item block = null;
	public GhostkingswordrealItem(ZaomengxiyouModElements instance) {
		super(instance, 856);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 34f;
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
		}, 3, -2.65f, new Item.Properties().group(ZaomengxiyouItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A75The ghost king sword after unblocking"));
				list.add(new StringTextComponent("\u00A75slaying demons and slaying demons"));
				list.add(new StringTextComponent("\u00A75was just a matter of thought."));
				list.add(new StringTextComponent(
						"\u00A75\u89E3\u5C01\u540E\u7684\u9B3C\u738B\u5251\uFF0C\u65A9\u5996\u9664\u9B54\uFF0C\u4E5F\u53EA\u662F\u4E00\u5FF5\u4E4B\u95F4\u3002"));
				list.add(new StringTextComponent("\u00A7o\u00A75Passive: 5% bloodthirsty."));
				list.add(new StringTextComponent("\u00A7o\u00A75\u88AB\u52A8\uFF1A5%\u55DC\u8840\u3002"));
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("sourceentity", sourceentity);
					GhostkingswordrealDangShiTiBeiGongJuJiZhongShiProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("ghostkingswordreal"));
	}
}
