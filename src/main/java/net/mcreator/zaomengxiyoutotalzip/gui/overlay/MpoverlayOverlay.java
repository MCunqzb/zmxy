
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

import net.mcreator.zaomengxiyoutotalzip.procedures.SouloverlayjudgeProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.JudgeoverlaycontrolProcedure;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@Mod.EventBusSubscriber
public class MpoverlayOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
			if (JudgeoverlaycontrolProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), ":" + (entity.getPersistentData().getDouble("showtime")) + "",
						posX + -190, posY + -44, -16777216);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/clock_00.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -207, posY + -49, 0, 0, 16, 16, 16, 16);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "" + (entity.getPersistentData().getBoolean("T")) + "",
						posX + -212, posY + 100, -1);
				if (SouloverlayjudgeProcedure.executeProcedure(ImmutableMap.of("entity", entity)))
					Minecraft
							.getInstance().fontRenderer
									.drawString(event.getMatrixStack(),
											":" + (int) ((entity.getCapability(ZaomengxiyouModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new ZaomengxiyouModVariables.PlayerVariables())).Sources) + "",
											posX + -190, posY + -63, -65286);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + (entity.getPersistentData().getBoolean("sourcebag")) + "", posX + -212, posY + 90, -205);
				if (SouloverlayjudgeProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("zaomengxiyou:textures/soul.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -206, posY + -65, 0, 0, 16, 16, 16, 16);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
