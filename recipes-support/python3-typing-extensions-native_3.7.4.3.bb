SUMMARY = "Backported and Experimental Type Hints for Python 3.7+"
HOMEPAGE = "https://github.com/python/typing"
AUTHOR = "Guido van Rossum, Jukka Lehtosalo, Łukasz Langa, Michael Lee <levkivskyi@gmail.com>"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

SRC_URI = "https://files.pythonhosted.org/packages/16/06/0f7367eafb692f73158e5c5cbca1aec798cdf78be5167f6415dd4205fa32/typing_extensions-3.7.4.3.tar.gz"
SRC_URI[md5sum] = "5fcbfcb22e6f8c9bf23fb9f8e020f6ee"
SRC_URI[sha256sum] = "99d4073b617d30288f569d3f13d2bd7548c3a7e4c8de87db09a9d29bb3a4a60c"

S = "${WORKDIR}/typing_extensions-3.7.4.3"

PYPI_PACKAGE = "typing_extensions"

inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"
