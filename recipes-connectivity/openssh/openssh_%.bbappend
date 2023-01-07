FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
   file://sshd_config \
   file://authorized_keys \
   file://sshd.socket \
"

do_install:append() {
    # Replace the default configuration with a custom one
    rm ${D}${sysconfdir}/ssh/sshd_config
    install -m 644 ${WORKDIR}/sshd_config ${D}${sysconfdir}/ssh/

    # Create the authorized_keys file to sshd default location
    install -d ${D}${ROOT_HOME}/.ssh
    install -m 644 ${WORKDIR}/authorized_keys ${D}${ROOT_HOME}/.ssh/
}

FILES:${PN}-sshd += "${ROOT_HOME}/.ssh/authorized_keys"
