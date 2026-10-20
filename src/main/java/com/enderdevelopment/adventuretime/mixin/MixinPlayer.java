package com.enderdevelopment.adventuretime.mixin;

import com.enderdevelopment.adventuretime.AdventureTimeMod;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class MixinPlayer {
    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        if ((Object)this instanceof ServerPlayer serverPlayer) {
            // Check for teleportation condition and teleport to Adventure Time dimension
        }
    }
}