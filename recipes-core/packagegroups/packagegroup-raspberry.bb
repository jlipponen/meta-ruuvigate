DESCRIPTION = "Packagegroup for Raspberry machines"

PACKAGE_ARCH = "${MACHINE_ARCH}"

HDMI_FORCE_HOTPLUG = "1"
ENABLE_UART = "1"

inherit packagegroup

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS_${PN} = "\
    pi-bluetooth \
"
