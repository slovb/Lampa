package com.slov.lampa;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.slov.lampa.init.ModBlocks;
import com.slov.lampa.init.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Lampa.MODID)
public class Lampa
{
	public static final String MODID = "lampa";
	
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Lampa() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ModBlocks.BLOCKS.register(bus);
    	ModItems.ITEMS.register(bus);
    }
}
