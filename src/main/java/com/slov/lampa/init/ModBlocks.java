package com.slov.lampa.init;

import com.slov.lampa.Lampa;
import com.slov.lampa.objects.blocks.ToroBottomBlock;
import com.slov.lampa.objects.blocks.ToroTopBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lampa.MODID);

	public static final RegistryObject<Block> TORO_BOTTOM = BLOCKS.register("toro_bottom", ToroBottomBlock::new);
	public static final RegistryObject<Block> TORO_TOP = BLOCKS.register("toro_top", ToroTopBlock::new);
}
