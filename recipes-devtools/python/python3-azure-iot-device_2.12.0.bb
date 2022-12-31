SUMMARY = "Microsoft Azure IoT Device Library"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-python/"
AUTHOR = "Microsoft Corporation <opensource@microsoft.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

SRC_URI = "https://files.pythonhosted.org/packages/35/27/021fa4e4968ad83193ec18c8998ef416d3fbf9916e77167ce3fe6c21c30d/azure-iot-device-2.12.0.tar.gz"
SRC_URI[md5sum] = "2fc64a53b199806f47ad5ac4316c6986"
SRC_URI[sha256sum] = "a15a211341430674fa2959f4a87ac39d2ba1f7f0b8bfb09d94a4f1f1be27fb09"

inherit pypi setuptools3

RDEPENDS:${PN} = " \
	${PYTHON_PN}-deprecation \
	${PYTHON_PN}-janus \
	${PYTHON_PN}-paho-mqtt \
	${PYTHON_PN}-pysocks \
	${PYTHON_PN}-requests \
	${PYTHON_PN}-requests-unixsocket \
	${PYTHON_PN}-urllib3 \
"
