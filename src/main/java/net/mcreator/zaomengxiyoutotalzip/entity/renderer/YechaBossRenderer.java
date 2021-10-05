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

import net.mcreator.zaomengxiyoutotalzip.entity.YechaBossEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class YechaBossRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(YechaBossEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelyechaBoss(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("zaomengxiyou:textures/yechaboss.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("zaomengxiyou:textures/yechabosslight.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelyechaBoss extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer tooth;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r1_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r2_r1;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r3_r1;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r4_r1;
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer letfarm;
		private final ModelRenderer leftarmup;
		private final ModelRenderer cube_r14;
		private final ModelRenderer leftarmdown;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer leftleg;
		private final ModelRenderer cube_r24;
		private final ModelRenderer rightleg;
		private final ModelRenderer cube_r25;
		private final ModelRenderer bodyforward;
		private final ModelRenderer cube_r26;
		private final ModelRenderer xuanzhuan;
		private final ModelRenderer cube_r27;
		private final ModelRenderer headpitch;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r5_r1;
		private final ModelRenderer cube_r5_r2;
		private final ModelRenderer cube_r5_r3;
		private final ModelRenderer cube_r5_r4;
		private final ModelRenderer cube_r5_r5;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r5_r6;
		private final ModelRenderer cube_r5_r7;
		private final ModelRenderer cube_r5_r8;
		private final ModelRenderer cube_r5_r9;
		private final ModelRenderer cube_r5_r10;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r5_r11;
		private final ModelRenderer cube_r5_r12;
		private final ModelRenderer cube_r5_r13;
		private final ModelRenderer cube_r5_r14;
		private final ModelRenderer cube_r5_r15;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r6_r1;
		private final ModelRenderer cube_r6_r2;
		private final ModelRenderer cube_r6_r3;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r6_r4;
		private final ModelRenderer cube_r6_r5;
		private final ModelRenderer cube_r6_r6;
		public ModelyechaBoss() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -13.0F, 3.0F);
			tooth = new ModelRenderer(this);
			tooth.setRotationPoint(0.0F, 0.0F, -3.0F);
			head.addChild(tooth);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
			tooth.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
			cube_r1_r1 = new ModelRenderer(this);
			cube_r1_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
			cube_r1.addChild(cube_r1_r1);
			setRotationAngle(cube_r1_r1, 0.1719F, 0.0026F, -0.0302F);
			cube_r1_r1.setTextureOffset(0, 17).addBox(-4.6199F, -8.421F, -3.8439F, 4.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -1.0F, 3.0F);
			tooth.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.1309F, -0.1745F, 0.0F);
			cube_r2_r1 = new ModelRenderer(this);
			cube_r2_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
			cube_r2.addChild(cube_r2_r1);
			setRotationAngle(cube_r2_r1, 0.043F, 0.001F, -0.0511F);
			cube_r2_r1.setTextureOffset(0, 45).addBox(-3.8378F, -8.2415F, -9.9087F, 3.0F, 6.0F, 7.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -1.0F, 3.0F);
			tooth.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, 0.1745F, 0.0F);
			cube_r3_r1 = new ModelRenderer(this);
			cube_r3_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
			cube_r3.addChild(cube_r3_r1);
			setRotationAngle(cube_r3_r1, 0.043F, -0.001F, 0.0511F);
			cube_r3_r1.setTextureOffset(0, 45).addBox(0.8378F, -8.2415F, -9.9087F, 3.0F, 6.0F, 7.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 3.0F);
			tooth.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
			cube_r4_r1 = new ModelRenderer(this);
			cube_r4_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
			cube_r4.addChild(cube_r4_r1);
			setRotationAngle(cube_r4_r1, 0.1719F, -0.0026F, 0.0302F);
			cube_r4_r1.setTextureOffset(0, 31).addBox(-0.3801F, -8.421F, -3.8439F, 5.0F, 7.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, -3.0F);
			head.addChild(bone);
			bone.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, 0.0F, 10.0F, 9.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -4.0F, 2.0F);
			body.setTextureOffset(23, 20).addBox(-4.0F, -9.0F, -1.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(29, 57).addBox(-5.0F, 7.0F, 0.0F, 10.0F, 5.0F, 4.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(1.0F, 2.4F, 1.0F);
			body.addChild(bone_r1);
			setRotationAngle(bone_r1, -0.0873F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(46, 15).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(1.0F, -6.0F, 1.0F);
			body.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.0436F, 0.0F, 0.0F);
			bone_r2.setTextureOffset(46, 15).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-3.0F, -4.0F, -2.0F);
			body.addChild(bone2);
			bone2.setTextureOffset(0, 74).addBox(-3.4899F, -3.7552F, 6.4037F, 13.0F, 4.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(47, 72).addBox(-2.4899F, -0.1552F, 6.2037F, 11.0F, 6.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(6, 68).addBox(0.0F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(31, 71).addBox(-2.0323F, 3.7837F, 1.0565F, 2.0F, 2.0F, 7.0F, 0.0F, false);
			bone2.setTextureOffset(31, 71).addBox(6.2677F, 3.7837F, 1.0565F, 2.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(6.0937F, 1.9526F, 0.4226F);
			bone2.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.2182F, 0.2182F, 0.0F);
			cube_r10.setTextureOffset(0, 68).addBox(0.0F, -1.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-0.1653F, 1.9053F, 0.9763F);
			bone2.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.2182F, -0.2182F, -0.0524F);
			cube_r11.setTextureOffset(0, 68).addBox(-2.0F, -1.169F, -0.5434F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.2182F, -0.2182F, 0.0F);
			cube_r12.setTextureOffset(0, 58).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 8.0F, 0.0F, true);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(6.0F, 0.0F, 0.0F);
			bone2.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.2182F, 0.2182F, 0.0F);
			cube_r13.setTextureOffset(0, 58).addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 8.0F, 0.0F, true);
			letfarm = new ModelRenderer(this);
			letfarm.setRotationPoint(6.0F, -7.0F, 4.0F);
			leftarmup = new ModelRenderer(this);
			leftarmup.setRotationPoint(0.0F, 0.0F, 0.0F);
			letfarm.addChild(leftarmup);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarmup.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 0.0F, -0.1745F);
			cube_r14.setTextureOffset(25, 40).addBox(0.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r14.setTextureOffset(68, 56).addBox(2.0F, -3.0F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
			cube_r14.setTextureOffset(54, 15).addBox(1.5F, -3.0F, -4.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r14.setTextureOffset(54, 15).addBox(1.5F, -3.0F, 2.0F, 2.0F, 11.0F, 1.0F, 0.0F, true);
			cube_r14.setTextureOffset(37, 39).addBox(1.5F, -4.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r14.setTextureOffset(37, 39).addBox(1.5F, 8.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			leftarmdown = new ModelRenderer(this);
			leftarmdown.setRotationPoint(0.7331F, 6.2999F, 0.0F);
			letfarm.addChild(leftarmdown);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftarmdown.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.0F, 0.0F, 0.0873F);
			cube_r15.setTextureOffset(92, 20).addBox(4.2168F, -1.4487F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r15.setTextureOffset(88, 14).addBox(4.2168F, -0.4487F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r15.setTextureOffset(84, 0).addBox(4.2168F, 0.5513F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			cube_r15.setTextureOffset(25, 40).addBox(0.2168F, -0.4487F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(4.5388F, 7.9773F, 3.0F);
			leftarmdown.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.2618F, 0.0F, 0.0873F);
			cube_r16.setTextureOffset(83, 44).addBox(-1.0F, 6.0F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
			cube_r16.setTextureOffset(83, 33).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(4.5388F, 7.9773F, -4.0F);
			leftarmdown.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.2618F, 0.0F, 0.0873F);
			cube_r17.setTextureOffset(83, 44).addBox(-1.0F, 6.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r17.setTextureOffset(80, 22).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(4.1527F, 0.9168F, 4.7321F);
			leftarmdown.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.0F, -1.0472F, 0.0873F);
			cube_r18.setTextureOffset(94, 34).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(5.1489F, 1.0039F, 3.0F);
			leftarmdown.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.0F, -0.5236F, 0.0873F);
			cube_r19.setTextureOffset(94, 24).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(4.1527F, 0.9168F, -5.7321F);
			leftarmdown.addChild(cube_r20);
			setRotationAngle(cube_r20, 0.0F, 1.2217F, 0.0873F);
			cube_r20.setTextureOffset(94, 34).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(5.1489F, 1.0039F, -4.0F);
			leftarmdown.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.0F, 0.5236F, 0.0873F);
			cube_r21.setTextureOffset(94, 24).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-6.0F, -7.0F, 4.0F);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(-3.8797F, 10.4856F, 2.0F);
			rightarm.addChild(cube_r22);
			setRotationAngle(cube_r22, -0.4363F, 0.0F, 0.1745F);
			cube_r22.setTextureOffset(72, 79).addBox(1.5F, 0.4F, -53.0F, 0.0F, 18.0F, 28.0F, 0.0F, false);
			cube_r22.setTextureOffset(100, 0).addBox(1.5F, 2.4F, 12.0F, 0.0F, 14.0F, 9.0F, 0.0F, false);
			cube_r22.setTextureOffset(0, 86).addBox(0.5F, 8.4F, -28.0F, 2.0F, 2.0F, 40.0F, 0.0F, false);
			cube_r22.setTextureOffset(76, 86).addBox(0.0F, 0.0F, -3.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
			rightarm.addChild(cube_r23);
			setRotationAngle(cube_r23, 0.0F, 0.0F, 0.1745F);
			cube_r23.setTextureOffset(88, 85).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(3.0F, 8.0F, 3.0F);
			leftleg.setTextureOffset(0, 100).addBox(-3.0F, 0.0F, -1.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
			leftleg.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.0F, 0.0F, -0.2618F);
			cube_r24.setTextureOffset(100, 42).addBox(1.0F, -1.0F, -2.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-3.0F, 8.0F, 4.0F);
			rightleg.setTextureOffset(0, 100).addBox(-2.0F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(0.0F, 0.0F, -1.0F);
			rightleg.addChild(cube_r25);
			setRotationAngle(cube_r25, 0.0F, 0.0F, 0.2618F);
			cube_r25.setTextureOffset(100, 42).addBox(-3.0F, -1.0F, -2.0F, 2.0F, 11.0F, 6.0F, 0.0F, true);
			bodyforward = new ModelRenderer(this);
			bodyforward.setRotationPoint(0.0F, 8.0F, 1.0F);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
			bodyforward.addChild(cube_r26);
			setRotationAngle(cube_r26, -0.1309F, 0.0F, 0.0F);
			cube_r26.setTextureOffset(108, 71).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 13.0F, 0.0F, 0.0F, false);
			xuanzhuan = new ModelRenderer(this);
			xuanzhuan.setRotationPoint(0.0F, -4.0F, 0.0F);
			setRotationAngle(xuanzhuan, 0.0F, 0.0F, 0.7854F);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
			xuanzhuan.addChild(cube_r27);
			setRotationAngle(cube_r27, 0.3927F, -0.3927F, 0.0F);
			cube_r27.setTextureOffset(61, 50).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			headpitch = new ModelRenderer(this);
			headpitch.setRotationPoint(0.0F, -13.0F, 3.0F);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(0.0F, 0.0F, -10.0F);
			headpitch.addChild(cube_r28);
			setRotationAngle(cube_r28, 0.2182F, 0.0F, 0.0F);
			cube_r28.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r28.setTextureOffset(0, 0).addBox(1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.4081F, -9.0F, -8.6642F);
			headpitch.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(52, 0).addBox(-1.5919F, 2.0F, 4.6642F, 4.0F, 4.0F, 10.0F, 0.0F, false);
			cube_r5_r1 = new ModelRenderer(this);
			cube_r5_r1.setRotationPoint(1.9081F, 17.9243F, 19.8554F);
			cube_r5.addChild(cube_r5_r1);
			setRotationAngle(cube_r5_r1, -0.9163F, 0.0F, 0.0F);
			cube_r5_r1.setTextureOffset(68, 40).addBox(-2.5F, -2.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r5_r2 = new ModelRenderer(this);
			cube_r5_r2.setRotationPoint(2.4081F, 15.1526F, 18.7074F);
			cube_r5.addChild(cube_r5_r2);
			setRotationAngle(cube_r5_r2, -1.1781F, 0.0F, 0.0F);
			cube_r5_r2.setTextureOffset(68, 35).addBox(-3.5F, -2.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r5_r3 = new ModelRenderer(this);
			cube_r5_r3.setRotationPoint(2.4081F, 9.9973F, 20.264F);
			cube_r5.addChild(cube_r5_r3);
			setRotationAngle(cube_r5_r3, -1.4835F, 0.0F, 0.0F);
			cube_r5_r3.setTextureOffset(62, 28).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r4 = new ModelRenderer(this);
			cube_r5_r4.setRotationPoint(2.4081F, 5.378F, 18.3506F);
			cube_r5.addChild(cube_r5_r4);
			setRotationAngle(cube_r5_r4, -1.1781F, 0.0F, 0.0F);
			cube_r5_r4.setTextureOffset(62, 21).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r5 = new ModelRenderer(this);
			cube_r5_r5.setRotationPoint(2.4081F, 6.8525F, 16.9994F);
			cube_r5.addChild(cube_r5_r5);
			setRotationAngle(cube_r5_r5, -0.7418F, 0.0F, 0.0F);
			cube_r5_r5.setTextureOffset(62, 14).addBox(-4.0F, -2.0F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.4081F, -9.0F, 1.3358F);
			headpitch.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
			cube_r8.setTextureOffset(52, 0).addBox(-1.5919F, -0.5882F, -4.9951F, 4.0F, 4.0F, 10.0F, 0.0F, false);
			cube_r5_r6 = new ModelRenderer(this);
			cube_r5_r6.setRotationPoint(1.9081F, 15.3361F, 10.1962F);
			cube_r8.addChild(cube_r5_r6);
			setRotationAngle(cube_r5_r6, -0.9163F, 0.0F, 0.0F);
			cube_r5_r6.setTextureOffset(68, 40).addBox(-2.5F, -2.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r5_r7 = new ModelRenderer(this);
			cube_r5_r7.setRotationPoint(2.4081F, 12.5644F, 9.0481F);
			cube_r8.addChild(cube_r5_r7);
			setRotationAngle(cube_r5_r7, -1.1781F, 0.0F, 0.0F);
			cube_r5_r7.setTextureOffset(68, 35).addBox(-3.5F, -2.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r5_r8 = new ModelRenderer(this);
			cube_r5_r8.setRotationPoint(2.4081F, 7.4092F, 10.6047F);
			cube_r8.addChild(cube_r5_r8);
			setRotationAngle(cube_r5_r8, -1.4835F, 0.0F, 0.0F);
			cube_r5_r8.setTextureOffset(62, 28).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r9 = new ModelRenderer(this);
			cube_r5_r9.setRotationPoint(2.4081F, 2.7898F, 8.6913F);
			cube_r8.addChild(cube_r5_r9);
			setRotationAngle(cube_r5_r9, -1.1781F, 0.0F, 0.0F);
			cube_r5_r9.setTextureOffset(62, 21).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r10 = new ModelRenderer(this);
			cube_r5_r10.setRotationPoint(2.4081F, 4.2643F, 7.3401F);
			cube_r8.addChild(cube_r5_r10);
			setRotationAngle(cube_r5_r10, -0.7418F, 0.0F, 0.0F);
			cube_r5_r10.setTextureOffset(62, 14).addBox(-4.0F, -2.0F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.4081F, -9.0F, 1.3358F);
			headpitch.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
			cube_r9.setTextureOffset(52, 0).addBox(-1.5919F, -0.5882F, -4.9951F, 4.0F, 4.0F, 10.0F, 0.0F, false);
			cube_r5_r11 = new ModelRenderer(this);
			cube_r5_r11.setRotationPoint(1.9081F, 15.3361F, 10.1962F);
			cube_r9.addChild(cube_r5_r11);
			setRotationAngle(cube_r5_r11, -0.9163F, 0.0F, 0.0F);
			cube_r5_r11.setTextureOffset(68, 40).addBox(-2.5F, -2.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r5_r12 = new ModelRenderer(this);
			cube_r5_r12.setRotationPoint(2.4081F, 12.5644F, 9.0481F);
			cube_r9.addChild(cube_r5_r12);
			setRotationAngle(cube_r5_r12, -1.1781F, 0.0F, 0.0F);
			cube_r5_r12.setTextureOffset(68, 35).addBox(-3.5F, -2.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r5_r13 = new ModelRenderer(this);
			cube_r5_r13.setRotationPoint(2.4081F, 7.4092F, 10.6047F);
			cube_r9.addChild(cube_r5_r13);
			setRotationAngle(cube_r5_r13, -1.4835F, 0.0F, 0.0F);
			cube_r5_r13.setTextureOffset(62, 28).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r14 = new ModelRenderer(this);
			cube_r5_r14.setRotationPoint(2.4081F, 2.7898F, 8.6913F);
			cube_r9.addChild(cube_r5_r14);
			setRotationAngle(cube_r5_r14, -1.1781F, 0.0F, 0.0F);
			cube_r5_r14.setTextureOffset(62, 21).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r5_r15 = new ModelRenderer(this);
			cube_r5_r15.setRotationPoint(2.4081F, 4.2643F, 7.3401F);
			cube_r9.addChild(cube_r5_r15);
			setRotationAngle(cube_r5_r15, -0.7418F, 0.0F, 0.0F);
			cube_r5_r15.setTextureOffset(62, 14).addBox(-4.0F, -2.0F, -5.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.4081F, -7.0F, -8.6642F);
			headpitch.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(36, 0).addBox(-5.5919F, 6.0F, 2.9322F, 1.0F, 3.0F, 4.0F, 0.0F, true);
			cube_r6_r1 = new ModelRenderer(this);
			cube_r6_r1.setRotationPoint(-5.5919F, 7.2743F, 16.1531F);
			cube_r7.addChild(cube_r6_r1);
			setRotationAngle(cube_r6_r1, 0.7854F, 0.0F, 0.0F);
			cube_r6_r1.setTextureOffset(46, 0).addBox(0.0F, -2.9319F, -0.5176F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r6_r2 = new ModelRenderer(this);
			cube_r6_r2.setRotationPoint(6.4081F, 9.81F, 14.3405F);
			cube_r7.addChild(cube_r6_r2);
			setRotationAngle(cube_r6_r2, 0.4363F, 0.0F, 0.0F);
			cube_r6_r2.setTextureOffset(36, 14).addBox(-12.0F, -5.1704F, -2.4327F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r6_r3 = new ModelRenderer(this);
			cube_r6_r3.setRotationPoint(-4.5919F, 10.0F, 8.6642F);
			cube_r7.addChild(cube_r6_r3);
			setRotationAngle(cube_r6_r3, 0.2618F, 0.0F, 0.0F);
			cube_r6_r3.setTextureOffset(36, 7).addBox(-1.0F, -4.4142F, -1.4142F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.4081F, -7.0F, -8.6642F);
			headpitch.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(36, 0).addBox(5.4081F, 6.0F, 2.9322F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			cube_r6_r4 = new ModelRenderer(this);
			cube_r6_r4.setRotationPoint(6.4081F, 7.2743F, 16.1531F);
			cube_r6.addChild(cube_r6_r4);
			setRotationAngle(cube_r6_r4, 0.7854F, 0.0F, 0.0F);
			cube_r6_r4.setTextureOffset(46, 0).addBox(-1.0F, -2.9319F, -0.5176F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r6_r5 = new ModelRenderer(this);
			cube_r6_r5.setRotationPoint(6.4081F, 9.81F, 14.3405F);
			cube_r6.addChild(cube_r6_r5);
			setRotationAngle(cube_r6_r5, 0.4363F, 0.0F, 0.0F);
			cube_r6_r5.setTextureOffset(36, 14).addBox(-1.0F, -5.1704F, -2.4327F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r6_r6 = new ModelRenderer(this);
			cube_r6_r6.setRotationPoint(6.4081F, 10.0F, 8.6642F);
			cube_r6.addChild(cube_r6_r6);
			setRotationAngle(cube_r6_r6, 0.2618F, 0.0F, 0.0F);
			cube_r6_r6.setTextureOffset(36, 7).addBox(-1.0F, -4.4142F, -1.4142F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			letfarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			bodyforward.render(matrixStack, buffer, packedLight, packedOverlay);
			xuanzhuan.render(matrixStack, buffer, packedLight, packedOverlay);
			headpitch.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.headpitch.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.xuanzhuan.rotateAngleY = f2 / 20.f;
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.letfarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
