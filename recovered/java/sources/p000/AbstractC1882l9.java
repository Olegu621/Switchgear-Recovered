            package p000;

            import android.os.Build;
            import java.util.HashSet;
            
            /* JADX INFO: renamed from: l9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1882l9 {

                /* JADX INFO: renamed from: c */
                public static final HashSet f13153c = new HashSet();

                /* JADX INFO: renamed from: a */
                public final String f13154a;

                /* JADX INFO: renamed from: b */
                public final String f13155b;

                public AbstractC1882l9(String str, String str2) {
/* 4 */             this.f13154a = str;
/* 6 */             this.f13155b = str2;
/* 10 */            f13153c.add(this);
                }

                /* JADX INFO: renamed from: a */
                public abstract boolean mo6026a();

                /* JADX INFO: renamed from: b */
                public boolean mo97b() {
/* 1 */             HashSet hashSet = AbstractC1785j9.f12148a;
/* 3 */             String str = this.f13155b;
/* 9 */             if (hashSet.contains(str)) {
/* 44 */                return true;
                    }
/* 11 */            String str2 = Build.TYPE;
                    return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
                }
            }
