// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelshituolingxiaobing extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer rightarm2;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public Modelshituolingxiaobing() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 1.0F);
		head.setTextureOffset(159, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 73).addBox(1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(3.0F, 0.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 60).addBox(3.0F, -5.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 60).addBox(-2.0F, -5.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 60).addBox(1.0F, -9.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 50).addBox(-3.0F, -9.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 50).addBox(-5.0F, -8.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(21, 40).addBox(4.0F, -8.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(21, 40).addBox(2.0F, -9.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(21, 29).addBox(-4.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 124).addBox(-5.0F, -1.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 124).addBox(4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 124).addBox(3.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 113).addBox(1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 66).addBox(2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 52).addBox(0.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 96).addBox(-1.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 83).addBox(-3.0F, -9.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 41).addBox(-2.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 29).addBox(-4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 0.0F);
		body.setTextureOffset(161, 17).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 5.0F, 1.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(195, 32).addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, 5.0F, 1.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.setTextureOffset(119, 32).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 5.0F, 3.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.48F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(163, 33).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 5.0F, -1.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(136, 32).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-4.0F, 6.0F, 0.0F);
		rightarm2.setTextureOffset(193, 18).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		rightarm2.setTextureOffset(88, 70).addBox(-2.0F, 5.0F, -2.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		rightarm2.setTextureOffset(77, 63).addBox(-2.0F, 3.5F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightarm2.setTextureOffset(89, 50).addBox(-2.0F, 4.5F, -10.0F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		rightarm2.setTextureOffset(94, 63).addBox(-2.0F, 4.5F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 5.0F, 1.0F);
		leftarm.setTextureOffset(140, 17).addBox(0.0F, -1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 14.0F, 1.0F);
		rightleg.setTextureOffset(171, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 14.0F, 1.0F);
		leftleg.setTextureOffset(147, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}