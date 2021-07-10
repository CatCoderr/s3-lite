package io.github.linktosriram.s3lite.core.auth;

import io.github.linktosriram.s3lite.api.region.RegionProvider;

public interface RegionAwareSigner extends Signer {

    static RegionAwareSigner create() {
        return Aws4Signer.create();
    }

    RegionProvider getRegion();

    void setRegion(RegionProvider region);
}
