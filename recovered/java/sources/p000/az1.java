            package p000;

            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class az1 {

                /* JADX INFO: renamed from: c */
                public static final az1 f2145c = new az1();

                /* JADX INFO: renamed from: b */
                public final ConcurrentHashMap f2147b = new ConcurrentHashMap();

                /* JADX INFO: renamed from: a */
                public final qc3 f2146a = new qc3(1);

                /* JADX INFO: renamed from: a */
                public final h72 m1182a(Class cls) {
                    h72 h72VarM7812A;
                    Class cls2;
/* 3 */             ez0.m3614a(cls, "messageType");
/* 6 */             ConcurrentHashMap concurrentHashMap = this.f2147b;
/* 12 */            h72 h72Var = (h72) concurrentHashMap.get(cls);
/* 14 */            if (h72Var != null) {
/* 196 */               return h72Var;
                    }
/* 16 */            qc3 qc3Var = this.f2146a;
/* 18 */            qc3Var.getClass();
/* 21 */            Class cls3 = l72.f13131a;
/* 30 */            if (!sq0.class.isAssignableFrom(cls) && (cls2 = l72.f13131a) != null && !cls2.isAssignableFrom(cls)) {
/* 45 */                C1951n4.m6859j("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
/* 29 */                return null;
                    }
/* 53 */            s02 s02VarMo6414a = ((lb1) qc3Var.f15492b).mo6414a(cls);
/* 69 */            if ((s02VarMo6414a.f16374d & 2) == 2) {
/* 75 */                if (sq0.class.isAssignableFrom(cls)) {
/* 85 */                    h72VarM7812A = new sh1(l72.f13134d, hg0.f9066a, s02VarMo6414a.f16371a);
                        } else {
/* 89 */                    tx2 tx2Var = l72.f13132b;
/* 91 */                    fg0 fg0Var = hg0.f9067b;
/* 93 */                    if (fg0Var == null) {
/* 103 */                       f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 99 */                    h72VarM7812A = new sh1(tx2Var, fg0Var, s02VarMo6414a.f16371a);
                        }
                    } else if (sq0.class.isAssignableFrom(cls)) {
/* 142 */               h72VarM7812A = (s02VarMo6414a.f16374d & 1) == 1 ? qh1.m7812A(s02VarMo6414a, in1.f9727b, c81.f2763b, l72.f13134d, hg0.f9066a, jc1.f12210b) : qh1.m7812A(s02VarMo6414a, in1.f9727b, c81.f2763b, l72.f13134d, null, jc1.f12210b);
                    } else if ((s02VarMo6414a.f16374d & 1) == 1) {
/* 152 */               gn1 gn1Var = in1.f9726a;
/* 154 */               a81 a81Var = c81.f2762a;
/* 156 */               tx2 tx2Var2 = l72.f13132b;
/* 158 */               fg0 fg0Var2 = hg0.f9067b;
/* 160 */               if (fg0Var2 == null) {
/* 169 */                   f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 29 */                    return null;
                        }
/* 164 */               h72VarM7812A = qh1.m7812A(s02VarMo6414a, gn1Var, a81Var, tx2Var2, fg0Var2, jc1.f12209a);
                    } else {
/* 182 */               h72VarM7812A = qh1.m7812A(s02VarMo6414a, in1.f9726a, c81.f2762a, l72.f13133c, null, jc1.f12209a);
                    }
/* 190 */           h72 h72Var2 = (h72) concurrentHashMap.putIfAbsent(cls, h72VarM7812A);
                    return h72Var2 != null ? h72Var2 : h72VarM7812A;
                }
            }
