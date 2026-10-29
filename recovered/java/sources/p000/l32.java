            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 83 */    public final class l32 {

                /* JADX INFO: renamed from: a */
                public final zq2 f13089a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f13090b;

                /* JADX INFO: renamed from: c */
                public final boolean f13091c;

                /* JADX INFO: renamed from: d */
                public final String f13092d;

                public l32(ArrayList arrayList, ArrayList arrayList2) {
                    String str;
/* 6 */             ArrayList arrayList3 = new ArrayList();
/* 9 */             Iterator it = arrayList.iterator();
                    loop0: while (true) {
/* 14 */                str = null;
                        while (true) {
/* 19 */                    if (!it.hasNext()) {
                                break loop0;
                            }
/* 25 */                    zq2 zq2Var = (zq2) it.next();
/* 29 */                    arrayList3.add(zq2Var.f20294b);
/* 32 */                    HashMap map = zq2Var.f20294b;
/* 34 */                    map = map == null ? null : map;
/* 38 */                    if (map == null) {
                                break;
                            }
/* 42 */                    Object obj = map.get("ua");
/* 48 */                    if (!(obj instanceof String)) {
                                break;
                            } else {
/* 50 */                        str = (String) obj;
                            }
                        }
                    }
/* 55 */            zq2 zq2Var2 = new zq2();
/* 58 */            this.f13089a = zq2Var2;
/* 67 */            HashMap map2 = new b92("iglu:com.snowplowanalytics.snowplow/payload_data/jsonschema/1-0-4", arrayList3).f2330a;
/* 69 */            HashMap map3 = map2 != null ? map2 : null;
/* 72 */            if (map3 != null) {
/* 74 */                zq2Var2.m10422c(map3);
                    }
/* 77 */            this.f13090b = arrayList2;
/* 79 */            this.f13092d = str;
/* 82 */            this.f13091c = false;
                }

/* 84 */        public l32(zq2 zq2Var, long j, boolean z) {
/* 86 */            ArrayList arrayList = new ArrayList();
/* 87 */            arrayList.add(Long.valueOf(j));
/* 88 */            this.f13090b = arrayList;
/* 89 */            this.f13089a = zq2Var;
/* 90 */            this.f13091c = z;
/* 91 */            HashMap map = zq2Var.f20294b;
                    String str = null;
                    map = map == null ? null : map;
                    if (map != null) {
/* 92 */                Object obj = map.get("ua");
                        if (obj instanceof String) {
                            str = (String) obj;
                        }
                    }
/* 93 */            this.f13092d = str;
                }
            }
