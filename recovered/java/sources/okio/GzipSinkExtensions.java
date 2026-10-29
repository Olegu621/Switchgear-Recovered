            package okio;

            import kotlin.Metadata;
            
            /* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m6176d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class GzipSinkExtensions {
                public static final GzipSink gzip(Sink sink) {
/* 1 */             sink.getClass();
/* 6 */             return new GzipSink(sink);
                }
            }
