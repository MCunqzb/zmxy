
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
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.zaomengxiyoutotalzip.procedures.TianshayuejiZaiWanJiaTingZhiShiYongShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.TianshayuejiDangGongJuChuXianZaiShouZhongShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class TianshayuejiItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:tianshayueji")
	public static final Item block = null;
	public TianshayuejiItem(ZaomengxiyouModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.6f, new Item.Properties().group(ZaomengxiyouItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A73\u7531\u6708\u77F3\u7ECF\u4E09\u5473\u771F\u706B\u7CBE\u70BC\u800C\u6210\uFF0C\u95EA\u8000\u7740\u9EC4\u91D1\u822C\u7684\u5149\u8292\uFF0C\u6B64\u5149\u582A\u6BD4\u7693\u6708\u4E4B\u660E\u3002"));
			}

			@Override
			public void onPlayerStoppedUsing(ItemStack itemstack, World world, LivingEntity entity, int time) {
				super.onPlayerStoppedUsing(itemstack, world, entity, time);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					TianshayuejiZaiWanJiaTingZhiShiYongShiProcedure.executeProcedure($_dependencies);
				}
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					TianshayuejiDangGongJuChuXianZaiShouZhongShiProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("tianshayueji"));
	}
}
