# Base this image on core-image-base
include recipes-core/images/core-image-base.bb

IMAGE_INSTALL_append = " \
                python3 \
                python3-ruuvigate \
                ruuvigate \
                blueman \
                wpa-supplicant \
                ${@bb.utils.contains('SOC_FAMILY', 'rpi', 'packagegroup-raspberry', '', d)} \
                "
