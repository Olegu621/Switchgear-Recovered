            package p000;

            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yp3 {

                /* JADX INFO: renamed from: c */
                public static final yp3 f19747c = new yp3();

                /* JADX INFO: renamed from: b */
                public final ConcurrentHashMap f19749b = new ConcurrentHashMap();

                /* JADX INFO: renamed from: a */
                public final d52 f19748a = new d52(3);

                /* JADX INFO: renamed from: a */
                public final bq3 m10168a(Class cls) {
                    bq3 bq3VarM8829u;
                    Class cls2;
/* 1 */             Charset charset = so3.f16726a;
/* 4 */             if (cls == null) {
/* 197 */               C1951n4.m6868s("messageType");
/* 3 */                 return null;
                    }
/* 6 */             ConcurrentHashMap concurrentHashMap = this.f19749b;
/* 12 */            bq3 bq3Var = (bq3) concurrentHashMap.get(cls);
/* 14 */            if (bq3Var != null) {
/* 194 */               return bq3Var;
                    }
/* 16 */            d52 d52Var = this.f19748a;
/* 18 */            d52Var.getClass();
/* 21 */            Class cls3 = cq3.f6887a;
/* 29 */            if (!eo3.class.isAssignableFrom(cls) && (cls2 = cq3.f6887a) != null && !cls2.isAssignableFrom(cls)) {
/* 44 */                C1951n4.m6859j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
/* 3 */                 return null;
                    }
/* 52 */            aq3 aq3VarZzc = ((ip3) d52Var.f7001a).zzc(cls);
/* 68 */            if ((aq3VarZzc.f2062d & 2) == 2) {
/* 74 */                if (eo3.class.isAssignableFrom(cls)) {
/* 84 */                    bq3VarM8829u = new vp3(cq3.f6890d, sn3.f16722a, aq3VarZzc.f2059a);
                        } else {
/* 88 */                    nq3 nq3Var = cq3.f6888b;
/* 90 */                    qn3 qn3Var = sn3.f16723b;
/* 92 */                    if (qn3Var == null) {
/* 103 */                       f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 3 */                         return null;
                            }
/* 98 */                    bq3VarM8829u = new vp3(nq3Var, qn3Var, aq3VarZzc.f2059a);
                        }
                    } else if (eo3.class.isAssignableFrom(cls)) {
/* 116 */               if ((aq3VarZzc.f2062d & 1) == 1) {
/* 118 */                   int i = xp3.f19310a;
/* 120 */                   dp3 dp3Var = ep3.f7829b;
/* 122 */                   nq3 nq3Var2 = cq3.f6890d;
/* 124 */                   qn3 qn3Var2 = sn3.f16722a;
/* 126 */                   int i2 = op3.f14862a;
/* 128 */                   bq3VarM8829u = tp3.m8829u(aq3VarZzc, dp3Var, nq3Var2, qn3Var2);
                        } else {
/* 133 */                   int i3 = xp3.f19310a;
/* 135 */                   dp3 dp3Var2 = ep3.f7829b;
/* 137 */                   nq3 nq3Var3 = cq3.f6890d;
/* 139 */                   int i4 = op3.f14862a;
/* 141 */                   bq3VarM8829u = tp3.m8829u(aq3VarZzc, dp3Var2, nq3Var3, null);
                        }
                    } else if ((aq3VarZzc.f2062d & 1) == 1) {
/* 151 */               int i5 = xp3.f19310a;
/* 153 */               cp3 cp3Var = ep3.f7828a;
/* 155 */               nq3 nq3Var4 = cq3.f6888b;
/* 157 */               qn3 qn3Var3 = sn3.f16723b;
/* 159 */               if (qn3Var3 == null) {
/* 168 */                   f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 3 */                     return null;
                        }
/* 161 */               int i6 = op3.f14862a;
/* 163 */               bq3VarM8829u = tp3.m8829u(aq3VarZzc, cp3Var, nq3Var4, qn3Var3);
                    } else {
/* 172 */               int i7 = xp3.f19310a;
/* 174 */               cp3 cp3Var2 = ep3.f7828a;
/* 176 */               nq3 nq3Var5 = cq3.f6889c;
/* 178 */               int i8 = op3.f14862a;
/* 180 */               bq3VarM8829u = tp3.m8829u(aq3VarZzc, cp3Var2, nq3Var5, null);
                    }
/* 188 */           bq3 bq3Var2 = (bq3) concurrentHashMap.putIfAbsent(cls, bq3VarM8829u);
                    return bq3Var2 == null ? bq3VarM8829u : bq3Var2;
                }
            }
