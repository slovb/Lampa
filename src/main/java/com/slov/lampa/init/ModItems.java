package com.slov.lampa.init;

import com.slov.lampa.Lampa;
import com.slov.lampa.objects.items.ToroBottomItem;
import com.slov.lampa.objects.items.ToroTopItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Lampa.MODID);
	
	public static final RegistryObject<Item> TORO_BOTTOM_ITEM = ITEMS.register("toro_bottom", ToroBottomItem::new);
	public static final RegistryObject<Item> TORO_TOP_ITEM = ITEMS.register("toro_top", ToroTopItem::new);
	
}
