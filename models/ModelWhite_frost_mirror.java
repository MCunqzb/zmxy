// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelWhite_frost_mirror extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer hexadecagon;
	private final ModelRenderer bone2;
	private final ModelRenderer a0_r1;
	private final ModelRenderer a9_r1;
	private final ModelRenderer a7_r1;
	private final ModelRenderer a6_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer a_r1;
	private final ModelRenderer a12_r1;

	public ModelWhite_frost_mirror() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0538F, -8.5362F, -0.9449F);
		bone.setTextureOffset(0, 18).addBox(-7.0538F, -4.4638F, 0.9449F, 14.0F, 8.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 27).addBox(-6.0538F, -5.4638F, 0.9449F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 27).addBox(-6.0538F, 3.5362F, 0.9449F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 29).addBox(-5.0538F, 4.5362F, 0.9449F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 29).addBox(-5.0538F, -6.4638F, 0.9449F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 12).addBox(-4.0538F, -7.4638F, 0.9449F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 12).addBox(-4.0538F, 5.5362F, 0.9449F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0538F, -0.4638F, 0.4449F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 1.5708F);
		cube_r1.setTextureOffset(0, 11).addBox(-0.6F, -9.6569F, -5.6569F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0538F, -0.4638F, 0.4449F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, -1.5708F);
		cube_r2.setTextureOffset(0, 5).addBox(-0.6F, -10.6569F, -5.6569F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.4462F, 9.6931F, 1.0381F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4363F, 0.0F, -3.1416F);
		cube_r3.setTextureOffset(10, 0).addBox(0.0F, -3.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.0538F, -0.4638F, 0.4449F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -3.1416F);
		cube_r4.setTextureOffset(4, 7).addBox(-1.0F, -10.6569F, 0.0931F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0538F, -0.4638F, 0.4449F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(6, 0).addBox(-0.6F, -10.6569F, -5.6569F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		hexadecagon = new ModelRenderer(this);
		hexadecagon.setRotationPoint(-0.0538F, -0.4638F, 0.9449F);
		bone.addChild(hexadecagon);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hexadecagon.addChild(bone2);
		bone2.setTextureOffset(22, 0).addBox(-1.5913F, 7.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(22, 0).addBox(-1.5913F, -8.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		a0_r1 = new ModelRenderer(this);
		a0_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(a0_r1);
		setRotationAngle(a0_r1, 0.0F, 0.0F, 0.7854F);
		a0_r1.setTextureOffset(22, 0).addBox(-1.5913F, -8.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		a0_r1.setTextureOffset(22, 0).addBox(-1.5913F, 7.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		a9_r1 = new ModelRenderer(this);
		a9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(a9_r1);
		setRotationAngle(a9_r1, 0.0F, 0.0F, 0.3927F);
		a9_r1.setTextureOffset(22, 0).addBox(-1.5913F, -8.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		a9_r1.setTextureOffset(22, 0).addBox(-1.5913F, 7.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		a7_r1 = new ModelRenderer(this);
		a7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(a7_r1);
		setRotationAngle(a7_r1, 0.0F, 0.0F, -0.3927F);
		a7_r1.setTextureOffset(22, 0).addBox(-1.5913F, -8.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		a7_r1.setTextureOffset(22, 0).addBox(-1.5913F, 7.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		a6_r1 = new ModelRenderer(this);
		a6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(a6_r1);
		setRotationAngle(a6_r1, 0.0F, 0.0F, -0.7854F);
		a6_r1.setTextureOffset(22, 0).addBox(-1.5913F, -8.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		a6_r1.setTextureOffset(22, 0).addBox(-1.5913F, 7.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		hexadecagon.addChild(bone3);
		bone3.setTextureOffset(0, 0).addBox(-8.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(0, 0).addBox(7.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		a_r1 = new ModelRenderer(this);
		a_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(a_r1);
		setRotationAngle(a_r1, 0.0F, 0.0F, -0.3927F);
		a_r1.setTextureOffset(0, 0).addBox(7.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		a_r1.setTextureOffset(0, 0).addBox(-8.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		a12_r1 = new ModelRenderer(this);
		a12_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(a12_r1);
		setRotationAngle(a12_r1, 0.0F, 0.0F, 0.3927F);
		a12_r1.setTextureOffset(0, 0).addBox(7.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		a12_r1.setTextureOffset(0, 0).addBox(-8.0F, -1.5913F, -0.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}