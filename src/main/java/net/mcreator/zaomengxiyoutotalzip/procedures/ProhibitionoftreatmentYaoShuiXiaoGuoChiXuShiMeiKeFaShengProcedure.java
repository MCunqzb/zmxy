package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

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
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER
						.warn("Failed to load dependency world for procedure ProhibitionoftreatmentYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(HealingreductionPotionEffect.potion);
		}
		if (((new Object() {
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
		}.check(entity)) < 10)) {
			entity.getPersistentData().putDouble("saved health", ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
			entity.getPersistentData().putDouble("ban health", 0);
		} else {
			if ((((entity.getPersistentData().getDouble("ban health")) <= 5)
					|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < (entity.getPersistentData()
							.getDouble("saved health"))))) {
				entity.getPersistentData().putDouble("ban health", ((entity.getPersistentData().getDouble("ban health")) + 1));
				entity.getPersistentData().putDouble("saved health",
						Math.round(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)));
			}
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > (entity.getPersistentData().getDouble("saved health")))
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) >= 1))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).setHealth((float) (entity.getPersistentData().getDouble("saved health")));
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"gamerule naturalregeneration false");
			}
		}
	}
}
