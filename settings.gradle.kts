val mod_name: String by extra

pluginManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://maven.minecraftforge.net/") }
        maven { url = uri("https://repo.spongepowered.org/repository/maven-public/") }
    }
}

rootProject.name = "$mod_name (Fabric)"