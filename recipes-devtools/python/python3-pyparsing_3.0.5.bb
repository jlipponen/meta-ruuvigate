SUMMARY = "Python parsing module"
HOMEPAGE = "https://github.com/pyparsing/pyparsing/"
AUTHOR = "Paul McGuire <ptmcg.gm+pyparsing@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

SRC_URI = "https://files.pythonhosted.org/packages/39/cb/69988a9b62158c85288e7d3aeb5634efd506ca92c8a34dfae3bd2a88943a/pyparsing-3.0.5.tar.gz"
SRC_URI[md5sum] = "db54052d5e0e51c74d0bd35a708d8c3a"
SRC_URI[sha256sum] = "9329d1c1b51f0f76371c4ded42c5ec4cc0be18456b22193e0570c2da98ed288b"

S = "${WORKDIR}/pyparsing-3.0.5.tar.gz"

RDEPENDS_${PN} = ""

inherit pypi setuptools3
