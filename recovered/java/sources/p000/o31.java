            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class o31 {

                /* JADX INFO: renamed from: b */
                public static final Logger f14603b = Logger.getLogger(o31.class.getName());

                /* JADX INFO: renamed from: a */
                public final ConcurrentHashMap f14604a;

                public o31(o31 o31Var) {
/* 11 */            this.f14604a = new ConcurrentHashMap(o31Var.f14604a);
                }

                /* JADX INFO: renamed from: a */
                public final synchronized n31 m7094a(String str) {
/* 10 */            if (!this.f14604a.containsKey(str)) {
/* 41 */                throw new GeneralSecurityException("No key manager found for key type " + str);
                    }
/* 18 */            return (n31) this.f14604a.get(str);
                }

                /* JADX INFO: renamed from: b */
                public final synchronized void m7095b(kx0 kx0Var) {
/* 4 */             int iMo6293l = kx0Var.mo6293l();
/* 20 */            if (!(iMo6293l != 1 ? pm2.m7479b(iMo6293l) : pm2.m7478a(iMo6293l))) {
/* 60 */                throw new GeneralSecurityException("failed to register key manager " + kx0Var.getClass() + " as it is not FIPS compatible.");
                    }
/* 27 */            m7096c(new n31(kx0Var));
                }

                /* JADX INFO: renamed from: c */
                public final synchronized void m7096c(n31 n31Var) {
/* 6 */             kx0 kx0Var = n31Var.f14110a;
/* 10 */            Class cls = (Class) kx0Var.f13035c;
/* 24 */            if (!((Map) kx0Var.f13034b).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 70 */                throw new IllegalArgumentException("Given internalKeyMananger " + kx0Var.toString() + " does not support primitive class " + cls.getName());
                    }
/* 71 */            String strMo6294m = kx0Var.mo6294m();
/* 81 */            n31 n31Var2 = (n31) this.f14604a.get(strMo6294m);
/* 83 */            if (n31Var2 != null && !n31Var2.f14110a.getClass().equals(n31Var.f14110a.getClass())) {
/* 110 */               f14603b.warning("Attempted overwrite of a registered key manager for key type ".concat(strMo6294m));
/* 166 */               throw new GeneralSecurityException("typeUrl (" + strMo6294m + ") is already registered with " + n31Var2.f14110a.getClass().getName() + ", cannot be re-registered with " + n31Var.f14110a.getClass().getName());
                    }
/* 171 */           this.f14604a.putIfAbsent(strMo6294m, n31Var);
                }

/* 13 */        public o31() {
/* 15 */            this.f14604a = new ConcurrentHashMap();
                }
            }
