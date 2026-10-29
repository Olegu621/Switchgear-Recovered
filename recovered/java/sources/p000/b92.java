            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.HashMap;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class b92 {

                /* JADX INFO: renamed from: a */
                public final HashMap f2330a;

                public b92(zq2 zq2Var) {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.f2330a = map;
/* 13 */            m1300b("iglu:com.snowplowanalytics.mobile/screen/jsonschema/1-0-0");
/* 20 */            map.put(SharedDataContentProvider.BASE_PATH, zq2Var.f20294b);
                }

                /* JADX INFO: renamed from: a */
                public final void m1299a(Object obj) {
/* 1 */             if (obj != null) {
/* 7 */                 this.f2330a.put(SharedDataContentProvider.BASE_PATH, obj);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m1300b(String str) {
/* 1 */             str.getClass();
/* 8 */             if (str.length() > 0) {
/* 14 */                this.f2330a.put("schema", str);
                    } else {
/* 20 */                C1951n4.m6859j("schema cannot be empty");
                    }
                }

                public final String toString() {
/* 8 */             String string = new JSONObject(this.f2330a).toString();
/* 12 */            string.getClass();
/* 15 */            return string;
                }

/* 23 */        public b92(String str, Object obj) {
                    str.getClass();
                    obj.getClass();
/* 25 */            this.f2330a = new HashMap();
/* 26 */            m1300b(str);
/* 27 */            m1299a(obj);
                }

/* 27 */        public b92(String str) {
/* 29 */            this.f2330a = new HashMap();
/* 30 */            m1300b(str);
/* 31 */            m1299a(new HashMap());
                }
            }
