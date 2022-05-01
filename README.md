# meta-ruuvigate
Yocto layer hosting application for pushing RuuviTag data to cloud with the RuuviGate application:
https://github.com/jlipponen/RuuviGate

Only tested with Raspberry Pi Zero W V1.1 and poky @dunfell

## Build
```
/poky$ source oe-init-build-env
/poky/build$ bitbake core-image-base
```

## Write image to an SD card
Check the SD's device name (often `mmcblk0`) and write the image with `bmaptool`:
```
sudo bmaptool copy \
/path/to/poky/build/tmp/deploy/images/raspberrypi0-wifi/core-image-base-raspberrypi0-wifi.wic.bz2 \
--bmap /path/to/poky/build/tmp/deploy/images/raspberrypi0-wifi/core-image-base-raspberrypi0-wifi.wic.bmap \
/dev/mmcblk0
```

## Configure wireless
Mount the SD card's `root` filesystem and write your wifi credentials to

`etc/wpa_supplicant/wpa_supplicant-nl80211-wlan0.conf`

## Configure Azure
Write your Azure IoT Central device's configurations to

`etc/ruuvigate/azure.yaml`

## Configure RuuviTags (optional)
Optionally, write your RuuviTag MACs to

`etc/ruuvigate/ruuvi.yaml`
