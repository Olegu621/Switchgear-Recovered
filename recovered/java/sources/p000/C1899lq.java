            package p000;

            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            
            /* JADX INFO: renamed from: lq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1899lq {

                /* JADX INFO: renamed from: a */
                public final StringBuilder f13450a = new StringBuilder();

                /* JADX INFO: renamed from: b */
                public final Object f13451b;

                /* JADX INFO: renamed from: c */
                public int f13452c;

                /* JADX INFO: renamed from: d */
                public final C1837kn f13453d;

                /* JADX INFO: renamed from: e */
                public final HashMap f13454e;

                /* JADX INFO: renamed from: f */
                public int f13455f;

                public C1899lq(C1837kn c1837kn) {
/* 13 */            Object obj = new Object();
/* 16 */            this.f13451b = obj;
/* 23 */            this.f13454e = new HashMap();
/* 26 */            this.f13452c = 1;
                    synchronized (obj) {
/* 29 */                this.f13453d = c1837kn;
/* 33 */                this.f13455f = this.f13452c;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m6518c(C2467xn c2467xn, EnumC2506yp enumC2506yp) {
/* 5 */             if (j13.m5651m()) {
/* 30 */                j13.m5660v(enumC2506yp.ordinal(), "CX:State[" + c2467xn + "]");
                    }
                }

                /* JADX INFO: renamed from: a */
                public final C1862kq m6519a(String str) {
/* 1 */             HashMap map = this.f13454e;
/* 15 */            for (InterfaceC1838ko interfaceC1838ko : map.keySet()) {
/* 37 */                if (str.equals(interfaceC1838ko.mo6170a().mo310b())) {
/* 43 */                    return (C1862kq) map.get(interfaceC1838ko);
                        }
                    }
/* 46 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public final void m6520b() {
/* 3 */             boolean zM4344o0 = hu0.m4344o0("CameraStateRegistry");
/* 12 */            StringBuilder sb = this.f13450a;
/* 14 */            if (zM4344o0) {
/* 16 */                sb.setLength(0);
/* 21 */                sb.append("Recalculating open cameras:\n");
/* 38 */                sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
/* 41 */                sb.append("-------------------------------------------------------------------\n");
                    }
/* 54 */            int i = 0;
/* 59 */            for (Map.Entry entry : this.f13454e.entrySet()) {
/* 71 */                if (hu0.m4344o0("CameraStateRegistry")) {
/* 118 */                   sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC1838ko) entry.getKey()).toString(), ((C1862kq) entry.getValue()).f12973a != null ? ((C1862kq) entry.getValue()).f12973a.toString() : "UNKNOWN"));
                        }
/* 127 */               EnumC2506yp enumC2506yp = ((C1862kq) entry.getValue()).f12973a;
/* 129 */               if (enumC2506yp != null && enumC2506yp.f19741a) {
/* 135 */                   i++;
                        }
                    }
/* 142 */           if (hu0.m4344o0("CameraStateRegistry")) {
/* 144 */               sb.append("-------------------------------------------------------------------\n");
/* 147 */               Locale locale = Locale.US;
/* 178 */               sb.append("Open count: " + i + " (Max allowed: " + this.f13452c + ")");
/* 181 */               hu0.m4312F0("CameraStateRegistry");
                    }
/* 191 */           this.f13455f = Math.max(this.f13452c - i, 0);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m6521d(C2467xn c2467xn) {
                    boolean z;
                    synchronized (this.f13451b) {
                        try {
/* 14 */                    C1862kq c1862kq = (C1862kq) this.f13454e.get(c2467xn);
/* 18 */                    de3.m3027i(c1862kq, "Camera must first be registered with registerCamera()");
/* 27 */                    z = true;
/* 29 */                    if (hu0.m4344o0("CameraStateRegistry")) {
/* 33 */                        this.f13450a.setLength(0);
/* 36 */                        StringBuilder sb = this.f13450a;
/* 38 */                        Locale locale = Locale.US;
/* 40 */                        int i = this.f13455f;
/* 42 */                        EnumC2506yp enumC2506yp = c1862kq.f12973a;
/* 55 */                        boolean z2 = enumC2506yp != null && enumC2506yp.f19741a;
/* 99 */                        sb.append("tryOpenCamera(" + c2467xn + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + c1862kq.f12973a + ")]");
                            }
/* 104 */                   if (this.f13455f > 0) {
/* 122 */                       EnumC2506yp enumC2506yp2 = EnumC2506yp.OPENING;
/* 124 */                       c1862kq.f12973a = enumC2506yp2;
/* 126 */                       m6518c(c2467xn, enumC2506yp2);
                            } else {
/* 106 */                       EnumC2506yp enumC2506yp3 = c1862kq.f12973a;
/* 117 */                       if (enumC2506yp3 != null && enumC2506yp3.f19741a) {
/* 122 */                           EnumC2506yp enumC2506yp4 = EnumC2506yp.OPENING;
/* 124 */                           c1862kq.f12973a = enumC2506yp4;
/* 126 */                           m6518c(c2467xn, enumC2506yp4);
                                } else {
/* 120 */                           z = false;
                                }
                            }
/* 135 */                   if (hu0.m4344o0("CameraStateRegistry")) {
/* 137 */                       StringBuilder sb2 = this.f13450a;
/* 139 */                       Locale locale2 = Locale.US;
/* 152 */                       sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
/* 157 */                       hu0.m4312F0("CameraStateRegistry");
                            }
/* 160 */                   if (z) {
/* 162 */                       m6520b();
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 166 */           return z;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m6522e(String str, String str2) {
                    synchronized (this.f13451b) {
                        try {
/* 9 */                     boolean z = true;
/* 10 */                    if (this.f13453d.f12882b != 2) {
/* 9 */                         return true;
                            }
/* 16 */                    C1862kq c1862kqM6519a = m6519a(str);
/* 26 */                    EnumC2506yp enumC2506yp = c1862kqM6519a != null ? c1862kqM6519a.f12973a : null;
/* 34 */                    C1862kq c1862kqM6519a2 = str2 != null ? m6519a(str2) : null;
/* 37 */                    EnumC2506yp enumC2506yp2 = c1862kqM6519a2 != null ? c1862kqM6519a2.f12973a : null;
/* 39 */                    EnumC2506yp enumC2506yp3 = EnumC2506yp.OPEN;
/* 59 */                    boolean z2 = enumC2506yp3.equals(enumC2506yp) || EnumC2506yp.CONFIGURED.equals(enumC2506yp);
/* 77 */                    boolean z3 = enumC2506yp3.equals(enumC2506yp2) || EnumC2506yp.CONFIGURED.equals(enumC2506yp2);
/* 78 */                    if (!z2 || !z3) {
/* 83 */                        z = false;
                            }
/* 85 */                    return z;
                        } catch (Throwable th) {
/* 87 */                    throw th;
                        }
                    }
                }
            }
