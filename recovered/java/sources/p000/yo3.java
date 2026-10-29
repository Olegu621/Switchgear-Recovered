            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzgl;
            import com.google.android.gms.internal.measurement.zzil;
            import com.google.android.gms.internal.measurement.zzin;
            import com.google.android.gms.internal.measurement.zzis;
            import java.util.Collections;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yo3 extends qo3 {
                /* JADX INFO: renamed from: C */
                public static final boolean m10165C(String str) {
/* 8 */             String str2 = (String) vg3.f18163t.m9011a(null);
/* 15 */            if (TextUtils.isEmpty(str2)) {
/* 14 */                return false;
                    }
/* 26 */            for (String str3 : str2.split(",")) {
/* 38 */                if (str.equalsIgnoreCase(str3.trim())) {
/* 40 */                    return true;
                        }
                    }
/* 14 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
                
                    if (java.lang.Math.abs(r8.hashCode() % 100) < r9.zzq().zzc()) goto L24;
                 */
                /* JADX INFO: renamed from: A */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final xo3 m10166A(String str) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             mp3 mp3Var = this.f15676b;
/* 7 */             ae3 ae3Var = mp3Var.f13913c;
/* 9 */             vi3 vi3Var = mp3Var.f13909a;
/* 11 */            mp3.m6728S(ae3Var);
/* 14 */            di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 18 */            zl3 zl3Var = zl3.GOOGLE_ANALYTICS;
/* 20 */            xo3 xo3Var = null;
/* 21 */            if (di3VarM219D0 == null || !di3VarM219D0.m3133y()) {
/* 421 */               return new xo3(m10167B(str), Collections.EMPTY_MAP, zl3Var, null);
                    }
/* 31 */            zzil zzilVarZzb = zzis.zzb();
/* 36 */            zzilVarZzb.zzb(2);
/* 43 */            zzin zzinVarZzb = zzin.zzb(di3VarM219D0.m3128t());
/* 47 */            kb1.m6061n(zzinVarZzb);
/* 50 */            zzilVarZzb.zza(zzinVarZzb);
/* 53 */            String strM3094E = di3VarM219D0.m3094E();
/* 57 */            mp3.m6728S(vi3Var);
/* 60 */            zzgl zzglVarM9286L = vi3Var.m9286L(str);
/* 65 */            if (zzglVarM9286L != null) {
/* 69 */                ae3 ae3Var2 = mp3Var.f13913c;
/* 71 */                mp3.m6728S(ae3Var2);
/* 74 */                di3 di3VarM219D1 = ae3Var2.m219D0(str);
/* 78 */                if (di3VarM219D1 != null) {
/* 86 */                    if (!zzglVarM9286L.zzp() || zzglVarM9286L.zzq().zzc() != 100) {
/* 98 */                        up3 up3Var = ij3Var.f9668w;
/* 100 */                       ij3.m4553j(up3Var);
/* 111 */                       if (!up3Var.m9098Z(str, di3VarM219D1.m3092C())) {
/* 118 */                           if (!TextUtils.isEmpty(strM3094E)) {
                                    }
                                }
                            }
/* 141 */                   String strM3093D = di3VarM219D0.m3093D();
/* 145 */                   zzilVarZzb.zzb(2);
/* 148 */                   mp3.m6728S(vi3Var);
/* 155 */                   zzgl zzglVarM9286L2 = vi3Var.m9286L(di3VarM219D0.m3093D());
/* 159 */                   if (zzglVarM9286L2 == null || !zzglVarM9286L2.zzp()) {
/* 355 */                       uh3 uh3Var = ij3Var.f9655f;
/* 357 */                       ij3.m4555l(uh3Var);
/* 364 */                       uh3Var.f17534Y.m8511b(strM3093D, "[sgtm] Missing sgtm_setting in remote config. appId");
/* 368 */                       zzilVarZzb.zzc(4);
                            } else {
/* 171 */                       HashMap map = new HashMap();
/* 182 */                       if (!TextUtils.isEmpty(di3VarM219D0.m3092C())) {
/* 190 */                           map.put("x-gtm-server-preview", di3VarM219D0.m3092C());
                                }
/* 197 */                       String strZzd = zzglVarM9286L2.zzq().zzd();
/* 205 */                       zzin zzinVarZzb2 = zzin.zzb(di3VarM219D0.m3128t());
/* 209 */                       if (zzinVarZzb2 != null && zzinVarZzb2 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
/* 215 */                           zzilVarZzb.zza(zzinVarZzb2);
                                } else if (m10165C(di3VarM219D0.m3093D())) {
/* 231 */                           zzilVarZzb.zza(zzin.PINNED_TO_SERVICE_UPLOAD);
                                } else if (TextUtils.isEmpty(strZzd)) {
/* 243 */                           zzilVarZzb.zza(zzin.MISSING_SGTM_SERVER_URL);
                                } else {
/* 321 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 323 */                           ij3.m4555l(uh3Var2);
/* 330 */                           uh3Var2.f17534Y.m8511b(strM3093D, "[sgtm] Eligible for client side upload. appId");
/* 333 */                           zzilVarZzb.zzb(3);
/* 338 */                           zzilVarZzb.zza(zzin.CLIENT_UPLOAD_ELIGIBLE);
/* 351 */                           xo3Var = new xo3(strZzd, map, zl3.SGTM_CLIENT, (zzis) zzilVarZzb.zzbc());
                                }
/* 250 */                       zzglVarM9286L2.zzq().zza();
/* 257 */                       zzglVarM9286L2.zzq().zzb();
/* 260 */                       ij3Var.getClass();
/* 263 */                       uh3 uh3Var3 = ij3Var.f9655f;
/* 269 */                       if (TextUtils.isEmpty(strZzd)) {
/* 303 */                           zzilVarZzb.zzc(6);
/* 306 */                           ij3.m4555l(uh3Var3);
/* 317 */                           uh3Var3.f17534Y.m8511b(di3VarM219D0.m3093D(), "[sgtm] Local service, missing sgtm_server_url");
                                } else {
/* 271 */                           ij3.m4555l(uh3Var3);
/* 278 */                           uh3Var3.f17534Y.m8511b(strM3093D, "[sgtm] Eligible for local service direct upload. appId");
/* 282 */                           zzilVarZzb.zzb(5);
/* 285 */                           zzilVarZzb.zzc(2);
/* 298 */                           xo3Var = new xo3(strZzd, map, zl3.SGTM, (zzis) zzilVarZzb.zzbc());
                                }
                            }
                            return xo3Var != null ? xo3Var : new xo3(m10167B(str), Collections.EMPTY_MAP, zl3Var, (zzis) zzilVarZzb.zzbc());
                        }
                    }
/* 392 */           zzilVarZzb.zzc(3);
/* 409 */           return new xo3(m10167B(str), Collections.EMPTY_MAP, zl3Var, (zzis) zzilVarZzb.zzbc());
                }

                /* JADX INFO: renamed from: B */
                public final String m10167B(String str) {
/* 3 */             vi3 vi3Var = this.f15676b.f13909a;
/* 5 */             mp3.m6728S(vi3Var);
/* 8 */             String strM9287M = vi3Var.m9287M(str);
/* 17 */            if (TextUtils.isEmpty(strM9287M)) {
/* 96 */                return (String) vg3.f18159r.m9011a(null);
                    }
/* 27 */            Uri uri = Uri.parse((String) vg3.f18159r.m9011a(null));
/* 31 */            Uri.Builder builderBuildUpon = uri.buildUpon();
/* 35 */            String authority = uri.getAuthority();
/* 60 */            StringBuilder sb = new StringBuilder(String.valueOf(strM9287M).length() + 1 + String.valueOf(authority).length());
/* 63 */            sb.append(strM9287M);
/* 68 */            sb.append(".");
/* 71 */            sb.append(authority);
/* 78 */            builderBuildUpon.authority(sb.toString());
/* 85 */            return builderBuildUpon.build().toString();
                }
            }
