// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwangchuanship extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modelwangchuanship() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 10.0F, 6.0F);
		bone.setTextureOffset(0, 0).addBox(-14.0F, 11.0F, -24.0F, 29.0F, 3.0F, 34.0F, 0.0F, false);
		bone.setTextureOffset(0, 38).addBox(15.0F, -2.0F, -24.0F, 2.0F, 13.0F, 34.0F, 0.0F, false);
		bone.setTextureOffset(0, 38).addBox(-16.0F, -2.0F, -24.0F, 2.0F, 13.0F, 34.0F, 0.0F, false);
		bone.setTextureOffset(0, 92).addBox(-14.0F, -2.0F, 8.0F, 29.0F, 13.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(8, 110).addBox(-14.0F, -2.0F, -28.0F, 29.0F, 13.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(16.0F, 8.0F, -17.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -37.6583F, -12.4843F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(78, 113).addBox(-3.0F, 4.9851F, 1.9471F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -39.9755F, -6.1832F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(89, 113).addBox(-1.0F, -2.0F, -13.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -32.7594F, 4.8558F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0036F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(120, 74).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(120, 92).addBox(-2.0F, -34.0F, -1.0F, 2.0F, 34.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(16.0F, -15.0F, -25.0F);
		bone3.setTextureOffset(108, 121).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(84, 101).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		bone3.setTextureOffset(101, 103).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(100, 108).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(86, 108).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
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