SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = "Andrey Petrov <andrey.petrov@shazow.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2823cb995439c984fd62a973d79815c"

SRC_URI = "https://files.pythonhosted.org/packages/80/be/3ee43b6c5757cabea19e75b8f46eaf05a2f5144107d7db48c7cf3a864f73/urllib3-1.26.7.tar.gz"
SRC_URI[md5sum] = "e0051a87a956e618a6bb514a07fa7773"
SRC_URI[sha256sum] = "4987c65554f7a2dbf30c18fd48778ef124af6fab771a377103da0585e2336ece"

S = "${WORKDIR}/urllib3-1.26.7.tar.gz"

RDEPENDS:${PN} = ""

inherit pypi setuptools3
