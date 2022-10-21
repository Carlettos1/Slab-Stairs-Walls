package com.carlettos.newwalls;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

public class NewBlocks {
    private static final LinkedList<Pair<Block, String>> BLOCKS = new LinkedList<>();
    
    public static final Logger LOGGER = LoggerFactory.getLogger("block_creation");
    
    public static final Block POLISHED_GRANITE_BRICKS = createBlock(Blocks.POLISHED_GRANITE, "bricks");
    public static final Block POLISHED_GRANITE_BRICK_SLAB = createSlab(POLISHED_GRANITE_BRICKS);
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = createStairs(POLISHED_GRANITE_BRICKS);
    public static final Block POLISHED_GRANITE_BRICK_WALL = createWall(POLISHED_GRANITE_BRICKS);
    
    public static final Block POLISHED_DIORITE_BRICKS = createBlock(Blocks.POLISHED_DIORITE, "bricks");
    public static final Block POLISHED_DIORITE_BRICK_SLAB = createSlab(POLISHED_DIORITE_BRICKS);
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = createStairs(POLISHED_DIORITE_BRICKS);
    public static final Block POLISHED_DIORITE_BRICK_WALL = createWall(POLISHED_DIORITE_BRICKS);

    public static final Block POLISHED_ANDESITE_BRICKS = createBlock(Blocks.POLISHED_ANDESITE, "bricks");
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = createSlab(POLISHED_ANDESITE_BRICKS);
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = createStairs(POLISHED_ANDESITE_BRICKS);
    public static final Block POLISHED_ANDESITE_BRICK_WALL = createWall(POLISHED_ANDESITE_BRICKS);
    
    public static final Block QUARTZ_WALL = createWall(Blocks.QUARTZ_BLOCK, "quartz_wall");
    public static final Block PURPUR_WALL = createWall(Blocks.PURPUR_BLOCK, "purpur_wall");
    public static final Block PRISMARINE_BRICK_WALL = createWall(Blocks.PRISMARINE_BRICKS);
    public static final Block DARK_PRISMARINE_WALL = createWall(Blocks.DARK_PRISMARINE);
    public static final Block SMOOTH_SANDSTONE_WALL = createWall(Blocks.SMOOTH_SANDSTONE);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = createWall(Blocks.SMOOTH_RED_SANDSTONE);
    public static final Block SMOOTH_QUARTZ_WALL = createWall(Blocks.SMOOTH_QUARTZ);
    public static final Block STONE_WALL = createWall(Blocks.STONE);
    public static final Block POLISHED_GRANITE_WALL = createWall(Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_DIORITE_WALL = createWall(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_ANDESITE_WALL = createWall(Blocks.POLISHED_ANDESITE);
    public static final Block SMOOTH_STONE_STAIRS = createStairs(Blocks.SMOOTH_STONE);
    public static final Block SMOOTH_STONE_WALL = createWall(Blocks.SMOOTH_STONE);
    public static final Block CUT_SANDSTONE_STAIRS = createStairs(Blocks.CUT_SANDSTONE);
    public static final Block CUT_SANDSTONE_WALL = createWall(Blocks.CUT_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_STAIRS = createStairs(Blocks.CUT_RED_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_WALL = createWall(Blocks.CUT_RED_SANDSTONE);
    
    public static final Block CRACKED_STONE_BRICK_SLAB = createSlab(Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_STAIRS = createStairs(Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_WALL = createWall(Blocks.CRACKED_STONE_BRICKS);

    public static final Block CRACKED_NETHER_BRICK_SLAB = createSlab(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_STAIRS = createStairs(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_WALL = createWall(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_FENCE = createFence(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.CRACKED_NETHER_BRICKS);
    
    public static final Block RED_NETHER_BRICK_FENCE = createFence(Blocks.RED_NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.RED_NETHER_BRICKS);
    public static final Block NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.NETHER_BRICKS);
    
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = createSlab(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = createStairs(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = createWall(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    
    public static final Block QUARTZ_BRICK_SLAB = createSlab(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_STAIRS = createStairs(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = createWall(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_FENCE = createFence(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_FENCE_GATE = createFenceGate(Blocks.QUARTZ_BRICKS);
    
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = createSlab(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = createStairs(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = createWall(Blocks.CRACKED_DEEPSLATE_BRICKS);
    
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = createSlab(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = createStairs(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = createWall(Blocks.CRACKED_DEEPSLATE_TILES);
    
    public static final Block TUFF_SLAB = createSlab(Blocks.TUFF);
    public static final Block TUFF_STAIRS = createStairs(Blocks.TUFF);
    public static final Block TUFF_WALL = createWall(Blocks.TUFF);
    
    public static final Block CALCITE_SLAB = createSlab(Blocks.CALCITE);
    public static final Block CALCITE_STAIRS = createStairs(Blocks.CALCITE);
    public static final Block CALCITE_WALL = createWall(Blocks.CALCITE);
    
    public static final Block SMOOTH_BASALT_SLAB = createSlab(Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_STAIRS = createStairs(Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_WALL = createWall(Blocks.SMOOTH_BASALT);
    
    public static final Block createBlock(Block parent, String type) {
        Block block = new Block(Settings.copy(parent));
        common(parent, block, type);
        return block;
    }

    public static final SlabBlock createSlab(Block parent) {
        SlabBlock slab = new SlabBlock(Settings.copy(parent));
        common(parent, slab, "slab");
        return slab;
    }
    
    public static final StairsBlock createStairs(Block parent) {
        StairsBlock stairs = new StairsBlock(parent.getDefaultState(), Settings.copy(parent));
        common(parent, stairs, "stairs");
        return stairs;
    }
    
    public static final WallBlock createWall(Block parent, String name) {
        WallBlock wall = new WallBlock(Settings.copy(parent));
        BLOCKS.add(new Pair<>(wall, name));
        return wall;
    }
    
    public static final WallBlock createWall(Block parent) {
        WallBlock wall = new WallBlock(Settings.copy(parent));
        common(parent, wall, "wall");
        return wall;
    }
    
    public static final FenceBlock createFence(Block parent) {
        FenceBlock fence = new FenceBlock(Settings.copy(parent));
        common(parent, fence, "fence");
        return fence;
    }
    
    public static final FenceGateBlock createFenceGate(Block parent) {
        FenceGateBlock fenceGate = new FenceGateBlock(Settings.copy(parent));
        common(parent, fenceGate, "fence_gate");
        return fenceGate;
    }
    
    public static final void common(Block parent, Block new_, String type) {
        var registryKey = Registry.BLOCK.getKey(parent);
        String parentName = null;
        if (registryKey.isPresent()) {
             parentName = registryKey.get().getValue().getPath();
        } else {
            for (Pair<Block, String> pair : BLOCKS) {
                if (pair.getLeft() == parent) {
                    parentName = pair.getRight();
                    break;
                }
            }
        }
        
        if (parentName == null) {
            LOGGER.warn("Problem adding automatic name to: " + new_ + " parent doesn't exist either on registry or on BLOCKS");
            return;
        }
        
        if (parentName.lastIndexOf('s') == parentName.length() - 1) {
            parentName = parentName.substring(0, parentName.length() - 1);
        }
        BLOCKS.add(new Pair<>(new_, parentName + '_' + type));
    }
    
    public static final void register() {
        BLOCKS.forEach(par -> Registry.register(Registry.BLOCK, new Identifier(SlabStairsWalls.MOD_ID, par.getRight()), par.getLeft()));
    }
}
