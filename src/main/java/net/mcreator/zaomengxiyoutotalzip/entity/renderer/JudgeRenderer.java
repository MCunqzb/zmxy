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

import net.mcreator.zaomengxiyoutotalzip.entity.JudgeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JudgeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(JudgeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeljudge(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/judge.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/judgerlight.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeljudge extends EntityModel<Entity> {
		private final ModelRenderer ear;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer head;
		private final ModelRenderer cube_r3;
		private final ModelRenderer body;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer pan;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		public Modeljudge() {
			textureWidth = 128;
			textureHeight = 128;
			ear = new ModelRenderer(this);
			ear.setRotationPoint(0.0F, -8.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-4.0F, 3.0F, 1.0F);
			ear.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.6981F, 0.0F);
			cube_r1.setTextureOffset(116, 7).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.0F, 3.0F, 1.0F);
			ear.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
			cube_r2.setTextureOffset(116, 0).addBox(0.0F, -4.0F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -8.0F, 0.0F);
			head.setTextureOffset(84, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(84, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(70, 0).addBox(-1.5F, -3.0F, 0.7F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(66, 0).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 4.0F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(46, 0).addBox(-5.0F, 0.0F, 0.1F, 10.0F, 21.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(89, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(116, 15).addBox(-3.0F, -14.0F, -2.1F, 6.0F, 9.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(73, 18).addBox(-4.0F, -24.0F, -2.1F, 8.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(73, 23).addBox(-4.0F, -24.0F, 2.1F, 8.0F, 4.0F, 0.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(4.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(72, 33).addBox(0.0F, -1.6F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(72, 47).addBox(0.0F, 8.4F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, 2.0F, 2.0F);
			rightarm.setTextureOffset(89, 33).addBox(-4.0F, -1.6F, -4.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(89, 47).addBox(-4.0F, 8.4F, -4.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			pan = new ModelRenderer(this);
			pan.setRotationPoint(-6.0F, 2.0F, 0.0F);
			pan.setTextureOffset(0, 106).addBox(-1.0F, 10.0F, -12.0F, 1.0F, 1.0F, 21.0F, 0.0F, false);
			pan.setTextureOffset(11, 85).addBox(-0.5F, 10.0F, 8.0F, 0.0F, 10.0F, 11.0F, 0.0F, false);
			pan.setTextureOffset(18, 92).addBox(-1.5F, 9.5F, -14.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			pan.setTextureOffset(0, 93).addBox(-2.5F, 8.5F, -17.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			pan.setTextureOffset(0, 88).addBox(-2.0F, 9.0F, -16.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			pan.setTextureOffset(0, 79).addBox(-3.0F, 8.2F, -20.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 10.0F, -19.0F);
			pan.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 54).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 10.0F, -19.0F);
			pan.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 61).addBox(-1.5F, 0.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 10.0F, -19.0F);
			pan.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 68).addBox(-2.5F, -1.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			leftleg.setTextureOffset(72, 56).addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			rightleg.setTextureOffset(89, 56).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			ear.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			pan.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.ear.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.pan.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
