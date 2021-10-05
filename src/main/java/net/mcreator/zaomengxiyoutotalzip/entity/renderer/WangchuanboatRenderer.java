package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.zaomengxiyoutotalzip.entity.WangchuanboatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WangchuanboatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WangchuanboatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwangchuanship(), 1f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/wangchuanship.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/wangchuanshiplight.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwangchuanship extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		public Modelwangchuanship() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 10.0F, 6.0F);
			bone.setTextureOffset(0, 0).addBox(-14.0F, 11.0F, -24.0F, 29.0F, 3.0F, 34.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(15.0F, -2.0F, -24.0F, 2.0F, 13.0F, 34.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(-16.0F, -2.0F, -24.0F, 2.0F, 13.0F, 34.0F, 0.0F, false);
			bone.setTextureOffset(0, 92).addBox(-14.0F, -2.0F, 8.0F, 29.0F, 13.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(8, 110).addBox(-14.0F, -2.0F, -28.0F, 29.0F, 13.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(16.0F, 8.0F, -17.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.0F, -37.6583F, -12.4843F);
			bone2.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(78, 113).addBox(-3.0F, 4.9851F, 1.9471F, 2.0F, 2.0F, 10.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -39.9755F, -6.1832F);
			bone2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(89, 113).addBox(-1.0F, -2.0F, -13.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -32.7594F, 4.8558F);
			bone2.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.0036F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(120, 74).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(120, 92).addBox(-2.0F, -34.0F, -1.0F, 2.0F, 34.0F, 2.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(16.0F, -15.0F, -25.0F);
			bone3.setTextureOffset(108, 121).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(84, 101).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			bone3.setTextureOffset(101, 103).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
			bone3.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(100, 108).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, -1.0F, -1.0F);
			bone3.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(86, 108).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			bone2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone3.render(matrixStack, buffer, packedLight, packedOverlay);
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
