// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelxia extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leftarm;
	private final ModelRenderer rifhtarm;

	public Modelxia() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -1.0F);
		head.setTextureOffset(104, 0).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(108, 20).addBox(-3.0F, -15.0F, -1.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(114, 27).addBox(-2.0F, -18.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(102, 28).addBox(-1.0F, -20.0F, 1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(122, 35).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(102, 35).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(118, 40).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 0).addBox(3.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(11, 0).addBox(-4.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);
		body.setTextureOffset(71, 0).addBox(-3.0F, -10.0F, -2.0F, 6.0F, 18.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(54, 13).addBox(-3.0F, -6.0F, 3.0F, 6.0F, 14.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 27).addBox(-3.0F, 6.0F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
		cube_r1.setTextureOffset(68, 30).addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -10.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6109F);
		cube_r2.setTextureOffset(54, 30).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -10.0F, 4.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.48F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(54, 0).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 11.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(3.0F, 7.0F, 1.0F);
		leftarm.setTextureOffset(60, 52).addBox(0.0F, 1.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 59).addBox(0.0F, 6.0F, -11.0F, 1.0F, 1.0F, 20.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 8).addBox(0.0F, 5.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 14).addBox(0.0F, 7.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 31).addBox(0.0F, 4.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 42).addBox(0.0F, 8.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		rifhtarm = new ModelRenderer(this);
		rifhtarm.setRotationPoint(-3.0F, 7.0F, 1.0F);
		rifhtarm.setTextureOffset(93, 52).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rifhtarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rifhtarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}