package net.mcreator.zaomengxiyoutotalzip.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Util;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.zaomengxiyoutotalzip.particle.HutiParticle;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class JiaomowangOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency entity for procedure JiaomowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency x for procedure JiaomowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency y for procedure JiaomowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency z for procedure JiaomowangOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZaomengxiyouMod.LOGGER.warn("Failed to load dependency world for procedure JiaomowangOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (12 / 2d), y - (12 / 2d), z - (12 / 2d), x + (12 / 2d), y + (12 / 2d), z + (12 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			entity.getPersistentData().putDouble("jmw", ((entity.getPersistentData().getDouble("jmw")) + 1));
			if ((((entity.getPersistentData().getDouble("jmw")) > 148) && ((entity.getPersistentData().getDouble("jmw")) < 150))) {
				for (int index0 = 0; index0 < (int) (1); index0++) {
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u8986\u6D77\u86DF\u9F99"), ChatType.SYSTEM,
									Util.DUMMY_UUID);
					}
				}
			}
			if ((((entity.getPersistentData().getDouble("jmw")) > 145) && ((entity.getPersistentData().getDouble("jmw")) < 150))) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
			if ((((entity.getPersistentData().getDouble("jmw")) > 155) && ((entity.getPersistentData().getDouble("jmw")) < 170))) {
				for (int index1 = 0; index1 < (int) (5); index1++) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager()
								.handleCommand(
										new CommandSource(ICommandSource.DUMMY,
												new Vector3d((x + (3 - (6 * Math.random()))), (y + (9 * Math.random())),
														(z + (3 - (6 * Math.random())))),
												Vector2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
												null).withFeedbackDisabled(),
										"summon minecraft:trident ~ ~15 ~ {Motion:[0.0,-2.0,0.0],direction:[0.0,-2.0,0.0],Power:[0.0,-5.0,0.0]}");
					}
				}
			}
			if ((((entity.getPersistentData().getDouble("jmw")) > 220) && ((entity.getPersistentData().getDouble("jmw")) < 222))) {
				for (int index2 = 0; index2 < (int) (1); index2++) {
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(new StringTextComponent("\u91D1\u521A\u62A4\u4F53"), ChatType.SYSTEM,
									Util.DUMMY_UUID);
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"kill @e[type=minecraft:trident]");
					}
				}
			}
			if ((((entity.getPersistentData().getDouble("jmw")) > 220) && ((entity.getPersistentData().getDouble("jmw")) < 320))) {
				world.addParticle(HutiParticle.particle, x, (y + 1), z, 0, 0.1, 0);
				entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 3));
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"attribute @s minecraft:generic.armor base set 40");
					}
				}
			}
			if ((((entity.getPersistentData().getDouble("jmw")) > 344) && ((entity.getPersistentData().getDouble("jmw")) < 380))) {
				entity.getPersistentData().putDouble("jmw", 0);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"attribute @s minecraft:generic.armor base set 16");
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("jmw", 0);
		}
	}
}
