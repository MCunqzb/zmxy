package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.ReductionofinjuryPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.item.KingKongArmorItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class KingKongArmorXiongJiaShiJianMeiYouXiKeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure KingKongArmorXiongJiaShiJianMeiYouXiKe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).choice) == 3)) {
			if (((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
					: ItemStack.EMPTY).getItem() == KingKongArmorItem.helmet)
					&& ((((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
							: ItemStack.EMPTY).getItem() == KingKongArmorItem.body)
							&& (((entity instanceof LivingEntity)
									? ((LivingEntity) entity)
											.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
									: ItemStack.EMPTY).getItem() == KingKongArmorItem.legs)))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(ReductionofinjuryPotionEffect.potion, (int) 20, (int) 10));
			}
		}
	}
}
