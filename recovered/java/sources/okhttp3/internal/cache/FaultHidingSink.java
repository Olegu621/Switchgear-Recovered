            package okhttp3.internal.cache;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ForwardingSink;
            import okio.Sink;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "delegate", "Lokio/Sink;", "onException", "Lkotlin/Function1;", "Ljava/io/IOException;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "hasErrors", HttpUrl.FRAGMENT_ENCODE_SET, "getOnException", "()Lkotlin/jvm/functions/Function1;", "close", "flush", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public class FaultHidingSink extends ForwardingSink {
                private boolean hasErrors;
                private final Function1<IOException, Unit> onException;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public FaultHidingSink(Sink sink, Function1<? super IOException, Unit> function1) {
/* 7 */             super(sink);
/* 1 */             sink.getClass();
/* 4 */             function1.getClass();
/* 10 */            this.onException = function1;
                }

                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
/* 3 */             if (this.hasErrors) {
/* 5 */                 return;
                    }
                    try {
/* 6 */                 super.close();
                    } catch (IOException e) {
/* 12 */                this.hasErrors = true;
/* 16 */                this.onException.invoke(e);
                    }
                }

                @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
                public void flush() {
/* 3 */             if (this.hasErrors) {
/* 5 */                 return;
                    }
                    try {
/* 6 */                 super.flush();
                    } catch (IOException e) {
/* 12 */                this.hasErrors = true;
/* 16 */                this.onException.invoke(e);
                    }
                }

                public final Function1<IOException, Unit> getOnException() {
/* 1 */             return this.onException;
                }

                @Override // okio.ForwardingSink, okio.Sink
                public void write(Buffer source, long byteCount) throws EOFException {
/* 1 */             source.getClass();
/* 6 */             if (this.hasErrors) {
/* 8 */                 source.skip(byteCount);
/* 11 */                return;
                    }
                    try {
/* 12 */                super.write(source, byteCount);
                    } catch (IOException e) {
/* 18 */                this.hasErrors = true;
/* 22 */                this.onException.invoke(e);
                    }
                }
            }
