// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelxuanwujia extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;

	public Modelxuanwujia() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 0.0F);
		body.setTextureOffset(0, 42).addBox(2.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(120, 31).addBox(3.0F, -3.0F, 4.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(120, 40).addBox(-6.0F, -3.0F, 4.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 53).addBox(-4.0F, 3.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 23).addBox(-5.0F, -7.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 49).addBox(2.0F, 3.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 16).addBox(3.0F, -7.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 9).addBox(-4.0F, -8.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(124, 0).addBox(-3.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(124, 0).addBox(2.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(122, 13).addBox(2.0F, -8.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 50).addBox(-4.0F, -0.1F, -3.0F, 2.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(34, 0).addBox(-4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(46, 0).addBox(4.0F, 0.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 12.0F, 3.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(51, 33).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 12.0F, -2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(31, 31).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(4.0F, 12.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
		cube_r3.setTextureOffset(30, 41).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.0F, 12.0F, 0.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.setTextureOffset(45, 42).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 8.0F, 0.0F);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 8.0F, 0.0F);

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
	}
}