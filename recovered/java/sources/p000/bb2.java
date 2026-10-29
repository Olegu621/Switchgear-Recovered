            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
            import java.util.ArrayList;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bb2 extends ab2 {
                /* JADX INFO: renamed from: d */
                public static bb2 m1315d(zy2 zy2Var, Size size) {
/* 10 */            if (((C1034io) zy2Var.mo7023b(zy2.f20386I, null)) == null) {
/* 440 */               ds0.m3206w((String) zy2Var.mo7023b(rm2.f16183D, zy2Var.toString()), "Implementation is missing option unpacker for ");
/* 3 */                 return null;
                    }
/* 14 */            bb2 bb2Var = new bb2();
/* 23 */            fb2 fb2Var = (fb2) zy2Var.mo7023b(zy2.f20384G, null);
/* 25 */            nq1 nq1Var = nq1.f14410c;
/* 33 */            int i = fb2.m3701a().f8120g.f12443c;
/* 35 */            if (fb2Var != null) {
/* 39 */                i = fb2Var.f8120g.f12443c;
/* 51 */                for (CameraDevice.StateCallback stateCallback : fb2Var.f8116c) {
/* 59 */                    ArrayList arrayList = bb2Var.f165c;
/* 65 */                    if (!arrayList.contains(stateCallback)) {
/* 68 */                        arrayList.add(stateCallback);
                            }
                        }
/* 82 */                for (CameraCaptureSession.StateCallback stateCallback2 : fb2Var.f8117d) {
/* 90 */                    ArrayList arrayList2 = bb2Var.f166d;
/* 96 */                    if (!arrayList2.contains(stateCallback2)) {
/* 99 */                        arrayList2.add(stateCallback2);
                            }
                        }
/* 109 */               bb2Var.f164b.m5543b(fb2Var.f8120g.f12444d);
/* 114 */               nq1Var = fb2Var.f8120g.f12442b;
                    }
/* 116 */           C1767ir c1767ir = bb2Var.f164b;
/* 118 */           c1767ir.getClass();
/* 125 */           c1767ir.f11911d = uk1.m9035m(nq1Var);
/* 129 */           if (zy2Var instanceof ww1) {
/* 131 */               Rational rational = xw1.f19387a;
/* 143 */               if (((PreviewPixelHDRnetQuirk) f80.f8038a.m3582h(PreviewPixelHDRnetQuirk.class)) != null && !xw1.f19387a.equals(new Rational(size.getWidth(), size.getHeight()))) {
/* 168 */                   uk1 uk1VarM9034j = uk1.m9034j();
/* 183 */                   uk1VarM9034j.m9037p(C0998ho.m4249L(CaptureRequest.TONEMAP_MODE), 2);
/* 197 */                   bb2Var.f164b.m5545e(new C0998ho(nq1.m7021d(uk1VarM9034j)));
                        }
                    }
/* 220 */           bb2Var.f164b.f11908a = ((Integer) zy2Var.mo7023b(C0998ho.f9165i, Integer.valueOf(i))).intValue();
/* 233 */           CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) zy2Var.mo7023b(C0998ho.f9167w, new C2189sp());
/* 235 */           ArrayList arrayList3 = bb2Var.f165c;
/* 241 */           if (!arrayList3.contains(stateCallback3)) {
/* 244 */               arrayList3.add(stateCallback3);
                    }
/* 258 */           CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) zy2Var.mo7023b(C0998ho.f9162U, new C0888ep());
/* 260 */           ArrayList arrayList4 = bb2Var.f166d;
/* 266 */           if (!arrayList4.contains(stateCallback4)) {
/* 269 */               arrayList4.add(stateCallback4);
                    }
/* 287 */           C1001hr c1001hr = new C1001hr((CameraCaptureSession.CaptureCallback) zy2Var.mo7023b(C0998ho.f9163V, new C0187bo()));
/* 292 */           bb2Var.f164b.m5544c(c1001hr);
/* 295 */           ArrayList arrayList5 = bb2Var.f167e;
/* 301 */           if (!arrayList5.contains(c1001hr)) {
/* 303 */               arrayList5.add(c1001hr);
                    }
/* 306 */           C1888lf c1888lf = zy2.f20394Q;
/* 317 */           Integer num = (Integer) zy2Var.mo7023b(c1888lf, 0);
/* 319 */           int iIntValue = num.intValue();
/* 323 */           if (iIntValue != 0) {
/* 325 */               C1767ir c1767ir2 = bb2Var.f164b;
/* 327 */               c1767ir2.getClass();
/* 330 */               if (iIntValue != 0) {
/* 336 */                   ((uk1) c1767ir2.f11911d).m9037p(c1888lf, num);
                        }
                    }
/* 339 */           int iM10450v = zy2Var.m10450v();
/* 343 */           if (iM10450v != 0) {
/* 345 */               C1767ir c1767ir3 = bb2Var.f164b;
/* 347 */               c1767ir3.getClass();
/* 350 */               if (iM10450v != 0) {
/* 362 */                   ((uk1) c1767ir3.f11911d).m9037p(zy2.f20393P, Integer.valueOf(iM10450v));
                        }
                    }
/* 365 */           uk1 uk1VarM9034j2 = uk1.m9034j();
/* 369 */           C1888lf c1888lf2 = C0998ho.f9164W;
/* 377 */           uk1VarM9034j2.m9037p(c1888lf2, (String) zy2Var.mo7023b(c1888lf2, null));
/* 380 */           C1888lf c1888lf3 = C0998ho.f9166v;
/* 392 */           Long l = (Long) zy2Var.mo7023b(c1888lf3, -1L);
/* 394 */           l.getClass();
/* 397 */           uk1VarM9034j2.m9037p(c1888lf3, l);
/* 402 */           bb2Var.f164b.m5545e(uk1VarM9034j2);
/* 422 */           bb2Var.f164b.m5545e(new d52(nq1.m7021d(C1974nr.m7034b(zy2Var).f14413b)));
/* 425 */           return bb2Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m1316a(InterfaceC2235ty interfaceC2235ty) {
/* 3 */             this.f164b.m5545e(interfaceC2235ty);
                }

                /* JADX INFO: renamed from: b */
                public final void m1317b(d70 d70Var, mb0 mb0Var, int i) {
/* 1 */             C0168b5 c0168b5M6646a = C1926mg.m6646a(d70Var);
/* 5 */             if (mb0Var == null) {
/* 36 */                C1951n4.m6868s("Null dynamicRange");
/* 39 */                return;
                    }
/* 7 */             c0168b5M6646a.f2215f = mb0Var;
/* 13 */            c0168b5M6646a.f2211b = Integer.valueOf(i);
/* 21 */            this.f163a.add(c0168b5M6646a.m1265j());
/* 30 */            ((HashSet) this.f164b.f11910c).add(d70Var);
                }

                /* JADX INFO: renamed from: c */
                public final fb2 m1318c() {
/* 43 */            return new fb2(new ArrayList(this.f163a), new ArrayList(this.f165c), new ArrayList(this.f166d), new ArrayList(this.f167e), this.f164b.m5546i(), this.f168f, this.f169g, this.f170h);
                }
            }
