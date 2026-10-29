            package okio;

            import java.io.Closeable;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import p000.jf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m6176d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "use", "R", "T", "Ljava/io/Closeable;", "Lokio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "okio"}, m6177k = 5, m6178mv = {1, 8, 0}, m6180xi = 48, m6181xs = "okio/Okio")
/* 8 */     final /* synthetic */ class Okio__OkioKt {
                public static final Sink blackhole() {
/* 3 */             return new BlackholeSink();
                }

                public static final BufferedSource buffer(Source source) {
/* 1 */             source.getClass();
/* 6 */             return new RealBufferedSource(source);
                }

                public static final <T extends Closeable, R> R use(T t, Function1<? super T, ? extends R> function1) throws Throwable {
                    R r;
/* 1 */             function1.getClass();
/* 4 */             Throwable th = null;
                    try {
/* 5 */                 r = (R) function1.invoke(t);
/* 9 */                 if (t != null) {
                            try {
/* 11 */                        t.close();
                            } catch (Throwable th2) {
/* 15 */                        th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 18 */                if (t != null) {
                            try {
/* 20 */                        t.close();
                            } catch (Throwable th4) {
/* 25 */                        jf0.m5798a(th3, th4);
                            }
                        }
/* 29 */                th = th3;
/* 30 */                r = null;
                    }
/* 31 */            if (th != null) {
/* 37 */                throw th;
                    }
/* 33 */            r.getClass();
                    return r;
                }

/* 9 */         public static final BufferedSink buffer(Sink sink) {
                    sink.getClass();
/* 10 */            return new RealBufferedSink(sink);
                }
            }
