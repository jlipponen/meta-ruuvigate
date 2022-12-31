SUMMARY = "Python3 application to publish RuuviTag data to Azure IoT Central"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

SRC_URI = "https://github.com/jlipponen/RuuviGate/releases/download/${PV}/ruuvigate-${PV}.tar.gz"
SRC_URI[md5sum] = "f15eab72350a3ef5f6114d9160eb529d"
SRC_URI[sha256sum] = "fa77a1b1aaa5b87a0713ed8647ba42ba463af5f3ec6d0f47cddc86a8d7b1ff09"

inherit python_poetry_core

S = "${WORKDIR}/ruuvigate-${PV}"

UPSTREAM_CHECK_URI = "https://github.com/jlipponen/RuuviGate/releases"

PIP_INSTALL_PACKAGE = "ruuvigate"

RDEPENDS:${PN} = " \
	${PYTHON_PN}-azure-iot-device \
	${PYTHON_PN}-ruuvitag-sensor \
	${PYTHON_PN}-pyyaml \
"
