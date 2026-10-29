            package okio;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0082\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m6176d2 = {"FCOMMENT", HttpUrl.FRAGMENT_ENCODE_SET, "FEXTRA", "FHCRC", "FNAME", "SECTION_BODY", HttpUrl.FRAGMENT_ENCODE_SET, "SECTION_DONE", "SECTION_HEADER", "SECTION_TRAILER", "getBit", HttpUrl.FRAGMENT_ENCODE_SET, "bit", "gzip", "Lokio/GzipSource;", "Lokio/Source;", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class GzipSourceExtensions {
                private static final int FCOMMENT = 4;
                private static final int FEXTRA = 2;
                private static final int FHCRC = 1;
                private static final int FNAME = 3;
                private static final byte SECTION_BODY = 1;
                private static final byte SECTION_DONE = 3;
                private static final byte SECTION_HEADER = 0;
                private static final byte SECTION_TRAILER = 2;

                private static final boolean getBit(int i, int i2) {
                    return ((i >> i2) & 1) == 1;
                }

                public static final GzipSource gzip(Source source) {
/* 1 */             source.getClass();
/* 6 */             return new GzipSource(source);
                }
            }
