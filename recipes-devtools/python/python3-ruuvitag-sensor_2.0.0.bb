SUMMARY = "Find RuuviTag sensor beacons, get and encode data from selected sensors"
HOMEPAGE = "https://github.com/ttu/ruuvitag-sensor"
AUTHOR = "Tomi Tuhkanen <tomi.tuhkanen@iki.fi>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=f7e07dde79e0a058d4ef36963577b178"

SRC_URI = "https://files.pythonhosted.org/packages/22/80/cd0ec6be661cba0ff5baf482ed7be52c3f0927fbb3f3ca7572ce7efb17d4/ruuvitag_sensor-2.0.0.tar.gz"
SRC_URI[md5sum] = "9f254958abecf5067e7aa127a3855b49"
SRC_URI[sha256sum] = "81c458550777bced1f4105f8747a0463b9f506df917e6b2d956316d06b9e9d85"

inherit pypi setuptools3

PYPI_PACKAGE = "ruuvitag_sensor"

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-ptyprocess \
    ${PYTHON_PN}-reactivex \
"
