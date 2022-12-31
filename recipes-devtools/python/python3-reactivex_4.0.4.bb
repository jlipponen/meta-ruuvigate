SUMMARY = "ReactiveX (Rx) for Python"
HOMEPAGE = "http://reactivex.io/"
AUTHOR = "Dag Brattli <dag@brattli.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81f64d8152017ecfec10b583e282e48f"

SRC_URI = "https://files.pythonhosted.org/packages/ef/63/f776322df4d7b456446eff78c4e64f14c3c26d57d46b4e06c18807d5d99c/reactivex-4.0.4.tar.gz"
SRC_URI[md5sum] = "04acdb9c89ce3a41e705661d2003b7b3"
SRC_URI[sha256sum] = "e912e6591022ab9176df8348a653fe8c8fa7a301f26f9931c9d8c78a650e04e8"

inherit pypi setuptools3

RDEPENDS:${PN} = " \
	${PYTHON_PN}-typing-extensions \
"
