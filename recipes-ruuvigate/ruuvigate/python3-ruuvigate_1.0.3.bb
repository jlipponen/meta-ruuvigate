SUMMARY = "Python3 application to publish RuuviTag data to Azure IoT Central"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

SRC_URI = "https://github.com/jlipponen/RuuviGate/releases/download/${PV}/ruuvigate-${PV}.tar.gz"
SRC_URI[md5sum] = "16497856983c7cbb3c617d2f4a4096ef"
SRC_URI[sha256sum] = "3598ac19e670203eac5336ecc7a1ec024af61ae3e7dff306cb8cb51b62951bd3"

inherit python_poetry_core

S = "${WORKDIR}/ruuvigate-${PV}"

UPSTREAM_CHECK_URI = "https://github.com/jlipponen/RuuviGate/releases"

PIP_INSTALL_PACKAGE = "ruuvigate"

RDEPENDS:${PN} = " \
	${PYTHON_PN}-azure-iot-device \
	${PYTHON_PN}-ruuvitag-sensor \
	${PYTHON_PN}-pyyaml \
"
