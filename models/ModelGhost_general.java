// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGhost_general extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer toward1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer toward;
	private final ModelRenderer cube_r4;
	private final ModelRenderer back;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer headpitch;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public ModelGhost_general() {
		textureWidth = 80;
		textureHeight = 80;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 14.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 7.0F, -2.0F);
		body.addChild(bone);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 0.0F, 2.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0175F);
		cube_r1.setTextureOffset(13, 30).addBox(0.0F, 0.0F, -2.0F, 0.0F, 8.0F, 5.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 0.0F, 2.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0262F);
		cube_r2.setTextureOffset(13, 30).addBox(0.0F, 0.0F, -2.0F, 0.0F, 8.0F, 5.0F, 0.0F, false);

		toward1 = new ModelRenderer(this);
		toward1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(toward1);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		toward1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 35).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 10.0F, 0.0F, 0.0F, false);

		toward = new ModelRenderer(this);
		toward.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(toward);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		toward.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0087F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(8, 35).addBox(-4.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 0.0F, true);
		cube_r4.setTextureOffset(8, 35).addBox(2.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone.addChild(back);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		back.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(23, 35).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 2.0F, 0.0F);
		leftarm.setTextureOffset(33, 0).addBox(0.0F, -2.0F, -1.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.1236F, -0.7596F, -0.1436F);
		leftarm.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1298F, -0.7769F, 0.5331F);
		cube_r6.setTextureOffset(46, 14).addBox(9.0F, -3.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0161F, -0.3732F, -0.1125F);
		leftarm.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0869F, -0.7816F, 0.4722F);
		cube_r7.setTextureOffset(62, 14).addBox(4.0F, -3.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.7854F, 0.3491F);
		cube_r8.setTextureOffset(58, 19).addBox(-2.0F, -4.0F, -2.0F, 6.0F, 2.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(bone2);
		bone2.setTextureOffset(21, 16).addBox(1.0F, 10.7F, 8.4F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(0, 45).addBox(1.0F, 9.0F, -3.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone2.setTextureOffset(19, 43).addBox(1.0F, 7.0F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(23, 44).addBox(1.0F, 8.0F, -6.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(30, 44).addBox(1.0F, 7.8F, -10.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(25, 52).addBox(1.0F, 7.6F, -17.0F, 1.0F, 5.0F, 7.0F, 0.0F, false);
		bone2.setTextureOffset(44, 51).addBox(1.0F, 7.2F, -23.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		bone2.setTextureOffset(16, 49).addBox(1.0F, 6.7F, -24.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(24, 49).addBox(1.0F, 6.2F, -25.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(16, 56).addBox(1.0F, 5.9F, -26.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(20, 56).addBox(1.0F, 5.3F, -27.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -0.8253F, 3.3194F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(2, 53).addBox(1.0F, 9.0F, 4.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(33, 0).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 13.0F, 3.0F, 0.0F, true);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.2243F, -1.0008F, -0.1315F);
		rightarm.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1298F, 0.7769F, -0.5331F);
		cube_r10.setTextureOffset(46, 14).addBox(-15.0F, -3.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, true);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.0808F, -0.5352F, -0.1071F);
		rightarm.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0869F, 0.7816F, -0.4722F);
		cube_r11.setTextureOffset(62, 14).addBox(-11.0F, -3.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, true);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.7854F, -0.3491F);
		cube_r12.setTextureOffset(58, 19).addBox(-6.0F, -4.0F, -2.0F, 6.0F, 2.0F, 5.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.setTextureOffset(46, 0).addBox(-2.0F, 2.0F, -1.5F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.setTextureOffset(46, 0).addBox(-2.0F, 2.0F, -1.5F, 4.0F, 10.0F, 4.0F, 0.0F, true);

		headpitch = new ModelRenderer(this);
		headpitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		headpitch.setTextureOffset(0, 69).addBox(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.0F, -5.0F, 1.0F);
		headpitch.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
		cube_r13.setTextureOffset(35, 16).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, true);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.0F, -5.0F, 1.0F);
		headpitch.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.3927F, 0.0F);
		cube_r14.setTextureOffset(35, 16).addBox(1.0F, -4.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.0F, -4.0F, 4.0F);
		headpitch.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.2182F, 0.0F);
		cube_r15.setTextureOffset(0, 73).addBox(-2.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.0F, -4.0F, 4.0F);
		headpitch.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.2182F, 0.0F);
		cube_r16.setTextureOffset(0, 73).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -5.0F, 4.0F);
		headpitch.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(0, 73).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, -3.0F, 4.0F);
		headpitch.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(0, 73).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -8.0F, 1.0F);
		headpitch.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.48F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(64, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -8.0F, 0.0F);
		headpitch.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.2182F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(62, 8).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		headpitch.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.headpitch.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.back.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.toward1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.toward.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}