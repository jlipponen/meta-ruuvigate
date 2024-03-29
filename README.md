# meta-ruuvigate
Yocto layer providing an image hosting the [RuuviGate application](https://github.com/jlipponen/RuuviGate), which is ran as a [systemd service](./recipes-ruuvigate/systemd/files/ruuvigate.service).

## Supported devices
|Supported devices|
|-|
|Raspberry Pi Zero W V1.1|

## Build
Setup a Yocto environment in a supported version and capable of building an image for your device. There are multiple guides available online for Raspberry Pi, for example. Then add this layer and build the `ruuvigate-image` for your device. You can take these steps to build an image for Raspberry Pi Zero W with Yocto in mickledore:
```
/poky$ git clone -b mickledore https://github.com/jlipponen/meta-ruuvigate.git
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

## Use prebuild image
Alternatively, you may use a prebuild [Raspberry Pi Imager](https://www.raspberrypi.com/software/) compatible image found from [releases](https://github.com/jlipponen/meta-ruuvigate/releases). Download this image to your computer. Then install the Imager application from raspberrypi.com and select "CHOOSE OS" -> "Use custom" and browse to the prebuild image. After that, select the SD card by clicking the "CHOOSE STORAGE" and finally hit "WRITE".

![Alt text](./img/imager.png?raw=true "Rapsberry Pi Imager")

## Configure wireless
Set your country, network name and password to [wpa_supplicant-nl80211-wlan0.conf](./recipes-connectivity/wpa-supplicant/files/wpa_supplicant-nl80211-wlan0.conf)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/wpa_supplicant/wpa_supplicant-nl80211-wlan0.conf`

## Configure Azure
Set your Azure IoT Central device credentials to [azure.yaml](./recipes-ruuvigate/systemd/files/azure.yaml)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/ruuvigate/azure.yaml`

## Configure RuuviTags (optional)
List your RuuviTag devices' MAC addressess in [ruuvi.yaml](./recipes-ruuvigate/systemd/files/ruuvi.yaml)

Alternatively, you can mount the SD card's `root` filesystem and edit \
`etc/ruuvigate/ruuvi.yaml`

## Enable SSH connectivity
You can connect to your RuuviGate with SSH. By default, Public Key Authentication is used. First, generate a public and private key pair with `ssh-keygen`. For example:

```
~/.ssh$ ssh-keygen -t rsa -f ruuvigate
```

then copy the _ruuvigate.pub_ **public key** content to RuuviGate's [authorized_keys](./recipes-connectivity/openssh/files/authorized_keys) file. Futhermore, create the following entry to your SSH client's config file:

```
Host ruuvigate
     HostName <IP-of-your-RuuviGate>
     User root
     Port 13666
     IdentityFile /home/<your-username>/.ssh/ruuvigate.pub
```

Opening SSH connection should now work with:

```
$ ssh ruuvigate
```

Alternatively, you can mount the SD card's `root` filesystem and edit \
`home/root/.ssh/authorized_keys`
