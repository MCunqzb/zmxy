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

import net.mcreator.zaomengxiyoutotalzip.entity.MihouwangEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MihouwangRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MihouwangEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmihouwangband2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/mihouwangband2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.0
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelmihouwangband2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer leftleg;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		public Modelmihouwangband2() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 1.0F);
			head.setTextureOffset(162, 2).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(162, 20).addBox(-4.0F, -5.0F, -4.1F, 8.0F, 5.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(178, 19).addBox(4.1F, -2.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(198, 4).addBox(-4.1F, -2.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, 0.1F, -4.0F, 8.0F, 0.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 1.0F);
			body.setTextureOffset(161, 36).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 14.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(192, 37).addBox(-4.0F, -7.0F, -2.2F, 8.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.2182F, 1.5708F);
			cube_r1.setTextureOffset(204, 44).addBox(-1.4342F, -3.0F, 2.5052F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(3.0F, -7.0F, 2.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(193, 44).addBox(-1.0F, -0.3295F, 0.1221F, 2.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
			cube_r3.setTextureOffset(147, 47).addBox(-2.3233F, 7.4567F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
			cube_r4.setTextureOffset(133, 47).addBox(1.3233F, 7.4567F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -1.0F, 2.0F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(133, 36).addBox(-5.0F, 5.876F, -2.8049F, 10.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.0F, 6.0F, -2.0F);
			body.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(155, 78).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-3.0F, 6.0F, -2.0F);
			body.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(178, 78).addBox(-2.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.0F, 12.0F, 1.0F);
			leftleg.setTextureOffset(153, 87).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.0F, 12.0F, 1.0F);
			rightleg.setTextureOffset(177, 87).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, -1.0F, 1.0F);
			leftarm.setTextureOffset(106, 34).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, -1.0F, 1.0F);
			rightarm.setTextureOffset(215, 37).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightarm.setTextureOffset(91, 75).addBox(-2.5F, 9.0F, -11.0F, 1.0F, 1.0F, 22.0F, 0.0F, false);
			rightarm.setTextureOffset(110, 103).addBox(-3.5F, 8.0F, -14.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			rightarm.setTextureOffset(110, 103).addBox(-3.5F, 8.0F, 11.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
