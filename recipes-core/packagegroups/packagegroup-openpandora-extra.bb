DESCRIPTION = "Openpandora core pacakges"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r2"

inherit packagegroup

RDEPENDS_${PN} = " \
        nano \
        lsof \
        hdparm \
        tmux \
        packagegroup-sdk-target \
        htop \
        libgles-omap3-x11demos \       
	wireless-tools \
	openal-soft \
	p7zip \
	elementary-icon-theme elementary-icon-theme-enable \
"

