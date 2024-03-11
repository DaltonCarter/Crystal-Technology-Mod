package com.CartersDev.CrysTechMod;

import com.CartersDev.CrysTechMod.block.ModBlocks;
import com.CartersDev.CrysTechMod.block.ModWoodTypes;
import com.CartersDev.CrysTechMod.container.ModContainers;
import com.CartersDev.CrysTechMod.data.recipes.ModRecipeTypes;
import com.CartersDev.CrysTechMod.fluid.ModFluids;
import com.CartersDev.CrysTechMod.item.ModItems;
import com.CartersDev.CrysTechMod.screen.LightningChannelerScreen;
import com.CartersDev.CrysTechMod.tileentity.ModTileEntities;
import com.CartersDev.CrysTechMod.world.structure.structures.ModStructures;
import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraft.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CrystalTech.MOD_ID)
public class CrystalTech
{
    public static final String MOD_ID = "crystechmod";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public CrystalTech() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);
        // call in constructor below the ModContainers.register call!
        ModStructures.register(eventBus);
        ModFluids.register(eventBus);
        ModRecipeTypes.register(eventBus);

        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            AxeItem.BLOCK_STRIPPING_MAP = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.BLOCK_STRIPPING_MAP)
                    .put(ModBlocks.PLAGUED_LOG.get(), ModBlocks.STRIPPED_PLAGUED_LOG.get())
                    .put(ModBlocks.PLAGUED_WOOD.get(), ModBlocks.STRIPPED_PLAGUED_WOOD.get()).build();

            // Add to the setup method inside the enqueueWork
            ModStructures.setupStructures();
            WoodType.register(ModWoodTypes.PLAGUED);
        });
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ModBlocks.PLAGUED_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.PLAGUED_TRAPDOOR.get(), RenderType.getCutout());

            RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_TIBERIUM_CROP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_TIBERIUM_CROP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.RED_TIBERIUM_CROP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_TIBERIUM_CROP.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.RIPARIUS_CRYSTAL.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.VINIFERA_CRYSTAL.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.CRUENTUS_CRYSTAL.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ABOREUS_CRYSTAL.get(), RenderType.getTranslucent());
            //Glass:
            RenderTypeLookup.setRenderLayer(ModBlocks.CLEAR_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.LIME_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.PINK_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.RED_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.GDI_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.NOD_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.MOSAIC_TIBERGLASS.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ModBlocks.WOLF_TIBERGLASS.get(), RenderType.getTranslucent());

            //End Glass:

            RenderTypeLookup.setRenderLayer(ModBlocks.PLAGUED_LEAVES.get(), RenderType.getCutout());
//           RenderTypeLookup.setRenderLayer(ModBlocks.REDWOOD_SAPLING.get(), RenderType.getCutout());

            RenderTypeLookup.setRenderLayer(ModBlocks.HYACINTH.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_OF_LIFE.get(), RenderType.getCutout());

            ScreenManager.registerFactory(ModContainers.LIGHTNING_CHANNELER_CONTAINER.get(),
                    LightningChannelerScreen::new);

            ClientRegistry.bindTileEntityRenderer(ModTileEntities.SIGN_TILE_ENTITIES.get(),
                    SignTileEntityRenderer::new);

            Atlases.addWoodType(ModWoodTypes.PLAGUED);

//



        });
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo(CrystalTech.MOD_ID, "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
