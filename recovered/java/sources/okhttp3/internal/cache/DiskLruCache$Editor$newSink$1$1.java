            package okhttp3.internal.cache;

            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.b51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Ljava/io/IOException;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 15 */    public final class DiskLruCache$Editor$newSink$1$1 extends b51 implements Function1<IOException, Unit> {
                final /* synthetic */ DiskLruCache this$0;
                final /* synthetic */ DiskLruCache.Editor this$1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
/* 6 */             super(1);
/* 1 */             this.this$0 = diskLruCache;
/* 3 */             this.this$1 = editor;
                }

                public final void invoke(IOException iOException) {
/* 1 */             iOException.getClass();
/* 4 */             DiskLruCache diskLruCache = this.this$0;
/* 6 */             DiskLruCache.Editor editor = this.this$1;
                    synchronized (diskLruCache) {
/* 9 */                 editor.detach$okhttp();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
/* 16 */        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
/* 17 */            invoke((IOException) obj);
                    return Unit.f12910a;
                }
            }
