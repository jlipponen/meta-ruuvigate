SUMMARY = "Python service to publish RuuviTag data to cloud"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

inherit setuptools3

SRC_URI = "git://github.com/jlipponen/RuuviGate.git;branch=main"
SRCREV = "a47f19d97d5c2849e808850964b054a41801e190"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "python3-ruuvitag-sensor python3-azure-iot-device python3-pyyaml"
