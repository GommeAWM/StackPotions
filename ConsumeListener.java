package reyd.Listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerItemConsumeEvent;
import cn.nukkit.item.Item;
import cn.nukkit.potion.Effect;

import java.util.Map;

public class ConsumeListener implements Listener {

    @EventHandler
    public void onItemConsume(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();

        Item item = event.getItem();

        if (item.getId() == 373 && item.getDamage() == 33) {

            String name = item.getName();
            String convert = name.replaceAll("\\D+", "");

            if (convert.isEmpty()) {
                return;
            }

            int result = Integer.parseInt(convert);

            result--;

            if (result > 0 && result < 65) {

                if (item.getName().equals(name)) {

                    Item item1 = Item.get(373, 33, 1).setCustomName("\uE154 §bPotion Strength II §c(§ax" + result + "§c)");

                    event.setCancelled(true);
                    Effect effect = Effect.getEffect(5).setDuration(1800).setAmplifier(1);
                    player.addEffect(effect);

                    Map<Integer, Item> inv = player.getInventory().getContents();

                    for (Map.Entry<Integer, Item> entry : inv.entrySet()) {
                        Integer get1 = entry.getKey();
                        Item item2 = entry.getValue();

                        if (item2.getId() == 373 && item2.getDamage() == 33){
                            if (get1 < 9){
                                if (item2.getName().equals(name)){

                                    inv.put(get1, item1);
                                    player.getInventory().setContents(inv);
                                    break;

                                }
                            }
                        }

                    }

                }


            } else {
                player.sendMessage("\uE154 §fYou have used up a §summon§f potion. §7(§c64 count§7)");
            }

        }

        if (item.getId() == 373 && item.getDamage() == 16) {

            String name = item.getName();
            String convert = name.replaceAll("\\D+", "");

            if (convert.isEmpty()) {
                return;
            }

            int result = Integer.parseInt(convert);

            result--;

            if (result > 0 && result < 65) {

                Item item1 = Item.get(373, 16, 1).setCustomName("\uE154 §bPotion Speed II §c(§ax" + result + "§c)");


                event.setCancelled(true);
                Effect effect = Effect.getEffect(1).setDuration(1800).setAmplifier(1);
                player.addEffect(effect);

                Map<Integer, Item> inv = player.getInventory().getContents();

                for (Map.Entry<Integer, Item> entry : inv.entrySet()) {
                    Integer get1 = entry.getKey();
                    Item item2 = entry.getValue();

                    if (item2.getId() == 373 && item2.getDamage() == 16){
                        if (get1 < 9){
                            if (item2.getName().equals(name)){

                                inv.put(get1, item1);
                                player.getInventory().setContents(inv);
                                break;

                            }
                        }
                    }

                }

            } else {
                player.sendMessage("\uE154 §fYou have used up a §summon§f potion. §7(§c64 count§7)");
            }

        }

        if (item.getId() == 373 && item.getDamage() == 29) {

            String name = item.getName();
            String convert = name.replaceAll("\\D+", "");

            if (convert.isEmpty()) {
                return;
            }

            int result = Integer.parseInt(convert);

            result--;

            if (result > 0 && result < 65) {

                Item item1 = Item.get(373, 29, 1).setCustomName("\uE154 §bPotions Regeneration I §c(§ax" + result + "§c)");

                event.setCancelled(true);
                Effect effect = Effect.getEffect(10).setDuration(2400).setAmplifier(0);
                player.addEffect(effect);

                Map<Integer, Item> inv = player.getInventory().getContents();

                for (Map.Entry<Integer, Item> entry : inv.entrySet()) {
                    Integer get1 = entry.getKey();
                    Item item2 = entry.getValue();

                    if (item2.getId() == 373 && item2.getDamage() == 29){
                        if (get1 < 9){
                            if (item2.getName().equals(name)){

                                inv.put(get1, item1);
                                player.getInventory().setContents(inv);
                                break;

                            }
                        }
                    }

                }

            } else {
                player.sendMessage("\uE154 §fYou have used up a §summon§f potion §7(§c64 count§7)");
            }

        }
    }

}
