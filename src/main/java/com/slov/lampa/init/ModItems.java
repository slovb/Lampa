package com.slov.lampa.init;

import com.slov.lampa.Lampa;
import com.slov.lampa.objects.items.PedestalItem;
import com.slov.lampa.objects.items.ToroItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lampa.MODID);
	
	public static final RegistryObject<Item> TORO_ITEM = ITEMS.register("toro", ToroItem::new);
	public static final RegistryObject<Item> PEDESTAL_ITEM = ITEMS.register("pedestal", PedestalItem::new);
}
