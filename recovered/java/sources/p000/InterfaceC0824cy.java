            package p000;

            import java.util.Set;
            
            /* JADX INFO: renamed from: cy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC0824cy {
                /* JADX INFO: renamed from: a */
                default Set mo1257a(f02 f02Var) {
/* 9 */             return (Set) mo1259c(f02Var).get();
                }

                /* JADX INFO: renamed from: b */
                default iz1 mo1258b(Class cls) {
/* 5 */             return mo1260d(f02.m3619a(cls));
                }

                /* JADX INFO: renamed from: c */
                iz1 mo1259c(f02 f02Var);

                /* JADX INFO: renamed from: d */
                iz1 mo1260d(f02 f02Var);

                /* JADX INFO: renamed from: e */
                default Object mo1261e(f02 f02Var) {
/* 1 */             iz1 iz1VarMo1260d = mo1260d(f02Var);
/* 5 */             if (iz1VarMo1260d == null) {
/* 7 */                 return null;
                    }
/* 9 */             return iz1VarMo1260d.get();
                }

                default Object get(Class cls) {
/* 5 */             return mo1261e(f02.m3619a(cls));
                }
            }
