            package p000;

            import java.security.GeneralSecurityException;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class al1 {

                /* JADX INFO: renamed from: b */
                public static final al1 f328b = new al1();

                /* JADX INFO: renamed from: a */
                public final AtomicReference f329a = new AtomicReference(new ha2(new ra2(19)));

                /* JADX INFO: renamed from: a */
                public final de3 m303a(xy1 xy1Var) {
/* 1 */             AtomicReference atomicReference = this.f329a;
/* 7 */             ha2 ha2Var = (ha2) atomicReference.get();
/* 9 */             ha2Var.getClass();
/* 16 */            C2335wl c2335wl = (C2335wl) xy1Var.f19395c;
/* 29 */            if (!ha2Var.f8987b.containsKey(new fa2(xy1.class, c2335wl))) {
                        try {
/* 33 */                    C2133r6 c2133r6 = new C2133r6();
/* 40 */                    ((h31) xy1Var.f19397e).ordinal();
/* 43 */                    return c2133r6;
                        } catch (GeneralSecurityException e) {
/* 52 */                    throw new C2086px("Creating a LegacyProtoKey failed", e);
                        }
                    }
/* 57 */            ha2 ha2Var2 = (ha2) atomicReference.get();
/* 59 */            ha2Var2.getClass();
/* 64 */            fa2 fa2Var = new fa2(xy1.class, c2335wl);
/* 67 */            HashMap map = ha2Var2.f8987b;
/* 73 */            if (map.containsKey(fa2Var)) {
/* 83 */                return ((p31) map.get(fa2Var)).f14955b.mo3209c(xy1Var);
                    }
/* 92 */            ds0.m3205v(fa2Var, "No Key Parser for requested key type ", " available");
/* 95 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public final synchronized void m304b(p31 p31Var) {
/* 12 */            ra2 ra2Var = new ra2((ha2) this.f329a.get());
/* 17 */            p31Var.getClass();
/* 24 */            fa2 fa2Var = new fa2(xy1.class, p31Var.f14954a);
/* 29 */            HashMap map = (HashMap) ra2Var.f15956b;
/* 35 */            if (map.containsKey(fa2Var)) {
/* 41 */                p31 p31Var2 = (p31) map.get(fa2Var);
/* 47 */                if (!p31Var2.equals(p31Var) || p31Var != p31Var2) {
/* 54 */                    ds0.m3207x(fa2Var, "Attempt to register non-equal parser for already existing object of type: ");
                        }
                    } else {
/* 58 */                map.put(fa2Var, p31Var);
                    }
/* 68 */            this.f329a.set(new ha2(ra2Var));
                }

                /* JADX INFO: renamed from: c */
                public final synchronized void m305c(t31 t31Var) {
/* 12 */            ra2 ra2Var = new ra2((ha2) this.f329a.get());
/* 21 */            ga2 ga2Var = new ga2(t31Var.f16911a, xy1.class);
/* 26 */            HashMap map = (HashMap) ra2Var.f15955a;
/* 32 */            if (map.containsKey(ga2Var)) {
/* 38 */                t31 t31Var2 = (t31) map.get(ga2Var);
/* 44 */                if (!t31Var2.equals(t31Var) || t31Var != t31Var2) {
/* 51 */                    ds0.m3207x(ga2Var, "Attempt to register non-equal serializer for already existing object of type: ");
                        }
                    } else {
/* 55 */                map.put(ga2Var, t31Var);
                    }
/* 65 */            this.f329a.set(new ha2(ra2Var));
                }

                /* JADX INFO: renamed from: d */
                public final synchronized void m306d(ir1 ir1Var) {
/* 12 */            ra2 ra2Var = new ra2((ha2) this.f329a.get());
/* 17 */            ir1Var.getClass();
/* 24 */            fa2 fa2Var = new fa2(yy1.class, ir1Var.f11915a);
/* 29 */            HashMap map = (HashMap) ra2Var.f15958d;
/* 35 */            if (map.containsKey(fa2Var)) {
/* 41 */                ir1 ir1Var2 = (ir1) map.get(fa2Var);
/* 47 */                if (!ir1Var2.equals(ir1Var) || ir1Var != ir1Var2) {
/* 54 */                    ds0.m3207x(fa2Var, "Attempt to register non-equal parser for already existing object of type: ");
                        }
                    } else {
/* 58 */                map.put(fa2Var, ir1Var);
                    }
/* 68 */            this.f329a.set(new ha2(ra2Var));
                }

                /* JADX INFO: renamed from: e */
                public final synchronized void m307e(jr1 jr1Var) {
/* 12 */            ra2 ra2Var = new ra2((ha2) this.f329a.get());
/* 21 */            ga2 ga2Var = new ga2(jr1Var.f12449a, yy1.class);
/* 26 */            HashMap map = (HashMap) ra2Var.f15957c;
/* 32 */            if (map.containsKey(ga2Var)) {
/* 38 */                jr1 jr1Var2 = (jr1) map.get(ga2Var);
/* 44 */                if (!jr1Var2.equals(jr1Var) || jr1Var != jr1Var2) {
/* 51 */                    ds0.m3207x(ga2Var, "Attempt to register non-equal serializer for already existing object of type: ");
                        }
                    } else {
/* 55 */                map.put(ga2Var, jr1Var);
                    }
/* 65 */            this.f329a.set(new ha2(ra2Var));
                }
            }
