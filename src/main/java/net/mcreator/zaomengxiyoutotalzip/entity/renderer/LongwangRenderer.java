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

import net.mcreator.zaomengxiyoutotalzip.entity.LongwangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LongwangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LongwangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modellongwang(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/longwang.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modellongwang extends EntityModel<Entity> {
		private final ModelRenderer jiao1;
		private final ModelRenderer jiao_r1;
		private final ModelRenderer jiao2;
		private final ModelRenderer jiao2_r1;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer tail;
		private final ModelRenderer bone2;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftarm;
		public Modellongwang() {
			textureWidth = 128;
			textureHeight = 128;
			jiao1 = new ModelRenderer(this);
			jiao1.setRotationPoint(0.0F, -8.0F, 0.0F);
			jiao_r1 = new ModelRenderer(this);
			jiao_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			jiao1.addChild(jiao_r1);
			setRotationAngle(jiao_r1, -0.8727F, 0.0F, 0.0F);
			jiao_r1.setTextureOffset(124, 33).addBox(2.0F, -12.2149F, 2.8944F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			jiao2 = new ModelRenderer(this);
			jiao2.setRotationPoint(0.0F, -8.0F, 0.0F);
			jiao2_r1 = new ModelRenderer(this);
			jiao2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			jiao2.addChild(jiao2_r1);
			setRotationAngle(jiao2_r1, -0.8727F, 0.0F, 0.0F);
			jiao2_r1.setTextureOffset(118, 33).addBox(-3.0F, -12.2149F, 2.8944F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.0F, 0.0F);
			head.setTextureOffset(96, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(98, 17).addBox(-5.0F, -9.0F, 1.0F, 10.0F, 10.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(102, 46).addBox(-3.0F, -4.0F, -11.0F, 6.0F, 2.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(102, 56).addBox(-3.0F, -2.0F, -11.0F, 6.0F, 2.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(126, 67).addBox(3.1F, -4.0F, -10.0F, 0.0F, 10.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(123, 67).addBox(-3.1F, -4.0F, -10.0F, 0.0F, 10.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.0F, -5.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 6.0F, 0.0F);
			body.setTextureOffset(71, 79).addBox(-5.0F, -5.0F, -2.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 18.0F, 0.0F);
			body.addChild(tail);
			tail.setTextureOffset(78, 16).addBox(-3.0F, -11.0F, 2.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(78, 24).addBox(-3.0F, -10.0F, 4.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(82, 32).addBox(-2.0F, -8.0F, 6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(82, 40).addBox(-2.0F, -7.0F, 8.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(82, 47).addBox(-2.0F, -6.0F, 10.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(85, 54).addBox(-1.0F, -4.0F, 12.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(84, 60).addBox(-1.0F, -3.0F, 14.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(84, 65).addBox(-0.5F, -4.0F, 15.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 18.0F, -4.0F);
			body.addChild(bone2);
			bone2.setTextureOffset(49, 0).addBox(-5.0F, -12.0F, 1.9F, 10.0F, 12.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(49, 12).addBox(-5.0F, -12.0F, 6.1F, 10.0F, 12.0F, 0.0F, 0.0F, false);
			bone2.setTextureOffset(49, 24).addBox(4.9F, -12.0F, 2.0F, 0.0F, 12.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(59, 24).addBox(-4.9F, -12.0F, 2.0F, 0.0F, 12.0F, 4.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 13.0F, 0.0F);
			leftleg.setTextureOffset(0, 50).addBox(0.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 13.0F, 0.0F);
			rightleg.setTextureOffset(18, 50).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
			rightarm.setTextureOffset(0, 66).addBox(-5.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(18, 66).addBox(0.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			jiao1.render(matrixStack, buffer, packedLight, packedOverlay);
			jiao2.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.jiao1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.jiao2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
