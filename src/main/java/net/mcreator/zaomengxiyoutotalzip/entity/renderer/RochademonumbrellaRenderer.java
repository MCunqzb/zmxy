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

import net.mcreator.zaomengxiyoutotalzip.entity.RochademonumbrellaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RochademonumbrellaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RochademonumbrellaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRocha_demon_umbrella(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/rocha_demon_umbrella.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRocha_demon_umbrella extends EntityModel<Entity> {
		private final ModelRenderer Rochademonumbrella;
		private final ModelRenderer bone;
		private final ModelRenderer hexadecagon;
		private final ModelRenderer hexadecagon_r1;
		private final ModelRenderer hexadecagon_r2;
		private final ModelRenderer hexadecagon_r3;
		private final ModelRenderer hexadecagon_r4;
		private final ModelRenderer hexadecagon1;
		private final ModelRenderer hexadecagon_r5;
		private final ModelRenderer hexadecagon_r6;
		private final ModelRenderer hexadecagon_r7;
		private final ModelRenderer hexadecagon_r8;
		private final ModelRenderer hexadecagon2;
		private final ModelRenderer hexadecagon_r9;
		private final ModelRenderer hexadecagon_r10;
		private final ModelRenderer hexadecagon_r11;
		private final ModelRenderer hexadecagon_r12;
		private final ModelRenderer hexadecagon3;
		private final ModelRenderer hexadecagon_r13;
		private final ModelRenderer hexadecagon_r14;
		private final ModelRenderer hexadecagon_r15;
		private final ModelRenderer hexadecagon_r16;
		private final ModelRenderer hexadecagon4;
		private final ModelRenderer hexadecagon_r17;
		private final ModelRenderer hexadecagon_r18;
		private final ModelRenderer hexadecagon_r19;
		private final ModelRenderer hexadecagon_r20;
		public ModelRocha_demon_umbrella() {
			textureWidth = 64;
			textureHeight = 32;
			Rochademonumbrella = new ModelRenderer(this);
			Rochademonumbrella.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			Rochademonumbrella.addChild(bone);
			bone.setTextureOffset(52, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(48, 26).addBox(-1.5F, -22.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(60, 0).addBox(-0.5F, -26.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);
			hexadecagon = new ModelRenderer(this);
			hexadecagon.setRotationPoint(8.0F, 0.0F, -8.0F);
			Rochademonumbrella.addChild(hexadecagon);
			hexadecagon.setTextureOffset(0, 2).addBox(-8.9946F, -10.5F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon.setTextureOffset(0, 2).addBox(-8.9946F, -10.5F, 12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon.setTextureOffset(0, 2).addBox(-4.0F, -10.5F, 7.0054F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon.setTextureOffset(0, 2).addBox(-13.0F, -10.5F, 7.0054F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r1 = new ModelRenderer(this);
			hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon.addChild(hexadecagon_r1);
			setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
			hexadecagon_r1.setTextureOffset(0, 2).addBox(-5.0F, -2.5F, -0.9946F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r1.setTextureOffset(0, 2).addBox(4.0F, -2.5F, -0.9946F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r1.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r1.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r2 = new ModelRenderer(this);
			hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon.addChild(hexadecagon_r2);
			setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
			hexadecagon_r2.setTextureOffset(0, 2).addBox(-5.0F, -2.5F, -0.9946F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r2.setTextureOffset(0, 2).addBox(4.0F, -2.5F, -0.9946F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r2.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r2.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r3 = new ModelRenderer(this);
			hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon.addChild(hexadecagon_r3);
			setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
			hexadecagon_r3.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r3.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r4 = new ModelRenderer(this);
			hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon.addChild(hexadecagon_r4);
			setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
			hexadecagon_r4.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r4.setTextureOffset(0, 2).addBox(-0.9946F, -2.5F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon1 = new ModelRenderer(this);
			hexadecagon1.setRotationPoint(8.0F, -3.0F, -8.0F);
			Rochademonumbrella.addChild(hexadecagon1);
			hexadecagon1.setTextureOffset(0, 6).addBox(-8.7956F, -11.5F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon1.setTextureOffset(0, 6).addBox(-8.7956F, -11.5F, 11.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon1.setTextureOffset(0, 6).addBox(-5.0F, -11.5F, 7.2044F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon1.setTextureOffset(0, 6).addBox(-12.0F, -11.5F, 7.2044F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r5 = new ModelRenderer(this);
			hexadecagon_r5.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon1.addChild(hexadecagon_r5);
			setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
			hexadecagon_r5.setTextureOffset(0, 6).addBox(-4.0F, -3.5F, -0.7956F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r5.setTextureOffset(0, 6).addBox(3.0F, -3.5F, -0.7956F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r5.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r5.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r6 = new ModelRenderer(this);
			hexadecagon_r6.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon1.addChild(hexadecagon_r6);
			setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
			hexadecagon_r6.setTextureOffset(0, 6).addBox(-4.0F, -3.5F, -0.7956F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r6.setTextureOffset(0, 6).addBox(3.0F, -3.5F, -0.7956F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r6.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r6.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r7 = new ModelRenderer(this);
			hexadecagon_r7.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon1.addChild(hexadecagon_r7);
			setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
			hexadecagon_r7.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r7.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r8 = new ModelRenderer(this);
			hexadecagon_r8.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon1.addChild(hexadecagon_r8);
			setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
			hexadecagon_r8.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon_r8.setTextureOffset(0, 6).addBox(-0.7956F, -3.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hexadecagon2 = new ModelRenderer(this);
			hexadecagon2.setRotationPoint(8.0F, -7.0F, -8.0F);
			Rochademonumbrella.addChild(hexadecagon2);
			hexadecagon2.setTextureOffset(0, 36).addBox(-8.6962F, -10.5F, 4.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon2.setTextureOffset(0, 36).addBox(-8.6962F, -10.5F, 10.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon2.setTextureOffset(0, 36).addBox(-5.5F, -10.5F, 7.3038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon2.setTextureOffset(0, 36).addBox(-11.5F, -10.5F, 7.3038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r9 = new ModelRenderer(this);
			hexadecagon_r9.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon2.addChild(hexadecagon_r9);
			setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
			hexadecagon_r9.setTextureOffset(0, 36).addBox(-3.5F, -2.5F, -0.6962F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r9.setTextureOffset(0, 36).addBox(2.5F, -2.5F, -0.6962F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r9.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r9.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r10 = new ModelRenderer(this);
			hexadecagon_r10.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon2.addChild(hexadecagon_r10);
			setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
			hexadecagon_r10.setTextureOffset(0, 36).addBox(-3.5F, -2.5F, -0.6962F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r10.setTextureOffset(0, 36).addBox(2.5F, -2.5F, -0.6962F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r10.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r10.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r11 = new ModelRenderer(this);
			hexadecagon_r11.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon2.addChild(hexadecagon_r11);
			setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
			hexadecagon_r11.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r11.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r12 = new ModelRenderer(this);
			hexadecagon_r12.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon2.addChild(hexadecagon_r12);
			setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
			hexadecagon_r12.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon_r12.setTextureOffset(0, 36).addBox(-0.6962F, -2.5F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			hexadecagon3 = new ModelRenderer(this);
			hexadecagon3.setRotationPoint(8.0F, -10.0F, -8.0F);
			Rochademonumbrella.addChild(hexadecagon3);
			hexadecagon3.setTextureOffset(0, 11).addBox(-8.5967F, -8.5F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon3.setTextureOffset(0, 11).addBox(-8.5967F, -8.5F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon3.setTextureOffset(0, 11).addBox(-6.0F, -8.5F, 7.4033F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon3.setTextureOffset(0, 11).addBox(-11.0F, -8.5F, 7.4033F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r13 = new ModelRenderer(this);
			hexadecagon_r13.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon3.addChild(hexadecagon_r13);
			setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
			hexadecagon_r13.setTextureOffset(0, 11).addBox(-3.0F, -0.5F, -0.5967F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r13.setTextureOffset(0, 11).addBox(2.0F, -0.5F, -0.5967F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r13.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r13.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r14 = new ModelRenderer(this);
			hexadecagon_r14.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon3.addChild(hexadecagon_r14);
			setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
			hexadecagon_r14.setTextureOffset(0, 11).addBox(-3.0F, -0.5F, -0.5967F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r14.setTextureOffset(0, 11).addBox(2.0F, -0.5F, -0.5967F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r14.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r14.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r15 = new ModelRenderer(this);
			hexadecagon_r15.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon3.addChild(hexadecagon_r15);
			setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
			hexadecagon_r15.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r15.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r16 = new ModelRenderer(this);
			hexadecagon_r16.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon3.addChild(hexadecagon_r16);
			setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
			hexadecagon_r16.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r16.setTextureOffset(0, 11).addBox(-0.5967F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon4 = new ModelRenderer(this);
			hexadecagon4.setRotationPoint(8.0F, -11.0F, -8.0F);
			Rochademonumbrella.addChild(hexadecagon4);
			hexadecagon4.setTextureOffset(1, 14).addBox(-8.4973F, -8.5F, 5.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon4.setTextureOffset(1, 14).addBox(-8.4973F, -8.5F, 9.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon4.setTextureOffset(1, 14).addBox(-6.5F, -8.5F, 7.5027F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon4.setTextureOffset(1, 14).addBox(-10.5F, -8.5F, 7.5027F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			hexadecagon_r17 = new ModelRenderer(this);
			hexadecagon_r17.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon4.addChild(hexadecagon_r17);
			setRotationAngle(hexadecagon_r17, 0.0F, -0.3927F, 0.0F);
			hexadecagon_r17.setTextureOffset(1, 14).addBox(-2.5F, -0.5F, -0.4973F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			hexadecagon_r17.setTextureOffset(1, 14).addBox(1.5F, -0.5F, -0.4973F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			hexadecagon_r17.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r17.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r18 = new ModelRenderer(this);
			hexadecagon_r18.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon4.addChild(hexadecagon_r18);
			setRotationAngle(hexadecagon_r18, 0.0F, 0.3927F, 0.0F);
			hexadecagon_r18.setTextureOffset(1, 14).addBox(-2.5F, -0.5F, -0.4973F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			hexadecagon_r18.setTextureOffset(1, 14).addBox(1.5F, -0.5F, -0.4973F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			hexadecagon_r18.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r18.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r19 = new ModelRenderer(this);
			hexadecagon_r19.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon4.addChild(hexadecagon_r19);
			setRotationAngle(hexadecagon_r19, 0.0F, -0.7854F, 0.0F);
			hexadecagon_r19.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r19.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r20 = new ModelRenderer(this);
			hexadecagon_r20.setRotationPoint(-8.0F, -8.0F, 8.0F);
			hexadecagon4.addChild(hexadecagon_r20);
			setRotationAngle(hexadecagon_r20, 0.0F, 0.7854F, 0.0F);
			hexadecagon_r20.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			hexadecagon_r20.setTextureOffset(1, 14).addBox(-0.4973F, -0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rochademonumbrella.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rochademonumbrella.rotateAngleY = f2 / 20.f;
		}
	}
}
