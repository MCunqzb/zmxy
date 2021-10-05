// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelxueahaimojia extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;

	public Modelxueahaimojia() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 0.0F);
		body.setTextureOffset(0, 42).addBox(2.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 50).addBox(-4.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(34, 0).addBox(-4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(46, 0).addBox(4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 70).addBox(2.0F, 0.0F, -3.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 70).addBox(-6.0F, 0.0F, -3.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 12.0F, 1.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.setTextureOffset(0, 66).addBox(-0.1F, 2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 12.0F, 1.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
		cube_r2.setTextureOffset(0, 66).addBox(0.0F, 2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 12.0F, -3.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 70).addBox(-2.0F, 0.0F, -0.1F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 4.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(112, 116).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(-1.3764F, 15.9197F, 0.0F);
		body.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.0F, 0.0F, 0.3927F);
		cube_r4_r1.setTextureOffset(30, 41).addBox(-4.0F, -3.0F, -3.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(1.4525F, 16.3024F, 0.0F);
		body.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, 0.0F, -0.3927F);
		cube_r3_r1.setTextureOffset(30, 41).addBox(4.0F, -3.0F, -3.0F, 0.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 15.537F, -1.3003F);
		body.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.3927F, 0.0F, 0.0F);
		cube_r2_r1.setTextureOffset(31, 31).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, 15.9867F, 1.5488F);
		body.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1_r1.setTextureOffset(51, 33).addBox(-4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 9.0F, 0.0F);
		leftarm.setTextureOffset(63, 70).addBox(-1.0F, -3.0F, -3.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		leftarm.setTextureOffset(72, 84).addBox(4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(72, 84).addBox(4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 9.0F, 0.0F);
		rightarm.setTextureOffset(103, 69).addBox(-4.0F, -3.0F, -3.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		rightarm.setTextureOffset(72, 84).addBox(-5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(72, 84).addBox(-5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}