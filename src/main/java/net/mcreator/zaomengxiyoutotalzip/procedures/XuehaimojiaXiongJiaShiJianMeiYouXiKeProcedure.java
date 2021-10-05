package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.XuehaimojiaItem;
import net.mcreator.zaomengxiyoutotalzip.item.BloodMagicArmorItem;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class XuehaimojiaXiongJiaShiJianMeiYouXiKeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure XuehaimojiaXiongJiaShiJianMeiYouXiKe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
				: ItemStack.EMPTY).getItem() == XuehaimojiaItem.body)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 4));
			entity.getPersistentData().putDouble("xhmj", ((entity.getPersistentData().getDouble("xhmj")) + 1));
			if ((((entity.getPersistentData().getDouble("xhmj")) % 80) == 0)) {
				entity.attackEntityFrom(DamageSource.MAGIC, (float) 1);
			}
			if (((entity.getPersistentData().getDouble("xhmj")) > 200)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 20, (int) 8));
				entity.getPersistentData().putDouble("xhmj", 0);
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < (0.4
					* ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 20, (int) 14));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 0));
			}
		}
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
				: ItemStack.EMPTY).getItem() == BloodMagicArmorItem.body)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 4));
			entity.getPersistentData().putDouble("xhmj", ((entity.getPersistentData().getDouble("xhmj")) + 1));
			if ((((entity.getPersistentData().getDouble("xhmj")) % 80) == 0)) {
				entity.attackEntityFrom(DamageSource.MAGIC, (float) 4);
			}
			if (((entity.getPersistentData().getDouble("xhmj")) > 200)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 20, (int) 8));
				entity.getPersistentData().putDouble("xhmj", 0);
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < (0.2
					* ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 20, (int) 14));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 20, (int) 0));
				entity.getPersistentData().putDouble("blood", ((entity.getPersistentData().getDouble("blood")) + 1));
				if (((entity.getPersistentData().getDouble("blood")) >= 50)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 10, (int) 0));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 20, (int) 0));
					entity.getPersistentData().putDouble("blood", 1);
				}
			}
		}
	}
}
