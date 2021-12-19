SUMMARY = "Python service to publish RuuviTag data to cloud"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

inherit setuptools3

SRC_URI = "git://github.com/jlipponen/RuuviGate.git;branch=main"
SRCREV = "9969a0cad1668329e11d57040f2c513cb0806c8a"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "python3-ruuvitag-sensor python3-azure-iot-device python3-pyyaml"

PREFERRED_VERSION_python3-ruuvitag-sensor = "1.2.0+git%"
