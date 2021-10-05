package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.zaomengxiyoutotalzip.entity.ShouyerenEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ShouyerenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ShouyerenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelshouyeren(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/shouyeren.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/shouyeren.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelshouyeren extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		public Modelshouyeren() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -5.0F, 0.0F);
			head.setTextureOffset(48, 62).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(31, 101).addBox(4.1F, -9.0F, 1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(47, 101).addBox(-4.1F, -9.0F, 1.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(89, 0).addBox(-4.0F, -8.1F, -4.1F, 8.0F, 2.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(96, 117).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(96, 105).addBox(-4.0F, -15.0F, -3.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(100, 89).addBox(-3.0F, -23.0F, -2.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(110, 60).addBox(-1.0F, -30.0F, 3.0F, 2.0F, 6.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(106, 73).addBox(-2.0F, -28.0F, 0.0F, 4.0F, 8.0F, 7.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 2.0F, 0.0F);
			body.setTextureOffset(52, 0).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 15.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(12.0F, -4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 41).addBox(4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 38).addBox(-12.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(20, 0).addBox(-12.0F, -4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(13, 89).addBox(4.9F, 9.0F, -3.0F, 0.0F, 13.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 89).addBox(-4.9F, 9.0F, -3.0F, 0.0F, 13.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 23).addBox(-5.0F, 7.0F, -3.1F, 10.0F, 15.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 80).addBox(-5.0F, 7.0F, 3.1F, 10.0F, 15.0F, 0.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, -4.0F, 0.0F);
			leftarm.setTextureOffset(48, 21).addBox(0.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, -4.0F, 0.0F);
			rightarm.setTextureOffset(64, 21).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			rightleg.setTextureOffset(32, 0).addBox(-4.0F, -13.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			leftleg.setTextureOffset(28, 19).addBox(0.0F, -13.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
