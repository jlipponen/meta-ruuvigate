SUMMARY = "Find RuuviTag sensor beacons, get and encode data from selected sensors"
HOMEPAGE = "https://github.com/ttu/ruuvitag-sensor"
AUTHOR = "Tomi Tuhkanen <tomi.tuhkanen@iki.fi>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=c484cb5ae763bcdad1fe5de0bf6433a3"

SRC_URI = "https://files.pythonhosted.org/packages/ae/47/ec43825a9371c4a3d654cca2978a4cf00f99a05937fbbda64973ee5dbf6b/ruuvitag_sensor-1.2.0.tar.gz"
SRC_URI[md5sum] = "f25a10e0b24eb1955b40b7ef2500f815"
SRC_URI[sha256sum] = "362b10521ff80ba06f6886c2c45f44f5b577f4f5a46b897cecb2b8d387214712"

S = "${WORKDIR}/ruuvitag_sensor-1.2.0.tar.gz"

PYPI_PACKAGE = "ruuvitag_sensor"

RDEPENDS_${PN} = "bluez5 bluez-hcidump \
                  python3-ptyprocess"

inherit pypi setuptools3
