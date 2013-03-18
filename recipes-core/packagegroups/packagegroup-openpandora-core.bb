DESCRIPTION = "Openpandora core pacakges"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = " \
        slim \
        pam-plugin-mkhomedir libpam-xtests \
        aufs-util \
        util-linux \
        squashfs-tools \
        libgles-omap3 \
        udev-extraconf \
        openpandora-first-run-wizard \
        openpandora-sudoers \
        openpandora-configtray \
        openpandora-libpnd \
        openpandora-misc \
        openpandora-state \
        openpandora-xfce-defaults \
	sudo-enable-wheel-group \
"

