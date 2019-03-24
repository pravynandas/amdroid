Amdroid
=======

Ampache client for Android. Allows streaming music from any Ampache server.

![](https://raw.githubusercontent.com/Dejvino/amdroid/master/screenshot_01.png)

## History
By Me (pravynandas):
Since There are not many changes in recent years by the fork of Dejvino, I wanted to take the resposibility of moving it even further.
I see a great skope of improvement in this project and wanted to build something great of this foundation.

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

