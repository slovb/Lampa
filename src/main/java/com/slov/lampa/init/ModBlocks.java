package com.slov.lampa.init;

import com.slov.lampa.Lampa;
import com.slov.lampa.objects.blocks.PedestalBlock;
import com.slov.lampa.objects.blocks.ToroBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Lampa.MODID);

	public static final RegistryObject<Block> PEDESTAL = BLOCKS.register("pedestal", PedestalBlock::new);
	public static final RegistryObject<Block> TORO = BLOCKS.register("toro", ToroBlock::new);
}
