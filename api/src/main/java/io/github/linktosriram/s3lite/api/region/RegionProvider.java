package io.github.linktosriram.s3lite.api.region;

import java.net.URI;

public interface RegionProvider {

    String getRegionName();

    URI getEndpoint();
}
