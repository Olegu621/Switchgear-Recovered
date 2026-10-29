            package okio;

            import io.flutter.plugin.editing.SpellCheckPlugin;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, m6176d2 = {"Lokio/-DeprecatedUtf8;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "size", HttpUrl.FRAGMENT_ENCODE_SET, "string", HttpUrl.FRAGMENT_ENCODE_SET, "beginIndex", HttpUrl.FRAGMENT_ENCODE_SET, SpellCheckPlugin.END_INDEX_KEY, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 10 */    public final class DeprecatedUtf8 {
                public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

                private DeprecatedUtf8() {
                }

                public final long size(String string) {
/* 1 */             string.getClass();
/* 7 */             return Utf8.size$default(string, 0, 0, 3, null);
                }

/* 11 */        public final long size(String string, int beginIndex, int endIndex) {
                    string.getClass();
/* 12 */            return Utf8.size(string, beginIndex, endIndex);
                }
            }
