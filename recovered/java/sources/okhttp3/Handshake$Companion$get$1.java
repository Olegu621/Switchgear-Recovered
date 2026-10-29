            package okhttp3;

            import java.security.cert.Certificate;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 4 */     public final class Handshake$Companion$get$1 extends b51 implements Function0<List<? extends Certificate>> {
                final /* synthetic */ List<Certificate> $peerCertificatesCopy;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public Handshake$Companion$get$1(List<? extends Certificate> list) {
/* 4 */             super(0);
/* 1 */             this.$peerCertificatesCopy = list;
                }

                @Override // kotlin.jvm.functions.Function0
/* 5 */         public final List<Certificate> invoke() {
/* 6 */             return this.$peerCertificatesCopy;
                }
            }
