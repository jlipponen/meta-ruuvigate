SUMMARY = "Find RuuviTag sensor beacons, get and encode data from selected sensors"
HOMEPAGE = "https://github.com/ttu/ruuvitag-sensor"
AUTHOR = "Tomi Tuhkanen <tomi.tuhkanen@iki.fi>"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=529e1909877071821558d4023ff657f5"

inherit setuptools3

SRC_URI = "git://github.com/jlipponen/ruuvitag-sensor.git;branch=check-for-root"
SRCREV = "98a624c04648c5df9a82ad1d3c2135104a48581d"
PV = "1.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "bluez5 bluez-hcidump \
                  python3-ptyprocess"
