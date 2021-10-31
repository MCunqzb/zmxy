package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.VertigoPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class ThreeLifeHammerDangShiTiBeiGongJuJiZhongShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure ThreeLifeHammerDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ThreeLifeHammerDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((Math.random() < 0.1)
				&& ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) * 2) > ((LivingEntity) sourceentity)
						.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(VertigoPotionEffect.potion, (int) 60, (int) 0, (false), (false)));
		}
	}
}
