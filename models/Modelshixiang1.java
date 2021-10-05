// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelshixiang1 extends EntityModel<Entity> {
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer di;
	private final ModelRenderer body;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer body2;
	private final ModelRenderer arm;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer sword;
	private final ModelRenderer hesd;
	private final ModelRenderer cube_r16;

	public Modelshixiang1() {
		textureWidth = 256;
		textureHeight = 256;

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(16.0F, 20.0F, -2.0F);
		leftleg.setTextureOffset(12, 212).addBox(-2.0F, -2.0F, -8.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		leftleg.setTextureOffset(219, 226).addBox(-5.0F, -22.0F, 0.0F, 10.0F, 22.0F, 9.0F, 0.0F, false);
		leftleg.setTextureOffset(178, 224).addBox(-5.0F, -44.0F, -1.0F, 10.0F, 22.0F, 10.0F, 0.0F, false);
		leftleg.setTextureOffset(137, 0).addBox(-3.0F, -25.0F, -2.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
		leftleg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
		cube_r1.setTextureOffset(14, 192).addBox(1.0F, 0.0F, -7.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -2.0F, 0.0F);
		leftleg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
		cube_r2.setTextureOffset(12, 202).addBox(-4.0F, 0.0F, -8.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-14.0F, 20.0F, -2.0F);
		rightleg.setTextureOffset(130, 212).addBox(-2.0F, -2.0F, -8.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);
		rightleg.setTextureOffset(219, 226).addBox(-5.0F, -22.0F, 0.0F, 10.0F, 22.0F, 9.0F, 0.0F, false);
		rightleg.setTextureOffset(178, 224).addBox(-5.0F, -44.0F, -1.0F, 10.0F, 22.0F, 10.0F, 0.0F, false);
		rightleg.setTextureOffset(137, 0).addBox(-3.0F, -25.0F, -2.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -2.0F, 0.0F);
		rightleg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
		cube_r3.setTextureOffset(130, 193).addBox(1.0F, 0.0F, -7.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		rightleg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.7418F, 0.0F);
		cube_r4.setTextureOffset(130, 202).addBox(-4.0F, 0.0F, -8.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		di = new ModelRenderer(this);
		di.setRotationPoint(0.0F, 22.0F, 0.0F);
		di.setTextureOffset(0, 0).addBox(-26.0F, -1.0F, -16.0F, 52.0F, 3.0F, 32.0F, 0.0F, false);
		di.setTextureOffset(4, 192).addBox(-24.0F, -2.0F, -15.0F, 48.0F, 1.0F, 30.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(16.0F, -45.0F, 6.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(149, 16).addBox(-20.0F, 0.0F, 1.0F, 10.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(-35.0F, 0.0F, 1.0F, 11.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, 1.0F, 11.0F, 14.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(8.0F, -45.0F, 6.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(137, 18).addBox(-16.0F, 0.0F, 1.0F, 4.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(137, 18).addBox(-2.0F, 0.0F, 1.0F, 4.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(15.0F, -46.0F, -3.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 65).addBox(-37.0F, -1.0F, -1.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 65).addBox(-6.0F, -1.0F, -1.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 65).addBox(-6.0F, -1.0F, -1.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-15.0F, -46.0F, -3.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3054F, 1.5708F, 0.0F);
		cube_r8.setTextureOffset(0, 65).addBox(-13.0F, 1.0F, -4.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(15.0F, -46.0F, -3.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, -1.5708F, 0.0F);
		cube_r9.setTextureOffset(0, 65).addBox(-1.0F, 2.0F, -6.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, -46.0F, -3.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 36).addBox(-6.0F, -1.0F, -1.0F, 11.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.0F, -46.0F, -3.0F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(24, 14).addBox(-15.0F, -1.0F, -1.0F, 3.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(24, 14).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 16.0F, 1.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body2.setTextureOffset(102, 37).addBox(-19.0F, -52.0F, -3.0F, 40.0F, 5.0F, 11.0F, 0.0F, false);
		body2.setTextureOffset(25, 37).addBox(-12.0F, -62.0F, -3.0F, 27.0F, 10.0F, 11.0F, 0.0F, false);
		body2.setTextureOffset(30, 64).addBox(-13.0F, -70.0F, -3.0F, 29.0F, 8.0F, 11.0F, 0.0F, false);
		body2.setTextureOffset(22, 84).addBox(-17.0F, -86.0F, -3.0F, 37.0F, 16.0F, 11.0F, 0.0F, false);
		body2.setTextureOffset(125, 63).addBox(-14.0F, -85.0F, -5.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(125, 63).addBox(5.0F, -85.0F, -5.0F, 12.0F, 10.0F, 2.0F, 0.0F, false);

		arm = new ModelRenderer(this);
		arm.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-22.0F, -61.0F, 0.0F);
		arm.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2182F, 0.0F, 0.3054F);
		cube_r12.setTextureOffset(35, 128).addBox(-6.0F, -2.0F, -8.0F, 28.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(28.0F, -65.0F, -3.0F);
		arm.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2618F, 0.0F, -0.48F);
		cube_r13.setTextureOffset(35, 128).addBox(-27.0F, 0.0F, -4.0F, 28.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-17.0F, -86.0F, 3.0F);
		arm.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2182F, 0.0F, 0.2182F);
		cube_r14.setTextureOffset(221, 0).addBox(-7.0F, 0.0F, -5.0F, 9.0F, 29.0F, 9.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(20.0F, -86.0F, 2.0F);
		arm.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2182F, 0.0F, -0.2182F);
		cube_r15.setTextureOffset(221, 0).addBox(-2.0F, 0.0F, -4.0F, 9.0F, 29.0F, 9.0F, 0.0F, false);

		sword = new ModelRenderer(this);
		sword.setRotationPoint(-22.0F, -37.0F, 0.0F);
		sword.setTextureOffset(238, 69).addBox(21.5F, -7.0F, -7.0F, 4.0F, 21.0F, 4.0F, 0.0F, false);
		sword.setTextureOffset(164, 54).addBox(17.0F, 14.0F, -7.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);
		sword.setTextureOffset(168, 60).addBox(19.0F, 25.0F, -7.0F, 9.0F, 11.0F, 3.0F, 0.0F, false);
		sword.setTextureOffset(167, 109).addBox(20.0F, 16.0F, -7.0F, 7.0F, 9.0F, 3.0F, 0.0F, false);
		sword.setTextureOffset(166, 75).addBox(18.0F, 36.0F, -7.0F, 11.0F, 18.0F, 3.0F, 0.0F, false);
		sword.setTextureOffset(168, 97).addBox(19.0F, 54.0F, -7.0F, 9.0F, 2.0F, 3.0F, 0.0F, false);
		sword.setTextureOffset(168, 103).addBox(20.0F, 56.0F, -7.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		hesd = new ModelRenderer(this);
		hesd.setRotationPoint(0.0F, 24.0F, 0.0F);
		hesd.setTextureOffset(148, 124).addBox(-6.0F, -102.0F, -7.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(12.0F, -87.0F, -4.0F);
		hesd.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.48F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(0, 114).addBox(-20.0F, 0.0F, 0.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
		cube_r16.setTextureOffset(0, 114).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		di.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		arm.render(matrixStack, buffer, packedLight, packedOverlay);
		sword.render(matrixStack, buffer, packedLight, packedOverlay);
		hesd.render(matrixStack, buffer, packedLight, packedOverlay);
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