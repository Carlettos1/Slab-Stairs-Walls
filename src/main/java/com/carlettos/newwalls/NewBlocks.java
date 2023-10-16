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
import net.minecraft.block.WoodType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

public class NewBlocks {
    private static final LinkedList<Pair<Block, String>> BLOCKS = new LinkedList<>();
    public static final Logger LOGGER = LoggerFactory.getLogger("block_creation");
    
    public static final Block QUARTZ_BLOCK_WALL = createWall(Blocks.QUARTZ_BLOCK);
    public static final Block PURPUR_BLOCK_WALL = createWall(Blocks.PURPUR_BLOCK);
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
    public static final Block CRACKED_STONE_BRICK_STAIRS = createStairs(Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_SLAB = createSlab(Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_WALL = createWall(Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_STAIRS = createStairs(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_SLAB = createSlab(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_WALL = createWall(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_FENCE = createFence(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.CRACKED_NETHER_BRICKS);
    public static final Block NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_FENCE = createFence(Blocks.RED_NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.RED_NETHER_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = createStairs(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = createSlab(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = createWall(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block QUARTZ_BRICK_STAIRS = createStairs(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = createSlab(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = createWall(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_FENCE = createFence(Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_FENCE_GATE = createFenceGate(Blocks.QUARTZ_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = createStairs(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = createSlab(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = createWall(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = createStairs(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = createSlab(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = createWall(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block TUFF_STAIRS = createStairs(Blocks.TUFF);
    public static final Block TUFF_SLAB = createSlab(Blocks.TUFF);
    public static final Block TUFF_WALL = createWall(Blocks.TUFF);
    public static final Block CALCITE_STAIRS = createStairs(Blocks.CALCITE);
    public static final Block CALCITE_SLAB = createSlab(Blocks.CALCITE);
    public static final Block CALCITE_WALL = createWall(Blocks.CALCITE);
    public static final Block SMOOTH_BASALT_STAIRS = createStairs(Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_SLAB = createSlab(Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_WALL = createWall(Blocks.SMOOTH_BASALT);
    public static final Block SCULK_STAIRS = createStairs(Blocks.SCULK);
    public static final Block SCULK_SLAB = createSlab(Blocks.SCULK);
    public static final Block SCULK_WALL = createWall(Blocks.SCULK);
    public static final Block SCULK_FENCE = createFence(Blocks.SCULK);
    public static final Block SCULK_FENCE_GATE = createFenceGate(Blocks.SCULK);
    public static final Block DRIPSTONE_BLOCK_STAIRS = createStairs(Blocks.DRIPSTONE_BLOCK);
    public static final Block DRIPSTONE_BLOCK_SLAB = createSlab(Blocks.DRIPSTONE_BLOCK);
    public static final Block DRIPSTONE_BLOCK_WALL = createWall(Blocks.DRIPSTONE_BLOCK);
    public static final Block COAL_BLOCK_STAIRS = createStairs(Blocks.COAL_BLOCK);
    public static final Block COAL_BLOCK_SLAB = createSlab(Blocks.COAL_BLOCK);
    public static final Block COAL_BLOCK_WALL = createWall(Blocks.COAL_BLOCK);
    public static final Block COAL_BLOCK_FENCE = createFence(Blocks.COAL_BLOCK);
    public static final Block COAL_BLOCK_FENCE_GATE = createFenceGate(Blocks.COAL_BLOCK);
    public static final Block CHISELED_SANDSTONE_STAIRS = createStairs(Blocks.CHISELED_SANDSTONE);
    public static final Block CHISELED_SANDSTONE_SLAB = createSlab(Blocks.CHISELED_SANDSTONE);
    public static final Block CHISELED_SANDSTONE_WALL = createWall(Blocks.CHISELED_SANDSTONE);
    public static final Block WHITE_WOOL_STAIRS = createStairs(Blocks.WHITE_WOOL);
    public static final Block WHITE_WOOL_SLAB = createSlab(Blocks.WHITE_WOOL);
    public static final Block WHITE_WOOL_WALL = createWall(Blocks.WHITE_WOOL);
    public static final Block ORANGE_WOOL_STAIRS = createStairs(Blocks.ORANGE_WOOL);
    public static final Block ORANGE_WOOL_SLAB = createSlab(Blocks.ORANGE_WOOL);
    public static final Block ORANGE_WOOL_WALL = createWall(Blocks.ORANGE_WOOL);
    public static final Block MAGENTA_WOOL_STAIRS = createStairs(Blocks.MAGENTA_WOOL);
    public static final Block MAGENTA_WOOL_SLAB = createSlab(Blocks.MAGENTA_WOOL);
    public static final Block MAGENTA_WOOL_WALL = createWall(Blocks.MAGENTA_WOOL);
    public static final Block LIGHT_BLUE_WOOL_STAIRS = createStairs(Blocks.LIGHT_BLUE_WOOL);
    public static final Block LIGHT_BLUE_WOOL_SLAB = createSlab(Blocks.LIGHT_BLUE_WOOL);
    public static final Block LIGHT_BLUE_WOOL_WALL = createWall(Blocks.LIGHT_BLUE_WOOL);
    public static final Block YELLOW_WOOL_STAIRS = createStairs(Blocks.YELLOW_WOOL);
    public static final Block YELLOW_WOOL_SLAB = createSlab(Blocks.YELLOW_WOOL);
    public static final Block YELLOW_WOOL_WALL = createWall(Blocks.YELLOW_WOOL);
    public static final Block LIME_WOOL_STAIRS = createStairs(Blocks.LIME_WOOL);
    public static final Block LIME_WOOL_SLAB = createSlab(Blocks.LIME_WOOL);
    public static final Block LIME_WOOL_WALL = createWall(Blocks.LIME_WOOL);
    public static final Block PINK_WOOL_STAIRS = createStairs(Blocks.PINK_WOOL);
    public static final Block PINK_WOOL_SLAB = createSlab(Blocks.PINK_WOOL);
    public static final Block PINK_WOOL_WALL = createWall(Blocks.PINK_WOOL);
    public static final Block GRAY_WOOL_STAIRS = createStairs(Blocks.GRAY_WOOL);
    public static final Block GRAY_WOOL_SLAB = createSlab(Blocks.GRAY_WOOL);
    public static final Block GRAY_WOOL_WALL = createWall(Blocks.GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_STAIRS = createStairs(Blocks.LIGHT_GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_SLAB = createSlab(Blocks.LIGHT_GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_WALL = createWall(Blocks.LIGHT_GRAY_WOOL);
    public static final Block CYAN_WOOL_STAIRS = createStairs(Blocks.CYAN_WOOL);
    public static final Block CYAN_WOOL_SLAB = createSlab(Blocks.CYAN_WOOL);
    public static final Block CYAN_WOOL_WALL = createWall(Blocks.CYAN_WOOL);
    public static final Block PURPLE_WOOL_STAIRS = createStairs(Blocks.PURPLE_WOOL);
    public static final Block PURPLE_WOOL_SLAB = createSlab(Blocks.PURPLE_WOOL);
    public static final Block PURPLE_WOOL_WALL = createWall(Blocks.PURPLE_WOOL);
    public static final Block BLUE_WOOL_STAIRS = createStairs(Blocks.BLUE_WOOL);
    public static final Block BLUE_WOOL_SLAB = createSlab(Blocks.BLUE_WOOL);
    public static final Block BLUE_WOOL_WALL = createWall(Blocks.BLUE_WOOL);
    public static final Block BROWN_WOOL_STAIRS = createStairs(Blocks.BROWN_WOOL);
    public static final Block BROWN_WOOL_SLAB = createSlab(Blocks.BROWN_WOOL);
    public static final Block BROWN_WOOL_WALL = createWall(Blocks.BROWN_WOOL);
    public static final Block GREEN_WOOL_STAIRS = createStairs(Blocks.GREEN_WOOL);
    public static final Block GREEN_WOOL_SLAB = createSlab(Blocks.GREEN_WOOL);
    public static final Block GREEN_WOOL_WALL = createWall(Blocks.GREEN_WOOL);
    public static final Block RED_WOOL_STAIRS = createStairs(Blocks.RED_WOOL);
    public static final Block RED_WOOL_SLAB = createSlab(Blocks.RED_WOOL);
    public static final Block RED_WOOL_WALL = createWall(Blocks.RED_WOOL);
    public static final Block BLACK_WOOL_STAIRS = createStairs(Blocks.BLACK_WOOL);
    public static final Block BLACK_WOOL_SLAB = createSlab(Blocks.BLACK_WOOL);
    public static final Block BLACK_WOOL_WALL = createWall(Blocks.BLACK_WOOL);
    public static final Block OBSIDIAN_STAIRS = createStairs(Blocks.OBSIDIAN);
    public static final Block OBSIDIAN_SLAB = createSlab(Blocks.OBSIDIAN);
    public static final Block OBSIDIAN_WALL = createWall(Blocks.OBSIDIAN);
    public static final Block OBSIDIAN_FENCE = createFence(Blocks.OBSIDIAN);
    public static final Block OBSIDIAN_FENCE_GATE = createFenceGate(Blocks.OBSIDIAN);
    public static final Block SNOW_BLOCK_STAIRS = createStairs(Blocks.SNOW_BLOCK);
    public static final Block SNOW_BLOCK_SLAB = createSlab(Blocks.SNOW_BLOCK);
    public static final Block SNOW_BLOCK_WALL = createWall(Blocks.SNOW_BLOCK);
    public static final Block SNOW_BLOCK_FENCE = createFence(Blocks.SNOW_BLOCK);
    public static final Block SNOW_BLOCK_FENCE_GATE = createFenceGate(Blocks.SNOW_BLOCK);
    public static final Block CHISELED_STONE_BRICK_STAIRS = createStairs(Blocks.CHISELED_STONE_BRICKS);
    public static final Block CHISELED_STONE_BRICK_SLAB = createSlab(Blocks.CHISELED_STONE_BRICKS);
    public static final Block CHISELED_STONE_BRICK_WALL = createWall(Blocks.CHISELED_STONE_BRICKS);
    public static final Block PACKED_MUD_STAIRS = createStairs(Blocks.PACKED_MUD);
    public static final Block PACKED_MUD_SLAB = createSlab(Blocks.PACKED_MUD);
    public static final Block PACKED_MUD_WALL = createWall(Blocks.PACKED_MUD);
    public static final Block CHISELED_DEEPSLATE_STAIRS = createStairs(Blocks.CHISELED_DEEPSLATE);
    public static final Block CHISELED_DEEPSLATE_SLAB = createSlab(Blocks.CHISELED_DEEPSLATE);
    public static final Block CHISELED_DEEPSLATE_WALL = createWall(Blocks.CHISELED_DEEPSLATE);
    public static final Block CHISELED_NETHER_BRICK_STAIRS = createStairs(Blocks.CHISELED_NETHER_BRICKS);
    public static final Block CHISELED_NETHER_BRICK_SLAB = createSlab(Blocks.CHISELED_NETHER_BRICKS);
    public static final Block CHISELED_NETHER_BRICK_WALL = createWall(Blocks.CHISELED_NETHER_BRICKS);
    public static final Block CHISELED_NETHER_BRICK_FENCE = createFence(Blocks.CHISELED_NETHER_BRICKS);
    public static final Block CHISELED_NETHER_BRICK_FENCE_GATE = createFenceGate(Blocks.CHISELED_NETHER_BRICKS);
    public static final Block CHISELED_QUARTZ_BLOCK_STAIRS = createStairs(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Block CHISELED_QUARTZ_BLOCK_SLAB = createSlab(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Block CHISELED_QUARTZ_BLOCK_WALL = createWall(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Block CHISELED_QUARTZ_BLOCK_FENCE = createFence(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Block CHISELED_QUARTZ_BLOCK_FENCE_GATE = createFenceGate(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Block QUARTZ_BLOCK_FENCE = createFence(Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_BLOCK_FENCE_GATE = createFenceGate(Blocks.QUARTZ_BLOCK);
    public static final Block WHITE_TERRACOTTA_STAIRS = createStairs(Blocks.WHITE_TERRACOTTA);
    public static final Block WHITE_TERRACOTTA_SLAB = createSlab(Blocks.WHITE_TERRACOTTA);
    public static final Block WHITE_TERRACOTTA_WALL = createWall(Blocks.WHITE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_STAIRS = createStairs(Blocks.ORANGE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_SLAB = createSlab(Blocks.ORANGE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_WALL = createWall(Blocks.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = createStairs(Blocks.MAGENTA_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_SLAB = createSlab(Blocks.MAGENTA_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_WALL = createWall(Blocks.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = createStairs(Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = createSlab(Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = createWall(Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_STAIRS = createStairs(Blocks.YELLOW_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_SLAB = createSlab(Blocks.YELLOW_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_WALL = createWall(Blocks.YELLOW_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_STAIRS = createStairs(Blocks.LIME_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_SLAB = createSlab(Blocks.LIME_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_WALL = createWall(Blocks.LIME_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_STAIRS = createStairs(Blocks.PINK_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_SLAB = createSlab(Blocks.PINK_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_WALL = createWall(Blocks.PINK_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_STAIRS = createStairs(Blocks.GRAY_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_SLAB = createSlab(Blocks.GRAY_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_WALL = createWall(Blocks.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = createStairs(Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = createSlab(Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = createWall(Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_STAIRS = createStairs(Blocks.CYAN_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_SLAB = createSlab(Blocks.CYAN_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_WALL = createWall(Blocks.CYAN_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_STAIRS = createStairs(Blocks.PURPLE_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_SLAB = createSlab(Blocks.PURPLE_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_WALL = createWall(Blocks.PURPLE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_STAIRS = createStairs(Blocks.BLUE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_SLAB = createSlab(Blocks.BLUE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_WALL = createWall(Blocks.BLUE_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_STAIRS = createStairs(Blocks.BROWN_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_SLAB = createSlab(Blocks.BROWN_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_WALL = createWall(Blocks.BROWN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_STAIRS = createStairs(Blocks.GREEN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_SLAB = createSlab(Blocks.GREEN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_WALL = createWall(Blocks.GREEN_TERRACOTTA);
    public static final Block RED_TERRACOTTA_STAIRS = createStairs(Blocks.RED_TERRACOTTA);
    public static final Block RED_TERRACOTTA_SLAB = createSlab(Blocks.RED_TERRACOTTA);
    public static final Block RED_TERRACOTTA_WALL = createWall(Blocks.RED_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_STAIRS = createStairs(Blocks.BLACK_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_SLAB = createSlab(Blocks.BLACK_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_WALL = createWall(Blocks.BLACK_TERRACOTTA);
    public static final Block CHISELED_RED_SANDSTONE_STAIRS = createStairs(Blocks.CHISELED_RED_SANDSTONE);
    public static final Block CHISELED_RED_SANDSTONE_SLAB = createSlab(Blocks.CHISELED_RED_SANDSTONE);
    public static final Block CHISELED_RED_SANDSTONE_WALL = createWall(Blocks.CHISELED_RED_SANDSTONE);
    public static final Block NETHER_WART_BLOCK_STAIRS = createStairs(Blocks.NETHER_WART_BLOCK);
    public static final Block NETHER_WART_BLOCK_SLAB = createSlab(Blocks.NETHER_WART_BLOCK);
    public static final Block NETHER_WART_BLOCK_WALL = createWall(Blocks.NETHER_WART_BLOCK);
    public static final Block WARPED_WART_BLOCK_STAIRS = createStairs(Blocks.WARPED_WART_BLOCK);
    public static final Block WARPED_WART_BLOCK_SLAB = createSlab(Blocks.WARPED_WART_BLOCK);
    public static final Block WARPED_WART_BLOCK_WALL = createWall(Blocks.WARPED_WART_BLOCK);
    public static final Block CHISELED_POLISHED_BLACKSTONE_STAIRS = createStairs(Blocks.CHISELED_POLISHED_BLACKSTONE);
    public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = createSlab(Blocks.CHISELED_POLISHED_BLACKSTONE);
    public static final Block CHISELED_POLISHED_BLACKSTONE_WALL = createWall(Blocks.CHISELED_POLISHED_BLACKSTONE);
    public static final Block CRYING_OBSIDIAN_STAIRS = createStairs(Blocks.CRYING_OBSIDIAN);
    public static final Block CRYING_OBSIDIAN_SLAB = createSlab(Blocks.CRYING_OBSIDIAN);
    public static final Block CRYING_OBSIDIAN_WALL = createWall(Blocks.CRYING_OBSIDIAN);
    public static final Block CRYING_OBSIDIAN_FENCE = createFence(Blocks.CRYING_OBSIDIAN);
    public static final Block CRYING_OBSIDIAN_FENCE_GATE = createFenceGate(Blocks.CRYING_OBSIDIAN);
    public static final Block BLUE_ICE_STAIRS = createStairs(Blocks.BLUE_ICE);
    public static final Block BLUE_ICE_SLAB = createSlab(Blocks.BLUE_ICE);
    public static final Block BLUE_ICE_WALL = createWall(Blocks.BLUE_ICE);
    public static final Block BLUE_ICE_FENCE = createFence(Blocks.BLUE_ICE);
    public static final Block BLUE_ICE_FENCE_GATE = createFenceGate(Blocks.BLUE_ICE);
    public static final Block PACKED_ICE_STAIRS = createStairs(Blocks.PACKED_ICE);
    public static final Block PACKED_ICE_SLAB = createSlab(Blocks.PACKED_ICE);
    public static final Block PACKED_ICE_WALL = createWall(Blocks.PACKED_ICE);
    public static final Block PACKED_ICE_FENCE = createFence(Blocks.PACKED_ICE);
    public static final Block PACKED_ICE_FENCE_GATE = createFenceGate(Blocks.PACKED_ICE);
    public static final Block WHITE_CONCRETE_STAIRS = createStairs(Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_SLAB = createSlab(Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_WALL = createWall(Blocks.WHITE_CONCRETE);
    public static final Block ORANGE_CONCRETE_STAIRS = createStairs(Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_SLAB = createSlab(Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_WALL = createWall(Blocks.ORANGE_CONCRETE);
    public static final Block MAGENTA_CONCRETE_STAIRS = createStairs(Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_SLAB = createSlab(Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_WALL = createWall(Blocks.MAGENTA_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = createStairs(Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = createSlab(Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = createWall(Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block YELLOW_CONCRETE_STAIRS = createStairs(Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_SLAB = createSlab(Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_WALL = createWall(Blocks.YELLOW_CONCRETE);
    public static final Block LIME_CONCRETE_STAIRS = createStairs(Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_SLAB = createSlab(Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_WALL = createWall(Blocks.LIME_CONCRETE);
    public static final Block PINK_CONCRETE_STAIRS = createStairs(Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_SLAB = createSlab(Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_WALL = createWall(Blocks.PINK_CONCRETE);
    public static final Block GRAY_CONCRETE_STAIRS = createStairs(Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_SLAB = createSlab(Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_WALL = createWall(Blocks.GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = createStairs(Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = createSlab(Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = createWall(Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block CYAN_CONCRETE_STAIRS = createStairs(Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_SLAB = createSlab(Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_WALL = createWall(Blocks.CYAN_CONCRETE);
    public static final Block PURPLE_CONCRETE_STAIRS = createStairs(Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_SLAB = createSlab(Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_WALL = createWall(Blocks.PURPLE_CONCRETE);
    public static final Block BLUE_CONCRETE_STAIRS = createStairs(Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_SLAB = createSlab(Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_WALL = createWall(Blocks.BLUE_CONCRETE);
    public static final Block BROWN_CONCRETE_STAIRS = createStairs(Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_SLAB = createSlab(Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_WALL = createWall(Blocks.BROWN_CONCRETE);
    public static final Block GREEN_CONCRETE_STAIRS = createStairs(Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_SLAB = createSlab(Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_WALL = createWall(Blocks.GREEN_CONCRETE);
    public static final Block RED_CONCRETE_STAIRS = createStairs(Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_SLAB = createSlab(Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_WALL = createWall(Blocks.RED_CONCRETE);
    public static final Block BLACK_CONCRETE_STAIRS = createStairs(Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_SLAB = createSlab(Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_WALL = createWall(Blocks.BLACK_CONCRETE);


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
        FenceGateBlock fenceGate = new FenceGateBlock(Settings.copy(parent), WoodType.OAK);
        common(parent, fenceGate, "fence_gate");
        return fenceGate;
    }
    
    public static final void common(Block parent, Block new_, String type) {
        var registryKey = Registries.BLOCK.getKey(parent);
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
        BLOCKS.forEach(par -> Registry.register(Registries.BLOCK, new Identifier(SlabStairsWalls.MOD_ID, par.getRight()), par.getLeft()));
    }
}
