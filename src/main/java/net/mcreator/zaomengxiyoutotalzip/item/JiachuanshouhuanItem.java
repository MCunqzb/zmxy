
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

import net.mcreator.zaomengxiyoutotalzip.procedures.JiachuanshouhuanTouKuiShiJianMeiYouXiKeProcedure;
import net.mcreator.zaomengxiyoutotalzip.itemgroup.ZaomengxiyouItemGroup;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class JiachuanshouhuanItem extends ZaomengxiyouModElements.ModElement {
	@ObjectHolder("zaomengxiyou:jiachuanshouhuan_helmet")
	public static final Item helmet = null;
	@ObjectHolder("zaomengxiyou:jiachuanshouhuan_chestplate")
	public static final Item body = null;
	@ObjectHolder("zaomengxiyou:jiachuanshouhuan_leggings")
	public static final Item legs = null;
	@ObjectHolder("zaomengxiyou:jiachuanshouhuan_boots")
	public static final Item boots = null;
	public JiachuanshouhuanItem(ZaomengxiyouModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 500;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
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
				return "jiachuanshouhuan";
			}

			@Override
			public float getToughness() {
				return 0.3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ZaomengxiyouItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A7a\u770B\u4F3C\u666E\u901A\u7684\u624B\u956F"));
				list.add(new StringTextComponent("\u00A7a\u8574\u85CF\u6709\u795E\u79D8\u7684\u529B\u91CF"));
				list.add(new StringTextComponent(
						"\u00A7a\u53EA\u6709\u51D1\u9F50\u5BB6\u4F20\u88C5\u5907\u624D\u80FD\u91CA\u653E\u51FA\u8FD9\u80A1\u529B\u91CF\u3002"));
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "zaomengxiyou:textures/models/armor/jiachuangshouhuan__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					JiachuanshouhuanTouKuiShiJianMeiYouXiKeProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("jiachuanshouhuan_helmet"));
	}
}
