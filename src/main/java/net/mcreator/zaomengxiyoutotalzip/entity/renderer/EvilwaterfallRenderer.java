package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.EvilwaterfallEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EvilwaterfallRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EvilwaterfallEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwaterfall(), 0.1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/evilwaterfall.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwaterfall extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		public Modelwaterfall() {
			textureWidth = 256;
			textureHeight = 256;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-11.0F, -128.0F, -11.0F, 22.0F, 128.0F, 22.0F, 0.0F, false);
			bb_main.setTextureOffset(89, 0).addBox(-18.0F, -129.0F, -19.0F, 36.0F, 10.0F, 37.0F, 0.0F, false);
			bb_main.setTextureOffset(91, 51).addBox(-14.0F, -119.0F, -15.0F, 28.0F, 10.0F, 29.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-9.0F, -137.0F, -9.0F, 18.0F, 12.0F, 18.0F, 0.0F, false);
			bb_main.setTextureOffset(89, 0).addBox(-18.0F, -10.0F, -19.0F, 36.0F, 10.0F, 37.0F, 0.0F, false);
			bb_main.setTextureOffset(91, 96).addBox(-14.0F, -20.0F, -15.0F, 28.0F, 10.0F, 29.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
