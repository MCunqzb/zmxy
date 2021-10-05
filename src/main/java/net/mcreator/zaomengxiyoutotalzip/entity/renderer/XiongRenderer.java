package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.XiongEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class XiongRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(XiongEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelxiong(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/xiong.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelxiong extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightarm;
		private final ModelRenderer ci2;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer ci;
		public Modelxiong() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, 1.0F);
			head.setTextureOffset(137, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(145, 14).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(122, 118).addBox(-4.0F, -6.0F, 3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(148, 119).addBox(-4.0F, -4.0F, 3.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(148, 119).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 11.0F, 0.0F);
			body.setTextureOffset(134, 26).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 11.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(109, 29).addBox(0.2F, -5.0F, 5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(110, 38).addBox(-3.6F, -2.3F, 5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(176, 30).addBox(-0.6F, 0.0F, 5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(178, 38).addBox(1.2F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(189, 38).addBox(-2.6F, -1.3F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(189, 29).addBox(0.4F, 1.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 228).addBox(-5.0F, -7.0F, -4.0F, 10.0F, 1.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, 3.0F, -3.0F, 10.0F, 2.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(0, 78).addBox(-4.0F, 5.0F, -3.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 92).addBox(-5.0F, 5.0F, 5.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 27).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(2.0F, 16.0F, 0.0F);
			leftleg.setTextureOffset(122, 50).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, 6.0F, 2.0F);
			rightarm.setTextureOffset(151, 51).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(148, 70).addBox(-5.0F, 6.0F, -3.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
			ci2 = new ModelRenderer(this);
			ci2.setRotationPoint(-5.0F, 7.0F, -1.0F);
			rightarm.addChild(ci2);
			ci2.setTextureOffset(184, 54).addBox(3.0F, 2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci2.setTextureOffset(183, 65).addBox(1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ci2.setTextureOffset(183, 75).addBox(4.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci2.setTextureOffset(198, 54).addBox(2.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci2.setTextureOffset(197, 63).addBox(0.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-2.0F, 16.0F, 1.0F);
			rightleg.setTextureOffset(121, 69).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(4.0F, 6.0F, 2.0F);
			leftarm.setTextureOffset(127, 97).addBox(0.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(150, 94).addBox(0.0F, 6.0F, -3.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
			ci = new ModelRenderer(this);
			ci.setRotationPoint(0.0F, 7.0F, -2.0F);
			leftarm.addChild(ci);
			ci.setTextureOffset(180, 90).addBox(3.0F, 2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci.setTextureOffset(193, 91).addBox(1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ci.setTextureOffset(178, 98).addBox(4.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci.setTextureOffset(193, 99).addBox(2.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ci.setTextureOffset(177, 106).addBox(0.0F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.ci.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.ci2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
