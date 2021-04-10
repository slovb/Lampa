package com.slov.lampa.objects.items;

import com.slov.lampa.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PedestalItem extends BlockNamedItem {

	public PedestalItem() {
		super(ModBlocks.PEDESTAL.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
