// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaishuangzhongjia extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r1_r1;
	private final ModelRenderer Body_r1_r2;
	private final ModelRenderer Body_r1_r3;
	private final ModelRenderer Body_r1_r4;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer Body_r7;
	private final ModelRenderer Body_r7_r1;
	private final ModelRenderer Body_r8;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArm_r3;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelbaishuangzhongjia() {
		textureWidth = 64;
		textureHeight = 40;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(0, 32).addBox(-4.0F, 4.0F, -4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 7.9439F, -16.0061F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, -1.3526F, 0.0F, 0.0F);

		Body_r1_r1 = new ModelRenderer(this);
		Body_r1_r1.setRotationPoint(-0.7F, -18.9439F, 1.0061F);
		Body_r1.addChild(Body_r1_r1);
		setRotationAngle(Body_r1_r1, -0.8777F, -0.3085F, -0.247F);
		Body_r1_r1.setTextureOffset(19, 34).addBox(-3.0F, -13.0F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		Body_r1_r2 = new ModelRenderer(this);
		Body_r1_r2.setRotationPoint(-0.7F, -18.9439F, 1.0061F);
		Body_r1.addChild(Body_r1_r2);
		setRotationAngle(Body_r1_r2, -0.8777F, 0.3085F, 0.247F);
		Body_r1_r2.setTextureOffset(19, 34).addBox(3.0F, -13.0F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		Body_r1_r3 = new ModelRenderer(this);
		Body_r1_r3.setRotationPoint(0.0F, -18.9439F, 1.0061F);
		Body_r1.addChild(Body_r1_r3);
		setRotationAngle(Body_r1_r3, -0.8777F, -0.3085F, -0.247F);
		Body_r1_r3.setTextureOffset(56, 0).addBox(-4.0F, -9.0F, 0.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		Body_r1_r4 = new ModelRenderer(this);
		Body_r1_r4.setRotationPoint(0.0F, -18.9439F, 1.0061F);
		Body_r1.addChild(Body_r1_r4);
		setRotationAngle(Body_r1_r4, -0.8777F, 0.3085F, 0.247F);
		Body_r1_r4.setTextureOffset(56, 0).addBox(2.0F, -9.0F, 0.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(0.0F, 5.0F, 3.0F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, -1.2217F, 0.0F, 0.0F);
		Body_r2.setTextureOffset(56, 0).addBox(-4.0F, -10.9647F, 0.1321F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		Body_r2.setTextureOffset(56, 0).addBox(2.0F, -10.9647F, 0.1321F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 20.7846F, -12.0F);
		Body.addChild(Body_r3);
		setRotationAngle(Body_r3, -0.5236F, 0.0F, 0.0F);
		Body_r3.setTextureOffset(40, 0).addBox(-5.0F, -29.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		Body_r3.setTextureOffset(40, 0).addBox(1.0F, -29.0F, 1.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		Body_r3.setTextureOffset(56, 0).addBox(2.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, true);
		Body_r3.setTextureOffset(56, 0).addBox(-4.0F, -37.0F, 2.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 16.732F, 16.5885F);
		Body.addChild(Body_r4);
		setRotationAngle(Body_r4, 1.0472F, 0.0F, 0.0F);
		Body_r4.setTextureOffset(24, 0).addBox(2.5F, -19.8F, 18.4F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Body_r4.setTextureOffset(24, 0).addBox(-3.5F, -19.8F, 18.4F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(0.0F, 23.5984F, 6.2776F);
		Body.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.3491F, 0.0F, 0.0F);
		Body_r5.setTextureOffset(24, 0).addBox(-3.5F, -18.081F, 12.9738F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Body_r5.setTextureOffset(24, 0).addBox(2.5F, -18.081F, 12.9738F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(0.0F, 24.0061F, 3.9439F);
		Body.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.2182F, 0.0F, 0.0F);

		Body_r7 = new ModelRenderer(this);
		Body_r7.setRotationPoint(0.0F, 23.7947F, -3.1326F);
		Body.addChild(Body_r7);
		setRotationAngle(Body_r7, -0.1309F, 0.0F, 0.0F);

		Body_r7_r1 = new ModelRenderer(this);
		Body_r7_r1.setRotationPoint(0.0F, -21.7947F, -2.8674F);
		Body_r7.addChild(Body_r7_r1);
		setRotationAngle(Body_r7_r1, -0.5672F, 0.0F, 0.0F);
		Body_r7_r1.setTextureOffset(0, 0).addBox(-4.0F, -0.2053F, 0.0674F, 8.0F, 6.0F, 0.0F, 0.0F, false);

		Body_r8 = new ModelRenderer(this);
		Body_r8.setRotationPoint(0.0F, 24.3386F, -2.1289F);
		Body.addChild(Body_r8);
		setRotationAngle(Body_r8, -0.1745F, 0.0F, 0.0F);
		Body_r8.setTextureOffset(24, 8).addBox(-3.0F, -12.0F, -3.1F, 6.0F, 7.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(7.8288F, 21.1592F, 0.0F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.1309F);
		RightArm_r1.setTextureOffset(16, 0).addBox(-8.2883F, -28.7446F, 1.3624F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(2.0966F, 22.3814F, -1.9182F);
		RightArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, -0.0873F, 0.0F, 0.1309F);
		RightArm_r2.setTextureOffset(16, 0).addBox(-5.6288F, -28.9576F, 0.5387F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(5.9541F, 21.7612F, 0.0F);
		RightArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.0436F);
		RightArm_r3.setTextureOffset(16, 0).addBox(-8.7944F, -26.8152F, -1.6376F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-5.949F, 21.5566F, -1.1523F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, -0.0524F, 0.0F, 0.0436F);
		LeftArm_r1.setTextureOffset(16, 0).addBox(7.0862F, -27.9829F, 0.9895F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(-3.0535F, 22.6334F, 1.7252F);
		LeftArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0785F, 0.0F, -0.0873F);
		LeftArm_r2.setTextureOffset(16, 0).addBox(4.0332F, -28.1767F, 2.0395F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		LeftArm_r3 = new ModelRenderer(this);
		LeftArm_r3.setRotationPoint(-5.0F, 21.9866F, 0.7676F);
		LeftArm.addChild(LeftArm_r3);
		setRotationAngle(LeftArm_r3, 0.0349F, 0.0F, 0.0F);
		LeftArm_r3.setTextureOffset(16, 0).addBox(6.9F, -27.0594F, -1.4838F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
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