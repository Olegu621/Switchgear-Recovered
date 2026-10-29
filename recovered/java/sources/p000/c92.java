            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c92 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ u21[] f2779b = {new sy1(c92.class, "schema", "getSchema()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, c92.class, SharedDataContentProvider.BASE_PATH, "getData()Ljava/util/Map;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f2780a;

                public c92(Map map) {
/* 1 */             map.getClass();
/* 7 */             this.f2780a = map;
                }

                /* JADX INFO: renamed from: a */
                public final b92 m1552a() {
/* 4 */             u21[] u21VarArr = f2779b;
/* 8 */             String name = u21VarArr[0].getName();
/* 12 */            Map map = this.f2780a;
/* 33 */            return new b92((String) mc1.m6638a(map, name), (Map) mc1.m6638a(map, u21VarArr[1].getName()));
                }
            }
