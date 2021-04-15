package com.slov.lampa.objects.items;

import com.slov.lampa.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ToroBottomItem extends BlockNamedItem {

	public ToroBottomItem() {
		super(ModBlocks.TORO_BOTTOM.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
