SUMMARY = "MQTT version 5.0/3.1.1 client class"
HOMEPAGE = "http://eclipse.org/paho"
AUTHOR = "Roger Light <roger@atchoo.org>"
LICENSE = "EPL-2.0 | EDL-1.0"
LIC_FILES_CHKSUM = " \
    file://edl-v10;md5=c09f121939f063aeb5235972be8c722c \
    file://notice.html;md5=6939d012464e0bf698543a3e98cd4265 \
    file://about.html;md5=15600df8a73272a7302d697f882b367a \
"

SRC_URI = "https://files.pythonhosted.org/packages/f8/dd/4b75dcba025f8647bc9862ac17299e0d7d12d3beadbf026d8c8d74215c12/paho-mqtt-1.6.1.tar.gz"
SRC_URI[md5sum] = "bdb20f88db291fdb4a0fe804c0f29316"
SRC_URI[sha256sum] = "2a8291c81623aec00372b5a85558a372c747cbca8e9934dfe218638b8eefc26f"

inherit pypi setuptools3
