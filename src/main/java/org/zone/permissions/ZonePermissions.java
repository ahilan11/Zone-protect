package org.zone.permissions;

@SuppressWarnings("unused")
public enum ZonePermissions implements ZonePermission {
    //meta region
    REGION_CREATE_BOUNDS_EXACT(false, "zone", "region", "create", "bounds", "exact"),
    REGION_CREATE_BOUNDS_CHUNK(false, "zone", "region", "create", "bounds", "chunk"),
    REGION_CREATE_SUB_BOUNDS_EXACT(true, "zone", "region", "create", "sub", "bounds", "exact"),
    REGION_CREATE_SUB_BOUNDS_CHUNK(true, "zone", "region", "create", "sub", "bounds", "chunk"),
    REGION_BASIC_INFO(true, "zone", "region", "info", "basic"),
    REGION_ADMIN_INFO(false, "zone", "region", "info", "admin"),
    REGION_EDIT_BOUNDS_EXACT(false, "zone", "region", "edit", "bounds", "exact"),
    REGION_EDIT_BOUNDS_CHUNK(false, "zone", "region", "edit", "bounds", "chunk"),
    REGION_LEAVE(true, "zone", "region", "leave"),
    REGION_INFO_SHOW_BOUNDS(true, "zone", "region", "info", "show"),

    //meta region override
    OVERRIDE_REGION_CREATE_BOUNDS_EXACT(false,
            "zone",
            "override",
            "region",
            "create",
            "bounds",
            "exact"),
    OVERRIDE_REGION_CREATE_BOUNDS_CHUNK(false,
            "zone",
            "override",
            "region",
            "create",
            "bounds",
            "chunk"),
    OVERRIDE_REGION_CREATE_SUB_BOUNDS_EXACT(false,
            "zone",
            "override",
            "region",
            "create",
            "sub",
            "bounds",
            "exact"),
    OVERRIDE_REGION_CREATE_SUB_BOUNDS_CHUNK(false,
            "zone",
            "override",
            "region",
            "create",
            "sub",
            "bounds",
            "chunk"),
    OVERRIDE_REGION_BASIC_INFO(false, "zone", "override", "region", "info", "basic"),
    OVERRIDE_REGION_ADMIN_INFO(false, "zone", "override", "region", "info", "admin"),
    OVERRIDE_REGION_EDIT_BOUNDS_EXACT(false,
            "zone",
            "override",
            "region",
            "edit",
            "bounds",
            "exact"),
    OVERRIDE_REGION_EDIT_BOUNDS_CHUNK(false,
            "zone",
            "override",
            "region",
            "edit",
            "bounds",
            "chunk"),
    OVERRIDE_REGION_INFO_SHOW_BOUNDS(false, "zone", "override", "region", "info", "show"),


    //place block
    FLAG_BLOCK_INTERACTION_PLACE_ENABLE(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "enable"),
    FLAG_BLOCK_INTERACTION_PLACE_VIEW(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "view"),
    FLAG_BLOCK_INTERACTION_PLACE_SET_GROUP(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "group"),

