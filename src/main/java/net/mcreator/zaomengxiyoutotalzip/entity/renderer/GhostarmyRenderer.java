package net.mcreator.zaomengxiyoutotalzip.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.zaomengxiyoutotalzip.entity.GhostarmyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GhostarmyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GhostarmyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelguibingxiang(), 0.9f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/guibingxiang.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelguibingxiang extends EntityModel<Entity> {
		private final ModelRenderer base;
		private final ModelRenderer leg;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bone3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer bone4;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer down;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer bone5;
		private final ModelRenderer cube_r13;
		private final ModelRenderer bone6;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer body;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer head;
		private final ModelRenderer righthand;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer lefthand2;
		private final ModelRenderer cube_r26;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r29;
		private final ModelRenderer cube_r30;
		private final ModelRenderer cube_r31;
		private final ModelRenderer cube_r32;
		private final ModelRenderer cube_r33;
		private final ModelRenderer bone7;
		public Modelguibingxiang() {
			textureWidth = 128;
			textureHeight = 128;
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 24.0F, 0.0F);
			base.setTextureOffset(50, 108).addBox(-10.0F, -1.0F, -9.0F, 20.0F, 1.0F, 19.0F, 0.0F, false);
			base.setTextureOffset(50, 108).addBox(-10.0F, -18.0F, -9.0F, 20.0F, 1.0F, 19.0F, 0.0F, false);
			base.setTextureOffset(54, 85).addBox(-9.0F, -7.0F, -8.0F, 18.0F, 6.0F, 17.0F, 0.0F, false);
			base.setTextureOffset(58, 65).addBox(-8.0F, -12.0F, -7.0F, 16.0F, 5.0F, 15.0F, 0.0F, false);
			base.setTextureOffset(54, 86).addBox(-9.0F, -17.0F, -8.0F, 18.0F, 5.0F, 17.0F, 0.0F, false);
			leg = new ModelRenderer(this);
			leg.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(6.0F, -18.0F, 3.0F);
			leg.addChild(bone);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 3.0F, 9.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-12.0F, 0.0F, 0.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.1309F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 3.0F, 9.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -3.0F, 0.0F);
			bone.addChild(bone2);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
			cube_r3.setTextureOffset(3, 12).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-12.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
			cube_r4.setTextureOffset(3, 12).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 3.0F, 8.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -3.0F, 0.0F);
			bone2.addChild(bone3);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, -0.1309F, 0.0F);
			cube_r5.setTextureOffset(6, 23).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-12.0F, 0.0F, 0.0F);
			bone3.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
			cube_r6.setTextureOffset(6, 23).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, true);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, -9.0F, 0.0F);
			bone.addChild(bone4);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, -0.1309F, -0.0873F);
			cube_r7.setTextureOffset(31, 0).addBox(-1.0F, -13.0F, -3.0F, 2.0F, 13.0F, 3.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-12.0F, 0.0F, 0.0F);
			bone4.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.1309F, 0.0873F);
			cube_r8.setTextureOffset(31, 0).addBox(-1.0F, -13.0F, -3.0F, 2.0F, 13.0F, 3.0F, 0.0F, true);
			down = new ModelRenderer(this);
			down.setRotationPoint(0.0F, -35.0F, 0.0F);
			leg.addChild(down);
			down.setTextureOffset(0, 31).addBox(-6.0F, -6.0F, -3.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);
			down.setTextureOffset(41, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 15.0F, 0.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -5.0F, -3.0F);
			down.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.303F, -0.0393F, -0.1249F);
			cube_r9.setTextureOffset(112, 6).addBox(2.0F, 5.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r9.setTextureOffset(116, 20).addBox(1.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, -5.0F, -3.0F);
			down.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.3011F, 0.0522F, 0.1666F);
			cube_r10.setTextureOffset(116, 20).addBox(-6.0F, 0.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r10.setTextureOffset(112, 6).addBox(-5.0F, 5.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-5.0937F, -5.5774F, 1.0F);
			down.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
			cube_r11.setTextureOffset(53, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 6.0F, 7.0F, 0.0F, true);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(5.0937F, -5.5774F, 0.0F);
			down.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
			cube_r12.setTextureOffset(53, 0).addBox(0.0F, 0.0F, -2.0F, 1.0F, 6.0F, 7.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, -5.0F, 6.0F);
			down.addChild(bone5);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone5.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(116, 38).addBox(1.0F, 0.0F, -1.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(120, 6).addBox(-5.0F, 5.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(116, 38).addBox(-6.0F, 0.0F, -1.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r13.setTextureOffset(120, 6).addBox(2.0F, 5.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, -18.0F, 0.0F);
			bone6.setTextureOffset(72, 0).addBox(-1.0F, -16.0F, 1.0F, 2.0F, 17.0F, 1.0F, 0.0F, false);
			bone6.setTextureOffset(114, 13).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			bone6.setTextureOffset(114, 13).addBox(-2.0F, -9.0F, 0.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			bone6.setTextureOffset(114, 13).addBox(-2.0F, -12.0F, 0.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-2.0F, -8.0F, 2.0F);
			bone6.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3054F);
			cube_r14.setTextureOffset(114, 32).addBox(-3.6993F, -0.9537F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(1.6993F, -11.0463F, 2.0F);
			bone6.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, 0.3054F);
			cube_r15.setTextureOffset(112, 27).addBox(0.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-2.0F, -11.0F, 2.0F);
			bone6.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.0F, 0.0F, -0.3054F);
			cube_r16.setTextureOffset(112, 27).addBox(-4.6993F, -0.9537F, -2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(1.6993F, -8.0463F, 2.0F);
			bone6.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3054F);
			cube_r17.setTextureOffset(114, 32).addBox(0.0F, -1.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-2.0F, -5.0F, 2.0F);
			bone6.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3054F);
			cube_r18.setTextureOffset(116, 0).addBox(-2.6993F, -0.9537F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(1.6993F, -5.0463F, 2.0F);
			bone6.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3054F);
			cube_r19.setTextureOffset(116, 0).addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -27.0F, 5.0F);
			body.setTextureOffset(81, 0).addBox(-4.0F, 6.0F, 0.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(79, 5).addBox(-7.0F, 0.0F, 0.0F, 14.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(80, 13).addBox(-8.0F, -4.0F, 0.0F, 16.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 26).addBox(-8.0F, -4.0F, -7.1F, 16.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 42).addBox(-9.0F, -8.0F, -7.0F, 18.0F, 4.0F, 8.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(-3.0F, 10.0F, 0.0F);
			body.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.0F, 0.0F, -0.3054F);
			cube_r20.setTextureOffset(85, 24).addBox(-1.0F, -15.0F, -7.0F, 1.0F, 15.0F, 7.0F, 0.0F, false);
			cube_r20.setTextureOffset(57, 15).addBox(-1.0F, -10.0F, -7.1F, 4.0F, 10.0F, 0.0F, 0.0F, true);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(3.0F, 10.0F, -7.1F);
			body.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3054F);
			cube_r21.setTextureOffset(57, 15).addBox(-3.0F, -10.0F, 0.0F, 4.0F, 10.0F, 0.0F, 0.0F, false);
			cube_r21.setTextureOffset(85, 24).addBox(0.0F, -15.0F, 0.1F, 1.0F, 15.0F, 7.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -36.0F, 3.0F);
			head.setTextureOffset(0, 54).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(103, 38).addBox(-2.0F, -5.0F, -5.1F, 4.0F, 7.0F, 0.0F, 0.0F, false);
			righthand = new ModelRenderer(this);
			righthand.setRotationPoint(-10.0F, -34.0F, 2.0F);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
			righthand.addChild(cube_r22);
			setRotationAngle(cube_r22, 0.0F, 0.0F, 0.2182F);
			cube_r22.setTextureOffset(82, 51).addBox(-5.0F, 2.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
			cube_r22.setTextureOffset(100, 46).addBox(-7.0F, -4.0F, -3.0F, 8.0F, 5.0F, 6.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(-5.1357F, 13.7366F, 0.0F);
			righthand.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0F, 0.0F, -0.2182F);
			cube_r23.setTextureOffset(0, 118).addBox(-8.0F, 5.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			cube_r23.setTextureOffset(0, 118).addBox(-6.5F, 1.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			cube_r23.setTextureOffset(0, 118).addBox(-5.0F, -3.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-5.1357F, 13.7366F, 0.0F);
			righthand.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.0F, 0.0F, 0.0873F);
			cube_r24.setTextureOffset(0, 97).addBox(-4.0F, -2.0F, -1.5F, 2.0F, 17.0F, 3.0F, 0.0F, false);
			cube_r24.setTextureOffset(25, 93).addBox(-2.0F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(1.0F, 0.0F, 0.0F);
			righthand.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0F, 0.0F, 0.2182F);
			cube_r25.setTextureOffset(25, 71).addBox(-5.0F, -1.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			lefthand2 = new ModelRenderer(this);
			lefthand2.setRotationPoint(16.0F, -34.0F, 2.0F);
			lefthand2.setTextureOffset(45, 66).addBox(4.0F, 3.0F, -16.0F, 2.0F, 55.0F, 2.0F, 0.0F, false);
			lefthand2.setTextureOffset(53, 41).addBox(-1.0F, -16.0F, -15.0F, 12.0F, 19.0F, 0.0F, 0.0F, false);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(-7.0F, 0.0F, 0.0F);
			lefthand2.addChild(cube_r26);
			setRotationAngle(cube_r26, -0.6109F, 0.0F, -0.3054F);
			cube_r26.setTextureOffset(82, 51).addBox(-0.1F, 2.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, true);
			cube_r26.setTextureOffset(100, 46).addBox(0.0F, -4.0F, -3.0F, 8.0F, 5.0F, 6.0F, 0.0F, true);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(-7.0F, -4.0F, 3.0F);
			lefthand2.addChild(cube_r27);
			setRotationAngle(cube_r27, -0.5558F, 0.268F, 0.0976F);
			cube_r27.setTextureOffset(110, 62).addBox(6.0F, -4.0F, -3.0F, 2.0F, 6.0F, 5.0F, 0.0F, true);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(-7.0F, -4.0F, 3.0F);
			lefthand2.addChild(cube_r28);
			setRotationAngle(cube_r28, -0.5947F, 0.149F, -0.0894F);
			cube_r28.setTextureOffset(100, 46).addBox(1.0F, -3.0F, -3.0F, 2.0F, 5.0F, 6.0F, 0.0F, true);
			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(-26.0F, -4.0F, 3.0F);
			lefthand2.addChild(cube_r29);
			setRotationAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
			cube_r29.setTextureOffset(109, 47).addBox(-7.0F, -5.0F, -5.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
			cube_r30 = new ModelRenderer(this);
			cube_r30.setRotationPoint(-26.0F, -4.0F, 3.0F);
			lefthand2.addChild(cube_r30);
			setRotationAngle(cube_r30, 0.0F, 0.0F, -0.1309F);
			cube_r30.setTextureOffset(109, 47).addBox(-3.0F, -5.0F, -5.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);
			cube_r31 = new ModelRenderer(this);
			cube_r31.setRotationPoint(0.3875F, 7.1809F, -3.5652F);
			lefthand2.addChild(cube_r31);
			setRotationAngle(cube_r31, 1.1467F, -0.5497F, 0.04F);
			cube_r31.setTextureOffset(10, 98).addBox(-3.3117F, -5.5071F, -8.9F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r31.setTextureOffset(10, 98).addBox(-3.3117F, -1.5071F, -7.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r31.setTextureOffset(10, 98).addBox(-3.3117F, -8.5071F, -10.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r32 = new ModelRenderer(this);
			cube_r32.setRotationPoint(0.3875F, 7.1809F, -3.5652F);
			lefthand2.addChild(cube_r32);
			setRotationAngle(cube_r32, 1.4958F, -0.5497F, 0.04F);
			cube_r32.setTextureOffset(10, 98).addBox(-4.3117F, -14.5071F, -7.5F, 3.0F, 17.0F, 2.0F, 0.0F, false);
			cube_r32.setTextureOffset(25, 93).addBox(-5.3117F, -15.5071F, -5.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			cube_r33 = new ModelRenderer(this);
			cube_r33.setRotationPoint(-7.0F, 0.0F, 0.0F);
			lefthand2.addChild(cube_r33);
			setRotationAngle(cube_r33, -0.6109F, 0.0F, -0.3054F);
			cube_r33.setTextureOffset(25, 71).addBox(0.0F, -1.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, -34.0F, 6.0F);
			bone7.setTextureOffset(0, 74).addBox(-13.0F, -15.0F, 0.1F, 10.0F, 22.0F, 0.0F, 0.0F, true);
			bone7.setTextureOffset(0, 74).addBox(2.0F, -15.0F, 0.1F, 10.0F, 22.0F, 0.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			base.render(matrixStack, buffer, packedLight, packedOverlay);
			leg.render(matrixStack, buffer, packedLight, packedOverlay);
			bone6.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			righthand.render(matrixStack, buffer, packedLight, packedOverlay);
			lefthand2.render(matrixStack, buffer, packedLight, packedOverlay);
			bone7.render(matrixStack, buffer, packedLight, packedOverlay);
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
