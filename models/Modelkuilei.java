// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelkuilei extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head1;
	private final ModelRenderer hat;
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer ping;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer wei;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm2;

	public Modelkuilei() {
		textureWidth = 200;
		textureHeight = 200;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, -8.0F);

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head1);
		head1.setTextureOffset(94, 69).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(hat);
		hat.setTextureOffset(0, 77).addBox(-7.0F, -8.0F, -11.0F, 14.0F, 5.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(0, 97).addBox(-5.0F, -10.0F, -9.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		hat.setTextureOffset(0, 110).addBox(-4.0F, -12.0F, -8.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		hat.setTextureOffset(0, 121).addBox(-2.0F, -14.0F, -6.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		hat.setTextureOffset(0, 130).addBox(-1.0F, -16.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(7, 131).addBox(-0.5F, -17.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(83, 35).addBox(-6.0F, -4.0F, -11.1F, 2.0F, 7.0F, 0.0F, 0.0F, false);
		hat.setTextureOffset(78, 34).addBox(7.1F, -5.0F, -10.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);
		hat.setTextureOffset(78, 34).addBox(7.1F, -5.0F, -7.0F, 0.0F, 7.0F, 2.0F, 0.0F, false);
		hat.setTextureOffset(78, 34).addBox(-7.1F, -5.0F, -10.0F, 0.0F, 7.0F, 2.0F, 0.0F, true);
		hat.setTextureOffset(78, 34).addBox(-7.1F, -5.0F, -7.0F, 0.0F, 7.0F, 2.0F, 0.0F, true);
		hat.setTextureOffset(83, 35).addBox(-3.0F, -4.0F, -11.1F, 2.0F, 7.0F, 0.0F, 0.0F, false);
		hat.setTextureOffset(83, 35).addBox(1.0F, -4.0F, -11.1F, 2.0F, 7.0F, 0.0F, 0.0F, false);
		hat.setTextureOffset(83, 35).addBox(4.0F, -4.0F, -11.1F, 2.0F, 7.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 3.0F, 0.0F);
		body.addChild(body1);
		body1.setTextureOffset(0, 0).addBox(-12.0F, -33.0F, -7.0F, 24.0F, 30.0F, 14.0F, 0.0F, false);
		body1.setTextureOffset(77, 0).addBox(-9.0F, -28.0F, -10.0F, 18.0F, 23.0F, 3.0F, 0.0F, false);
		body1.setTextureOffset(189, 68).addBox(12.0F, -33.0F, -13.0F, 0.0F, 31.0F, 6.0F, 0.0F, false);
		body1.setTextureOffset(189, 68).addBox(-12.0F, -33.0F, -13.0F, 0.0F, 31.0F, 6.0F, 0.0F, false);
		body1.setTextureOffset(0, 46).addBox(-12.0F, -5.0F, -7.1F, 24.0F, 5.0F, 0.0F, 0.0F, false);
		body1.setTextureOffset(119, 13).addBox(-12.0F, -23.9888F, -13.3095F, 24.0F, 16.0F, 0.0F, 0.0F, false);
		body1.setTextureOffset(167, 0).addBox(-7.0F, -24.0F, -13.0F, 14.0F, 16.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.9888F, -13.3095F);
		body1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(119, 30).addBox(-12.0F, 0.0F, 0.0F, 24.0F, 9.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -33.0F, -7.0F);
		body1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(119, 1).addBox(-13.0F, 0.0F, 0.0F, 24.0F, 11.0F, 0.0F, 0.0F, false);

		ping = new ModelRenderer(this);
		ping.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(ping);
		ping.setTextureOffset(58, 88).addBox(12.0F, -30.0F, -1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		ping.setTextureOffset(58, 88).addBox(-14.0F, -30.0F, -1.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		ping.setTextureOffset(58, 88).addBox(12.0F, -23.0F, 4.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		ping.setTextureOffset(58, 88).addBox(-14.0F, -23.0F, 4.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, -14.0F, 7.0F);
		ping.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.3491F, 0.0F);
		cube_r3.setTextureOffset(0, 52).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(5.0F, -25.0F, 7.0F);
		ping.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2182F, 0.2182F, 0.0F);
		cube_r4.setTextureOffset(0, 52).addBox(0.0F, 0.0F, -1.0F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -14.0F, 7.0F);
		ping.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, -0.3491F, 0.0F);
		cube_r5.setTextureOffset(0, 52).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.0F, -25.0F, 7.0F);
		ping.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2182F, -0.2182F, 0.0F);
		cube_r6.setTextureOffset(0, 52).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 4.0F, 13.0F, 0.0F, false);

		wei = new ModelRenderer(this);
		wei.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(wei);
		wei.setTextureOffset(0, 71).addBox(-8.0F, -35.0F, -2.0F, 16.0F, 5.0F, 0.0F, 0.0F, false);
		wei.setTextureOffset(98, 16).addBox(8.0F, -35.0F, -12.0F, 0.0F, 8.0F, 10.0F, 0.0F, false);
		wei.setTextureOffset(77, 16).addBox(-8.0F, -35.0F, -12.0F, 0.0F, 8.0F, 10.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(15.0F, 0.0F, 0.0F);
		leftarm.setTextureOffset(49, 44).addBox(-3.0F, -1.0F, -5.0F, 8.0F, 17.0F, 9.0F, 0.0F, false);
		leftarm.setTextureOffset(154, 40).addBox(-3.0F, 12.0F, -4.9F, 9.0F, 5.0F, 11.0F, 0.0F, false);
		leftarm.setTextureOffset(151, 57).addBox(-3.0F, 16.0F, -4.6F, 10.0F, 5.0F, 12.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-14.0F, 0.0F, 0.0F);
		rightarm2.setTextureOffset(49, 44).addBox(-6.0F, -1.0F, -5.0F, 8.0F, 17.0F, 9.0F, 0.0F, false);
		rightarm2.setTextureOffset(154, 40).addBox(-7.0F, 12.0F, -4.9F, 9.0F, 5.0F, 11.0F, 0.0F, true);
		rightarm2.setTextureOffset(151, 57).addBox(-8.0F, 16.0F, -4.6F, 10.0F, 5.0F, 12.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.hat.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.hat.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}