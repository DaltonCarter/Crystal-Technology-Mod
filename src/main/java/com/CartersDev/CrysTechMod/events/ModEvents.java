package com.CartersDev.CrysTechMod.events;


import com.CartersDev.CrysTechMod.CrystalTech;
import com.CartersDev.CrysTechMod.commands.ReturnHomeCommand;
import com.CartersDev.CrysTechMod.commands.SetHomeCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = CrystalTech.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {

        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());


    }
    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
       if(!event.getOriginal().getEntityWorld().isRemote()) {
           event.getPlayer().getPersistentData().putIntArray( CrystalTech.MOD_ID + "homepos",
                   event.getOriginal().getPersistentData().getIntArray(CrystalTech.MOD_ID + "homepos"));
       }

    }


}
