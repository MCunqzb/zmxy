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

import net.mcreator.zaomengxiyoutotalzip.entity.PiranhaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PiranhaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PiranhaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeleatenfish(), 0.3f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/eatenfish.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/eatenfishlight.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeleatenfish extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer upmouse;
		private final ModelRenderer cube_r1;
		private final ModelRenderer downmouse;
		private final ModelRenderer rightFin;
		private final ModelRenderer leftFin;
		private final ModelRenderer tailfin;
		public Modeleatenfish() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-0.5F, -5.0F, 1.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(12, 1).addBox(-0.5F, -4.0F, -3.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(20, 3).addBox(0.5F, -9.0F, -2.9992F, 0.0F, 4.0F, 6.0F, 0.0F, false);
			upmouse = new ModelRenderer(this);
			upmouse.setRotationPoint(0.0F, 21.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.5F, 1.0F, 1.0F);
			upmouse.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(10, 9).addBox(-0.5F, -3.2948F, -5.7705F, 2.0F, 3.0F, 6.0F, 0.0F, false);
			downmouse = new ModelRenderer(this);
			downmouse.setRotationPoint(0.0F, 24.0F, -3.0F);
			downmouse.setTextureOffset(0, 9).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			rightFin = new ModelRenderer(this);
			rightFin.setRotationPoint(-0.5F, 24.0F, 0.0F);
			setRotationAngle(rightFin, 0.0F, 0.6109F, 0.0F);
			rightFin.setTextureOffset(2, 16).addBox(-2.4096F, -2.0F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			leftFin = new ModelRenderer(this);
			leftFin.setRotationPoint(0.5F, 24.0F, 0.0F);
			setRotationAngle(leftFin, 0.0F, -0.6109F, 0.0F);
			leftFin.setTextureOffset(2, 21).addBox(0.4096F, -2.0F, -0.2868F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			tailfin = new ModelRenderer(this);
			tailfin.setRotationPoint(0.0F, 24.0F, 5.0F);
			tailfin.setTextureOffset(24, -4).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			upmouse.render(matrixStack, buffer, packedLight, packedOverlay);
			downmouse.render(matrixStack, buffer, packedLight, packedOverlay);
			rightFin.render(matrixStack, buffer, packedLight, packedOverlay);
			leftFin.render(matrixStack, buffer, packedLight, packedOverlay);
			tailfin.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.upmouse.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.tailfin.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.rightFin.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftFin.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.downmouse.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
