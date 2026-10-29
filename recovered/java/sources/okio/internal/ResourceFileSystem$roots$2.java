            package okio.internal;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function0;
            import okhttp3.HttpUrl;
            import okio.FileSystem;
            import okio.Path;
            import p000.b51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Pair;", "Lokio/FileSystem;", "Lokio/Path;", "invoke"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class ResourceFileSystem$roots$2 extends b51 implements Function0<List<? extends Pair<? extends FileSystem, ? extends Path>>> {
                final /* synthetic */ ClassLoader $classLoader;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ResourceFileSystem$roots$2(ClassLoader classLoader) {
/* 4 */             super(0);
/* 1 */             this.$classLoader = classLoader;
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<Pair<FileSystem, Path>> invoke() {
/* 7 */             return ResourceFileSystem.Companion.toClasspathRoots(this.$classLoader);
                }
            }
