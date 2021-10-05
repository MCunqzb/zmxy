// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGhost_gate extends EntityModel<Entity> {
	private final ModelRenderer kuang;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public ModelGhost_gate() {
		textureWidth = 160;
		textureHeight = 160;

		kuang = new ModelRenderer(this);
		kuang.setRotationPoint(0.0F, 24.0F, 0.0F);
		kuang.setTextureOffset(0, 14).addBox(-40.0F, -96.0F, -8.0F, 16.0F, 96.0F, 16.0F, 0.0F, false);
		kuang.setTextureOffset(0, 14).addBox(24.0F, -96.0F, -8.0F, 16.0F, 96.0F, 16.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -70.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6981F);
		cube_r1.setTextureOffset(93, 0).addBox(-4.0F, -53.0F, -9.0F, 12.0F, 18.0F, 18.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
		cube_r2.setTextureOffset(93, 0).addBox(-8.0F, -53.0F, -8.0F, 14.0F, 18.0F, 16.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
		cube_r3.setTextureOffset(66, 126).addBox(-8.0F, -53.0F, -8.0F, 16.0F, 18.0F, 16.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0873F);
		cube_r4.setTextureOffset(0, 126).addBox(-8.0F, -53.0F, -8.0F, 17.0F, 18.0F, 16.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.setTextureOffset(93, 0).addBox(-8.0F, -53.0F, -8.0F, 16.0F, 18.0F, 16.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 33.0F, 0.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.6981F);
		cube_r6.setTextureOffset(93, 0).addBox(-8.0F, -53.0F, -9.0F, 16.0F, 18.0F, 18.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-33.0F, -70.0F, -7.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(69.0F, -2.0F, 7.0F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2635F, 0.0349F, -0.3491F);
		cube_r7.setTextureOffset(104, 84).addBox(-5.0F, -6.0F, 3.0F, 6.0F, 36.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(69.0F, -2.0F, 7.0F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2635F, 0.0349F, -0.3491F);
		cube_r8.setTextureOffset(104, 84).addBox(-5.0F, -6.0F, -9.0F, 6.0F, 36.0F, 6.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 7.0F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.2635F, 0.0349F, 0.3491F);
		cube_r9.setTextureOffset(104, 84).addBox(-5.0F, -6.0F, 3.0F, 6.0F, 36.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 7.0F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2635F, 0.0349F, 0.3491F);
		cube_r10.setTextureOffset(104, 84).addBox(-5.0F, -6.0F, -9.0F, 6.0F, 36.0F, 6.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, -88.0F, -7.0F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
		cube_r11.setTextureOffset(137, 101).addBox(-34.0F, -2.0F, -7.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
		cube_r11.setTextureOffset(137, 101).addBox(-34.0F, -2.0F, 16.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 23.0F);
		bone3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.5236F);
		cube_r12.setTextureOffset(137, 101).addBox(29.0F, -3.0F, -7.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);
		cube_r12.setTextureOffset(137, 101).addBox(29.0F, -3.0F, -30.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, 0.0F, 7.0F);
		bone3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.1309F);
		cube_r13.setTextureOffset(144, 75).addBox(-10.0F, 8.0F, -12.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		cube_r13.setTextureOffset(144, 75).addBox(-10.0F, 8.0F, 8.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.0F, 0.0F, 27.0F);
		bone3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.1309F);
		cube_r14.setTextureOffset(144, 75).addBox(6.0F, 8.0F, -12.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		cube_r14.setTextureOffset(144, 75).addBox(6.0F, 8.0F, -32.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -74.0F, 0.0F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.5236F);
		cube_r15.setTextureOffset(104, 55).addBox(36.0F, 13.0F, -7.0F, 14.0F, 4.0F, 14.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.5236F);
		cube_r16.setTextureOffset(104, 55).addBox(-50.0F, 13.0F, -7.0F, 14.0F, 4.0F, 14.0F, 0.0F, true);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 16.0F, 0.0F);
		bone4.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.3491F);
		cube_r17.setTextureOffset(110, 37).addBox(40.0F, 1.0F, -7.0F, 11.0F, 4.0F, 14.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 16.0F, 0.0F);
		bone4.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
		cube_r18.setTextureOffset(110, 37).addBox(-51.0F, 1.0F, -7.0F, 11.0F, 4.0F, 14.0F, 0.0F, true);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -93.0F, 0.0F);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.2618F);
		cube_r19.setTextureOffset(71, 0).addBox(15.0F, -17.0F, -11.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);
		cube_r19.setTextureOffset(71, 0).addBox(15.0F, -17.0F, 8.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.2618F);
		cube_r20.setTextureOffset(71, 0).addBox(-22.0F, -17.0F, 8.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);
		cube_r20.setTextureOffset(71, 0).addBox(-22.0F, -17.0F, -11.0F, 7.0F, 31.0F, 2.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone6);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.6545F);
		cube_r21.setTextureOffset(64, 38).addBox(6.0F, 1.0F, -7.0F, 3.0F, 16.0F, 14.0F, 0.0F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.6545F);
		cube_r22.setTextureOffset(64, 38).addBox(-9.0F, 1.0F, -7.0F, 3.0F, 16.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		kuang.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}