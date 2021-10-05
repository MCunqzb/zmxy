
package net.mcreator.zaomengxiyoutotalzip.gui;

import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.ScreenManager;

import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxisd1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxisd10Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxisd100Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxis1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxis10Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Yaxis100Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.YExptextdecline1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.YExptextadd1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xzxisd100Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xaxisd1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xaxisd10Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xaxis1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xaxis10Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Xaxis100Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.SettingDangZheGeJieMianDaKaiShiProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.ResetXYProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.OverlaycontrolProcedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Exptextdecline1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Exptextadd1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Absorbedecline1Procedure;
import net.mcreator.zaomengxiyoutotalzip.procedures.Absorbeadd1Procedure;
import net.mcreator.zaomengxiyoutotalzip.ZaomengxiyouModElements;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@ZaomengxiyouModElements.ModElement.Tag
public class SettingGui extends ZaomengxiyouModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;
	public SettingGui(ZaomengxiyouModElements instance) {
		super(instance, 839);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}
	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("setting"));
		}
	}
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, SettingGuiWindow::new));
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		PlayerEntity entity = event.player;
		if (event.phase == TickEvent.Phase.END && entity.openContainer instanceof GuiContainerMod) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SettingDangZheGeJieMianDaKaiShiProcedure.executeProcedure($_dependencies);
			}
		}
	}
	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;
		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(0);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SettingDangZheGeJieMianDaKaiShiProcedure.executeProcedure($_dependencies);
			}
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;
		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}
	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				OverlaycontrolProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xaxis1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 2) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xaxis10Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 3) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xaxis100Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 4) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxis1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 5) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxis10Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 6) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxis100Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 7) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xaxisd1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 8) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xaxisd10Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 9) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Xzxisd100Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 10) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxisd1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 11) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxisd10Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 12) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Yaxisd100Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 13) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ResetXYProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 14) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Exptextadd1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 15) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Exptextdecline1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 16) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				YExptextadd1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 17) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				YExptextdecline1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 18) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Absorbeadd1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 19) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Absorbedecline1Procedure.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
