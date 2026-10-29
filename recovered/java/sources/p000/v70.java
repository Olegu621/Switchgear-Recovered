            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class v70 implements s70 {

                /* JADX INFO: renamed from: d */
                public final l73 f17884d;

                /* JADX INFO: renamed from: f */
                public int f17886f;

                /* JADX INFO: renamed from: g */
                public int f17887g;

                /* JADX INFO: renamed from: a */
                public l73 f17881a = null;

                /* JADX INFO: renamed from: b */
                public boolean f17882b = false;

                /* JADX INFO: renamed from: c */
                public boolean f17883c = false;

                /* JADX INFO: renamed from: e */
                public int f17885e = 1;

                /* JADX INFO: renamed from: h */
                public int f17888h = 1;

                /* JADX INFO: renamed from: i */
                public n80 f17889i = null;

                /* JADX INFO: renamed from: j */
                public boolean f17890j = false;

                /* JADX INFO: renamed from: k */
                public final ArrayList f17891k = new ArrayList();

                /* JADX INFO: renamed from: l */
                public final ArrayList f17892l = new ArrayList();

                public v70(l73 l73Var) {
/* 35 */            this.f17884d = l73Var;
                }

                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
/* 1 */             ArrayList<v70> arrayList = this.f17892l;
/* 3 */             Iterator it = arrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 21 */                if (!((v70) it.next()).f17890j) {
/* 109 */                   return;
                        }
                    }
/* 25 */            this.f17883c = true;
/* 27 */            l73 l73Var = this.f17881a;
/* 29 */            if (l73Var != null) {
/* 31 */                l73Var.mo1441a(this);
                    }
/* 36 */            if (this.f17882b) {
/* 40 */                this.f17884d.mo1441a(this);
/* 43 */                return;
                    }
/* 48 */            v70 v70Var = null;
/* 49 */            int i = 0;
/* 54 */            for (v70 v70Var2 : arrayList) {
/* 64 */                if (!(v70Var2 instanceof n80)) {
/* 67 */                    i++;
/* 69 */                    v70Var = v70Var2;
                        }
                    }
/* 71 */            if (v70Var != null && i == 1 && v70Var.f17890j) {
/* 79 */                n80 n80Var = this.f17889i;
/* 81 */                if (n80Var != null) {
/* 85 */                    if (!n80Var.f17890j) {
/* 109 */                       return;
                            } else {
/* 92 */                        this.f17886f = this.f17888h * n80Var.f17887g;
                            }
                        }
/* 99 */                mo6945d(v70Var.f17887g + this.f17886f);
                    }
/* 102 */           l73 l73Var2 = this.f17881a;
/* 104 */           if (l73Var2 != null) {
/* 106 */               l73Var2.mo1441a(this);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9226b(l73 l73Var) {
/* 3 */             this.f17891k.add(l73Var);
/* 8 */             if (this.f17890j) {
/* 10 */                l73Var.mo1441a(l73Var);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m9227c() {
/* 3 */             this.f17892l.clear();
/* 8 */             this.f17891k.clear();
/* 12 */            this.f17890j = false;
/* 14 */            this.f17887g = 0;
/* 16 */            this.f17883c = false;
/* 18 */            this.f17882b = false;
                }

                /* JADX INFO: renamed from: d */
                public void mo6945d(int i) {
/* 3 */             if (this.f17890j) {
/* 33 */                return;
                    }
/* 7 */             this.f17890j = true;
/* 9 */             this.f17887g = i;
/* 21 */            for (s70 s70Var : this.f17891k) {
/* 29 */                s70Var.mo1441a(s70Var);
                    }
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 12 */            sb.append(this.f17884d.f13136b.f20442k0);
/* 17 */            sb.append(":");
/* 26 */            sb.append(AbstractC0886en.m3495D(this.f17885e));
/* 31 */            sb.append("(");
/* 47 */            sb.append(this.f17890j ? Integer.valueOf(this.f17887g) : "unresolved");
/* 52 */            sb.append(") <t=");
/* 61 */            sb.append(this.f17892l.size());
/* 66 */            sb.append(":d=");
/* 75 */            sb.append(this.f17891k.size());
/* 80 */            sb.append(">");
/* 83 */            return sb.toString();
                }
            }
