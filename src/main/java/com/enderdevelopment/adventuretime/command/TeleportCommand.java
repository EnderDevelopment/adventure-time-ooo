package com.enderdevelopment.adventuretime.command;

import com.enderdevelopment.adventuretime.AdventureTimeMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class TeleportCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("teleport_to_ooo").executes(TeleportCommand::teleport));
    }

    private static int teleport(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        if (player != null) {
            player.teleportTo(AdventureTimeMod.ADVENTURE_TIME_DIMENSION);
            player.sendSystemMessage(Component.literal("Teleported to the Land of Ooo!"));
        }
        return 1;
    }
}