# Base this image on core-image-base
include recipes-core/images/core-image-base.bb
inherit features_check

REQUIRED_MACHINE_FEATURES = "bluetooth"
REQUIRED_DISTRO_FEATURES = "bluetooth"

IMAGE_INSTALL_append = " \
                python3 \
                python3-ruuvigate \
                ruuvigate \
                blueman \
                wpa-supplicant \
                "

IMAGE_INSTALL_append_rpi = " packagegroup-raspberry"
