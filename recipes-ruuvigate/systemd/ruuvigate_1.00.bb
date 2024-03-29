FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "ruuvigate.service"

SRC_URI += "\
  file://ruuvigate.service \
  file://azure.yaml \
  file://ruuvi.yaml \
"

FILES:${PN} += "${systemd_unitdir}/system/ruuvigate.service"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 644 ${WORKDIR}/ruuvigate.service ${D}/${systemd_unitdir}/system

  install -d ${D}${sysconfdir}/ruuvigate
  install -m 600 ${WORKDIR}/ruuvi.yaml ${D}${sysconfdir}/ruuvigate
  install -m 600 ${WORKDIR}/azure.yaml ${D}${sysconfdir}/ruuvigate
}
