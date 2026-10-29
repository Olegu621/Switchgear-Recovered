            package okio;

            import java.util.zip.Deflater;
            import kotlin.Metadata;
            
            /* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m6176d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class DeflaterSinkExtensions {
                public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
/* 1 */             sink.getClass();
/* 4 */             deflater.getClass();
/* 9 */             return new DeflaterSink(sink, deflater);
                }

                public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 7 */                 deflater = new Deflater();
                    }
/* 10 */            sink.getClass();
/* 13 */            deflater.getClass();
/* 18 */            return new DeflaterSink(sink, deflater);
                }
            }
