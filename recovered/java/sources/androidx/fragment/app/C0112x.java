            package androidx.fragment.app;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import p000.q33;
            import p000.t33;
            import p000.wm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.x */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0112x extends q33 {

                /* JADX INFO: renamed from: j */
                public static final wm0 f1517j = new wm0(0);

                /* JADX INFO: renamed from: g */
                public final boolean f1521g;

                /* JADX INFO: renamed from: d */
                public final HashMap f1518d = new HashMap();

                /* JADX INFO: renamed from: e */
                public final HashMap f1519e = new HashMap();

                /* JADX INFO: renamed from: f */
                public final HashMap f1520f = new HashMap();

                /* JADX INFO: renamed from: h */
                public boolean f1522h = false;

                /* JADX INFO: renamed from: i */
                public boolean f1523i = false;

                public C0112x(boolean z) {
/* 30 */            this.f1521g = z;
                }

                @Override // p000.q33
                /* JADX INFO: renamed from: b */
                public final void mo729b() {
/* 6 */             if (AbstractC0111w.m674K(3)) {
/* 8 */                 toString();
                    }
/* 12 */            this.f1522h = true;
                }

                /* JADX INFO: renamed from: c */
                public final void m730c(Fragment fragment) {
/* 3 */             if (this.f1523i) {
/* 5 */                 return;
                    }
/* 6 */             String str = fragment.mWho;
/* 8 */             HashMap map = this.f1518d;
/* 14 */            if (map.containsKey(str)) {
/* 32 */                return;
                    }
/* 19 */            map.put(fragment.mWho, fragment);
/* 27 */            if (AbstractC0111w.m674K(2)) {
/* 29 */                fragment.toString();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m731d(String str, boolean z) {
/* 1 */             HashMap map = this.f1519e;
/* 7 */             C0112x c0112x = (C0112x) map.get(str);
/* 9 */             if (c0112x != null) {
/* 11 */                if (z) {
/* 15 */                    ArrayList arrayList = new ArrayList();
/* 24 */                    arrayList.addAll(c0112x.f1519e.keySet());
/* 27 */                    Iterator it = arrayList.iterator();
/* 35 */                    while (it.hasNext()) {
/* 44 */                        c0112x.m731d((String) it.next(), true);
                            }
                        }
/* 48 */                c0112x.mo729b();
/* 51 */                map.remove(str);
                    }
/* 54 */            HashMap map2 = this.f1520f;
/* 60 */            t33 t33Var = (t33) map2.get(str);
/* 62 */            if (t33Var != null) {
/* 64 */                t33Var.m8686a();
/* 67 */                map2.remove(str);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m732e(Fragment fragment) {
/* 3 */             if (this.f1523i || this.f1518d.remove(fragment.mWho) == null || !AbstractC0111w.m674K(2)) {
/* 26 */                return;
                    }
/* 23 */            fragment.toString();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && C0112x.class == obj.getClass()) {
/* 17 */                C0112x c0112x = (C0112x) obj;
/* 27 */                if (this.f1518d.equals(c0112x.f1518d) && this.f1519e.equals(c0112x.f1519e) && this.f1520f.equals(c0112x.f1520f)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 24 */            return this.f1520f.hashCode() + ((this.f1519e.hashCode() + (this.f1518d.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append("} Fragments (");
/* 30 */            Iterator it = this.f1518d.values().iterator();
/* 40 */            while (it.hasNext()) {
/* 46 */                sb.append(it.next());
/* 53 */                if (it.hasNext()) {
/* 55 */                    sb.append(", ");
                        }
                    }
/* 61 */            sb.append(") Child Non Config (");
/* 70 */            Iterator it2 = this.f1519e.keySet().iterator();
/* 78 */            while (it2.hasNext()) {
/* 86 */                sb.append((String) it2.next());
/* 93 */                if (it2.hasNext()) {
/* 95 */                    sb.append(", ");
                        }
                    }
/* 101 */           sb.append(") ViewModelStores (");
/* 110 */           Iterator it3 = this.f1520f.keySet().iterator();
/* 118 */           while (it3.hasNext()) {
/* 126 */               sb.append((String) it3.next());
/* 133 */               if (it3.hasNext()) {
/* 135 */                   sb.append(", ");
                        }
                    }
/* 141 */           sb.append(')');
/* 144 */           return sb.toString();
                }
            }
