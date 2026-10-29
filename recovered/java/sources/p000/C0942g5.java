            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import io.sentry.C1697u2;
            import io.sentry.util.C1713l;
            import java.security.GeneralSecurityException;
            import java.security.SecureRandom;
            import java.text.DecimalFormat;
            import java.text.DecimalFormatSymbols;
            import java.util.Locale;
            import javax.crypto.Cipher;
            
            /* JADX INFO: renamed from: g5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0942g5 extends ThreadLocal {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8472a;

                public /* synthetic */ C0942g5(int i) {
/* 1 */             this.f8472a = i;
                }

                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    switch (this.f8472a) {
                        case 0:
                            try {
/* 177 */                       return (Cipher) he0.f9026b.f9028a.mo2941x("AES/CTR/NoPadding");
                            } catch (GeneralSecurityException e) {
/* 182 */                       C1697u2.m5439o(e);
/* 3 */                         return null;
                            }
                        case 1:
                            try {
/* 158 */                       return (Cipher) he0.f9026b.f9028a.mo2941x("AES/ECB/NOPADDING");
                            } catch (GeneralSecurityException e2) {
/* 163 */                       C1697u2.m5439o(e2);
/* 3 */                         return null;
                            }
                        case 2:
                            try {
/* 139 */                       return (Cipher) he0.f9026b.f9028a.mo2941x("AES/CTR/NOPADDING");
                            } catch (GeneralSecurityException e3) {
/* 144 */                       C1697u2.m5439o(e3);
/* 3 */                         return null;
                            }
                        case 3:
                            try {
/* 120 */                       return (Cipher) he0.f9026b.f9028a.mo2941x("AES/GCM-SIV/NoPadding");
                            } catch (GeneralSecurityException e4) {
/* 125 */                       C1697u2.m5439o(e4);
/* 3 */                         return null;
                            }
                        case 4:
/* 82 */                    if (Looper.myLooper() == Looper.getMainLooper()) {
/* 84 */                        return pg3.m7436o();
                            }
/* 93 */                    if (Looper.myLooper() != null) {
/* 106 */                       return new nt0(new Handler(Looper.myLooper()));
                            }
/* 3 */                     return null;
                        case 5:
                            try {
/* 65 */                        return (Cipher) he0.f9026b.f9028a.mo2941x("AES/GCM/NoPadding");
                            } catch (GeneralSecurityException e5) {
/* 70 */                        C1697u2.m5439o(e5);
/* 3 */                         return null;
                            }
                        case 6:
/* 48 */                    SecureRandom secureRandom = new SecureRandom();
/* 51 */                    secureRandom.nextLong();
/* 54 */                    return secureRandom;
                        case 7:
/* 42 */                    return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
                        case 8:
/* 28 */                    return new C1713l();
                        case 9:
/* 23 */                    return Boolean.FALSE;
                        case 10:
/* 18 */                    return 0L;
                        default:
/* 9 */                     xk3 xk3Var = new xk3();
/* 13 */                    xk3Var.f19243a = 0;
/* 15 */                    return xk3Var;
                    }
                }
            }
