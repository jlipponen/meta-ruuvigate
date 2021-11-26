SUMMARY = "Find RuuviTag sensor beacons, get and encode data from selected sensors"
HOMEPAGE = "https://github.com/ttu/ruuvitag-sensor"
AUTHOR = "Tomi Tuhkanen <tomi.tuhkanen@iki.fi>"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=529e1909877071821558d4023ff657f5"

inherit setuptools3

SRC_URI = "git://github.com/jlipponen/ruuvitag-sensor.git"
SRCREV = "c21b21f34644954767d0fbf22fb71c3f67d1ce02"
PV = "1.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "bluez5 bluez-hcidump \
                  python3-ptyprocess"
