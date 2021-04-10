package com.slov.lampa.objects.items;

import com.slov.lampa.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ToroItem extends BlockNamedItem {

	public ToroItem() {
		super(ModBlocks.TORO.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
