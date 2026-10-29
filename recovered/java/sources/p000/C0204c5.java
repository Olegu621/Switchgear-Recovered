            package p000;

            import android.os.Process;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            import java.util.IllegalFormatException;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: c5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 47 */    public final class C0204c5 {

                /* JADX INFO: renamed from: c */
                public static final C0204c5 f2701c;

                /* JADX INFO: renamed from: d */
                public static final C0204c5 f2702d;

                /* JADX INFO: renamed from: e */
                public static final C0204c5 f2703e;

                /* JADX INFO: renamed from: f */
                public static final C0204c5 f2704f;

                /* JADX INFO: renamed from: g */
                public static final C0204c5 f2705g;

                /* JADX INFO: renamed from: h */
                public static final C0204c5 f2706h;

                /* JADX INFO: renamed from: i */
                public static final C0204c5 f2707i;

                /* JADX INFO: renamed from: j */
                public static final C0204c5 f2708j;

                /* JADX INFO: renamed from: k */
                public static final C0204c5 f2709k;

                /* JADX INFO: renamed from: l */
                public static final C0204c5 f2710l;

                /* JADX INFO: renamed from: m */
                public static final C0204c5 f2711m;

                /* JADX INFO: renamed from: n */
                public static final C0204c5 f2712n;

                /* JADX INFO: renamed from: o */
                public static final C0204c5 f2713o;

                /* JADX INFO: renamed from: p */
                public static final C0204c5 f2714p;

                /* JADX INFO: renamed from: q */
                public static final C0204c5 f2715q;

                /* JADX INFO: renamed from: r */
                public static final C0204c5 f2716r;

                /* JADX INFO: renamed from: s */
                public static final C0204c5 f2717s;

                /* JADX INFO: renamed from: t */
                public static final C0204c5 f2718t;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2719a;

                /* JADX INFO: renamed from: b */
                public final String f2720b;

                static {
/* 5 */             int i = 0;
/* 9 */             f2701c = new C0204c5("SHA1", i);
/* 18 */            f2702d = new C0204c5("SHA224", i);
/* 27 */            f2703e = new C0204c5("SHA256", i);
/* 36 */            f2704f = new C0204c5("SHA384", i);
/* 45 */            f2705g = new C0204c5("SHA512", i);
/* 51 */            int i2 = 1;
/* 55 */            f2706h = new C0204c5("TINK", i2);
/* 64 */            f2707i = new C0204c5("CRUNCHY", i2);
/* 73 */            f2708j = new C0204c5("NO_PREFIX", i2);
/* 79 */            int i3 = 2;
/* 83 */            f2709k = new C0204c5("TINK", i3);
/* 92 */            f2710l = new C0204c5("CRUNCHY", i3);
/* 101 */           f2711m = new C0204c5("NO_PREFIX", i3);
/* 107 */           int i4 = 3;
/* 111 */           f2712n = new C0204c5("NONE", i4);
/* 120 */           f2713o = new C0204c5("FULL", i4);
/* 126 */           int i5 = 4;
/* 130 */           f2714p = new C0204c5("FOLD", i5);
/* 139 */           f2715q = new C0204c5("HINGE", i5);
/* 145 */           int i6 = 5;
/* 149 */           f2716r = new C0204c5("ENABLED", i6);
/* 158 */           f2717s = new C0204c5("DISABLED", i6);
/* 167 */           f2718t = new C0204c5("DESTROYED", i6);
                }

                public C0204c5(String str) {
/* 2 */             this.f2719a = 7;
/* 46 */            this.f2720b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
                }

                /* JADX INFO: renamed from: d */
                public static String m1527d(String str, String str2, Object... objArr) {
/* 2 */             if (objArr.length > 0) {
                        try {
/* 6 */                     str2 = String.format(Locale.US, str2, objArr);
                        } catch (IllegalFormatException e) {
/* 20 */                    AbstractC1245n0.m4877e("PlayCore", "Unable to format ".concat(str2), e);
/* 33 */                    str2 = pm2.m7489l(str2, " [", TextUtils.join(", ", objArr), "]");
                        }
                    }
/* 39 */            return AbstractC0886en.m3508l(str, " : ", str2);
                }

                /* JADX INFO: renamed from: a */
                public void m1528a(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 3)) {
/* 12 */                m1527d(this.f2720b, str, objArr);
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m1529b(RemoteException remoteException, String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 16 */                AbstractC1245n0.m4877e("PlayCore", m1527d(this.f2720b, str, objArr), remoteException);
                    }
                }

                /* JADX INFO: renamed from: c */
                public void m1530c(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 4)) {
/* 12 */                m1527d(this.f2720b, str, objArr);
                    }
                }

                public String toString() {
                    boolean zContainsAlias;
/* 1 */             int i = this.f2719a;
/* 3 */             String str = this.f2720b;
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
/* 51 */                    return str;
                        case 6:
/* 17 */                    StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
/* 20 */                    sb.append(str);
/* 25 */                    sb.append(", isKeyStoreBacked=");
                            try {
/* 30 */                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 35 */                        keyStore.load(null);
/* 38 */                        zContainsAlias = keyStore.containsAlias(str);
                                break;
                            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
/* 43 */                        zContainsAlias = false;
                            }
/* 46 */                    return AbstractC0886en.m3511o(sb, zContainsAlias, "}");
                        default:
/* 8 */                     return super.toString();
                    }
                }

/* 48 */        public /* synthetic */ C0204c5(String str, int i) {
/* 49 */            this.f2719a = i;
                    this.f2720b = str;
                }

/* 49 */        public C0204c5(String str, Object obj) {
                    this.f2719a = 6;
/* 51 */            this.f2720b = str;
                }
            }
