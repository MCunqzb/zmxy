package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.Map;

public class Tianshayupao2XiongJiaShiJianMeiYouXiKeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure Tianshayupao2XiongJiaShiJianMeiYouXiKe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("tsyp", ((entity.getPersistentData().getDouble("tsyp")) + 1));
		if ((((entity.getPersistentData().getDouble("tsyp")) > 200) && ((entity.getPersistentData().getDouble("tsyp")) < 203))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 80, (int) 2));
			entity.getPersistentData().putDouble("tsyp", 0);
		}
		if (((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) || (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity)))) {
			if ((!(entity.isOnGround()))) {
				entity.getPersistentData().putDouble("fly", ((entity.getPersistentData().getDouble("fly")) + 1));
				if ((((entity.getPersistentData().getDouble("fly")) > 0) && ((entity.getPersistentData().getDouble("fly")) < 405))) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7a\u53EF\u4EE5\u98DE\u884C"), (true));
					}
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.allowFlying = (true);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.isFlying = (true);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u4E0D\u80FD\u98DE\u884C"), (true));
					}
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.allowFlying = (false);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.isFlying = (false);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
				}
			} else {
				entity.getPersistentData().putDouble("fly", ((entity.getPersistentData().getDouble("fly")) + (-1)));
				if (((entity.getPersistentData().getDouble("fly")) < 0)) {
					entity.getPersistentData().putDouble("fly", 0);
				}
			}
		} else if (((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) || (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SPECTATOR;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity)))) {
			if ((!(entity.isOnGround()))) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.allowFlying = (true);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.isFlying = (true);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
			} else {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.allowFlying = (false);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.isFlying = (false);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
			}
		}
	}
}
