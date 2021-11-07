package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Score;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.zaomengxiyoutotalzip.item.Dishagun1Item;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Random;
import java.util.Map;

public class GroundevilgourditemrightclickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Groundevilgourditemrightclick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency itemstack for procedure Groundevilgourditemrightclick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) > 100)) {
			{
				double _setval = (double) (((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ZaomengxiyouModVariables.PlayerVariables())).mp) - 100);
				entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					Dishagun1Item.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) (((new Object() {
						public int getScore(String score) {
							if (entity instanceof PlayerEntity) {
								Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
								ScoreObjective _so = _sc.getObjective(score);
								if (_so != null) {
									Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
									return _scr.getScorePoints();
								}
							}
							return 0;
						}
					}.getScore("level_xiyou")) * 0.3) + 10), (int) 0.2);
				}
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 20);
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("low.mp").getString())), (false));
			}
		}
	}
}
