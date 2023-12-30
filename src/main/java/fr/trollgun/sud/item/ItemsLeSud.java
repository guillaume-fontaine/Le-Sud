package fr.trollgun.sud.item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static final LeSudItem LE_SUD;

    static{
        LE_SUD = Registry.register(Registries.ITEM, new Identifier("sud", "le_sud"), new LeSudItem());
    }

}
