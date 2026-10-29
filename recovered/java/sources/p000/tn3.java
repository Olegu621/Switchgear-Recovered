            package p000;

            import android.content.pm.PackageManager;
            import android.os.SystemClock;
            import android.util.Pair;
            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import io.sentry.android.core.C1268s;
            import java.math.BigInteger;
            import java.security.MessageDigest;
            import java.util.HashMap;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tn3 extends wo3 {

                /* JADX INFO: renamed from: U */
                public final C1268s f17193U;

                /* JADX INFO: renamed from: d */
                public final HashMap f17194d;

                /* JADX INFO: renamed from: e */
                public final C1268s f17195e;

                /* JADX INFO: renamed from: f */
                public final C1268s f17196f;

                /* JADX INFO: renamed from: i */
                public final C1268s f17197i;

                /* JADX INFO: renamed from: v */
                public final C1268s f17198v;

                /* JADX INFO: renamed from: w */
                public final C1268s f17199w;

                public tn3(mp3 mp3Var) {
/* 1 */             super(mp3Var);
/* 9 */             this.f17194d = new HashMap();
/* 17 */            ki3 ki3Var = ((ij3) this.f16749a).f9653e;
/* 19 */            ij3.m4553j(ki3Var);
/* 29 */            this.f17195e = new C1268s(ki3Var, "last_delete_stale", 0L);
/* 37 */            ki3 ki3Var2 = ((ij3) this.f16749a).f9653e;
/* 39 */            ij3.m4553j(ki3Var2);
/* 47 */            this.f17196f = new C1268s(ki3Var2, "last_delete_stale_batch", 0L);
/* 55 */            ki3 ki3Var3 = ((ij3) this.f16749a).f9653e;
/* 57 */            ij3.m4553j(ki3Var3);
/* 65 */            this.f17197i = new C1268s(ki3Var3, "backoff", 0L);
/* 73 */            ki3 ki3Var4 = ((ij3) this.f16749a).f9653e;
/* 75 */            ij3.m4553j(ki3Var4);
/* 83 */            this.f17198v = new C1268s(ki3Var4, "last_upload", 0L);
/* 91 */            ki3 ki3Var5 = ((ij3) this.f16749a).f9653e;
/* 93 */            ij3.m4553j(ki3Var5);
/* 101 */           this.f17199w = new C1268s(ki3Var5, "last_upload_attempt", 0L);
/* 109 */           ki3 ki3Var6 = ((ij3) this.f16749a).f9653e;
/* 111 */           ij3.m4553j(ki3Var6);
/* 119 */           this.f17193U = new C1268s(ki3Var6, "midnight_offset", 0L);
                }

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
                }

                /* JADX INFO: renamed from: D */
                public final Pair m8814D(String str) {
                    rn3 rn3Var;
                    AdvertisingIdClient.Info advertisingIdInfo;
/* 3 */             mo1375y();
/* 8 */             ij3 ij3Var = (ij3) this.f16749a;
/* 10 */            xt0 xt0Var = ij3Var.f9640V;
/* 12 */            pd3 pd3Var = ij3Var.f9651d;
/* 14 */            xt0Var.getClass();
/* 17 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 21 */            HashMap map = this.f17194d;
/* 27 */            rn3 rn3Var2 = (rn3) map.get(str);
/* 29 */            if (rn3Var2 != null && jElapsedRealtime < rn3Var2.f16203c) {
/* 48 */                return new Pair(rn3Var2.f16201a, Boolean.valueOf(rn3Var2.f16202b));
                    }
/* 53 */            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
/* 62 */            long jM7403G = pd3Var.m7403G(str, vg3.f18118b) + jElapsedRealtime;
                    try {
                        try {
/* 66 */                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(ij3Var.f9645a);
                        } catch (PackageManager.NameNotFoundException unused) {
/* 74 */                    if (rn3Var2 != null && jElapsedRealtime < rn3Var2.f16203c + pd3Var.m7403G(str, vg3.f18121c)) {
/* 99 */                        return new Pair(rn3Var2.f16201a, Boolean.valueOf(rn3Var2.f16202b));
                            }
/* 103 */                   advertisingIdInfo = null;
                        }
/* 104 */               if (advertisingIdInfo == null) {
/* 112 */                   return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
                        }
/* 116 */               String id = advertisingIdInfo.getId();
/* 138 */               rn3Var = id != null ? new rn3(id, jM7403G, advertisingIdInfo.isLimitAdTrackingEnabled()) : new rn3(HttpUrl.FRAGMENT_ENCODE_SET, jM7403G, advertisingIdInfo.isLimitAdTrackingEnabled());
/* 159 */               map.put(str, rn3Var);
/* 162 */               AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
/* 175 */               return new Pair(rn3Var.f16201a, Boolean.valueOf(rn3Var.f16202b));
                    } catch (Exception e) {
/* 142 */               uh3 uh3Var = ij3Var.f9655f;
/* 144 */               ij3.m4555l(uh3Var);
/* 151 */               uh3Var.f17533X.m8511b(e, "Unable to get advertising id");
/* 156 */               rn3Var = new rn3(HttpUrl.FRAGMENT_ENCODE_SET, jM7403G, false);
                    }
                }

                /* JADX INFO: renamed from: E */
                public final String m8815E(String str, boolean z) {
/* 1 */             mo1375y();
/* 15 */            String str2 = z ? (String) m8814D(str).first : "00000000-0000-0000-0000-000000000000";
/* 17 */            MessageDigest messageDigestM9063Q = up3.m9063Q();
/* 21 */            if (messageDigestM9063Q == null) {
/* 23 */                return null;
                    }
/* 47 */            return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM9063Q.digest(str2.getBytes())));
                }
            }
