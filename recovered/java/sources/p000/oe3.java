            package p000;

            import android.os.Bundle;
            import android.text.TextUtils;
            import com.google.android.gms.measurement.internal.zzbe;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 168 */   public final class oe3 {

                /* JADX INFO: renamed from: a */
                public final String f14727a;

                /* JADX INFO: renamed from: b */
                public final String f14728b;

                /* JADX INFO: renamed from: c */
                public final String f14729c;

                /* JADX INFO: renamed from: d */
                public final long f14730d;

                /* JADX INFO: renamed from: e */
                public final long f14731e;

                /* JADX INFO: renamed from: f */
                public final zzbe f14732f;

                public oe3(ij3 ij3Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
                    zzbe zzbeVar;
/* 4 */             kb1.m6058k(str2);
/* 7 */             kb1.m6058k(str3);
/* 10 */            this.f14727a = str2;
/* 12 */            this.f14728b = str3;
/* 22 */            this.f14729c = true == TextUtils.isEmpty(str) ? null : str;
/* 24 */            this.f14730d = j;
/* 26 */            this.f14731e = j2;
/* 32 */            if (j2 != 0 && j2 > j) {
/* 38 */                uh3 uh3Var = ij3Var.f9655f;
/* 40 */                ij3.m4555l(uh3Var);
/* 51 */                uh3Var.f17541w.m8511b(uh3.m9013H(str2), "Event created with reverse previous/current timestamps. appId");
                    }
/* 54 */            if (bundle == null || bundle.isEmpty()) {
/* 164 */               zzbeVar = new zzbe(new Bundle());
                    } else {
/* 64 */                Bundle bundle2 = new Bundle(bundle);
/* 71 */                Iterator<String> it = bundle2.keySet().iterator();
/* 79 */                while (it.hasNext()) {
/* 81 */                    String next = it.next();
/* 87 */                    if (next == null) {
/* 89 */                        uh3 uh3Var2 = ij3Var.f9655f;
/* 91 */                        ij3.m4555l(uh3Var2);
/* 98 */                        uh3Var2.f17538f.m8510a("Param name can't be null");
/* 101 */                       it.remove();
                            } else {
/* 105 */                       up3 up3Var = ij3Var.f9668w;
/* 107 */                       ij3.m4553j(up3Var);
/* 114 */                       Object objM9083G = up3Var.m9083G(bundle2.get(next), next);
/* 118 */                       if (objM9083G == null) {
/* 120 */                           uh3 uh3Var3 = ij3Var.f9655f;
/* 122 */                           ij3.m4555l(uh3Var3);
/* 135 */                           uh3Var3.f17541w.m8511b(ij3Var.f9639U.m6657b(next), "Param value can't be null");
/* 138 */                           it.remove();
                                } else {
/* 142 */                           up3 up3Var2 = ij3Var.f9668w;
/* 144 */                           ij3.m4553j(up3Var2);
/* 147 */                           up3Var2.m9094O(objM9083G, next, bundle2);
                                }
                            }
                        }
/* 153 */               zzbeVar = new zzbe(bundle2);
                    }
/* 167 */           this.f14732f = zzbeVar;
                }

                /* JADX INFO: renamed from: a */
                public final oe3 m7140a(ij3 ij3Var, long j) {
/* 15 */            return new oe3(ij3Var, this.f14729c, this.f14727a, this.f14728b, this.f14730d, j, this.f14732f);
                }

                public final String toString() {
/* 3 */             String string = this.f14732f.toString();
/* 7 */             String str = this.f14727a;
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            String str2 = this.f14728b;
/* 41 */            StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
/* 48 */            fm0.m3796v(sb, "Event{appId='", str, "', name='", str2);
/* 55 */            return fm0.m3790p(sb, "', params=", string, "}");
                }

/* 169 */       public oe3(ij3 ij3Var, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
                    kb1.m6058k(str2);
/* 171 */           kb1.m6058k(str3);
/* 172 */           kb1.m6061n(zzbeVar);
                    this.f14727a = str2;
                    this.f14728b = str3;
/* 173 */           this.f14729c = true == TextUtils.isEmpty(str) ? null : str;
                    this.f14730d = j;
                    this.f14731e = j2;
                    if (j2 != 0 && j2 > j) {
/* 174 */               uh3 uh3Var = ij3Var.f9655f;
/* 175 */               ij3.m4555l(uh3Var);
/* 178 */               uh3Var.f17541w.m8512c(uh3.m9013H(str2), "Event created with reverse previous/current timestamps. appId, name", uh3.m9013H(str3));
                    }
                    this.f14732f = zzbeVar;
                }
            }
