            package io.sentry;

            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.d2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class C1425d2 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f10848a;

                public C1425d2(List list) {
/* 17 */            this.f10848a = new ArrayList(list == null ? new ArrayList(0) : list);
                }

                /* JADX INFO: renamed from: a */
                public InterfaceC1751y1 m5191a() {
/* 1 */             ArrayList arrayList = this.f10848a;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return null;
                    }
/* 21 */            return (InterfaceC1751y1) arrayList.get(arrayList.size() - 1);
                }

                /* JADX INFO: renamed from: b */
                public boolean m5192b() {
/* 8 */             if (this.f10848a.size() == 1) {
/* 7 */                 return true;
                    }
/* 11 */            InterfaceC1751y1 interfaceC1751y1M5191a = m5191a();
/* 15 */            m5194d();
/* 24 */            if (!(m5191a() instanceof C1378b2)) {
/* 65 */                if (!(m5191a() instanceof C1759z1)) {
/* 86 */                    return false;
                        }
/* 71 */                C1759z1 c1759z1 = (C1759z1) m5191a();
/* 73 */                if (interfaceC1751y1M5191a == null || c1759z1 == null) {
/* 86 */                    return false;
                        }
/* 83 */                c1759z1.f11848a.add(interfaceC1751y1M5191a.getValue());
/* 86 */                return false;
                    }
/* 30 */            C1378b2 c1378b2 = (C1378b2) m5191a();
/* 32 */            m5194d();
/* 39 */            C1157a2 c1157a2 = (C1157a2) m5191a();
/* 41 */            if (c1378b2 == null || interfaceC1751y1M5191a == null || c1157a2 == null) {
/* 86 */                return false;
                    }
/* 55 */            c1157a2.f9796a.put(c1378b2.f10715a, interfaceC1751y1M5191a.getValue());
/* 86 */            return false;
                }

                /* JADX INFO: renamed from: c */
                public boolean m5193c(InterfaceC1743x1 interfaceC1743x1) {
/* 1 */             Object objMo3666a = interfaceC1743x1.mo3666a();
/* 9 */             if (m5191a() == null && objMo3666a != null) {
/* 20 */                this.f10848a.add(new C1390c2(objMo3666a));
/* 23 */                return true;
                    }
/* 31 */            if (m5191a() instanceof C1378b2) {
/* 37 */                C1378b2 c1378b2 = (C1378b2) m5191a();
/* 39 */                m5194d();
/* 52 */                ((C1157a2) m5191a()).f9796a.put(c1378b2.f10715a, objMo3666a);
/* 75 */                return false;
                    }
/* 62 */            if (!(m5191a() instanceof C1759z1)) {
/* 75 */                return false;
                    }
/* 72 */            ((C1759z1) m5191a()).f11848a.add(objMo3666a);
/* 75 */            return false;
                }

                /* JADX INFO: renamed from: d */
                public void m5194d() {
/* 1 */             ArrayList arrayList = this.f10848a;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return;
                    }
/* 16 */            arrayList.remove(arrayList.size() - 1);
                }

/* 19 */        public C1425d2() {
/* 21 */            this.f10848a = new ArrayList();
                }
            }
