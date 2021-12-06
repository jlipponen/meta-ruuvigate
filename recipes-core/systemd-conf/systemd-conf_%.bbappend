FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://eth.network \
    file://en.network \
    file://wlan.network \
"
do_install_append() {
    install -m 644 ${WORKDIR}/eth.network ${D}${systemd_unitdir}/network/
    install -m 644 ${WORKDIR}/en.network ${D}${systemd_unitdir}/network/
    install -m 644 ${WORKDIR}/wlan.network ${D}${systemd_unitdir}/network/
}

FILES_${PN} += "\
    ${systemd_unitdir}/network/eth.network \
    ${systemd_unitdir}/network/en.network \
    ${systemd_unitdir}/network/wlan.network \
"

# Add a dependecy to wpa-supplicant to make sure it gets installed
RDEPENDS_${PN}_append = " wpa-supplicant"
