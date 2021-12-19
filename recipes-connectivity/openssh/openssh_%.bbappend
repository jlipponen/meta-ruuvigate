FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
   file://sshd_config \
   file://authorized_keys \
"

do_install_append() {
    # Replace the default configuration with custom one
    rm ${D}${sysconfdir}/ssh/sshd_config
    install -m 0644 ${WORKDIR}/sshd_config ${D}${sysconfdir}/ssh

    # Create the authorized_keys file to location expected by sshd
    #install -d ${D}${ROOT_HOME}/.ssh
    #install -m 0644 ${WORKDIR}/authorized_keys ${D}${ROOT_HOME}/.ssh
}

#PACKAGES =+ "${PN}-auth"
#FILES_${PN}-auth += "${D}${ROOT_HOME}/.ssh/authorized_keys "
