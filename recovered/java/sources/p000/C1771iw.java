            package p000;

            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.RecyclerView;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.List;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: iw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C1771iw {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11944a;

                /* JADX INFO: renamed from: b */
                public int f11945b;

                /* JADX INFO: renamed from: c */
                public int f11946c;

                /* JADX INFO: renamed from: d */
                public int f11947d;

                /* JADX INFO: renamed from: e */
                public Object f11948e;

                public C1771iw(AbstractC1006hw abstractC1006hw) {
/* 2 */             this.f11944a = 0;
/* 7 */             this.f11947d = 0;
/* 11 */            ez0.m3614a(abstractC1006hw, "input");
/* 14 */            this.f11948e = abstractC1006hw;
/* 16 */            abstractC1006hw.f9337b = this;
                }

                /* JADX INFO: renamed from: T */
                public static void m5562T(int i) throws pz0 {
/* 3 */             if ((i & 3) != 0) {
/* 10 */                throw pz0.m7627f();
                    }
                }

                /* JADX INFO: renamed from: U */
                public static void m5563U(int i) throws pz0 {
/* 3 */             if ((i & 7) != 0) {
/* 10 */                throw pz0.m7627f();
                    }
                }

                /* JADX INFO: renamed from: A */
                public void m5564A(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3268v()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3268v()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: B */
                public void m5565B(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ja1;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(abstractC1006hw.mo3268v()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(abstractC1006hw.mo3268v()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ja1 ja1Var = (ja1) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ja1Var.m5731b(abstractC1006hw.mo3268v());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ja1Var.m5731b(abstractC1006hw.mo3268v());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: C */
                public void m5566C(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 2) {
/* 52 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 58 */                if ((iMo3247D & 3) != 0) {
/* 93 */                    throw new qz0("Failed to parse the message.");
                        }
/* 64 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 83 */                do {
/* 76 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3269w()));
/* 83 */                } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 85 */                return;
                    }
/* 13 */            if (i != 5) {
/* 51 */                throw qz0.m8030b();
                    }
/* 42 */            do {
/* 26 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3269w()));
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 85 */                    return;
                        } else {
/* 36 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C == this.f11945b);
/* 44 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: D */
                public void m5567D(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iMo3247D = abstractC1006hw.mo3247D();
/* 123 */                   m5562T(iMo3247D);
/* 130 */                   int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 146 */                   do {
/* 139 */                       list.add(Integer.valueOf(abstractC1006hw.mo3269w()));
/* 146 */                   } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 148 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 109 */               do {
/* 93 */                    list.add(Integer.valueOf(abstractC1006hw.mo3269w()));
/* 100 */                   if (abstractC1006hw.mo3257g()) {
/* 148 */                       return;
                            } else {
/* 103 */                       iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 109 */               } while (iMo3246C == this.f11945b);
/* 111 */               this.f11947d = iMo3246C;
/* 113 */               return;
                    }
/* 14 */            ry0 ry0Var = (ry0) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iMo3247D2 = abstractC1006hw.mo3247D();
/* 56 */                m5562T(iMo3247D2);
/* 63 */                int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 76 */                do {
/* 69 */                    ry0Var.m8332b(abstractC1006hw.mo3269w());
/* 76 */                } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 148 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw pz0.m7624c();
                    }
/* 42 */            do {
/* 26 */                ry0Var.m8332b(abstractC1006hw.mo3269w());
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 148 */                   return;
                        } else {
/* 36 */                    iMo3246C2 = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C2 == this.f11945b);
/* 44 */            this.f11947d = iMo3246C2;
                }

                /* JADX INFO: renamed from: E */
                public void m5568E(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 1) {
/* 89 */                do {
/* 73 */                    ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3270x()));
/* 80 */                    if (abstractC1006hw.mo3257g()) {
/* 82 */                        return;
                            } else {
/* 83 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 89 */                } while (iMo3246C == this.f11945b);
/* 91 */                this.f11947d = iMo3246C;
/* 93 */                return;
                    }
/* 13 */            if (i != 2) {
/* 61 */                throw qz0.m8030b();
                    }
/* 15 */            int iMo3247D = abstractC1006hw.mo3247D();
/* 21 */            if ((iMo3247D & 7) != 0) {
/* 56 */                throw new qz0("Failed to parse the message.");
                    }
/* 27 */            int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 46 */            do {
/* 39 */                ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3270x()));
/* 46 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
                }

                /* JADX INFO: renamed from: F */
                public void m5569F(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ja1;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Long.valueOf(abstractC1006hw.mo3270x()));
/* 134 */                       if (abstractC1006hw.mo3257g()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 143 */                   } while (iMo3246C == this.f11945b);
/* 145 */                   this.f11947d = iMo3246C;
/* 147 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 84 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 88 */                m5563U(iMo3247D);
/* 95 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 111 */               do {
/* 104 */                   list.add(Long.valueOf(abstractC1006hw.mo3270x()));
/* 111 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 136 */               return;
                    }
/* 14 */            ja1 ja1Var = (ja1) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    ja1Var.m5731b(abstractC1006hw.mo3270x());
/* 64 */                    if (abstractC1006hw.mo3257g()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 73 */                } while (iMo3246C2 == this.f11945b);
/* 75 */                this.f11947d = iMo3246C2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw pz0.m7624c();
                    }
/* 22 */            int iMo3247D2 = abstractC1006hw.mo3247D();
/* 26 */            m5563U(iMo3247D2);
/* 33 */            int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 45 */            do {
/* 38 */                ja1Var.m5731b(abstractC1006hw.mo3270x());
/* 45 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
                }

                /* JADX INFO: renamed from: G */
                public void m5570G(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3271y()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3271y()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: H */
                public void m5571H(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(abstractC1006hw.mo3271y()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(abstractC1006hw.mo3271y()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ry0 ry0Var = (ry0) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ry0Var.m8332b(abstractC1006hw.mo3271y());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ry0Var.m8332b(abstractC1006hw.mo3271y());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: I */
                public void m5572I(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3272z()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3272z()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: J */
                public void m5573J(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ja1;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(abstractC1006hw.mo3272z()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(abstractC1006hw.mo3272z()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ja1 ja1Var = (ja1) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ja1Var.m5731b(abstractC1006hw.mo3272z());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ja1Var.m5731b(abstractC1006hw.mo3272z());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: K */
                public void m5574K(dz0 dz0Var, boolean z) throws oz0, nz0 {
                    String strMo3244A;
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 10 */            if ((this.f11945b & 7) != 2) {
/* 57 */                throw qz0.m8030b();
                    }
/* 48 */            do {
/* 12 */                if (z) {
/* 14 */                    m5581R(2);
/* 17 */                    strMo3244A = abstractC1006hw.mo3245B();
                        } else {
/* 22 */                    m5581R(2);
/* 25 */                    strMo3244A = abstractC1006hw.mo3244A();
                        }
/* 32 */                ((ez1) dz0Var).add(strMo3244A);
/* 39 */                if (abstractC1006hw.mo3257g()) {
/* 41 */                    return;
                        } else {
/* 42 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 48 */            } while (iMo3246C == this.f11945b);
/* 50 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: L */
                public void m5575L(List list, boolean z) throws oz0, nz0 {
                    String strMo3244A;
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 10 */            if ((this.f11945b & 7) != 2) {
/* 88 */                throw pz0.m7624c();
                    }
/* 14 */            if ((list instanceof u51) && !z) {
/* 19 */                u51 u51Var = (u51) list;
/* 41 */                do {
/* 25 */                    u51Var.mo8695C0(m5593k());
/* 32 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 35 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 41 */                } while (iMo3246C2 == this.f11945b);
/* 43 */                this.f11947d = iMo3246C2;
/* 45 */                return;
                    }
/* 79 */            do {
/* 46 */                if (z) {
/* 48 */                    m5581R(2);
/* 51 */                    strMo3244A = abstractC1006hw.mo3245B();
                        } else {
/* 56 */                    m5581R(2);
/* 59 */                    strMo3244A = abstractC1006hw.mo3244A();
                        }
/* 63 */                list.add(strMo3244A);
/* 70 */                if (abstractC1006hw.mo3257g()) {
/* 72 */                    return;
                        } else {
/* 73 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 79 */            } while (iMo3246C == this.f11945b);
/* 81 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: M */
                public void m5576M(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3247D()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3247D()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: N */
                public void m5577N(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(abstractC1006hw.mo3247D()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(abstractC1006hw.mo3247D()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ry0 ry0Var = (ry0) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ry0Var.m8332b(abstractC1006hw.mo3247D());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ry0Var.m8332b(abstractC1006hw.mo3247D());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: O */
                public void m5578O(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3248E()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3248E()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: P */
                public void m5579P(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ja1;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Long.valueOf(abstractC1006hw.mo3248E()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Long.valueOf(abstractC1006hw.mo3248E()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ja1 ja1Var = (ja1) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ja1Var.m5731b(abstractC1006hw.mo3248E());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ja1Var.m5731b(abstractC1006hw.mo3248E());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: Q */
                public void m5580Q(int i) throws qz0, pz0 {
                    switch (this.f11944a) {
                        case 0:
/* 30 */                    if (((AbstractC1006hw) this.f11948e).mo3256f() != i) {
/* 37 */                        throw pz0.m7628g();
                            }
/* 32 */                    return;
                        default:
/* 14 */                    if (((AbstractC1006hw) this.f11948e).mo3256f() != i) {
/* 21 */                        throw qz0.m8033e();
                            }
/* 16 */                    return;
                    }
                }

                /* JADX INFO: renamed from: R */
                public void m5581R(int i) throws oz0, nz0 {
                    switch (this.f11944a) {
                        case 0:
/* 22 */                    if ((this.f11945b & 7) != i) {
/* 29 */                        throw pz0.m7624c();
                            }
/* 24 */                    return;
                        default:
/* 10 */                    if ((this.f11945b & 7) != i) {
/* 17 */                        throw qz0.m8030b();
                            }
/* 12 */                    return;
                    }
                }

                /* JADX INFO: renamed from: S */
                public boolean m5582S() {
                    int i;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 9 */             if (abstractC1006hw.mo3257g() || (i = this.f11945b) == this.f11946c) {
/* 23 */                return false;
                    }
/* 18 */            return abstractC1006hw.mo3603F(i);
                }

                /* JADX INFO: renamed from: a */
                public void m5583a(int i, int i2) {
/* 1 */             if (i < 0) {
/* 63 */                C1951n4.m6859j("Layout positions must be non-negative");
/* 66 */                return;
                    }
/* 3 */             if (i2 < 0) {
/* 57 */                C1951n4.m6859j("Pixel distance must be non-negative");
/* 60 */                return;
                    }
/* 5 */             int i3 = this.f11947d;
/* 7 */             int i4 = i3 * 2;
/* 11 */            int[] iArr = (int[]) this.f11948e;
/* 14 */            if (iArr == null) {
/* 16 */                int[] iArr2 = new int[4];
/* 18 */                this.f11948e = iArr2;
/* 21 */                Arrays.fill(iArr2, -1);
                    } else if (i4 >= iArr.length) {
/* 29 */                int[] iArr3 = new int[i3 * 4];
/* 31 */                this.f11948e = iArr3;
/* 35 */                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
/* 40 */            int[] iArr4 = (int[]) this.f11948e;
/* 42 */            iArr4[i4] = i;
/* 46 */            iArr4[i4 + 1] = i2;
/* 52 */            this.f11947d++;
                }

                /* JADX INFO: renamed from: b */
                public void m5584b(RecyclerView recyclerView, boolean z) {
/* 2 */             this.f11947d = 0;
/* 6 */             int[] iArr = (int[]) this.f11948e;
/* 8 */             if (iArr != null) {
/* 11 */                Arrays.fill(iArr, -1);
                    }
/* 14 */            AbstractC0133k abstractC0133k = recyclerView.f1637a0;
/* 18 */            if (recyclerView.f1631W == null || abstractC0133k == null || !abstractC0133k.f1767w) {
/* 76 */                return;
                    }
/* 26 */            if (z) {
/* 34 */                if (!recyclerView.f1645d.m7687h()) {
/* 42 */                    abstractC0133k.mo838t(recyclerView.f1631W.mo955a(), this);
                        }
                    } else if (!recyclerView.m859M()) {
/* 58 */                abstractC0133k.mo837s(this.f11945b, this.f11946c, recyclerView.f1624R0, this);
                    }
/* 61 */            int i = this.f11947d;
/* 65 */            if (i > abstractC0133k.f1753U) {
/* 67 */                abstractC0133k.f1753U = i;
/* 69 */                abstractC0133k.f1754V = z;
/* 73 */                recyclerView.f1639b.m1014k();
                    }
                }

                /* JADX INFO: renamed from: c */
                public int m5585c() {
                    switch (this.f11944a) {
                        case 0:
/* 42 */                    int i = this.f11947d;
/* 44 */                    if (i != 0) {
/* 46 */                        this.f11945b = i;
/* 49 */                        this.f11947d = 0;
                            } else {
/* 60 */                        this.f11945b = ((AbstractC1006hw) this.f11948e).mo3246C();
                            }
/* 62 */                    int i2 = this.f11945b;
                            return (i2 == 0 || i2 == this.f11946c) ? AbstractC0208c9.API_PRIORITY_OTHER : i2 >>> 3;
                        default:
/* 6 */                     int i3 = this.f11947d;
/* 8 */                     if (i3 != 0) {
/* 10 */                        this.f11945b = i3;
/* 13 */                        this.f11947d = 0;
                            } else {
/* 24 */                        this.f11945b = ((AbstractC1006hw) this.f11948e).mo3246C();
                            }
/* 26 */                    int i4 = this.f11945b;
                            return (i4 == 0 || i4 == this.f11946c) ? AbstractC0208c9.API_PRIORITY_OTHER : i4 >>> 3;
                    }
                }

                /* JADX INFO: renamed from: d */
                public void m5586d(Object obj, h72 h72Var, dg0 dg0Var) {
/* 1 */             int i = this.f11946c;
/* 11 */            this.f11946c = ((this.f11945b >>> 3) << 3) | 4;
                    try {
/* 13 */                h72Var.mo4129g(obj, this, dg0Var);
/* 20 */                if (this.f11945b != this.f11946c) {
/* 29 */                    throw pz0.m7627f();
                        }
/* 22 */                this.f11946c = i;
                    } catch (Throwable th) {
/* 31 */                this.f11946c = i;
/* 33 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public void m5587e(Object obj, i72 i72Var, eg0 eg0Var) {
/* 1 */             int i = this.f11946c;
/* 11 */            this.f11946c = ((this.f11945b >>> 3) << 3) | 4;
                    try {
/* 13 */                i72Var.mo4494d(obj, this, eg0Var);
/* 20 */                if (this.f11945b != this.f11946c) {
/* 32 */                    throw new qz0("Failed to parse the message.");
                        }
/* 22 */                this.f11946c = i;
                    } catch (Throwable th) {
/* 34 */                this.f11946c = i;
/* 36 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m5588f(Object obj, h72 h72Var, dg0 dg0Var) throws pz0 {
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             int iMo3247D = abstractC1006hw.mo3247D();
/* 13 */            if (abstractC1006hw.f9336a >= 100) {
/* 49 */                throw new pz0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
/* 15 */            int iMo3259l = abstractC1006hw.mo3259l(iMo3247D);
/* 23 */            abstractC1006hw.f9336a++;
/* 25 */            h72Var.mo4129g(obj, this, dg0Var);
/* 29 */            abstractC1006hw.mo3255b(0);
/* 36 */            abstractC1006hw.f9336a--;
/* 38 */            abstractC1006hw.mo3258j(iMo3259l);
                }

                /* JADX INFO: renamed from: g */
                public void m5589g(Object obj, i72 i72Var, eg0 eg0Var) throws qz0 {
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             int iMo3247D = abstractC1006hw.mo3247D();
/* 13 */            if (abstractC1006hw.f9336a >= 100) {
/* 49 */                throw new qz0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 15 */            int iMo3259l = abstractC1006hw.mo3259l(iMo3247D);
/* 23 */            abstractC1006hw.f9336a++;
/* 25 */            i72Var.mo4494d(obj, this, eg0Var);
/* 29 */            abstractC1006hw.mo3255b(0);
/* 36 */            abstractC1006hw.f9336a--;
/* 38 */            abstractC1006hw.mo3258j(iMo3259l);
                }

                /* JADX INFO: renamed from: h */
                public void m5590h(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Boolean.valueOf(abstractC1006hw.mo3260m()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Boolean.valueOf(abstractC1006hw.mo3260m()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: i */
                public void m5591i(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof AbstractC0022ak;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Boolean.valueOf(abstractC1006hw.mo3260m()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Boolean.valueOf(abstractC1006hw.mo3260m()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            AbstractC0022ak abstractC0022ak = (AbstractC0022ak) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    abstractC0022ak.m297b(abstractC1006hw.mo3260m());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                abstractC0022ak.m297b(abstractC1006hw.mo3260m());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: j */
                public C2259ul m5592j() throws oz0, nz0 {
/* 2 */             m5581R(2);
/* 9 */             return ((AbstractC1006hw) this.f11948e).mo3611o();
                }

                /* JADX INFO: renamed from: k */
                public AbstractC2298vl m5593k() throws oz0, nz0 {
/* 2 */             m5581R(2);
/* 9 */             return ((AbstractC1006hw) this.f11948e).mo3261n();
                }

                /* JADX INFO: renamed from: l */
                public void m5594l(dz0 dz0Var) throws oz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 10 */            if ((this.f11945b & 7) != 2) {
/* 44 */                throw qz0.m8030b();
                    }
/* 35 */            do {
/* 19 */                ((ez1) dz0Var).add(m5592j());
/* 26 */                if (abstractC1006hw.mo3257g()) {
/* 28 */                    return;
                        } else {
/* 29 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 35 */            } while (iMo3246C == this.f11945b);
/* 37 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: m */
                public void m5595m(List list) throws nz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 10 */            if ((this.f11945b & 7) != 2) {
/* 41 */                throw pz0.m7624c();
                    }
/* 32 */            do {
/* 16 */                list.add(m5593k());
/* 23 */                if (abstractC1006hw.mo3257g()) {
/* 25 */                    return;
                        } else {
/* 26 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 32 */            } while (iMo3246C == this.f11945b);
/* 34 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: n */
                public void m5596n(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 1) {
/* 89 */                do {
/* 73 */                    ((ez1) dz0Var).add(Double.valueOf(abstractC1006hw.mo3262p()));
/* 80 */                    if (abstractC1006hw.mo3257g()) {
/* 82 */                        return;
                            } else {
/* 83 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 89 */                } while (iMo3246C == this.f11945b);
/* 91 */                this.f11947d = iMo3246C;
/* 93 */                return;
                    }
/* 13 */            if (i != 2) {
/* 61 */                throw qz0.m8030b();
                    }
/* 15 */            int iMo3247D = abstractC1006hw.mo3247D();
/* 21 */            if ((iMo3247D & 7) != 0) {
/* 56 */                throw new qz0("Failed to parse the message.");
                    }
/* 27 */            int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 46 */            do {
/* 39 */                ((ez1) dz0Var).add(Double.valueOf(abstractC1006hw.mo3262p()));
/* 46 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
                }

                /* JADX INFO: renamed from: o */
                public void m5597o(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof k90;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Double.valueOf(abstractC1006hw.mo3262p()));
/* 134 */                       if (abstractC1006hw.mo3257g()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 143 */                   } while (iMo3246C == this.f11945b);
/* 145 */                   this.f11947d = iMo3246C;
/* 147 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 84 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 88 */                m5563U(iMo3247D);
/* 95 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 111 */               do {
/* 104 */                   list.add(Double.valueOf(abstractC1006hw.mo3262p()));
/* 111 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 136 */               return;
                    }
/* 14 */            k90 k90Var = (k90) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    k90Var.m6027b(abstractC1006hw.mo3262p());
/* 64 */                    if (abstractC1006hw.mo3257g()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 73 */                } while (iMo3246C2 == this.f11945b);
/* 75 */                this.f11947d = iMo3246C2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw pz0.m7624c();
                    }
/* 22 */            int iMo3247D2 = abstractC1006hw.mo3247D();
/* 26 */            m5563U(iMo3247D2);
/* 33 */            int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 45 */            do {
/* 38 */                k90Var.m6027b(abstractC1006hw.mo3262p());
/* 45 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
                }

                /* JADX INFO: renamed from: p */
                public void m5598p(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3263q()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3263q()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: q */
                public void m5599q(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(abstractC1006hw.mo3263q()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(abstractC1006hw.mo3263q()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ry0 ry0Var = (ry0) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ry0Var.m8332b(abstractC1006hw.mo3263q());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ry0Var.m8332b(abstractC1006hw.mo3263q());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

                /* JADX INFO: renamed from: r */
                public Object m5600r(y83 y83Var, Class cls, eg0 eg0Var) throws nz0, qz0 {
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
                    switch (y83Var.ordinal()) {
                        case 0:
/* 212 */                   m5581R(1);
/* 219 */                   return Double.valueOf(abstractC1006hw.mo3262p());
                        case 1:
/* 200 */                   m5581R(5);
/* 207 */                   return Float.valueOf(abstractC1006hw.mo3266t());
                        case 2:
/* 188 */                   m5581R(0);
/* 195 */                   return Long.valueOf(abstractC1006hw.mo3268v());
                        case 3:
/* 176 */                   m5581R(0);
/* 183 */                   return Long.valueOf(abstractC1006hw.mo3248E());
                        case 4:
/* 164 */                   m5581R(0);
/* 171 */                   return Integer.valueOf(abstractC1006hw.mo3267u());
                        case 5:
/* 152 */                   m5581R(1);
/* 159 */                   return Long.valueOf(abstractC1006hw.mo3265s());
                        case 6:
/* 140 */                   m5581R(5);
/* 147 */                   return Integer.valueOf(abstractC1006hw.mo3264r());
                        case 7:
/* 128 */                   m5581R(0);
/* 135 */                   return Boolean.valueOf(abstractC1006hw.mo3260m());
                        case 8:
/* 120 */                   m5581R(2);
/* 123 */                   return abstractC1006hw.mo3245B();
                        case 9:
                        default:
/* 18 */                    C1951n4.m6859j("unsupported field type.");
/* 21 */                    return null;
                        case 10:
/* 100 */                   m5581R(2);
/* 105 */                   i72 i72VarM2900a = cz1.f6940c.m2900a(cls);
/* 109 */                   tq0 tq0VarNewInstance = i72VarM2900a.newInstance();
/* 113 */                   m5589g(tq0VarNewInstance, i72VarM2900a, eg0Var);
/* 116 */                   i72VarM2900a.mo4492b(tq0VarNewInstance);
/* 119 */                   return tq0VarNewInstance;
                        case 11:
/* 95 */                    return m5592j();
                        case 12:
/* 83 */                    m5581R(0);
/* 90 */                    return Integer.valueOf(abstractC1006hw.mo3247D());
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 71 */                    m5581R(0);
/* 78 */                    return Integer.valueOf(abstractC1006hw.mo3263q());
                        case 14:
/* 59 */                    m5581R(5);
/* 66 */                    return Integer.valueOf(abstractC1006hw.mo3269w());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 47 */                    m5581R(1);
/* 54 */                    return Long.valueOf(abstractC1006hw.mo3270x());
                        case 16:
/* 35 */                    m5581R(0);
/* 42 */                    return Integer.valueOf(abstractC1006hw.mo3271y());
                        case 17:
/* 23 */                    m5581R(0);
/* 30 */                    return Long.valueOf(abstractC1006hw.mo3272z());
                    }
                }

                /* JADX INFO: renamed from: s */
                public void m5601s(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 2) {
/* 52 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 58 */                if ((iMo3247D & 3) != 0) {
/* 93 */                    throw new qz0("Failed to parse the message.");
                        }
/* 64 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 83 */                do {
/* 76 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3264r()));
/* 83 */                } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 85 */                return;
                    }
/* 13 */            if (i != 5) {
/* 51 */                throw qz0.m8030b();
                    }
/* 42 */            do {
/* 26 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3264r()));
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 85 */                    return;
                        } else {
/* 36 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C == this.f11945b);
/* 44 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: t */
                public void m5602t(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iMo3247D = abstractC1006hw.mo3247D();
/* 123 */                   m5562T(iMo3247D);
/* 130 */                   int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 146 */                   do {
/* 139 */                       list.add(Integer.valueOf(abstractC1006hw.mo3264r()));
/* 146 */                   } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 148 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 109 */               do {
/* 93 */                    list.add(Integer.valueOf(abstractC1006hw.mo3264r()));
/* 100 */                   if (abstractC1006hw.mo3257g()) {
/* 148 */                       return;
                            } else {
/* 103 */                       iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 109 */               } while (iMo3246C == this.f11945b);
/* 111 */               this.f11947d = iMo3246C;
/* 113 */               return;
                    }
/* 14 */            ry0 ry0Var = (ry0) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iMo3247D2 = abstractC1006hw.mo3247D();
/* 56 */                m5562T(iMo3247D2);
/* 63 */                int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 76 */                do {
/* 69 */                    ry0Var.m8332b(abstractC1006hw.mo3264r());
/* 76 */                } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 148 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw pz0.m7624c();
                    }
/* 42 */            do {
/* 26 */                ry0Var.m8332b(abstractC1006hw.mo3264r());
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 148 */                   return;
                        } else {
/* 36 */                    iMo3246C2 = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C2 == this.f11945b);
/* 44 */            this.f11947d = iMo3246C2;
                }

                /* JADX INFO: renamed from: u */
                public void m5603u(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 1) {
/* 89 */                do {
/* 73 */                    ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3265s()));
/* 80 */                    if (abstractC1006hw.mo3257g()) {
/* 82 */                        return;
                            } else {
/* 83 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 89 */                } while (iMo3246C == this.f11945b);
/* 91 */                this.f11947d = iMo3246C;
/* 93 */                return;
                    }
/* 13 */            if (i != 2) {
/* 61 */                throw qz0.m8030b();
                    }
/* 15 */            int iMo3247D = abstractC1006hw.mo3247D();
/* 21 */            if ((iMo3247D & 7) != 0) {
/* 56 */                throw new qz0("Failed to parse the message.");
                    }
/* 27 */            int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 46 */            do {
/* 39 */                ((ez1) dz0Var).add(Long.valueOf(abstractC1006hw.mo3265s()));
/* 46 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
                }

                /* JADX INFO: renamed from: v */
                public void m5604v(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ja1;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 78 */                int i2 = i & 7;
/* 80 */                if (i2 == 1) {
/* 143 */                   do {
/* 127 */                       list.add(Long.valueOf(abstractC1006hw.mo3265s()));
/* 134 */                       if (abstractC1006hw.mo3257g()) {
/* 136 */                           return;
                                } else {
/* 137 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 143 */                   } while (iMo3246C == this.f11945b);
/* 145 */                   this.f11947d = iMo3246C;
/* 147 */                   return;
                        }
/* 82 */                if (i2 != 2) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 84 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 88 */                m5563U(iMo3247D);
/* 95 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 111 */               do {
/* 104 */                   list.add(Long.valueOf(abstractC1006hw.mo3265s()));
/* 111 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 136 */               return;
                    }
/* 14 */            ja1 ja1Var = (ja1) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 1) {
/* 73 */                do {
/* 57 */                    ja1Var.m5731b(abstractC1006hw.mo3265s());
/* 64 */                    if (abstractC1006hw.mo3257g()) {
/* 136 */                       return;
                            } else {
/* 67 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 73 */                } while (iMo3246C2 == this.f11945b);
/* 75 */                this.f11947d = iMo3246C2;
/* 77 */                return;
                    }
/* 20 */            if (i3 != 2) {
/* 52 */                throw pz0.m7624c();
                    }
/* 22 */            int iMo3247D2 = abstractC1006hw.mo3247D();
/* 26 */            m5563U(iMo3247D2);
/* 33 */            int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 45 */            do {
/* 38 */                ja1Var.m5731b(abstractC1006hw.mo3265s());
/* 45 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
                }

                /* JADX INFO: renamed from: w */
                public void m5605w(dz0 dz0Var) throws qz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 10 */            if (i == 2) {
/* 52 */                int iMo3247D = abstractC1006hw.mo3247D();
/* 58 */                if ((iMo3247D & 3) != 0) {
/* 93 */                    throw new qz0("Failed to parse the message.");
                        }
/* 64 */                int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 83 */                do {
/* 76 */                    ((ez1) dz0Var).add(Float.valueOf(abstractC1006hw.mo3266t()));
/* 83 */                } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 85 */                return;
                    }
/* 13 */            if (i != 5) {
/* 51 */                throw qz0.m8030b();
                    }
/* 42 */            do {
/* 26 */                ((ez1) dz0Var).add(Float.valueOf(abstractC1006hw.mo3266t()));
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 85 */                    return;
                        } else {
/* 36 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C == this.f11945b);
/* 44 */            this.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: x */
                public void m5606x(List list) throws pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof qj0;
/* 7 */             int i = this.f11945b;
/* 11 */            if (!z) {
/* 79 */                int i2 = i & 7;
/* 81 */                if (i2 == 2) {
/* 119 */                   int iMo3247D = abstractC1006hw.mo3247D();
/* 123 */                   m5562T(iMo3247D);
/* 130 */                   int iMo3256f = abstractC1006hw.mo3256f() + iMo3247D;
/* 146 */                   do {
/* 139 */                       list.add(Float.valueOf(abstractC1006hw.mo3266t()));
/* 146 */                   } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 148 */                   return;
                        }
/* 83 */                if (i2 != 5) {
/* 118 */                   throw pz0.m7624c();
                        }
/* 109 */               do {
/* 93 */                    list.add(Float.valueOf(abstractC1006hw.mo3266t()));
/* 100 */                   if (abstractC1006hw.mo3257g()) {
/* 148 */                       return;
                            } else {
/* 103 */                       iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 109 */               } while (iMo3246C == this.f11945b);
/* 111 */               this.f11947d = iMo3246C;
/* 113 */               return;
                    }
/* 14 */            qj0 qj0Var = (qj0) list;
/* 16 */            int i3 = i & 7;
/* 18 */            if (i3 == 2) {
/* 52 */                int iMo3247D2 = abstractC1006hw.mo3247D();
/* 56 */                m5562T(iMo3247D2);
/* 63 */                int iMo3256f2 = abstractC1006hw.mo3256f() + iMo3247D2;
/* 76 */                do {
/* 69 */                    qj0Var.m7867b(abstractC1006hw.mo3266t());
/* 76 */                } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 148 */               return;
                    }
/* 20 */            if (i3 != 5) {
/* 51 */                throw pz0.m7624c();
                    }
/* 42 */            do {
/* 26 */                qj0Var.m7867b(abstractC1006hw.mo3266t());
/* 33 */                if (abstractC1006hw.mo3257g()) {
/* 148 */                   return;
                        } else {
/* 36 */                    iMo3246C2 = abstractC1006hw.mo3246C();
                        }
/* 42 */            } while (iMo3246C2 == this.f11945b);
/* 44 */            this.f11947d = iMo3246C2;
                }

                /* JADX INFO: renamed from: y */
                public void m5607y(dz0 dz0Var) throws qz0, pz0 {
                    int iMo3246C;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 7 */             int i = this.f11945b & 7;
/* 9 */             if (i == 0) {
/* 79 */                do {
/* 63 */                    ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3267u()));
/* 70 */                    if (abstractC1006hw.mo3257g()) {
/* 72 */                        return;
                            } else {
/* 73 */                        iMo3246C = abstractC1006hw.mo3246C();
                            }
/* 79 */                } while (iMo3246C == this.f11945b);
/* 81 */                this.f11947d = iMo3246C;
/* 83 */                return;
                    }
/* 12 */            if (i != 2) {
/* 51 */                throw qz0.m8030b();
                    }
/* 22 */            int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ((ez1) dz0Var).add(Integer.valueOf(abstractC1006hw.mo3267u()));
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 43 */            m5580Q(iMo3256f);
                }

                /* JADX INFO: renamed from: z */
                public void m5608z(List list) throws qz0, pz0 {
                    int iMo3246C;
                    int iMo3246C2;
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f11948e;
/* 5 */             boolean z = list instanceof ry0;
/* 7 */             int i = this.f11945b;
/* 10 */            if (!z) {
/* 77 */                int i2 = i & 7;
/* 79 */                if (i2 == 0) {
/* 142 */                   do {
/* 126 */                       list.add(Integer.valueOf(abstractC1006hw.mo3267u()));
/* 133 */                       if (abstractC1006hw.mo3257g()) {
/* 135 */                           return;
                                } else {
/* 136 */                           iMo3246C = abstractC1006hw.mo3246C();
                                }
/* 142 */                   } while (iMo3246C == this.f11945b);
/* 144 */                   this.f11947d = iMo3246C;
/* 146 */                   return;
                        }
/* 81 */                if (i2 != 2) {
/* 117 */                   throw pz0.m7624c();
                        }
/* 91 */                int iMo3256f = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 107 */               do {
/* 100 */                   list.add(Integer.valueOf(abstractC1006hw.mo3267u()));
/* 107 */               } while (abstractC1006hw.mo3256f() < iMo3256f);
/* 109 */               m5580Q(iMo3256f);
/* 112 */               return;
                    }
/* 13 */            ry0 ry0Var = (ry0) list;
/* 15 */            int i3 = i & 7;
/* 17 */            if (i3 == 0) {
/* 72 */                do {
/* 56 */                    ry0Var.m8332b(abstractC1006hw.mo3267u());
/* 63 */                    if (abstractC1006hw.mo3257g()) {
/* 135 */                       return;
                            } else {
/* 66 */                        iMo3246C2 = abstractC1006hw.mo3246C();
                            }
/* 72 */                } while (iMo3246C2 == this.f11945b);
/* 74 */                this.f11947d = iMo3246C2;
/* 76 */                return;
                    }
/* 19 */            if (i3 != 2) {
/* 51 */                throw pz0.m7624c();
                    }
/* 29 */            int iMo3256f2 = abstractC1006hw.mo3256f() + abstractC1006hw.mo3247D();
/* 41 */            do {
/* 34 */                ry0Var.m8332b(abstractC1006hw.mo3267u());
/* 41 */            } while (abstractC1006hw.mo3256f() < iMo3256f2);
/* 43 */            m5580Q(iMo3256f2);
                }

/* 18 */        public C1771iw(AbstractC1006hw abstractC1006hw, byte b) {
                    this.f11944a = 1;
/* 20 */            this.f11947d = 0;
/* 21 */            Charset charset = fz0.f8401a;
                    this.f11948e = abstractC1006hw;
/* 22 */            abstractC1006hw.f9337b = this;
                }

/* 22 */        public /* synthetic */ C1771iw() {
/* 23 */            this.f11944a = 2;
                }
            }
