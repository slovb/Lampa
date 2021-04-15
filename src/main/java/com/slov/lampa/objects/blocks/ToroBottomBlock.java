package com.slov.lampa.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ToroBottomBlock extends Block {
	protected static final VoxelShape SHAPE = VoxelShapes.or(
		Block.makeCuboidShape(3.0D,  0.0D,  3.0D, 13.0D,  1.5D, 13.0D), // Bottom
		Block.makeCuboidShape(5.0D,  1.5D,  5.0D, 11.0D,  2.5D, 11.0D), // Bottom ring
		Block.makeCuboidShape(6.0D,  2.5D,  6.0D, 10.0D,  8.4D, 10.0D), // Pillar
		Block.makeCuboidShape(5.0D,  6.5D,  5.0D, 11.0D,  7.5D, 11.0D), // Ring
		Block.makeCuboidShape(4.0D,  8.4D,  4.0D, 12.0D, 10.0D, 12.0D), // Lantern holder
		Block.makeCuboidShape(5.0D, 10.0D,  5.0D, 11.0D, 16.0D, 11.0D)  // Lantern
	);
	
	public ToroBottomBlock() {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F).sound(SoundType.STONE).lightValue(15));
		this.setDefaultState(this.stateContainer.getBaseState());
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Vec3d vec3d = state.getOffset(worldIn, pos);
		return SHAPE.withOffset(vec3d.x, vec3d.y, vec3d.z);
	}
}
