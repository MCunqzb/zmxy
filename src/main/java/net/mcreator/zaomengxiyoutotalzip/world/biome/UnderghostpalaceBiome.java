
package net.mcreator.zaomengxiyoutotalzip.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityClassification;

import net.mcreator.zaomengxiyoutotalzip.entity.NiutouEntity;
import net.mcreator.zaomengxiyoutotalzip.entity.MamianEntity;
import net.mcreator.zaomengxiyoutotalzip.block.UnderruckBlock;
import net.mcreator.zaomengxiyoutotalzip.block.UnderdirtBlock;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

@ZaomengxiyouModElements.ModElement.Tag
public class UnderghostpalaceBiome extends ZaomengxiyouModElements.ModElement {
	public static Biome biome;
	public UnderghostpalaceBiome(ZaomengxiyouModElements instance) {
		super(instance, 726);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-5474615).setWaterColor(-13428159).setWaterFogColor(-7967341)
						.withSkyColor(-5474615).withFoliageColor(-12122008).withGrassColor(-9622077)
						.setAmbientSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("zaomengxiyou:jieyindian")))
						.build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(UnderdirtBlock.block.getDefaultState(),
								UnderruckBlock.block.getDefaultState(), UnderruckBlock.block.getDefaultState())));
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(MamianEntity.entity, 20, 4, 4));
				mobSpawnInfo.withSpawner(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(NiutouEntity.entity, 20, 4, 4));
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(-1f).scale(0f).temperature(0.5f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("zaomengxiyou:underghostpalace"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
