            package okhttp3;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okio.ByteString;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m6176d2 = {"Lokhttp3/Credentials;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "basic", HttpUrl.FRAGMENT_ENCODE_SET, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "charset", "Ljava/nio/charset/Charset;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 45 */    public final class Credentials {
                public static final Credentials INSTANCE = new Credentials();

                private Credentials() {
                }

                public static final String basic(String username, String password, Charset charset) {
/* 1 */             username.getClass();
/* 4 */             password.getClass();
/* 7 */             charset.getClass();
/* 42 */            return Intrinsics.m6219d(ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64(), "Basic ");
                }

                public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 charset = StandardCharsets.ISO_8859_1;
/* 7 */                 charset.getClass();
                    }
/* 10 */            return basic(str, str2, charset);
                }

/* 46 */        public static final String basic(String str, String str2) {
/* 47 */            str.getClass();
                    str2.getClass();
                    return basic$default(str, str2, null, 4, null);
                }
            }
