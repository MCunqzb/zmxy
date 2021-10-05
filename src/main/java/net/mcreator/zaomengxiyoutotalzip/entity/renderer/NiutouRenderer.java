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

import net.mcreator.zaomengxiyoutotalzip.entity.NiutouEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NiutouRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NiutouEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelniutou(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/niutou.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/niutoulight.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelniutou extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		public Modelniutou() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 3.0F, 0.0F);
			head.setTextureOffset(47, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(77, 7).addBox(4.0F, -7.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(33, 7).addBox(-8.0F, -7.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(102, 0).addBox(0.0F, -15.0F, -3.0F, 0.0F, 15.0F, 13.0F, 0.0F, false);
			head.setTextureOffset(70, 2).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(19, 0).addBox(8.5F, -12.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 6).addBox(8.0F, -9.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(8.0F, -6.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-9.0F, -6.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(16, 6).addBox(-10.0F, -9.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(19, 0).addBox(-9.5F, -12.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 0.0F);
			body.setTextureOffset(45, 15).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 13.0F, 7.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(7.0F, 5.0F, 1.0F);
			leftarm.setTextureOffset(27, 17).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);
			leftarm.setTextureOffset(3, 22).addBox(-2.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 25).addBox(-2.0F, -6.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(11, 25).addBox(1.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(5, 27).addBox(3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 33).addBox(-1.0F, 8.0F, -6.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 33).addBox(-2.0F, 7.0F, -9.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			leftarm.setTextureOffset(18, 38).addBox(-3.0F, 6.0F, -15.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 39).addBox(-3.0F, 6.0F, -24.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(3, 50).addBox(-4.0F, 5.0F, -22.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			leftarm.setTextureOffset(25, 41).addBox(-3.0F, 3.0F, -20.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 41).addBox(0.0F, 3.0F, -18.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(25, 38).addBox(-2.0F, 12.0F, -18.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 38).addBox(-2.0F, 12.0F, -21.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(20, 35).addBox(-1.0F, 3.0F, -21.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(25, 35).addBox(1.0F, 12.0F, -20.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(29, 36).addBox(3.0F, 9.0F, -20.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(34, 42).addBox(-6.0F, 7.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(11, 55).addBox(-6.0F, 8.0F, -21.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(24, 55).addBox(3.0F, 10.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(24, 53).addBox(-6.0F, 10.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(24, 51).addBox(3.0F, 7.0F, -18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(30, 54).addBox(-2.0F, 9.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(30, 51).addBox(-1.0F, 7.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(11, 51).addBox(1.0F, 9.0F, -26.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-6.0F, 5.0F, 1.0F);
			rightarm.setTextureOffset(79, 17).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);
			rightarm.setTextureOffset(80, 33).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
			rightarm.setTextureOffset(97, 38).addBox(-6.0F, -2.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			rightarm.setTextureOffset(88, 36).addBox(0.0F, -6.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			rightarm.setTextureOffset(84, 36).addBox(-3.0F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(3.0F, 17.0F, 0.0F);
			leftleg.setTextureOffset(63, 44).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-2.0F, 17.0F, 0.0F);
			rightleg.setTextureOffset(39, 44).addBox(-3.0F, -1.0F, -3.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);
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
		}
	}
}
