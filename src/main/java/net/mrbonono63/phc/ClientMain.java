package net.mrbonono63.phc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.mrbonono63.phc.registry.PBlocks;

public class ClientMain implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                PBlocks.GLASS_CABINET
        );
    }
}
