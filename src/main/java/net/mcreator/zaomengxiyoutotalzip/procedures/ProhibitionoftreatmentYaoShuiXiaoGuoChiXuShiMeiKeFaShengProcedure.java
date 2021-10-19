package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.potion.ProhibitionoftreatmentPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.potion.HealingreductionPotionEffect;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;
import java.util.Collection;

public class ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency entity for procedure ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(HealingreductionPotionEffect.potion, (int) (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == ProhibitionoftreatmentPotionEffect.potion)
								return effect.getDuration();
						}
					}
					return 0;
				}
			}.check(entity)), (int) 100));
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(ProhibitionoftreatmentPotionEffect.potion);
		}
	}
}
