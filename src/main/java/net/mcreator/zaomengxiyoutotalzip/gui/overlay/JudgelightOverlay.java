
package net.mcreator.zaomengxiyoutotalzip.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.zaomengxiyoutotalzip.procedures.DeathjudgeProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge7Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge6Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge5Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge4Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge3Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge2Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Deathjudge1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@Mod.EventBusSubscriber
public class JudgelightOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (DeathjudgeProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
				if (Deathjudge7Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 99, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge6Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 117, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge5Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 135, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge4Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 153, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge3Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 171, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge2Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 189, posY + 104, 0, 0, 16, 16, 16, 16);
				}
				if (Deathjudge1Procedure.executeProcedure(ImmutableMap.of("world", world))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelight.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 189, posY + 86, 0, 0, 16, 16, 16, 16);
				}
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 189, posY + 86, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 189, posY + 104, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 171, posY + 104, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 153, posY + 104, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 135, posY + 104, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 117, posY + 104, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/judgelightoff.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 99, posY + 104, 0, 0, 16, 16, 16, 16);
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
