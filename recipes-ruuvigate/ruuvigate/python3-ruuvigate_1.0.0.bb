SUMMARY = "Python service to publish RuuviTag data to cloud"
HOMEPAGE = "https://github.com/jlipponen/RuuviGate"
AUTHOR = "Jan Lipponen <jan.lipponen@gmail.com>"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9102a09f09904a7cbd06a0b5ee52f0fc"

inherit setuptools3

SRC_URI = "git://github.com/jlipponen/RuuviGate.git;branch=main;protocol=https"
SRCREV = "cd7b8828ef2345dafcd64396e67219872b65f3c6"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-ruuvitag-sensor python3-azure-iot-device python3-pyyaml python3-janus"

PREFERRED_VERSION_python3-ruuvitag-sensor = "1.2.0+git%"
