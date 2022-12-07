SUMMARY = "Microsoft Azure IoT Device Library"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-python/tree/master/azure-iot-device"
AUTHOR = "Microsoft Corporation <opensource@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=9deaa7301daf1d7f2f1e98f809840528"

SRC_URI = "https://files.pythonhosted.org/packages/f6/3e/027a4526e14229a37498b84535d414a2d24907bbd417400ff8a535fd7412/azure-iot-device-2.9.0.tar.gz"
SRC_URI[md5sum] = "7adb661f88e79a2635ec882f1012b700"
SRC_URI[sha256sum] = "29cac73645b82afbb3d1c8689dcc737cea346f2f6199a19d5fcab45af25bc9a2"

S = "${WORKDIR}/azure-iot-device-2.9.0.tar.gz"

RDEPENDS:${PN} = "python3-urllib3 python3-deprecation python3-six python3-requests \
                  python3-requests-unixsocket python3-pysocks \
                  python3-paho-mqtt python3-chardet python3-idna"

inherit pypi setuptools3
