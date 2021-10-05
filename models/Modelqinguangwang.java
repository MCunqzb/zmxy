// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelqinguangwang extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelqinguangwang() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(46, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(78, 4).addBox(-1.0F, -13.0F, -3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(86, 9).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(86, 4).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(94, 0).addBox(0.0F, -26.0F, -3.0F, 0.0F, 14.0F, 7.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 3.0F, 0.0F);
		body.setTextureOffset(48, 16).addBox(-4.0F, -5.0F, -3.0F, 8.0F, 14.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(76, 24).addBox(-4.0F, 9.0F, -3.1F, 8.0F, 12.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(32, 24).addBox(-4.0F, 9.0F, 3.1F, 8.0F, 12.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(20, 18).addBox(-4.1F, 9.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(92, 18).addBox(4.1F, 9.0F, -3.0F, 0.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(104, 24).addBox(-4.0F, -5.0F, 3.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0F, -5.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0873F);
		cube_r1.setTextureOffset(30, 3).addBox(0.0F, -4.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.0F, -5.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0873F);
		cube_r2.setTextureOffset(78, 3).addBox(0.0F, -4.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.0F, 4.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 24).addBox(-5.0F, -12.0F, 0.0F, 10.0F, 12.0F, 0.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, -1.0F, 0.0F);
		leftarm.setTextureOffset(38, 36).addBox(0.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(34, 37).addBox(0.5F, 17.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(34, 41).addBox(2.7F, 17.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(34, 46).addBox(1.5F, 17.0F, -1.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, -1.0F, 0.0F);
		rightarm.setTextureOffset(76, 36).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(94, 40).addBox(-3.5667F, 17.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(94, 40).addBox(-1.3667F, 17.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(94, 40).addBox(-2.5667F, 17.0F, -1.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(38, 57).addBox(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(76, 57).addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
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
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}