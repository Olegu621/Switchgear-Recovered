            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import android.os.Build;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kb2 {

                /* JADX INFO: renamed from: a */
                public final jb2 f12673a;

                public kb2(ArrayList arrayList, y92 y92Var, C0851dp c0851dp) {
/* 8 */             if (Build.VERSION.SDK_INT < 28) {
/* 15 */                this.f12673a = new ib2(arrayList, y92Var, c0851dp);
                    } else {
/* 23 */                this.f12673a = new hb2(arrayList, y92Var, c0851dp);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static ArrayList m6075a(List list) {
/* 7 */             ArrayList arrayList = new ArrayList(list.size());
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 34 */                arrayList.add((OutputConfiguration) ((oq1) it.next()).f14865a.mo7988c());
                    }
/* 38 */            return arrayList;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof kb2)) {
/* 5 */                 return false;
                    }
/* 13 */            return this.f12673a.equals(((kb2) obj).f12673a);
                }

                public final int hashCode() {
/* 3 */             return this.f12673a.hashCode();
                }
            }
