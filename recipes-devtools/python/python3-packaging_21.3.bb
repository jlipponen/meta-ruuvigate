SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"
AUTHOR = "Donald Stufft and individual contributors <donald@stufft.io>"
LICENSE = "BSD-2-Clause | Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8 \
    file://LICENSE.APACHE;md5=2ee41112a44fe7014dce33e26468ba93 \
    file://LICENSE;md5=faadaedca9251a90b205c9167578ce91 \
"

SRC_URI = "https://files.pythonhosted.org/packages/df/9e/d1a7217f69310c1db8fdf8ab396229f55a699ce34a203691794c5d1cad0c/packaging-21.3.tar.gz"
SRC_URI[md5sum] = "e713c1939f294fd729af4a7be40dd141"
SRC_URI[sha256sum] = "dd47c42927d89ab911e606518907cc2d3a1f38bbd026385970643f9c5b8ecfeb"

inherit pypi setuptools3

RDEPENDS:${PN} = " \
	${PYTHON_PN}-pyparsing \
"
