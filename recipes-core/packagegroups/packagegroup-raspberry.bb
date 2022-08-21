DESCRIPTION = "Packagegroup for Raspberry machines"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS_${PN} = "\
    pi-bluetooth \
"
