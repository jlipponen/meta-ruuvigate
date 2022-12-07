SUMMARY = "Use requests to talk HTTP via a UNIX domain socket"
HOMEPAGE = "https://github.com/msabramo/requests-unixsocket"
AUTHOR = "Marc Abramowitz <marc@marc-abramowitz.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI = "https://files.pythonhosted.org/packages/4d/ce/78b651fe0adbd4227578fa432d1bde03b4f4945a70c81e252a2b6a2d895f/requests-unixsocket-0.2.0.tar.gz"
SRC_URI[md5sum] = "ca405eabee3505e6d557752ba0d0db5e"
SRC_URI[sha256sum] = "9e5c1a20afc3cf786197ae59c79bcdb0e7565f218f27df5f891307ee8817c1ea"

S = "${WORKDIR}/requests-unixsocket-0.2.0.tar.gz"

DEPENDS += "python3-pbr-native"
RDEPENDS:${PN} = "python3-requests python3-urllib3"

inherit pypi setuptools3
