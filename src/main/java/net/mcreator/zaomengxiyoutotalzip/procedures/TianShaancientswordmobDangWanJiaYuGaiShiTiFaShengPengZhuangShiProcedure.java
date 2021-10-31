package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class TianShaancientswordmobDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency entity for procedure TianShaancientswordmobDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency sourceentity for procedure TianShaancientswordmobDangWanJiaYuGaiShiTiFaShengPengZhuangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		entity.rotationYaw = (float) ((sourceentity.rotationYaw));
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) ((sourceentity.rotationPitch));
		sourceentity.startRiding(entity);
		if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
			((TameableEntity) entity).setTamed(true);
			((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
		}
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 60, (int) 1));
		entity.getPersistentData().putDouble("level", (new Object() {
			public int getScore(String score) {
				if (sourceentity instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) sourceentity).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective(score);
					if (_so != null) {
						Score _scr = _sc.getOrCreateScore(((PlayerEntity) sourceentity).getScoreboardName(), _so);
						return _scr.getScorePoints();
					}
				}
				return 0;
			}
		}.getScore("level_xiyou")));
	}
}
