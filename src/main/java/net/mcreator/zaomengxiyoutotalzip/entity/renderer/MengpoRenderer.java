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

import net.mcreator.zaomengxiyoutotalzip.entity.MengpoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MengpoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MengpoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMengpo(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/mengpo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMengpo extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer hear2;
		private final ModelRenderer hear3;
		private final ModelRenderer hear;
		private final ModelRenderer hear4;
		private final ModelRenderer hear5;
		private final ModelRenderer headpitch;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer bone;
		private final ModelRenderer bone4;
		private final ModelRenderer bodyclose;
		private final ModelRenderer body;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer leftarm;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer ballbig;
		public ModelMengpo() {
			textureWidth = 80;
			textureHeight = 80;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
			hear2 = new ModelRenderer(this);
			hear2.setRotationPoint(0.0F, 0.0F, -0.6F);
			head.addChild(hear2);
			hear2.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear2.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear2.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, 1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear2.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, 3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear3 = new ModelRenderer(this);
			hear3.setRotationPoint(0.0F, 0.0F, 0.0F);
			hear2.addChild(hear3);
			hear3.setTextureOffset(0, 16).addBox(-4.7F, -9.0F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear3.setTextureOffset(0, 16).addBox(-4.7F, -9.0F, -2.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear3.setTextureOffset(0, 16).addBox(-4.7F, -9.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear3.setTextureOffset(0, 16).addBox(-4.7F, -9.0F, 2.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear = new ModelRenderer(this);
			hear.setRotationPoint(0.0F, 0.0F, -0.6F);
			head.addChild(hear);
			hear.setTextureOffset(0, 16).addBox(4.0F, -9.0F, -3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear.setTextureOffset(0, 16).addBox(4.0F, -9.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear.setTextureOffset(0, 16).addBox(4.0F, -9.0F, 1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear.setTextureOffset(0, 16).addBox(4.0F, -9.0F, 3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear4 = new ModelRenderer(this);
			hear4.setRotationPoint(0.0F, 0.0F, 0.0F);
			hear.addChild(hear4);
			hear4.setTextureOffset(0, 16).addBox(3.7F, -9.0F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear4.setTextureOffset(0, 16).addBox(3.7F, -9.0F, -2.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear4.setTextureOffset(0, 16).addBox(3.7F, -9.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear4.setTextureOffset(0, 16).addBox(3.7F, -9.0F, 2.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			hear5 = new ModelRenderer(this);
			hear5.setRotationPoint(0.5F, 0.0F, 0.0F);
			head.addChild(hear5);
			hear5.setTextureOffset(4, 16).addBox(3.0F, -10.0F, 4.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(2.0F, -10.0F, 3.8F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(1.0F, -10.0F, 4.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(0.0F, -10.0F, 3.8F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(-1.0F, -10.0F, 4.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(-2.0F, -10.0F, 3.8F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(-3.0F, -10.0F, 4.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(-5.0F, -10.0F, 4.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			hear5.setTextureOffset(4, 16).addBox(-4.0F, -10.0F, 3.8F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			headpitch = new ModelRenderer(this);
			headpitch.setRotationPoint(0.0F, -12.0F, 0.0F);
			headpitch.setTextureOffset(68, 0).addBox(-1.5F, -5.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			headpitch.setTextureOffset(32, 10).addBox(-5.5F, -4.0F, 1.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			headpitch.setTextureOffset(70, 6).addBox(6.5F, -5.0F, 0.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			headpitch.setTextureOffset(8, 16).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			headpitch.setTextureOffset(8, 18).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			headpitch.setTextureOffset(24, 0).addBox(-1.0F, -3.4F, -3.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -4.8722F, -0.8721F);
			headpitch.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(76, 14).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -2.0F, 0.0F);
			headpitch.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(76, 11).addBox(-1.0F, -3.0F, -0.1F, 2.0F, 3.0F, 0.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -3.0F, -2.0F);
			headpitch.addChild(bone);
			setRotationAngle(bone, -0.3054F, 0.0F, 0.0F);
			bone.setTextureOffset(8, 22).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(2.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			headpitch.addChild(bone4);
			bodyclose = new ModelRenderer(this);
			bodyclose.setRotationPoint(0.0F, 10.0F, -3.4F);
			bodyclose.setTextureOffset(72, 25).addBox(-2.0F, 0.0F, -0.2F, 4.0F, 13.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -3.0F, 0.0F);
			body.setTextureOffset(64, 20).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(36, 12).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 13.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(40, 31).addBox(-4.5F, 12.0F, -3.5F, 9.0F, 15.0F, 7.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(2.0F, 12.0F, -3.0F);
			body.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(34, 53).addBox(-1.0F, -12.0F, -0.5F, 10.0F, 12.0F, 0.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 2.0F, -3.0F);
			body.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(18, 37).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(9.0F, 0.1721F, -3.0543F);
			body.addChild(bone3);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -0.0104F, 0.3239F);
			bone3.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(70, 69).addBox(-3.0F, -10.0F, -0.3F, 5.0F, 10.0F, 0.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(7.0F, 1.065F, 5.5336F);
			bone3.addChild(cube_r6);
			setRotationAngle(cube_r6, -1.4835F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(74, 43).addBox(-3.0F, -6.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(5.0F, -8.3738F, 5.8149F);
			bone3.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(70, 61).addBox(-7.0F, 0.0F, -0.001F, 5.0F, 8.0F, 0.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(3.0F, -0.4962F, 4.4253F);
			bone3.addChild(cube_r8);
			setRotationAngle(cube_r8, -1.0908F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(72, 54).addBox(-2.0F, -7.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(7.0F, -3.7285F, 10.6343F);
			bone3.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(74, 49).addBox(-4.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(3.0F, -0.5F, -1.0F);
			setRotationAngle(leftarm, 0.0F, 0.0F, -0.1745F);
			leftarm.setTextureOffset(0, 36).addBox(0.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 29).addBox(0.0F, 11.0F, -1.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-4.0F, -1.0F, -1.0F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-4.0F, 6.9509F, 4.9683F);
			rightarm.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(0, 52).addBox(0.0F, -9.0F, -4.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 6.9509F, 4.9683F);
			rightarm.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(12, 26).addBox(-4.0F, 6.0F, -4.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r11.setTextureOffset(0, 65).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-2.7F, 0.5805F, -11.9571F);
			rightarm.addChild(bone2);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.2F, 10.1705F, 5.2255F);
			bone2.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.5236F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(27, 24).addBox(-1.0F, -0.9409F, -1.0675F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-0.3F, 6.8705F, 8.2255F);
			bone2.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(27, 24).addBox(-0.5F, -0.883F, -1.0156F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(26, 18).addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 4.7321F, 4.1962F);
			bone2.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(33, 31).addBox(0.0F, -2.0F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, 7.5389F, 3.5492F);
			bone2.addChild(cube_r16);
			setRotationAngle(cube_r16, -1.5272F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(33, 31).addBox(0.0F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(2.7F, 6.3705F, 16.9255F);
			bone2.addChild(cube_r17);
			setRotationAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(72, 38).addBox(-3.5F, 4.0F, -10.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(72, 38).addBox(-3.5F, 6.2F, -7.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r17.setTextureOffset(30, 55).addBox(-2.7F, 6.7F, -11.0F, 1.0F, 1.0F, 24.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, 2.0F, -3.4641F);
			bone2.addChild(cube_r18);
			setRotationAngle(cube_r18, 1.4399F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(26, 18).addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			ballbig = new ModelRenderer(this);
			ballbig.setRotationPoint(0.7F, 5.3F, 0.7F);
			bone2.addChild(ballbig);
			ballbig.setTextureOffset(17, 44).addBox(-1.7F, -1.3F, -1.7F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			headpitch.render(matrixStack, buffer, packedLight, packedOverlay);
			bodyclose.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.headpitch.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.cube_r12.rotateAngleY = f2 / 20.f;
			this.cube_r13.rotateAngleZ = f2 / 20.f;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.ballbig.rotateAngleZ = f2 / 20.f;
			this.bodyclose.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
