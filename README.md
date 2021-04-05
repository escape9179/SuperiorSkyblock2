<p align="center">
<img src="https://bg-software.com/imgs/superiorskyblock-logo.png" />
<h2 align="center">The most optimized Skyblock core on the market.</h2>
</p>
<br>
<p align="center">
<a href="https://bg-software.com/discord/"><img src="https://img.shields.io/discord/293212540723396608?color=7289DA&label=Discord&logo=discord&logoColor=7289DA&link=https://bg-software.com/discord/"></a>
<a href="https://bg-software.com/patreon/"><img src="https://img.shields.io/badge/-Support_on_Patreon-F96854.svg?logo=patreon&style=flat&logoColor=white&link=https://bg-software.com/patreon/"></a><br>
<a href=""><img src="https://img.shields.io/maintenance/yes/2020"></a>
</p>

## Compiling

You can compile the project using gradlew.<br>
Run `gradlew shadowJar build` in console to build the project.<br>
You can find already compiled jars on our [Jenkins](https://hub.bg-software.com/) hub!<br>
You must add yourself all the private jars or purchase access to our private repository.

##### Private Jars:
- AdvancedSpawners by GC [[link]](https://advancedplugins.net/item/2)
- CMI by Zrips [[link]](https://www.spigotmc.org/resources/3742/)
- EpicSpawners by Songoda [[link]](https://songoda.com/marketplace/product/13)
- JetsMinions by jet315 [[link]](https://www.spigotmc.org/resources/59972/)
- MergedSpawner by vk2gpz [[link]](https://polymart.org/resource/189)
- ShopGUIPlus by brcdev [[link]](https://www.spigotmc.org/resources/6515/)

## API

The plugin is packed with a rich API for interacting with islands, players and more. When hooking into the plugin, it's highly recommended to only use the API and not the compiled plugin, as the API methods are not only commented, but also will not get removed or changed unless they are marked as deprecated. This means that when using the API, you won't have to do any additional changes to your code between updates.

##### Maven
```
<repositories>
    <repository>
        <id>bg-repo</id>
        <url>https://repo.bg-software.com/repository/api/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.bgsoftware</groupId>
        <artifactId>SuperiorSkyblockAPI</artifactId>
        <version>latest</version>
    </dependency>
</dependencies>
```

##### Gradle
```
repositories {
    maven { url 'https://repo.bg-software.com/repository/api/' }
}

dependencies {
    compileOnly 'com.bgsoftware:SuperiorSkyblockAPI:latest'
}
```

## Updates

This plugin is provided "as is", which means no updates or new features are guaranteed. We will do our best to keep
updating and pushing new updates, and you are more than welcome to contribute your time as well and make pull requests
for bug fixes.

## License

This plugin is licensed under GNU GPL v3.0

This plugin uses HikariCP which you can find [here](https://github.com/brettwooldridge/HikariCP).

# Raiding

### Required Plugins

* Multiverse-Core
    * In worlds.yml set SuperiorWorld property `autoLoad: false`. This is to ensure that SuperiorSkyblock loads the
      world instead of Multiverse.
* CleanroomGenerator-1.1.1 (it's possible that version may vary)

### Commands & Permissions

|Command|Permission|Description|Deprecated|
|-------|----------|-----------|----------|
|`is raid <player>`|`superior.island.raid`|Invite an island to a raid.|Deprecated. Use `is raid <island` instead.|
|`is raid <island>`|`superior.island.raid`|Invite an island to a raid.|
|`is raid toggle`| |Toggle the raiding feature on or off.|
|`is raidcooldown <[start, stop]>`|`superior.island.raidcooldown`|Start or stop the raid cool down timer.|
