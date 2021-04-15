package com.slov.lampa.objects.items;

import com.slov.lampa.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ToroTopItem extends BlockNamedItem {

	public ToroTopItem() {
		super(ModBlocks.TORO_TOP.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
