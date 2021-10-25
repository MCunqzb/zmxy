// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelArgillaceous_shield extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelArgillaceous_shield() {
		textureWidth = 48;
		textureHeight = 24;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, 24.0F, -8.0F, 11, 11, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 0, -6.0F, 23.0F, -8.5F, 1, 12, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 0, 6.0F, 23.0F, -8.5F, 1, 12, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 12, -5.0F, 23.0F, -8.5F, 11, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 15, -5.0F, 35.0F, -8.0F, 11, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 18, -4.0F, 36.0F, -8.0F, 9, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 20, -3.0F, 37.0F, -8.0F, 7, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 22, -2.0F, 38.0F, -8.0F, 5, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 0, -1.0F, 39.0F, -8.0F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.7279F, 35.0F, -7.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 13, 8.0F, -9.0F, -1.0F, 1, 9, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.0F, 35.0F, -7.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 13, 0.0F, 0.0F, -1.0F, 1, 9, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bone.rotateAngleY = f2;
	}
}