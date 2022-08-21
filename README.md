# meta-ruuvigate
Yocto layer providing an image hosting the [RuuviGate application](https://github.com/jlipponen/RuuviGate), which is ran as a [systemd service](./recipes-ruuvigate/systemd/files/ruuvigate.service).

## Supported devices and Yocto versions
|Device|Yocto|
|-|-|
|Raspberry Pi Zero W V1.1|dunfell|

## Build
Setup a Yocto environment in a supported version and capable of building an image for your device. There are multiple guides available online for Raspberry Pi, for example. Then add this layer and build the `ruuvigate-image` for your device. For example, you can follow these steps to build an image for Raspberry Pi Zero W with Yocto in Dunfell:
```
/poky$ git clone -b dunfell https://github.com/jlipponen/meta-ruuvigate.git
/poky$ source oe-init-build-env
/poky/build$ bitbake-layers add-layer "/path/to/poky/meta-ruuvigate/"
/poky/build$ export MACHINE="raspberrypi0-wifi" DISTRO="ruuvidistro" && bitbake ruuvigate-image
```

## Write image to an SD card
Check the SD's device name (often `mmcblk0`) and write the image with `bmaptool`:
```
sudo bmaptool copy \
/path/to/poky/build/tmp/deploy/images/raspberrypi0-wifi/ruuvigate-image-raspberrypi0-wifi.wic.bz2 \
--bmap /path/to/poky/build/tmp/deploy/images/raspberrypi0-wifi/ruuvigate-image-raspberrypi0-wifi.wic.bmap \
/dev/mmcblk0
```

## Configure wireless
Set your country, network name and password to [wpa_supplicant-nl80211-wlan0.conf](./recipes-connectivity/wpa-supplicant/files/wpa_supplicant-nl80211-wlan0.conf)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/wpa_supplicant/wpa_supplicant-nl80211-wlan0.conf`

## Configure Azure
Set your Azure IoT Central device credentials to [azure.yaml](./meta-ruuvigate/recipes-ruuvigate/systemd/files/azure.yaml)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/ruuvigate/azure.yaml`

## Configure RuuviTags (optional)
List your RuuviTag devices' MAC addressess in [ruuvi.yaml](./recipes-ruuvigate/systemd/files/ruuvi.yaml)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/ruuvigate/ruuvi.yaml`
