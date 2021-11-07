
package net.mcreator.zaomengxiyoutotalzip.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.zaomengxiyoutotalzip.procedures.Tianshayupao2XiongJiaShiJianMeiYouXiKeProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class Tianshayupao2Item extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:tianshayupao_2_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:tianshayupao_2_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:tianshayupao_2_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:tianshayupao_2_boots")
	public static final Item boots = null;
	public Tianshayupao2Item(ZaomengxiyouModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 16, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 30;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "tianshayupao_2";
			}

			@Override
			public float getToughness() {
				return 1.7f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A73\u4F20\u8BF4\u7531\u9CB2\u9E4F\u7FBD\u6BDB\u7F16\u7EC7\u6210\u7684\u6CD5\u888D\uFF0C\u85CF\u6709\u65E0\u9650\u7684\u6CD5\u529B\uFF0C\u7A7F\u4E0A\u540E\u817E\u4E91\u9A7E\u96FE\uFF0C\u7FF1\u7FD4\u4E91\u7AEF\u3002\uFF08\u771F\u7684\u53EF\u4EE5\u98DE\uFF0C\u66F4\u52A0\u6301\u4E45\uFF09"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/models/armor/tianshayupao__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					Tianshayupao2XiongJiaShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("tianshayupao_2_chestplate"));
	}
}
