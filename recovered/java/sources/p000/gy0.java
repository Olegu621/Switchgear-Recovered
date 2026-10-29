            package p000;

            import android.os.Build;
            import java.security.GeneralSecurityException;
            import java.security.spec.AlgorithmParameterSpec;
            import java.util.Objects;
            import javax.crypto.spec.GCMParameterSpec;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gy0 {

                /* JADX INFO: renamed from: c */
                public static final C0942g5 f8846c = new C0942g5(5);

                /* JADX INFO: renamed from: a */
                public final SecretKeySpec f8847a;

                /* JADX INFO: renamed from: b */
                public final boolean f8848b;

                public gy0(byte[] bArr) throws GeneralSecurityException {
/* 9 */             if (!pm2.m7479b(2)) {
/* 30 */                ds0.m3203t("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
/* 34 */                throw null;
                    }
/* 12 */            r13.m8049a(bArr.length);
/* 22 */            this.f8847a = new SecretKeySpec(bArr, "AES");
/* 25 */            this.f8848b = true;
                }

                /* JADX INFO: renamed from: a */
                public static AlgorithmParameterSpec m4039a(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 2 */             int i = p13.f14948a;
/* 22 */            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
                    return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
                }
            }
