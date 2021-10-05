package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Util;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.particle.FirebirdParticle;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class PengmowangOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure PengmowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure PengmowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure PengmowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure PengmowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure PengmowangOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			entity.getPersistentData().putDouble("pmw", ((entity.getPersistentData().getDouble("pmw")) + 1));
			if ((((entity.getPersistentData().getDouble("pmw")) > 98) && ((entity.getPersistentData().getDouble("pmw")) < 100))) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"gamerule doFireTick false");
				}
				if (!world.isRemote()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u706B\u9E1F\u51B2\u51FB"), ChatType.SYSTEM, Util.DUMMY_UUID);
				}
			}
			if ((((entity.getPersistentData().getDouble("pmw")) > 100) && ((entity.getPersistentData().getDouble("pmw")) < 120))) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(FirebirdParticle.particle, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			}
			if ((((entity.getPersistentData().getDouble("pmw")) > 120) && ((entity.getPersistentData().getDouble("pmw")) < 140))) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"execute as @e[type=zaomengxiyou:pengmowang] at @s run fill ~-2 ~ ~-2 ~2 ~ ~2 minecraft:fire keep");
				}
			}
			if ((((entity.getPersistentData().getDouble("pmw")) > 125) && ((entity.getPersistentData().getDouble("pmw")) < 127))) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 10, (int) 6));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 10, (int) 0));
						entityiterator.attackEntityFrom(DamageSource.IN_FIRE, (float) 10);
					}
				}
				entity.setMotion(((entity.getMotion().getX()) * 25), ((entity.getMotion().getY()) * 0.2), ((entity.getMotion().getZ()) * 25));
			}
			if ((((entity.getPersistentData().getDouble("pmw")) > 240) && ((entity.getPersistentData().getDouble("pmw")) < 255))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 100, (int) 2));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 300, (int) 2));
			}
			if ((((entity.getPersistentData().getDouble("pmw")) >= 250) && ((entity.getPersistentData().getDouble("pmw")) <= 350))) {
				if ((((entity.getPersistentData().getDouble("pmw")) % 10) == 1)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 10, (int) 6));
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x + (3 - (6 * Math.random()))), y, (z + (3 - (6 * Math.random())))), Vector2f.ZERO,
										(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
												.withFeedbackDisabled(),
								"summon minecraft:fireball ~ ~5 ~ {Motion:[0.0,-2.0,0.0],direction:[0.0,-1.0,0.0],ExplosionPower:2.5}");
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY,
										new Vector3d((x + (3 - (6 * Math.random()))), y, (z + (3 - (6 * Math.random())))), Vector2f.ZERO,
										(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
												.withFeedbackDisabled(),
								"summon minecraft:fireball ~ ~5 ~ {Motion:[0.0,-2.0,0.0],direction:[0.0,-1.0,0.0],ExplosionPower:2.5}");
					}
					entity.getPersistentData().putDouble("pmw", 0);
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"gamerule doFireTick true");
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("pmw", 0);
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager()
						.handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"gamerule doFireTick true");
			}
		}
	}
}
