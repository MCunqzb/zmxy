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

import net.mcreator.zaomengxiyoutotalzip.entity.ShituowangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ShituowangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ShituowangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelshituowang(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/shituowang.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelshituowang extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer tail;
		private final ModelRenderer cloth;
		private final ModelRenderer mao;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer rightarm;
		private final ModelRenderer leftarm;
		public Modelshituowang() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(155, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 72).addBox(3.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 72).addBox(4.0F, -7.0F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 79).addBox(4.0F, -9.0F, -3.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 72).addBox(-3.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 72).addBox(-5.0F, -9.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(-4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(-3.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(-1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(3.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(-2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(156, 95).addBox(2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 3.0F, 0.0F);
			body.setTextureOffset(159, 19).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 21.0F, 0.0F);
			body.addChild(tail);
			tail.setTextureOffset(137, 68).addBox(-1.0F, -13.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(157, 69).addBox(-1.0F, -10.0F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			tail.setTextureOffset(147, 69).addBox(-1.0F, -13.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			tail.setTextureOffset(176, 70).addBox(-1.0F, -10.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			tail.setTextureOffset(193, 68).addBox(1.0F, -10.5F, 5.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cloth = new ModelRenderer(this);
			cloth.setRotationPoint(0.0F, 21.0F, 0.0F);
			body.addChild(cloth);
			cloth.setTextureOffset(165, 39).addBox(-2.0F, -14.0F, -2.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);
			cloth.setTextureOffset(203, 19).addBox(-5.0F, -24.0F, -2.1F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			cloth.setTextureOffset(122, 20).addBox(-5.0F, -24.0F, 2.1F, 10.0F, 9.0F, 0.0F, 0.0F, false);
			mao = new ModelRenderer(this);
			mao.setRotationPoint(0.0F, 21.0F, 0.0F);
			body.addChild(mao);
			mao.setTextureOffset(0, 47).addBox(4.0F, -24.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 57).addBox(-5.0F, -24.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 37).addBox(-5.0F, -24.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 65).addBox(4.0F, -24.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 72).addBox(2.0F, -24.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 81).addBox(0.0F, -24.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 17).addBox(-3.0F, -24.0F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(0, 29).addBox(-2.0F, -24.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			mao.setTextureOffset(202, 4).addBox(-5.0F, -25.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			mao.setTextureOffset(129, 4).addBox(4.0F, -25.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			mao.setTextureOffset(0, 72).addBox(-3.0F, -32.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 12.0F, 0.0F);
			leftleg.setTextureOffset(137, 45).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(0.0F, 12.0F, 0.0F);
			rightleg.setTextureOffset(178, 45).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightarm.setTextureOffset(225, 22).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(106, 159).addBox(-2.0F, 8.0F, -8.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
			rightarm.setTextureOffset(155, 173).addBox(-2.0F, 6.0F, -9.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(173, 164).addBox(-2.0F, 7.0F, -18.0F, 1.0F, 3.0F, 9.0F, 0.0F, false);
			rightarm.setTextureOffset(201, 170).addBox(-2.0F, 7.0F, -20.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(201, 161).addBox(-2.0F, 7.0F, -21.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftarm.setTextureOffset(101, 19).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
