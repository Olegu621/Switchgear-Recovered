            package p000;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a92 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final Map f132b;

                /* JADX INFO: renamed from: c */
                public final String f133c;

                public a92(b92 b92Var) {
/* 4 */             HashMap map = b92Var.f2330a;
/* 8 */             Object obj = map.get(SharedDataContentProvider.BASE_PATH);
/* 12 */            obj.getClass();
/* 17 */            this.f132b = (Map) obj;
/* 21 */            Object obj2 = map.get("schema");
/* 25 */            obj2.getClass();
/* 30 */            this.f133c = (String) obj2;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 1 */             return this.f132b;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return this.f133c;
                }
            }
