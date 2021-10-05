// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeljiaomowang extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modeljiaomowang() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 1.0F);
		head.setTextureOffset(96, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(70, 13).addBox(-3.0F, -9.0F, -6.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(76, 6).addBox(-2.0F, -10.0F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(22, 10).addBox(0.0F, -16.0F, 1.0F, 0.0F, 15.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(81, 0).addBox(-1.0F, -11.0F, -3.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(45, 6).addBox(4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(53, 0).addBox(4.0F, -5.0F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(53, 0).addBox(-5.0F, -5.0F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(45, 6).addBox(-5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(63, 0).addBox(-2.0F, -8.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(63, 0).addBox(-1.0F, -7.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.setTextureOffset(98, 16).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 14.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(25, 34).addBox(0.0F, -6.0F, 4.0F, 0.0F, 15.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(81, 47).addBox(-1.0F, 17.0F, 13.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(46, 55).addBox(-3.0F, 8.0F, -2.1F, 6.0F, 8.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 16.0F, 10.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(96, 47).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 12.0F, 9.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(111, 47).addBox(-2.0F, -1.2167F, -3.6051F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 9.0F, 4.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(107, 37).addBox(-3.0F, -1.0F, -1.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 2.0F, 1.0F);
		leftarm.setTextureOffset(66, 21).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(83, 37).addBox(0.0F, 11.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(94, 37).addBox(3.0F, 11.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(89, 37).addBox(1.5F, 11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		rightarm.setTextureOffset(82, 21).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 96).addBox(-2.0F, 11.0F, -19.0F, 1.0F, 1.0F, 31.0F, 0.0F, false);
		rightarm.setTextureOffset(19, 97).addBox(-2.0F, 8.0F, -17.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(17, 108).addBox(-2.0F, 14.0F, -17.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		rightarm.setTextureOffset(25, 104).addBox(-2.0F, 9.0F, -13.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(20, 104).addBox(-2.0F, 12.0F, -13.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(66, 38).addBox(-4.0F, 11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(75, 38).addBox(-1.0F, 11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(70, 38).addBox(-2.5F, 11.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(1.0F, 15.0F, 0.0F);
		leftleg.setTextureOffset(103, 59).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.0F, 15.0F, 0.0F);
		rightleg.setTextureOffset(85, 59).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}