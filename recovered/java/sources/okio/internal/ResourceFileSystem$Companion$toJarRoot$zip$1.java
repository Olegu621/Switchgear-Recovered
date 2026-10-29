            package okio.internal;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.b51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "entry", "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class ResourceFileSystem$Companion$toJarRoot$zip$1 extends b51 implements Function1<ZipEntry, Boolean> {
                public static final ResourceFileSystem$Companion$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$Companion$toJarRoot$zip$1();

                public ResourceFileSystem$Companion$toJarRoot$zip$1() {
/* 2 */             super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ZipEntry zipEntry) {
/* 1 */             zipEntry.getClass();
/* 16 */            return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(zipEntry.getCanonicalPath()));
                }
            }
