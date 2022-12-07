SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"
AUTHOR = "Donald Stufft and individual contributors <donald@stufft.io>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

SRC_URI = "https://files.pythonhosted.org/packages/4d/34/523195b783e799fd401ad4bbc40d787926dd4c61838441df08bf42297792/packaging-21.2.tar.gz"
SRC_URI[md5sum] = "15576de4a5b2bf4f0e4928d05fdf2351"
SRC_URI[sha256sum] = "096d689d78ca690e4cd8a89568ba06d07ca097e3306a4381635073ca91479966"

S = "${WORKDIR}/packaging-21.2.tar.gz"

RDEPENDS:${PN} = "python3-pyparsing"

inherit pypi setuptools3
