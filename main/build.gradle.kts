plugins {
    id("com.gradleup.shadow") version "9.3.1"
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/groups/public/")
    maven("https://repo.extendedclip.com/releases/")
    maven("https://repo.fancyplugins.de/releases")
    maven("https://repo.momirealms.net/releases/")
    maven("https://mvn-repo.arim.space/lesser-gpl3/")
    maven("https://nexus.phoenixdevt.fr/repository/maven-public/")
    maven("https://repo.codemc.io/repository/maven-releases/")
    maven("https://repo.codemc.io/repository/maven-snapshots/")
    maven("https://repo.aselstudios.com/releases")
    maven("https://mvn.lumine.io/repository/maven-public/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:3.1.0")
    compileOnly("me.clip:placeholderapi:2.11.6")
    implementation("net.kyori:adventure-api:4.25.0")
    implementation("net.kyori:adventure-text-minimessage:4.25.0")
    implementation("net.kyori:adventure-text-serializer-plain:4.25.0")
    implementation("net.kyori:adventure-platform-bukkit:4.4.1")
    compileOnly("com.google.code.gson:gson:2.10.1")
    compileOnly("net.momirealms:custom-nameplates:3.0.33")
    implementation("space.arim.morepaperlib:morepaperlib:0.4.3")
    implementation("org.aselstudios:LuxDialoguesAPI:3.0.5")
    compileOnly("net.Indyuce:MMOCore-API:1.12.1-SNAPSHOT")
    compileOnly("io.lumine:MythicLib-dist:1.7.1-SNAPSHOT")
    compileOnly("com.github.retrooper:packetevents-spigot:2.11.1")
    compileOnly("dev.aurelium:auraskills-api-bukkit:2.3.8")
    compileOnly("io.lumine:Mythic-Dist:5.9.5")
}

tasks.shadowJar {
    relocate("org.bstats", "org.aselstudios.luxdialogues.libs.bstats")
    //relocate("net.kyori", "org.aselstudios.luxdialogues.libs.kyori")
    relocate("space.arim.morepaperlib", "org.aselstudios.luxdialogues.libs.morepaperlib")
}