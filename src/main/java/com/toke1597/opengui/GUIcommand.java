package com.toke1597.opengui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            Inventory gui = Bukkit.createInventory(p, 5*9, ChatColor.AQUA+""+ChatColor.BOLD+"JUKEBOX");
            ItemStack creative = new ItemStack(Material.GRASS_BLOCK,1);
            ItemStack credits = new ItemStack(Material.BEDROCK,1);
            ItemStack disc11 = new ItemStack(Material.MUSIC_DISC_11,1);
            ItemStack disc13 = new ItemStack(Material.MUSIC_DISC_13,1);
            ItemStack blocks = new ItemStack(Material.MUSIC_DISC_BLOCKS,1);
            ItemStack cat = new ItemStack(Material.MUSIC_DISC_CAT,1);
            ItemStack chirp = new ItemStack(Material.MUSIC_DISC_CHIRP,1);
            ItemStack far = new ItemStack(Material.MUSIC_DISC_FAR,1);
            ItemStack mall = new ItemStack(Material.MUSIC_DISC_MALL,1);
            ItemStack mellohi = new ItemStack(Material.MUSIC_DISC_MELLOHI,1);
            ItemStack stal = new ItemStack(Material.MUSIC_DISC_STAL,1);
            ItemStack strad = new ItemStack(Material.MUSIC_DISC_STRAD,1);
            ItemStack wait = new ItemStack(Material.MUSIC_DISC_WAIT,1);
            ItemStack ward = new ItemStack(Material.MUSIC_DISC_WARD,1);
            ItemStack dragon = new ItemStack(Material.DRAGON_EGG,1);
            ItemStack end = new ItemStack(Material.END_STONE,1);
            ItemStack game = new ItemStack(Material.EGG,1);
            ItemStack menu = new ItemStack(Material.REDSTONE_LAMP,1);
            ItemStack underwater = new ItemStack(Material.WATER_BUCKET,1);
            ItemStack stop = new ItemStack(Material.BARRIER,1);
            ItemStack otherside = new ItemStack(Material.NETHER_BRICK,1);
            ItemStack pigstep = new ItemStack(Material.NETHER_BRICK_FENCE,1);
            ItemStack nether_basalt_deltas = new ItemStack(Material.NETHER_BRICK_SLAB,1);
            ItemStack nether_crimson_forest = new ItemStack(Material.NETHER_BRICK_STAIRS,1);
            ItemStack nether_nether_wastes = new ItemStack(Material.LAVA_BUCKET,1);
            ItemStack nether_soul_sand_valley = new ItemStack(Material.SOUL_SAND,1);
            ItemStack nether_warped_forest = new ItemStack(Material.WARPED_FUNGUS,1);
            ItemStack overworld_deep_dark = new ItemStack(Material.OBSIDIAN,1);
            ItemStack overworld_dripstone_caves = new ItemStack(Material.DRIPSTONE_BLOCK,1);
            ItemStack overworld_frozen_peaks = new ItemStack(Material.ICE,1);
            ItemStack overworld_grove = new ItemStack(Material.MANGROVE_LOG,1);
            ItemStack overworld_jagged_peaks = new ItemStack(Material.SNOW_BLOCK,1);
            ItemStack overworld_jungle_and_forest = new ItemStack(Material.JUNGLE_LEAVES,1);
            ItemStack overworld_lush_caves = new ItemStack(Material.FLOWER_POT,1);
            ItemStack overworld_meadow = new ItemStack(Material.DANDELION,1);
            ItemStack overworld_old_growth_taiga = new ItemStack(Material.DARK_OAK_LOG,1);
            ItemStack overworld_snowy_slopes = new ItemStack(Material.POWDER_SNOW_BUCKET,1);
            ItemStack overworld_stony_peaks = new ItemStack(Material.STONE,1);
            ItemStack overworld_swamp = new ItemStack(Material.OCHRE_FROGLIGHT,1);

            ItemMeta creative_meta = creative.getItemMeta();
            ItemMeta credits_meta = credits.getItemMeta();
            ItemMeta disc11_meta = disc11.getItemMeta();
            ItemMeta disc13_meta = disc13.getItemMeta();
            ItemMeta blocks_meta = blocks.getItemMeta();
            ItemMeta cat_meta = cat.getItemMeta();
            ItemMeta chirp_meta = chirp.getItemMeta();
            ItemMeta far_meta = far.getItemMeta();
            ItemMeta mall_meta = mall.getItemMeta();
            ItemMeta mellohi_meta = mellohi.getItemMeta();
            ItemMeta stal_meta = stal.getItemMeta();
            ItemMeta strad_meta = strad.getItemMeta();
            ItemMeta wait_meta = wait.getItemMeta();
            ItemMeta ward_meta = wait.getItemMeta();
            ItemMeta dragon_meta = dragon.getItemMeta();
            ItemMeta end_meta = end.getItemMeta();
            ItemMeta game_meta = game.getItemMeta();
            ItemMeta menu_meta = menu.getItemMeta();
            ItemMeta underwater_meta = underwater.getItemMeta();
            ItemMeta stop_meta = stop.getItemMeta();
            ItemMeta otherside_meta = otherside.getItemMeta();
            ItemMeta pigstep_meta = pigstep.getItemMeta();
            ItemMeta nether_basalt_deltas_meta = nether_basalt_deltas.getItemMeta();
            ItemMeta nether_crimson_forest_meta = nether_crimson_forest.getItemMeta();
            ItemMeta nether_nether_wastes_meta = nether_nether_wastes.getItemMeta();
            ItemMeta nether_soul_sand_valley_meta = nether_soul_sand_valley.getItemMeta();
            ItemMeta nether_warped_forest_meta = nether_warped_forest.getItemMeta();
            ItemMeta overworld_deep_dark_meta = overworld_deep_dark.getItemMeta();
            ItemMeta overworld_dripstone_caves_meta = overworld_dripstone_caves.getItemMeta();
            ItemMeta overworld_frozen_peaks_meta = overworld_frozen_peaks.getItemMeta();
            ItemMeta overworld_grove_meta = overworld_grove.getItemMeta();
            ItemMeta overworld_jagged_peaks_meta = overworld_jagged_peaks.getItemMeta();
            ItemMeta overworld_jungle_and_forest_meta = overworld_jungle_and_forest.getItemMeta();
            ItemMeta overworld_lush_caves_meta = overworld_lush_caves.getItemMeta();
            ItemMeta overworld_meadow_meta = overworld_meadow.getItemMeta();
            ItemMeta overworld_old_growth_taiga_meta = overworld_old_growth_taiga.getItemMeta();
            ItemMeta overworld_snowy_slopes_meta = overworld_snowy_slopes.getItemMeta();
            ItemMeta overworld_stony_peaks_meta = overworld_stony_peaks.getItemMeta();
            ItemMeta overworld_swamp_meta = overworld_swamp.getItemMeta();

            creative_meta.setDisplayName(ChatColor.GREEN + "Creative");
            credits_meta.setDisplayName(ChatColor.GREEN + "Credits");
            disc11_meta.setDisplayName(ChatColor.BLACK + "11");
            disc13_meta.setDisplayName(ChatColor.YELLOW + "13");
            blocks_meta.setDisplayName(ChatColor.RED + "Blocks");
            cat_meta.setDisplayName(ChatColor.GREEN + "Cat");
            chirp_meta.setDisplayName(ChatColor.DARK_RED + "Chirp");
            far_meta.setDisplayName(ChatColor.DARK_GREEN + "Far");
            mall_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mall");
            mellohi_meta.setDisplayName(ChatColor.DARK_PURPLE + "Mellohi");
            stal_meta.setDisplayName(ChatColor.BLACK + "Stal");
            strad_meta.setDisplayName(ChatColor.GRAY + "Strad");
            wait_meta.setDisplayName(ChatColor.BLUE + "Wait");
            ward_meta.setDisplayName(ChatColor.GREEN + "Ward");
            dragon_meta.setDisplayName(ChatColor.GREEN + "Dragon");
            end_meta.setDisplayName(ChatColor.GREEN + "End");
            game_meta.setDisplayName(ChatColor.GREEN + "Game");
            menu_meta.setDisplayName(ChatColor.GREEN + "Menu");
            underwater_meta.setDisplayName(ChatColor.GREEN + "UnderWater");
            stop_meta.setDisplayName(ChatColor.RED + "Stop");
            otherside_meta.setDisplayName(ChatColor.GREEN + "Otherside");
            pigstep_meta.setDisplayName(ChatColor.GREEN + "Pigstep");
            nether_basalt_deltas_meta.setDisplayName(ChatColor.GREEN + "Basalt deltas");
            nether_crimson_forest_meta.setDisplayName(ChatColor.GREEN + "Crimson forest");
            nether_nether_wastes_meta.setDisplayName(ChatColor.GREEN + "Nehter wastes");
            nether_soul_sand_valley_meta.setDisplayName(ChatColor.GREEN + "Soul sand valley");
            nether_warped_forest_meta.setDisplayName(ChatColor.GREEN + "Warped forest");
            overworld_deep_dark_meta.setDisplayName(ChatColor.GREEN + "Deep dark");
            overworld_dripstone_caves_meta.setDisplayName(ChatColor.GREEN + "Dripstone caves");
            overworld_frozen_peaks_meta.setDisplayName(ChatColor.GREEN + "Frozen peaks");
            overworld_grove_meta.setDisplayName(ChatColor.GREEN + "Grove");
            overworld_jagged_peaks_meta.setDisplayName(ChatColor.GREEN + "Jagged_peaks");
            overworld_jungle_and_forest_meta.setDisplayName(ChatColor.GREEN + "Jungle and Forest");
            overworld_lush_caves_meta.setDisplayName(ChatColor.GREEN + "Lush caves");
            overworld_meadow_meta.setDisplayName(ChatColor.GREEN + "Meadow");
            overworld_old_growth_taiga_meta.setDisplayName(ChatColor.GREEN + "Old growth taiga");
            overworld_snowy_slopes_meta.setDisplayName(ChatColor.GREEN + "Snowy slopes");
            overworld_stony_peaks_meta.setDisplayName(ChatColor.GREEN + "Stony peaks");
            overworld_swamp_meta.setDisplayName(ChatColor.GREEN + "Swamp");


            creative.setItemMeta(creative_meta);
            credits.setItemMeta(credits_meta);
            disc11.setItemMeta(disc11_meta);
            disc13.setItemMeta(disc13_meta);
            blocks.setItemMeta(blocks_meta);
            cat.setItemMeta(cat_meta);
            chirp.setItemMeta(chirp_meta);
            far.setItemMeta(far_meta);
            mall.setItemMeta(mall_meta);
            mellohi.setItemMeta(mellohi_meta);
            wait.setItemMeta(wait_meta);
            ward.setItemMeta(ward_meta);
            stal.setItemMeta(stal_meta);
            strad.setItemMeta(strad_meta);
            dragon.setItemMeta(dragon_meta);
            end.setItemMeta(end_meta);
            game.setItemMeta(game_meta);
            menu.setItemMeta(menu_meta);
            underwater.setItemMeta(underwater_meta);
            stop.setItemMeta(stop_meta);
            otherside.setItemMeta(otherside_meta);
            pigstep.setItemMeta(pigstep_meta);
            nether_basalt_deltas.setItemMeta(nether_basalt_deltas_meta);
            nether_crimson_forest.setItemMeta(nether_crimson_forest_meta);
            nether_nether_wastes.setItemMeta(nether_nether_wastes_meta);
            nether_soul_sand_valley.setItemMeta(nether_soul_sand_valley_meta);
            nether_warped_forest.setItemMeta(nether_warped_forest_meta);
            overworld_deep_dark.setItemMeta(overworld_deep_dark_meta);
            overworld_dripstone_caves.setItemMeta(overworld_dripstone_caves_meta);
            overworld_frozen_peaks.setItemMeta(overworld_frozen_peaks_meta);
            overworld_grove.setItemMeta(overworld_grove_meta);
            overworld_jagged_peaks.setItemMeta(overworld_jagged_peaks_meta);
            overworld_jungle_and_forest.setItemMeta(overworld_jungle_and_forest_meta);
            overworld_lush_caves.setItemMeta(overworld_lush_caves_meta);
            overworld_meadow.setItemMeta(overworld_meadow_meta);
            overworld_old_growth_taiga.setItemMeta(overworld_old_growth_taiga_meta);
            overworld_snowy_slopes.setItemMeta(overworld_snowy_slopes_meta);
            overworld_stony_peaks.setItemMeta(overworld_stony_peaks_meta);
            overworld_swamp.setItemMeta(overworld_swamp_meta);


            gui.addItem(creative, credits, disc11, disc13, blocks, cat, chirp, far, mall, mellohi, wait, ward, stal, strad, dragon, end, game, menu, underwater,
                    otherside, pigstep, nether_basalt_deltas, nether_crimson_forest, nether_nether_wastes, nether_soul_sand_valley, nether_warped_forest,
                    overworld_deep_dark, overworld_dripstone_caves, overworld_frozen_peaks, overworld_grove, overworld_jagged_peaks, overworld_jungle_and_forest,
                    overworld_lush_caves, overworld_meadow, overworld_old_growth_taiga, overworld_snowy_slopes, overworld_stony_peaks, overworld_swamp,
                    stop);
            p.openInventory(gui);

        }
        return true;
    }
}
