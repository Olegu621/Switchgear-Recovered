            package p000;

            import com.google.android.gms.internal.measurement.zzn;
            import com.google.android.gms.internal.measurement.zzu;
            import java.util.HashMap;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ui3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17548a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vi3 f17549b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f17550c;

                public /* synthetic */ ui3(vi3 vi3Var, String str, int i) {
/* 1 */             this.f17548a = i;
/* 3 */             this.f17549b = vi3Var;
/* 5 */             this.f17550c = str;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
/* 1 */             int i = this.f17548a;
/* 3 */             String str = this.f17550c;
/* 5 */             vi3 vi3Var = this.f17549b;
                    switch (i) {
                        case 0:
/* 124 */                   return new zzu("internal.appMetadata", new ui3(vi3Var, str, 1));
                        case 1:
/* 27 */                    ae3 ae3Var = vi3Var.f15676b.f13913c;
/* 29 */                    mp3.m6728S(ae3Var);
/* 32 */                    di3 di3VarM219D0 = ae3Var.m219D0(str);
/* 38 */                    HashMap map = new HashMap();
/* 45 */                    map.put("platform", "android");
/* 50 */                    map.put("package_name", str);
/* 59 */                    ((ij3) vi3Var.f16749a).f9651d.m7401E();
/* 71 */                    map.put("gmp_version", 130000L);
/* 74 */                    if (di3VarM219D0 != null) {
/* 76 */                        String strM3103N = di3VarM219D0.m3103N();
/* 80 */                        if (strM3103N != null) {
/* 84 */                            map.put("app_version", strM3103N);
                                }
/* 97 */                        map.put("app_version_int", Long.valueOf(di3VarM219D0.m3105P()));
/* 110 */                       map.put("dynamite_version", Long.valueOf(di3VarM219D0.m3110b()));
                            }
/* 113 */                   return map;
                        default:
/* 21 */                    return new zzn("internal.remoteConfig", new we2(20, vi3Var, str));
                    }
                }
            }
