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

import net.mcreator.zaomengxiyoutotalzip.entity.WaterspriteEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WaterspriteRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WaterspriteEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwater_sprite(), 0.7f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/water_sprite.png");
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
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/water_sprite_light.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwater_sprite extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer plank;
		public Modelwater_sprite() {
			textureWidth = 80;
			textureHeight = 80;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(48, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(2.0F, -9.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.6F, -9.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 61).addBox(1.8F, -7.0F, -4.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 61).addBox(-0.5F, -7.5F, -4.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 61).addBox(-2.7F, -7.0F, -4.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.3F, -9.0F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.1F, -9.0F, 0.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(45, 49).addBox(-3.0F, -6.2F, -4.1F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(48, 16).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 17.0F, 6.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, -1.0F, 0.5F);
			leftarm.setTextureOffset(8, 0).addBox(0.0F, -1.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);
			leftarm.setTextureOffset(54, 72).addBox(0.0F, -3.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(16, 68).addBox(6.0F, -2.0F, -4.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 61).addBox(0.0F, -2.0F, -5.0F, 7.0F, 5.0F, 1.0F, 0.0F, true);
			leftarm.setTextureOffset(16, 61).addBox(0.0F, -2.0F, 3.0F, 7.0F, 5.0F, 1.0F, 0.0F, true);
			leftarm.setTextureOffset(8, 33).addBox(1.8F, -4.0F, 0.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(2.4F, -3.9F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(4.3F, -3.7F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(0.8F, -3.7F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(4.0F, -3.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(0.6F, -3.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(1.8F, -3.7F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(8, 33).addBox(4.0F, -3.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(13, 33).addBox(4.6F, 6.0F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(13, 33).addBox(4.6F, 11.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(13, 33).addBox(4.8F, 9.0F, -1.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(13, 33).addBox(4.5F, 8.0F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(13, 33).addBox(4.6F, 5.0F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, -1.0F, 0.5F);
			rightarm.setTextureOffset(28, 0).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);
			rightarm.setTextureOffset(54, 64).addBox(-6.0F, -3.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 68).addBox(-7.0F, -2.0F, -4.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 61).addBox(-7.0F, -2.0F, -5.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(16, 61).addBox(-7.0F, -2.0F, 3.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-2.0F, -3.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-4.2F, -3.7F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-1.4F, -3.7F, 1.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-5.0F, -3.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-5.2F, -3.7F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-1.7F, -3.7F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-3.6F, -3.9F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(8, 33).addBox(-3.2F, -4.0F, 0.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 0).addBox(-5.6F, 5.0F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(13, 33).addBox(-5.6F, 6.0F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(13, 33).addBox(-5.5F, 8.0F, 0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(13, 33).addBox(-5.7F, 9.0F, -1.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(13, 33).addBox(-5.6F, 11.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.0F, 16.0F, 0.0F);
			leftleg.setTextureOffset(8, 20).addBox(-2.0F, -1.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
			leftleg.setTextureOffset(34, 70).addBox(-2.0F, 7.0F, -5.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-3.0F, 16.0F, 0.0F);
			rightleg.setTextureOffset(28, 20).addBox(-2.0F, -1.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
			rightleg.setTextureOffset(34, 61).addBox(-2.0F, 7.0F, -5.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			plank = new ModelRenderer(this);
			plank.setRotationPoint(-5.0F, -1.0F, 0.5F);
			plank.setTextureOffset(4, 35).addBox(-4.0F, 11.0F, -16.0F, 3.0F, 1.0F, 20.0F, 0.0F, false);
			plank.setTextureOffset(0, 37).addBox(-5.0F, 11.0F, -16.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
			plank.setTextureOffset(76, 43).addBox(-3.0F, 10.0F, -15.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			plank.setTextureOffset(68, 39).addBox(-4.0F, 9.0F, -16.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			plank.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.plank.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
