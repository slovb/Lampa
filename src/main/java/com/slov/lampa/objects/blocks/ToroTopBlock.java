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

public class ToroTopBlock extends Block {
	protected static final VoxelShape SHAPE = VoxelShapes.or(
		Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 2.0D, 14.0D),
		Block.makeCuboidShape(4.0D, 2.0D, 4.0D, 12.0D, 3.0D, 12.0D),
		Block.makeCuboidShape(6.0D, 3.0D, 6.0D, 10.0D, 4.0D, 10.0D),
		Block.makeCuboidShape(7.5D, 4.0D, 7.5D,  8.5D, 4.5D,  8.5D)
	);

	public ToroTopBlock() {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F).sound(SoundType.STONE));
		this.setDefaultState(this.stateContainer.getBaseState());
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Vec3d vec3d = state.getOffset(worldIn, pos);
		return SHAPE.withOffset(vec3d.x, vec3d.y, vec3d.z);
	}
}