    //place block override
    OVERRIDE_FLAG_BLOCK_INTERACTION_PLACE_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "enable"),
    OVERRIDE_FLAG_BLOCK_INTERACTION_PLACE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "view"),
    OVERRIDE_FLAG_BLOCK_INTERACTION_PLACE_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "place",
            "group"),

    //break block
    FLAG_BLOCK_INTERACTION_BREAK_ENABLE(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "enable"),
    FLAG_BLOCK_INTERACTION_BREAK_VIEW(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "view"),
    FLAG_BLOCK_INTERACTION_BREAK_SET_GROUP(true,
            "zone",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "group"),

    //break block override
    OVERRIDE_FLAG_BLOCK_INTERACTION_BREAK_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "enable"),
    OVERRIDE_FLAG_BLOCK_INTERACTION_BREAK_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "view"),
    OVERRIDE_FLAG_BLOCK_INTERACTION_BREAK_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "block",
            "interaction",
            "break",
            "group"),

    //door interaction
    FLAG_DOOR_INTERACTION_ENABLE(true, "zone", "region", "flag", "door", "interaction", "enable"),
    FLAG_DOOR_INTERACTION_VIEW(true, "zone", "region", "flag", "door", "interaction", "view"),
    FLAG_DOOR_INTERACTION_SET_GROUP(true,
            "zone",
            "region",
            "flag",
            "door",
            "interaction",
            "set",
            "group"),

    //door interaction override
    OVERRIDE_FLAG_DOOR_INTERACTION_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "door",
            "interaction",
            "enable"),
    OVERRIDE_FLAG_DOOR_INTERACTION_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "door",
            "interaction",
            "view"),
    OVERRIDE_FLAG_DOOR_INTERACTION_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "door",
            "interaction",
            "set",
            "group"),

    //itemframe interaction
    FLAG_ITEM_FRAME_INTERACTION_ENABLE(true,
            "zone",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "enable"),
    FLAG_ITEM_FRAME_INTERACTION_VIEW(true,
            "zone",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "view"),
    FLAG_ITEM_FRAME_INTERACTION_SET_GROUP(true,
            "zone",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "group"),

    //itemframe interaction override
    OVERRIDE_FLAG_ITEM_FRAME_INTERACTION_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "enable"),
    OVERRIDE_FLAG_ITEM_FRAME_INTERACTION_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "view"),
    OVERRIDE_FLAG_ITEM_FRAME_INTERACTION_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "itemframe",
            "interaction",
            "break",
            "group"),

    //member
    FLAG_MEMBER_CHANGE(true, "zone", "region", "flag", "member", "group", "change"),
    FLAG_MEMBERS_VIEW(true, "zone", "region", "flag", "member", "group", "view"),

    //member override
    OVERRIDE_FLAG_MEMBER_CHANGE(false,
            "zone",
            "override",
            "region",
            "flag",
            "member",
            "group",
            "change"),
    OVERRIDE_FLAG_MEMBERS_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "member",
            "group",
            "view"),


    //greetings
    FLAG_GREETINGS_MESSAGE_SET(true, "zone", "region", "flag", "greetings", "set", "message"),
    FLAG_GREETINGS_MESSAGE_VIEW(true, "zone", "region", "flag", "greetings", "view"),
    FLAG_GREETINGS_MESSAGE_REMOVE(true, "zone", "region", "flag", "greetings", "remove"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_CHAT(true, "zone", "region", "flag", "greetings", "display", "set", "chat"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_SUBTITLE(true, "zone", "region", "flag", "greetings"
            , "display", "set", "title", "subtitle"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_FADE_IN(true, "zone", "region", "flag", "greetings",
            "display", "set", "title", "fade", "in"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_STAY(true, "zone", "region", "flag", "greetings",
            "display", "set", "title", "stay"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_FADE_OUT(true, "zone", "region", "flag", "greetings",
            "display", "set", "title", "fade", "out"),
    FLAG_GREETINGS_MESSAGE_DISPLAY_SET_BOSS_BAR(true, "zone", "region", "flag", "greetings", "display", "set", "boss", "bar"),

    //greetings override
    OVERRIDE_FLAG_GREETINGS_MESSAGE_SET(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "set",
            "message"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "view"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_REMOVE(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "remove"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_CHAT(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "chat"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_SUBTITLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "title",
            "subtitle"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_FADE_IN(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "title",
            "fade",
            "in"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_STAY(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "title",
            "stay"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_TITLE_FADE_OUT(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "title",
            "fade",
            "out"),
    OVERRIDE_FLAG_GREETINGS_MESSAGE_DISPLAY_SET_BOSS_BAR(false,
            "zone",
            "override",
            "region",
            "flag",
            "greetings",
            "display",
            "set",
            "boss",
            "bar"),

    //leavings
    FLAG_LEAVING_MESSAGE_SET(true, "zone", "region", "flag", "leaving", "set", "message"),
    FLAG_LEAVING_MESSAGE_VIEW(true, "zone", "region", "flag", "leaving", "view"),
    FLAG_LEAVING_MESSAGE_REMOVE(true, "zone", "region", "flag", "leaving", "remove"),
    FLAG_LEAVING_MESSAGE_SET_CHAT(true, "zone", "region", "flag", "leaving", "display", "set", "chat"),
    FLAG_LEAVING_MESSAGE_SET_TITLE_SUBTITLE(true, "zone", "region", "flag", "leaving", "display", "set", "title", "subtitle"),
    FLAG_LEAVING_MESSAGE_SET_TITLE_FADE_IN(true, "zone", "region", "flag", "leaving", "display", "set", "title", "fade", "in"),
    FLAG_LEAVING_MESSAGE_SET_TITLE_STAY(true, "zone", "region", "flag", "leaving", "display", "set", "title", "stay"),
    FLAG_LEAVING_MESSAGE_SET_TITLE_FADE_OUT(true, "zone", "region", "flag", "leaving", "display", "set", "title", "fade", "out"),
    FLAG_LEAVING_MESSAGE_SET_BOSS_BAR(true, "zone", "region", "flag", "leaving", "display", "set", "boss", "bar"),

    //leavings override
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "set",
            "message"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "view"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_REMOVE(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "remove"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_CHAT(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "chat"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_TITLE_SUBTITLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "title",
            "subtitle"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_TITLE_FADE_IN(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "title",
            "fade",
            "in"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_TITLE_STAY(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "title",
            "stay"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_TITLE_FADE_OUT(false, "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "title",
            "fade",
            "out"),
    OVERRIDE_FLAG_LEAVING_MESSAGE_SET_BOSS_BAR(false,
            "zone",
            "override",
            "region",
            "flag",
            "leaving",
            "display",
            "set",
            "boss",
            "bar"),

    //entry player
    FLAG_ENTRY_PLAYER_SET_GROUP(true, "zone", "region", "flag", "entry", "player", "set", "group"),
    FLAG_ENTRY_PLAYER_VIEW(true, "zone", "region", "flag", "entry", "player", "view"),
    FLAG_ENTRY_PLAYER_ENABLE(true, "zone", "region", "flag", "entry", "player", "enable"),

    //entry player override
    OVERRIDE_FLAG_ENTRY_PLAYER_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "entry",
            "player",
            "set",
            "group"),
    OVERRIDE_FLAG_ENTRY_PLAYER_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "entry",
            "player",
            "view"),
    OVERRIDE_FLAG_ENTRY_PLAYER_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "entry",
            "player",
            "enable"),

    //entry monster
    FLAG_ENTRY_MONSTER_VIEW(true, "zone", "region", "flag", "entry", "monster", "view"),
    FLAG_ENTRY_MONSTER_ENABLE(true, "zone", "region", "flag", "entry", "monster", "enable"),

    //entry monster override
    OVERRIDE_FLAG_ENTRY_MONSTER_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "entry",
            "monster",
            "view"),
    OVERRIDE_FLAG_ENTRY_MONSTER_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "entry",
            "monster",
            "enable"),

    //damage attack
    FLAG_DAMAGE_ATTACK_SET_GROUP(true,
            "zone",
            "region",
            "flag",
            "damage",
            "attack",
            "set",
            "group"),
    FLAG_DAMAGE_ATTACK_VIEW(true, "zone", "region", "flag", "damage", "attack", "view"),
    FLAG_DAMAGE_ATTACK_ENABLE(true, "zone", "region", "flag", "damage", "attack", "enable"),

    //damage attack override
    OVERRIDE_FLAG_DAMAGE_ATTACK_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "attack",
            "set",
            "group"),
    OVERRIDE_FLAG_DAMAGE_ATTACK_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "attack",
            "view"),
    OVERRIDE_FLAG_DAMAGE_ATTACK_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "attack",
            "enable"),

    //damage fall
    FLAG_DAMAGE_FALL_SET_GROUP(true, "zone", "region", "flag", "damage", "fall", "set", "group"),
    FLAG_DAMAGE_FALL_VIEW(true, "zone", "region", "flag", "damage", "fall", "view"),
    FLAG_DAMAGE_FALL_ENABLE(true, "zone", "region", "flag", "damage", "fall", "enable"),

    //damage fall override
    OVERRIDE_FLAG_DAMAGE_FALL_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fall",
            "set",
            "group"),
    OVERRIDE_FLAG_DAMAGE_FALL_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fall",
            "view"),
    OVERRIDE_FLAG_DAMAGE_FALL_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fall",
            "enable"),

    //tnt defuse
    FLAG_TNT_DEFUSE_ENABLE(false, "zone", "region", "flag", "tnt", "defuse", "enable"),
    FLAG_TNT_DEFUSE_VIEW(false, "zone", "region", "flag", "tnt", "defuse", "view"),

    //tnt defuse override
    OVERRIDE_FLAG_TNT_DEFUSE_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "tnt",
            "defuse",
            "enable"),
    OVERRIDE_FLAG_TNT_DEFUSE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "tnt",
            "defuse",
            "view"),

    //fire damage
    FLAG_FIRE_DAMAGE_ENABLE(false, "zone", "region", "flag", "damage", "fire", "enable"),
    FLAG_FIRE_DAMAGE_SET_GROUP(false, "zone", "region", "flag", "damage", "fire", "set", "group"),
    FLAG_FIRE_DAMAGE_VIEW(false, "zone", "region", "flag", "damage", "fire", "view"),

    //fire damage override
    OVERRIDE_FLAG_FIRE_DAMAGE_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fire",
            "enable"),
    OVERRIDE_FLAG_FIRE_DAMAGE_SET_GROUP(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fire",
            "set",
            "group"),
    OVERRIDE_FLAG_FIRE_DAMAGE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "damage",
            "fire",
            "view"),

    //zone visibility
    ZONE_VISIBILITY_SET(false, "zone", "region", "visibility", "set"),
    ZONE_VISIBILITY_VIEW(false, "zone", "region", "visibility", "view"),

    //zone visibility override
    OVERRIDE_ZONE_VISIBILITY_SET(false, "zone", "override", "region", "visibility", "set"),
    OVERRIDE_ZONE_VISIBILITY_VIEW(false, "zone", "override", "region", "visibility", "view"),

    //farmland trample
    FLAG_FARMLAND_TRAMPLE_SET_ENABLE(false,
            "zone",
            "region",
            "flag",
            "farmland",
            "trample",
            "set",
            "enable"),
    FLAG_FARMLAND_TRAMPLE_VIEW(false, "zone", "region", "flag", "farmland", "trample", "view"),

    //farmland trample override
    OVERRIDE_FLAG_FARMLAND_TRAMPLE_SET_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "farmland",
            "trample",
            "set",
            "enable"),
    OVERRIDE_FLAG_FARMLAND_TRAMPLE_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "farmland",
            "trample",
            "view"),

    //creeper grief
    FLAG_CREEPER_GRIEF_ENABLE(false, "zone", "region", "flag", "grief", "creeper", "set", "enable"),
    FLAG_CREEPER_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "creeper", "view"),

    //override creeper grief
    OVERRIDE_FLAG_CREEPER_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "creeper",
            "set",
            "enable"),
    OVERRIDE_FLAG_CREEPER_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "creeper",
            "view"),

    //enderman grief
    FLAG_ENDERMAN_GRIEF_ENABLE(false,
            "zone",
            "region",
            "flag",
            "grief",
            "enderman",
            "set",
            "enable"),
    FLAG_ENDERMAN_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "enderman", "view"),

    //override enderman grief
    OVERRIDE_FLAG_ENDERMAN_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "enderman",
            "set",
            "enable"),
    OVERRIDE_FLAG_ENDERMAN_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "enderman",
            "view"),

    //zombie grief
    FLAG_ZOMBIE_GRIEF_ENABLE(false, "zone", "region", "flag", "grief", "zombie", "set", "enable"),
    FLAG_ZOMBIE_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "zombie", "view"),

    //zombie grief override
    OVERRIDE_FLAG_ZOMBIE_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "zombie",
            "set",
            "enable"),
    OVERRIDE_FLAG_ZOMBIE_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "zombie",
            "view"),

    //skeleton grief
    FLAG_SKELETON_GRIEF_ENABLE(false,
            "zone",
            "region",
            "flag",
            "grief",
            "skeleton",
            "set",
            "enable"),
    FLAG_SKELETON_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "skeleton", "view"),

    //skeleton grief override
    OVERRIDE_FLAG_SKELETON_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "skeleton",
            "set",
            "enable"),
    OVERRIDE_FLAG_SKELETON_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "skeleton",
            "view"),

    //enderDragon grief
    FLAG_ENDERDRAGON_GRIEF_ENABLE(false,
            "zone",
            "region",
            "flag",
            "grief",
            "enderdragon",
            "set",
            "enable"),
    FLAG_ENDERDRAGON_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "enderdragon", "view"),

    //enderDragon grief override
    OVERRIDE_FLAG_ENDERDRAGON_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "enderdragon",
            "set",
            "enable"),
    OVERRIDE_FLAG_ENDERDRAGON_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "enderdragon",
            "view"),

    //wither grief
    FLAG_WITHER_GRIEF_ENABLE(false, "zone", "region", "flag", "grief", "wither", "set", "enable"),
    FLAG_WITHER_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "wither", "view"),

    //override wither grief
    OVERRIDE_FLAG_WITHER_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "wither",
            "set",
            "enable"),
    OVERRIDE_FLAG_WITHER_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "wither",
            "view"),

    //enderMite grief
    FLAG_ENDERMITE_GRIEF_ENABLE(false,
            "zone",
            "region",
            "flag",
            "grief",
            "endermite",
            "set",
            "enable"),
    FLAG_ENDERMITE_GRIEF_VIEW(false, "zone", "region", "flag", "grief", "endermite", "view"),

    //override endermite grief
    OVERRIDE_FLAG_ENDERMITE_GRIEF_ENABLE(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "endermite",
            "set",
            "enable"),
    OVERRIDE_FLAG_ENDERMITE_GRIEF_VIEW(false,
            "zone",
            "override",
            "region",
            "flag",
            "grief",
            "endermite",
            "view"),

    //join zone
    FLAG_JOIN_ZONE(false, "zone", "join"),

    //override join zone
    OVERRIDE_FLAG_JOIN_ZONE(false, "zone", "override", "join"),
    //invite player
    FLAG_INVITE_PLAYER(false, "zone", "invite", "players"),
    FLAG_INVITE_PLAYER_VIEW(false, "zone", "view", "invites"),
    FLAG_INVITE_ACCEPT(false, "zone", "invite", "accept"),
    FLAG_INVITE_DENY(false, "zone", "invite", "deny"),

    //invite player override
    OVERRIDE_FLAG_INVITE_PLAYER(false, "zone", "override", "invite", "players"),
    OVERRIDE_FLAG_INVITE_PLAYER_VIEW(false, "zone", "override", "invite", "view"),
    OVERRIDE_FLAG_INVITE_ACCEPT(false, "zone", "override", "invite", "accept"),
    OVERRIDE_FLAG_INVITE_DENY(false, "zone", "override", "invite", "deny"),

    //balance
    FLAG_BALANCE_VIEW(true, "zone", "region", "flag", "balance", "view"),

    //custom groups
    CREATE_CUSTOM_GROUP(false, "zone", "create", "group"),

    //custom groups override
    OVERRIDE_CREATE_CUSTOM_GROUP(false, "zone", "override", "create", "group"),

    //edit bounds
    FLAG_EDIT_BOUNDS_START(false, "zone", "region", "edit", "bounds", "start"),
    FLAG_EDIT_BOUNDS_END(false, "zone", "region", "edit", "bounds", "end"),
    //edit bounds override
    OVERRIDE_FLAG_EDIT_BOUNDS_START(false, "zone", "override", "region", "edit", "bounds", "start"),
    OVERRIDE_FLAG_EDIT_BOUNDS_END(false, "zone", "override", "region", "edit", "bounds", "end"),

    //balance override
    OVERRIDE_FLAG_BALANCE_VIEW(false, "zone", "override", "region", "flag", "balance", "view"),

    //service commands
    KICK(true, "zone", "region", "kick"),
    BAN(true, "zone", "region", "ban"),
    TEMP_BAN(true,"zone", "region", "ban", "temp"),
    UNBAN(true, "zone", "region", "unban"),

    //service commands override
    OVERRIDE_KICK(false, "zone", "override", "region", "kick"),
    OVERRIDE_BAN(false, "zone", "override", "region", "ban"),
    OVERRIDE_TEMP_BAN(false,"zone", "override", "region", "ban", "temp"),
    OVERRIDE_UNBAN(false, "zone", "override", "region", "unban"),

    //shops
    SHOPS_DISPLAY_CREATE(true, "zone", "region", "shop", "create", "display"),
    SHOPS_ITEM_SELL_ADD(true, "zone", "region", "shop", "sell", "item", "add"),

    //bypasses
    BYPASS_DOOR_INTERACTION(false, "zone", "bypass", "interaction", "door"),
    BYPASS_BLOCK_INTERACTION_PLACE(false, "zone", "bypass", "interaction", "block", "place"),
    BYPASS_BLOCK_INTERACTION_BREAK(false, "zone", "bypass", "interaction", "block", "break"),
    BYPASS_ITEM_FRAME_INTERACTION(false, "zone", "bypass", "interaction", "itemframe"),
    BYPASS_DAMAGE_FALL(false, "zone", "bypass", "damage", "fall"),
    BYPASS_DAMAGE_ATTACK(false, "zone", "bypass", "damage", "attack"),
    BYPASS_ENTRY(false, "zone", "bypass", "entry"),
    BYPASS_DAMAGE_FIRE(false, "zone", "bypass", "damage", "fire");

    private final String[] nodes;
    private final boolean isDefault;

    ZonePermissions(boolean isDefault, String... nodes) {
        this.isDefault = isDefault;
        this.nodes = nodes;
    }

    @Override
    public String[] getPermissionNode() {
        return this.nodes;
    }

    @Override
    public boolean isDefaultAllowed() {
        return this.isDefault;
    }
}
