package com.carlettos.newwalls;

import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

public class NewItems {
    private static final LinkedList<Pair<Item, Identifier>> ITEMS = new LinkedList<>();
    
    public static final Logger LOGGER = LoggerFactory.getLogger("item_creation");
    
    public static final BlockItem POLISHED_GRANITE_BRICKS = fromBlock(NewBlocks.POLISHED_GRANITE_BRICKS);
    public static final BlockItem POLISHED_GRANITE_BRICK_SLAB = fromBlock(NewBlocks.POLISHED_GRANITE_BRICK_SLAB);
    public static final BlockItem POLISHED_GRANITE_BRICK_STAIRS = fromBlock(NewBlocks.POLISHED_GRANITE_BRICK_STAIRS);
    public static final BlockItem POLISHED_GRANITE_BRICK_WALL = fromBlock(NewBlocks.POLISHED_GRANITE_BRICK_WALL);
    public static final BlockItem POLISHED_DIORITE_BRICKS = fromBlock(NewBlocks.POLISHED_DIORITE_BRICKS);
    public static final BlockItem POLISHED_DIORITE_BRICK_SLAB = fromBlock(NewBlocks.POLISHED_DIORITE_BRICK_SLAB);
    public static final BlockItem POLISHED_DIORITE_BRICK_STAIRS = fromBlock(NewBlocks.POLISHED_DIORITE_BRICK_STAIRS);
    public static final BlockItem POLISHED_DIORITE_BRICK_WALL = fromBlock(NewBlocks.POLISHED_DIORITE_BRICK_WALL);
    public static final BlockItem POLISHED_ANDESITE_BRICKS = fromBlock(NewBlocks.POLISHED_ANDESITE_BRICKS);
    public static final BlockItem POLISHED_ANDESITE_BRICK_SLAB = fromBlock(NewBlocks.POLISHED_ANDESITE_BRICK_SLAB);
    public static final BlockItem POLISHED_ANDESITE_BRICK_STAIRS = fromBlock(NewBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
    public static final BlockItem POLISHED_ANDESITE_BRICK_WALL = fromBlock(NewBlocks.POLISHED_ANDESITE_BRICK_WALL);
    public static final BlockItem QUARTZ_WALL = fromBlock(NewBlocks.QUARTZ_WALL);
    public static final BlockItem PURPUR_WALL = fromBlock(NewBlocks.PURPUR_WALL);
    public static final BlockItem PRISMARINE_BRICK_WALL = fromBlock(NewBlocks.PRISMARINE_BRICK_WALL);
    public static final BlockItem DARK_PRISMARINE_WALL = fromBlock(NewBlocks.DARK_PRISMARINE_WALL);
    public static final BlockItem SMOOTH_SANDSTONE_WALL = fromBlock(NewBlocks.SMOOTH_SANDSTONE_WALL);
    public static final BlockItem SMOOTH_RED_SANDSTONE_WALL = fromBlock(NewBlocks.SMOOTH_RED_SANDSTONE_WALL);
    public static final BlockItem SMOOTH_QUARTZ_WALL = fromBlock(NewBlocks.SMOOTH_QUARTZ_WALL);
    public static final BlockItem STONE_WALL = fromBlock(NewBlocks.STONE_WALL);
    public static final BlockItem POLISHED_GRANITE_WALL = fromBlock(NewBlocks.POLISHED_GRANITE_WALL);
    public static final BlockItem POLISHED_DIORITE_WALL = fromBlock(NewBlocks.POLISHED_DIORITE_WALL);
    public static final BlockItem POLISHED_ANDESITE_WALL = fromBlock(NewBlocks.POLISHED_ANDESITE_WALL);
    public static final BlockItem SMOOTH_STONE_STAIRS = fromBlock(NewBlocks.SMOOTH_STONE_STAIRS);
    public static final BlockItem SMOOTH_STONE_WALL = fromBlock(NewBlocks.SMOOTH_STONE_WALL);
    public static final BlockItem CUT_SANDSTONE_STAIRS = fromBlock(NewBlocks.CUT_SANDSTONE_STAIRS);
    public static final BlockItem CUT_SANDSTONE_WALL = fromBlock(NewBlocks.CUT_SANDSTONE_WALL);
    public static final BlockItem CUT_RED_SANDSTONE_STAIRS = fromBlock(NewBlocks.CUT_RED_SANDSTONE_STAIRS);
    public static final BlockItem CUT_RED_SANDSTONE_WALL = fromBlock(NewBlocks.CUT_RED_SANDSTONE_WALL);
    public static final BlockItem CRACKED_STONE_BRICK_SLAB = fromBlock(NewBlocks.CRACKED_STONE_BRICK_SLAB);
    public static final BlockItem CRACKED_STONE_BRICK_STAIRS = fromBlock(NewBlocks.CRACKED_STONE_BRICK_STAIRS);
    public static final BlockItem CRACKED_STONE_BRICK_WALL = fromBlock(NewBlocks.CRACKED_STONE_BRICK_WALL);
    public static final BlockItem CRACKED_NETHER_BRICK_SLAB = fromBlock(NewBlocks.CRACKED_NETHER_BRICK_SLAB);
    public static final BlockItem CRACKED_NETHER_BRICK_STAIRS = fromBlock(NewBlocks.CRACKED_NETHER_BRICK_STAIRS);
    public static final BlockItem CRACKED_NETHER_BRICK_WALL = fromBlock(NewBlocks.CRACKED_NETHER_BRICK_WALL);
    public static final BlockItem CRACKED_NETHER_BRICK_FENCE = fromBlock(NewBlocks.CRACKED_NETHER_BRICK_FENCE);
    public static final BlockItem CRACKED_NETHER_BRICK_FENCE_GATE = fromBlock(NewBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
    public static final BlockItem RED_NETHER_BRICK_FENCE = fromBlock(NewBlocks.RED_NETHER_BRICK_FENCE);
    public static final BlockItem RED_NETHER_BRICK_FENCE_GATE = fromBlock(NewBlocks.RED_NETHER_BRICK_FENCE_GATE);
    public static final BlockItem NETHER_BRICK_FENCE_GATE = fromBlock(NewBlocks.NETHER_BRICK_FENCE_GATE);
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = fromBlock(NewBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = fromBlock(NewBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
    public static final BlockItem CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = fromBlock(NewBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
    public static final BlockItem QUARTZ_BRICK_SLAB = fromBlock(NewBlocks.QUARTZ_BRICK_SLAB);
    public static final BlockItem QUARTZ_BRICK_STAIRS = fromBlock(NewBlocks.QUARTZ_BRICK_STAIRS);
    public static final BlockItem QUARTZ_BRICK_WALL = fromBlock(NewBlocks.QUARTZ_BRICK_WALL);
    public static final BlockItem QUARTZ_BRICK_FENCE = fromBlock(NewBlocks.QUARTZ_BRICK_FENCE);
    public static final BlockItem QUARTZ_BRICK_FENCE_GATE = fromBlock(NewBlocks.QUARTZ_BRICK_FENCE_GATE);
    public static final BlockItem CRACKED_DEEPSLATE_BRICK_SLAB = fromBlock(NewBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
    public static final BlockItem CRACKED_DEEPSLATE_BRICK_STAIRS = fromBlock(NewBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
    public static final BlockItem CRACKED_DEEPSLATE_BRICK_WALL = fromBlock(NewBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
    public static final BlockItem CRACKED_DEEPSLATE_TILE_SLAB = fromBlock(NewBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
    public static final BlockItem CRACKED_DEEPSLATE_TILE_STAIRS = fromBlock(NewBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
    public static final BlockItem CRACKED_DEEPSLATE_TILE_WALL = fromBlock(NewBlocks.CRACKED_DEEPSLATE_TILE_WALL);
    public static final BlockItem TUFF_SLAB = fromBlock(NewBlocks.TUFF_SLAB);
    public static final BlockItem TUFF_STAIRS = fromBlock(NewBlocks.TUFF_STAIRS);
    public static final BlockItem TUFF_WALL = fromBlock(NewBlocks.TUFF_WALL);
    public static final BlockItem CALCITE_SLAB = fromBlock(NewBlocks.CALCITE_SLAB);
    public static final BlockItem CALCITE_STAIRS = fromBlock(NewBlocks.CALCITE_STAIRS);
    public static final BlockItem CALCITE_WALL = fromBlock(NewBlocks.CALCITE_WALL);
    public static final BlockItem SMOOTH_BASALT_SLAB = fromBlock(NewBlocks.SMOOTH_BASALT_SLAB);
    public static final BlockItem SMOOTH_BASALT_STAIRS = fromBlock(NewBlocks.SMOOTH_BASALT_STAIRS);
    public static final BlockItem SMOOTH_BASALT_WALL = fromBlock(NewBlocks.SMOOTH_BASALT_WALL);
    public static final BlockItem SCULK_STAIRS = fromBlock(NewBlocks.SCULK_STAIRS);
    public static final BlockItem SCULK_SLAB = fromBlock(NewBlocks.SCULK_SLAB);
    public static final BlockItem SCULK_WALL = fromBlock(NewBlocks.SCULK_WALL);
    public static final BlockItem SCULK_FENCE = fromBlock(NewBlocks.SCULK_FENCE);
    public static final BlockItem SCULK_FENCE_GATE = fromBlock(NewBlocks.SCULK_FENCE_GATE);
    
    public static final BlockItem fromBlock(Block block) {
        BlockItem item = new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
        common(block, item);
        return item;
    }

    public static final void common(Block parent, Item item) {
        var registryKey = Registry.BLOCK.getKey(parent);
        
        Identifier blockName = null;
        if (registryKey.isPresent()) {
             blockName = registryKey.get().getValue();
        }
        
        if (blockName == null) {
            LOGGER.warn("Problem adding automatic name to: " + item + " parent doesn't exist on registry");
            return;
        }
        
        ITEMS.add(new Pair<>(item, blockName));
    }
    
    public static final void register() {
        ITEMS.forEach(pair -> Registry.register(Registry.ITEM, pair.getRight(), pair.getLeft()));
    }
}
