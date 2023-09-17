SUMMARY = "Python3 application to publish RuuviTag data to Azure IoT Central"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

SRC_URI = "https://github.com/jlipponen/RuuviGate/releases/download/${PV}/ruuvigate-${PV}.tar.gz"
SRC_URI[md5sum] = "8ebcdf54d0bdb726e806de15b003167f"
SRC_URI[sha256sum] = "75e0579231da700da550c4109c99550d2c3c50b3b27777b512737d7eb76fe924"

inherit python_poetry_core

S = "${WORKDIR}/ruuvigate-${PV}"

UPSTREAM_CHECK_URI = "https://github.com/jlipponen/RuuviGate/releases"

PIP_INSTALL_PACKAGE = "ruuvigate"

RDEPENDS:${PN} = " \
	${PYTHON_PN}-azure-iot-device \
	${PYTHON_PN}-ruuvitag-sensor \
	${PYTHON_PN}-pyyaml \
"
