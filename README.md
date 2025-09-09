Amdroid
=======

Ampache client for Android. Allows streaming music from any Ampache server.

![](https://raw.githubusercontent.com/Dejvino/amdroid/master/screenshot_01.png)

## History
Update Sep, 2025:
Recent update includes running the app successfully in android studio with following build stack.
Android Studio Ladybug | 2024.2.1 Patch 3
JDK: Java 1.8.0_292
Gradle Wrapper: gradle-6.7.1-bin.zip
Gradle Build Tools: 4.2.2
Minimum SDK: 14
Target SDK: 21
Compile SDK: 21

By Me (pravynandas):
Since There are not many changes in recent years by the fork of Dejvino, I wanted to take the resposibility of moving it even further.
I see a great scope of improvement in this project and wanted to build something great of this foundation.

By Dejvino:
This is a fork of the official "amdroid-h" repo.
Since there was no activity around this project in any way since 2010,
I decided to kick-start this again.

## Major Changes (WIP)
By Me (pravynandas):
* **Player Improvements**. There were some known pieces left unfinished causing the player to malfunction. Fixed some of them. Specially play/pause functionality from playlist activity and mini player.
* **Headset Integration**. Since it is vital for a music app to have headset button clicks integrated, I did some basic integration like single click and double click to control the play/pause and play next functionality. Yet to take it further to function when the device is locked/app in background.
* **Reworked UI**. There some obvious improvements needed on the UI side. Will do them one by one.

By Dejvion:
* **Reworked UI**. The original design looked very outdated. This puts off many potential users.
* **Upgraded Android APIs**. The aim is to drop all the deprecated dependencies and components.
* **Async Network/IO**. Everything UI-unrelated has to be moved out of the main (UI) thread. This brings app responsiveness and better UX.
* **Robust application**. Exceptions get handled properly. The app needs to be reliable.

