SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "https://requests.readthedocs.io"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/e7/01/3569e0b535fb2e4a6c384bdbed00c55b9d78b5084e0fb7f4d0bf523d7670/requests-2.26.0.tar.gz"
SRC_URI[md5sum] = "8c745949ad3e9ae83d9927fed213db8a"
SRC_URI[sha256sum] = "b8aa58f8cf793ffd8782d3d8cb19e66ef36f7aba4353eec859e74678b01b07a7"

S = "${WORKDIR}/requests-2.26.0.tar.gz"

RDEPENDS:${PN} = "python3-urllib3 python3-certifi"

inherit pypi setuptools3
