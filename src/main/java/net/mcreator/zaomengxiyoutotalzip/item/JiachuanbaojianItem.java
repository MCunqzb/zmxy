
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

import net.mcreator.zaomengxiyoutotalzip.procedures.JiachuanbaojianDangShiTiHuiDongWuPinShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class JiachuanbaojianItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:jiachuanbaojian")
	public static final Item block = null;
	public JiachuanbaojianItem(ZaomengxiyouModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 4.8f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A7a\u770B\u4F3C\u666E\u901A\u7684\u5B9D\u5251\uFF0C\u8574\u85CF\u6709\u795E\u79D8\u7684\u529B\u91CF\uFF0C\u53EA\u6709\u51D1\u9F50\u5BB6\u4F20\u88C5\u5907\u624D\u80FD\u91CA\u653E\u51FA\u8FD9\u80A1\u529B\u91CF\u3002"));
			}

			@Override
			public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
				boolean retval = super.onEntitySwing(itemstack, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					JiachuanbaojianDangShiTiHuiDongWuPinShiProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("jiachuanbaojian"));
	}
}
