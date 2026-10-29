            package p000;

            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.MeteringRectangle;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.media.ImageWriter;
            import android.os.Build;
            import android.os.Looper;
            import android.util.ArrayMap;
            import android.util.Range;
            import android.util.Size;
            import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: renamed from: jn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1799jn implements InterfaceC1972np {

                /* JADX INFO: renamed from: b */
                public final C0997hn f12384b;

                /* JADX INFO: renamed from: c */
                public final y92 f12385c;

                /* JADX INFO: renamed from: d */
                public final Object f12386d = new Object();

                /* JADX INFO: renamed from: e */
                public final C0962gp f12387e;

                /* JADX INFO: renamed from: f */
                public final gr0 f12388f;

                /* JADX INFO: renamed from: g */
                public final bb2 f12389g;

                /* JADX INFO: renamed from: h */
                public final fl0 f12390h;

                /* JADX INFO: renamed from: i */
                public final u93 f12391i;

                /* JADX INFO: renamed from: j */
                public final C2306vt f12392j;

                /* JADX INFO: renamed from: k */
                public final zr3 f12393k;

                /* JADX INFO: renamed from: l */
                public final zr0 f12394l;

                /* JADX INFO: renamed from: m */
                public final C0222cn f12395m;

                /* JADX INFO: renamed from: n */
                public final xt0 f12396n;

                /* JADX INFO: renamed from: o */
                public final er0 f12397o;

                /* JADX INFO: renamed from: p */
                public int f12398p;

                /* JADX INFO: renamed from: q */
                public volatile boolean f12399q;

                /* JADX INFO: renamed from: r */
                public volatile int f12400r;

                /* JADX INFO: renamed from: s */
                public final d52 f12401s;

                /* JADX INFO: renamed from: t */
                public final C1924me f12402t;

                /* JADX INFO: renamed from: u */
                public final AtomicLong f12403u;

                /* JADX INFO: renamed from: v */
                public int f12404v;

                /* JADX INFO: renamed from: w */
                public long f12405w;

                public C1799jn(C0962gp c0962gp, nt0 nt0Var, y92 y92Var, gr0 gr0Var, er0 er0Var) {
                    boolean z;
/* 13 */            bb2 bb2Var = new bb2();
/* 16 */            this.f12389g = bb2Var;
/* 19 */            this.f12398p = 0;
/* 21 */            this.f12399q = false;
/* 24 */            this.f12400r = 2;
/* 33 */            this.f12403u = new AtomicLong(0L);
/* 36 */            this.f12404v = 1;
/* 38 */            this.f12405w = 0L;
/* 42 */            C0960gn c0960gn = new C0960gn();
/* 50 */            c0960gn.f8743a = new HashSet();
/* 57 */            c0960gn.f8744b = new ArrayMap();
/* 59 */            this.f12387e = c0962gp;
/* 61 */            this.f12388f = gr0Var;
/* 63 */            this.f12385c = y92Var;
/* 70 */            this.f12397o = new er0(y92Var);
/* 74 */            C0997hn c0997hn = new C0997hn(y92Var);
/* 77 */            this.f12384b = c0997hn;
/* 83 */            bb2Var.f164b.f11908a = this.f12404v;
/* 92 */            bb2Var.f164b.m5544c(new C1001hr(c0997hn));
/* 97 */            bb2Var.f164b.m5544c(c0960gn);
/* 105 */           this.f12393k = new zr3(this, y92Var);
/* 112 */           this.f12390h = new fl0(this, nt0Var, y92Var);
/* 119 */           this.f12391i = new u93(this, c0962gp, y92Var);
/* 126 */           this.f12392j = new C2306vt(this, c0962gp, y92Var);
/* 130 */           zr0 zr0Var = new zr0();
/* 133 */           zr0Var.f20296a = false;
/* 135 */           zr0Var.f20297b = false;
/* 137 */           zr0Var.f20298c = false;
/* 139 */           zr0Var.f20299d = c0962gp;
/* 147 */           int[] iArr = (int[]) c0962gp.m3981a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 149 */           if (iArr == null) {
/* 165 */               z = false;
                        break;
                    }
/* 151 */           int length = iArr.length;
/* 152 */           int i = 0;
                    while (true) {
/* 153 */               if (i >= length) {
/* 165 */                   z = false;
                            break;
                        } else {
/* 158 */                   if (iArr[i] == 4) {
/* 160 */                       z = true;
                                break;
                            }
/* 162 */                   i++;
                        }
                    }
/* 166 */           zr0Var.f20297b = z;
/* 180 */           zr0Var.f20298c = f80.f8038a.m3582h(ZslDisablerQuirk.class) != null;
/* 194 */           zr0Var.f20300e = new ac1(new f42(22));
/* 196 */           this.f12394l = zr0Var;
/* 204 */           this.f12401s = new d52(er0Var, 5);
/* 211 */           this.f12402t = new C1924me(er0Var, 0);
/* 218 */           this.f12395m = new C0222cn(this, y92Var);
/* 230 */           this.f12396n = new xt0(this, c0962gp, er0Var, y92Var, nt0Var);
                }

                /* JADX INFO: renamed from: k */
                public static int m5846k(C0962gp c0962gp, int i) {
/* 7 */             int[] iArr = (int[]) c0962gp.m3981a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
/* 10 */            if (iArr == null) {
/* 9 */                 return 0;
                    }
/* 17 */            if (m5847l(iArr, i)) {
/* 19 */                return i;
                    }
                    return m5847l(iArr, 1) ? 1 : 0;
                }

                /* JADX INFO: renamed from: l */
                public static boolean m5847l(int[] iArr, int i) {
/* 4 */             for (int i2 : iArr) {
/* 8 */                 if (i == i2) {
/* 10 */                    return true;
                        }
                    }
/* 2 */             return false;
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: a */
                public final void mo5848a(InterfaceC2235ty interfaceC2235ty) {
/* 1 */             C0222cn c0222cn = this.f12395m;
/* 9 */             nq1 nq1VarM7021d = nq1.m7021d(C1974nr.m7034b(interfaceC2235ty).f14413b);
                    synchronized (c0222cn.f3008e) {
/* 16 */                d52 d52Var = c0222cn.f3009f;
/* 18 */                d52Var.getClass();
/* 21 */                EnumC2198sy enumC2198sy = EnumC2198sy.f16866c;
/* 35 */                for (C1888lf c1888lf : nq1VarM7021d.mo7024c()) {
/* 51 */                    ((uk1) d52Var.f7001a).m9036o(c1888lf, enumC2198sy, nq1VarM7021d.mo7025e(c1888lf));
                        }
                    }
/* 58 */            C2260um c2260um = new C2260um();
/* 66 */            c2260um.f17592c = new u32();
/* 70 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 73 */            c2260um.f17591b = c2466xm;
/* 77 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 87 */                c0222cn.f3007d.execute(new RunnableC0186bn(c0222cn, c2260um, 1));
/* 92 */                c2260um.f17590a = "addCaptureRequestOptions";
                    } catch (Exception e) {
/* 96 */                c2466xm.m9977b(e);
                    }
/* 112 */           w11.m9453w(c2466xm).mo3676a(new RunnableC0981h7(1), pg3.m7428g());
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: b */
                public final Rect mo5849b() {
/* 9 */             Rect rect = (Rect) this.f12387e.m3981a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
/* 19 */            if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
/* 30 */                return new Rect(0, 0, 4000, 3000);
                    }
/* 34 */            rect.getClass();
/* 37 */            return rect;
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: c */
                public final void mo5850c(int i) {
                    int i2;
                    synchronized (this.f12386d) {
/* 6 */                 i2 = this.f12398p;
                    }
/* 15 */            if (!(i2 > 0)) {
/* 19 */                hu0.m4315H0("Camera2CameraControlImp", "Camera is not active.");
/* 22 */                return;
                    }
/* 23 */            this.f12400r = i;
/* 25 */            hu0.m4312F0("Camera2CameraControlImp");
/* 28 */            zr0 zr0Var = this.f12394l;
/* 32 */            if (this.f12400r != 1) {
/* 34 */                int i3 = this.f12400r;
                    }
/* 36 */            zr0Var.getClass();
/* 39 */            m5860o();
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: d */
                public final void mo5851d(s72 s72Var) {
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: e */
                public final void mo5852e(bb2 bb2Var) throws Exception {
                    boolean zIsEmpty;
                    HashMap map;
                    StreamConfigurationMap streamConfigurationMap;
                    int[] validOutputFormatsForInput;
/* 1 */             zr0 zr0Var = this.f12394l;
/* 11 */            ac1 ac1Var = (ac1) zr0Var.f20300e;
                    while (true) {
                        synchronized (ac1Var.f179d) {
/* 20 */                    zIsEmpty = ((ArrayDeque) ac1Var.f177b).isEmpty();
                        }
/* 25 */                if (zIsEmpty) {
                            break;
                        } else {
/* 33 */                    ((mw0) ac1Var.m179h()).close();
                        }
                    }
/* 39 */            uw0 uw0Var = (uw0) zr0Var.f20303h;
/* 42 */            StreamConfigurationMap streamConfigurationMap2 = null;
/* 43 */            if (uw0Var != null) {
/* 47 */                C1767ir c1767ir = (C1767ir) zr0Var.f20301f;
/* 49 */                if (c1767ir != null) {
/* 66 */                    w11.m9453w(uw0Var.f7030e).mo3676a(new RunnableC1900lr(c1767ir, 2), pg3.m7436o());
/* 69 */                    zr0Var.f20301f = null;
                        }
/* 71 */                uw0Var.mo2951a();
/* 74 */                zr0Var.f20303h = null;
                    }
/* 78 */            ImageWriter imageWriter = (ImageWriter) zr0Var.f20304i;
/* 80 */            if (imageWriter != null) {
/* 82 */                imageWriter.close();
/* 85 */                zr0Var.f20304i = null;
                    }
/* 90 */            if (zr0Var.f20296a) {
/* 94 */                bb2Var.f164b.f11908a = 1;
/* 96 */                return;
                    }
/* 99 */            if (zr0Var.f20298c) {
/* 103 */               bb2Var.f164b.f11908a = 1;
/* 105 */               return;
                    }
                    try {
/* 116 */               streamConfigurationMap2 = (StreamConfigurationMap) ((C0962gp) zr0Var.f20299d).m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    } catch (AssertionError e) {
/* 141 */               hu0.m4325T("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
                    }
/* 145 */           if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
/* 197 */               map = new HashMap();
                    } else {
/* 156 */               map = new HashMap();
/* 165 */               for (int i : streamConfigurationMap2.getInputFormats()) {
/* 169 */                   Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
/* 173 */                   if (inputSizes != null) {
/* 180 */                       Arrays.sort(inputSizes, new C1007hx(true));
/* 189 */                       map.put(Integer.valueOf(i), inputSizes[0]);
                            }
                        }
                    }
/* 202 */           if (zr0Var.f20297b && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) ((C0962gp) zr0Var.f20299d).m3981a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
/* 241 */               for (int i2 : validOutputFormatsForInput) {
/* 247 */                   if (i2 == 256) {
/* 253 */                       Size size = (Size) map.get(34);
/* 267 */                       li1 li1Var = new li1(size.getWidth(), size.getHeight(), 34, 9);
/* 272 */                       zr0Var.f20302g = li1Var.f13305b;
/* 279 */                       zr0Var.f20301f = new C1767ir(li1Var);
/* 292 */                       li1Var.mo3811f(new C2357x6(zr0Var, 23), pg3.m7435n());
/* 326 */                       uw0 uw0Var2 = new uw0(((C1767ir) zr0Var.f20301f).getSurface(), new Size(((C1767ir) zr0Var.f20301f).getWidth(), ((C1767ir) zr0Var.f20301f).getHeight()), 34);
/* 329 */                       zr0Var.f20303h = uw0Var2;
/* 333 */                       C1767ir c1767ir2 = (C1767ir) zr0Var.f20301f;
/* 337 */                       s81 s81VarM9453w = w11.m9453w(uw0Var2.f7030e);
/* 341 */                       Objects.requireNonNull(c1767ir2);
/* 353 */                       s81VarM9453w.mo3676a(new RunnableC1900lr(c1767ir2, 2), pg3.m7436o());
/* 363 */                       bb2Var.m1317b((uw0) zr0Var.f20303h, mb0.f13671d, -1);
/* 368 */                       ki1 ki1Var = (ki1) zr0Var.f20302g;
/* 372 */                       bb2Var.f164b.m5544c(ki1Var);
/* 375 */                       ArrayList arrayList = bb2Var.f167e;
/* 381 */                       if (!arrayList.contains(ki1Var)) {
/* 383 */                           arrayList.add(ki1Var);
                                }
/* 388 */                       C0851dp c0851dp = new C0851dp(zr0Var, 2);
/* 391 */                       ArrayList arrayList2 = bb2Var.f166d;
/* 397 */                       if (!arrayList2.contains(c0851dp)) {
/* 400 */                           arrayList2.add(c0851dp);
                                }
/* 432 */                       bb2Var.f169g = new InputConfiguration(((C1767ir) zr0Var.f20301f).getWidth(), ((C1767ir) zr0Var.f20301f).getHeight(), ((C1767ir) zr0Var.f20301f).mo3809a());
/* 443 */                       return;
                            }
                        }
                    }
/* 441 */           bb2Var.f164b.f11908a = 1;
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: f */
                public final InterfaceC2235ty mo5853f() {
                    C0998ho c0998ho;
/* 1 */             C0222cn c0222cn = this.f12395m;
                    synchronized (c0222cn.f3008e) {
/* 6 */                 d52 d52Var = c0222cn.f3009f;
/* 8 */                 d52Var.getClass();
/* 21 */                c0998ho = new C0998ho(nq1.m7021d((uk1) d52Var.f7001a));
                    }
/* 25 */            return c0998ho;
                }

                @Override // p000.InterfaceC1972np
                /* JADX INFO: renamed from: g */
                public final void mo5854g() {
/* 1 */             C0222cn c0222cn = this.f12395m;
                    synchronized (c0222cn.f3008e) {
/* 13 */                c0222cn.f3009f = new d52(10);
                    }
/* 18 */            C2260um c2260um = new C2260um();
/* 26 */            c2260um.f17592c = new u32();
/* 30 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 33 */            c2260um.f17591b = c2466xm;
/* 37 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 47 */                c0222cn.f3007d.execute(new RunnableC0186bn(c0222cn, c2260um, 0));
/* 52 */                c2260um.f17590a = "clearCaptureRequestOptions";
                    } catch (Exception e) {
/* 56 */                c2466xm.m9977b(e);
                    }
/* 73 */            w11.m9453w(c2466xm).mo3676a(new RunnableC0981h7(1), pg3.m7428g());
                }

                /* JADX INFO: renamed from: h */
                public final void m5855h(InterfaceC1033in interfaceC1033in) {
/* 7 */             ((HashSet) this.f12384b.f9152b).add(interfaceC1033in);
                }

                /* JADX INFO: renamed from: i */
                public final void m5856i() {
                    synchronized (this.f12386d) {
                        try {
/* 4 */                     int i = this.f12398p;
/* 6 */                     if (i == 0) {
/* 23 */                        throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                            }
/* 10 */                    this.f12398p = i - 1;
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:65:0x011f A[Catch: all -> 0x0166, LOOP:0: B:63:0x0119->B:65:0x011f, LOOP_END, TryCatch #0 {, blocks: (B:62:0x0109, B:63:0x0119, B:65:0x011f, B:66:0x0131), top: B:75:0x0109 }] */
                /* JADX WARN: Code duplicated, block: B:75:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:77:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:8:0x0038  */
                /* JADX INFO: renamed from: j */
                public final fb2 m5857j() {
                    int[] iArr;
                    zr3 zr3Var;
                    C0222cn c0222cn;
                    uk1 uk1Var;
                    EnumC2198sy enumC2198sy;
/* 1 */             bb2 bb2Var = this.f12389g;
/* 7 */             bb2Var.f164b.f11908a = this.f12404v;
/* 13 */            d52 d52Var = new d52(10);
/* 18 */            int i = 1;
/* 23 */            d52Var.m2932F(CaptureRequest.CONTROL_MODE, 1);
/* 26 */            fl0 fl0Var = this.f12390h;
/* 28 */            fl0Var.getClass();
/* 33 */            int i2 = 4;
/* 34 */            int i3 = 3;
/* 39 */            int i4 = fl0Var.f8262c != 3 ? 4 : 3;
/* 40 */            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
/* 52 */            int[] iArr2 = (int[]) fl0Var.f8260a.f12387e.m3981a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
/* 55 */            if (iArr2 == null) {
/* 57 */                i2 = 0;
                    } else if (m5847l(iArr2, i4)) {
/* 65 */                i2 = i4;
                    } else if (!m5847l(iArr2, 4)) {
/* 78 */                if (m5847l(iArr2, 1)) {
/* 80 */                    i2 = 1;
                        } else {
/* 57 */                    i2 = 0;
                        }
                    }
/* 85 */            d52Var.m2932F(key, Integer.valueOf(i2));
/* 88 */            MeteringRectangle[] meteringRectangleArr = fl0Var.f8263d;
/* 91 */            if (meteringRectangleArr.length != 0) {
/* 95 */                d52Var.m2932F(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                    }
/* 98 */            MeteringRectangle[] meteringRectangleArr2 = fl0Var.f8264e;
/* 101 */           if (meteringRectangleArr2.length != 0) {
/* 105 */               d52Var.m2932F(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
                    }
/* 108 */           MeteringRectangle[] meteringRectangleArr3 = fl0Var.f8265f;
/* 111 */           if (meteringRectangleArr3.length != 0) {
/* 115 */               d52Var.m2932F(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
                    }
/* 122 */           Range range = (Range) this.f12401s.f7001a;
/* 124 */           if (range != null) {
/* 128 */               d52Var.m2932F(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    }
/* 137 */           ((t93) this.f12391i.f17432e).mo3994g(d52Var);
/* 148 */           int i5 = this.f12390h.f8266g ? 5 : 1;
/* 152 */           if (!this.f12399q) {
/* 164 */               int i6 = this.f12400r;
/* 166 */               if (i6 == 0) {
/* 176 */                   C1924me c1924me = this.f12402t;
/* 180 */                   if (c1924me.f13704a || c1924me.f13705b) {
/* 174 */                       i3 = 1;
                            } else {
/* 187 */                       i3 = 2;
                            }
                        } else if (i6 != 1) {
/* 170 */                   if (i6 == 2) {
/* 174 */                       i3 = 1;
                            }
                        }
/* 200 */               d52Var.m2932F(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m5846k(this.f12387e, i3)));
/* 203 */               CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
/* 213 */               iArr = (int[]) this.f12387e.m3981a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
/* 215 */               if (iArr != null || (!m5847l(iArr, 1) && !m5847l(iArr, 1))) {
/* 217 */                   i = 0;
                        }
/* 236 */               d52Var.m2932F(key2, Integer.valueOf(i));
/* 239 */               zr3Var = this.f12393k;
/* 241 */               zr3Var.getClass();
/* 244 */               CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                        synchronized (((C0828d1) zr3Var.f20312c).f6954a) {
                        }
/* 258 */               d52Var.m2932F(key3, 0);
/* 261 */               c0222cn = this.f12395m;
                        synchronized (c0222cn.f3008e) {
/* 270 */                   uk1Var = (uk1) c0222cn.f3009f.f7001a;
/* 272 */                   enumC2198sy = EnumC2198sy.f16864a;
/* 286 */                   for (C1888lf c1888lf : uk1Var.mo7024c()) {
/* 302 */                       ((uk1) d52Var.f7001a).m9036o(c1888lf, enumC2198sy, uk1Var.mo7025e(c1888lf));
                            }
                        }
/* 317 */               C0998ho c0998ho = new C0998ho(nq1.m7021d((uk1) d52Var.f7001a));
/* 320 */               C1767ir c1767ir = bb2Var.f164b;
/* 322 */               c1767ir.getClass();
/* 329 */               c1767ir.f11911d = uk1.m9035m(c0998ho);
/* 349 */               ((cl1) this.f12389g.f164b.f11913f).f14383a.put("CameraControlSessionUpdateId", Long.valueOf(this.f12405w));
/* 354 */               return this.f12389g.m1318c();
                    }
/* 160 */           d52Var.m2932F(CaptureRequest.FLASH_MODE, 2);
/* 172 */           i3 = i5;
/* 200 */           d52Var.m2932F(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m5846k(this.f12387e, i3)));
/* 203 */           CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
/* 213 */           iArr = (int[]) this.f12387e.m3981a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
/* 215 */           if (iArr != null) {
/* 217 */               i = 0;
                    } else {
/* 217 */               i = 0;
                    }
/* 236 */           d52Var.m2932F(key4, Integer.valueOf(i));
/* 239 */           zr3Var = this.f12393k;
/* 241 */           zr3Var.getClass();
/* 244 */           CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                    synchronized (((C0828d1) zr3Var.f20312c).f6954a) {
/* 258 */               d52Var.m2932F(key5, 0);
/* 261 */               c0222cn = this.f12395m;
                        synchronized (c0222cn.f3008e) {
/* 270 */                   uk1Var = (uk1) c0222cn.f3009f.f7001a;
/* 272 */                   enumC2198sy = EnumC2198sy.f16864a;
/* 286 */                   while (r5.hasNext()) {
/* 302 */                       ((uk1) d52Var.f7001a).m9036o(c1888lf, enumC2198sy, uk1Var.mo7025e(c1888lf));
                            }
/* 317 */                   C0998ho c0998ho2 = new C0998ho(nq1.m7021d((uk1) d52Var.f7001a));
/* 320 */                   C1767ir c1767ir2 = bb2Var.f164b;
/* 322 */                   c1767ir2.getClass();
/* 329 */                   c1767ir2.f11911d = uk1.m9035m(c0998ho2);
/* 349 */                   ((cl1) this.f12389g.f164b.f11913f).f14383a.put("CameraControlSessionUpdateId", Long.valueOf(this.f12405w));
/* 354 */                   return this.f12389g.m1318c();
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m5858m(boolean z) {
                    C2496yf c2496yf;
/* 3 */             hu0.m4312F0("Camera2CameraControlImp");
/* 6 */             fl0 fl0Var = this.f12390h;
/* 12 */            if (z != fl0Var.f8261b) {
/* 15 */                fl0Var.f8261b = z;
/* 19 */                if (!fl0Var.f8261b) {
/* 21 */                    C1799jn c1799jn = fl0Var.f8260a;
/* 29 */                    ((HashSet) c1799jn.f12384b.f9152b).remove(null);
/* 38 */                    ((HashSet) c1799jn.f12384b.f9152b).remove(null);
/* 44 */                    if (fl0Var.f8263d.length > 0 && fl0Var.f8261b) {
/* 58 */                        C1767ir c1767ir = new C1767ir();
/* 61 */                        c1767ir.f11909b = true;
/* 65 */                        c1767ir.f11908a = fl0Var.f8262c;
/* 67 */                        uk1 uk1VarM9034j = uk1.m9034j();
/* 77 */                        uk1VarM9034j.m9037p(C0998ho.m4249L(CaptureRequest.CONTROL_AF_TRIGGER), 2);
/* 89 */                        c1767ir.m5545e(new C0998ho(nq1.m7021d(uk1VarM9034j)));
/* 102 */                       fl0Var.f8260a.m5859n(Collections.singletonList(c1767ir.m5546i()));
                            }
/* 105 */                   MeteringRectangle[] meteringRectangleArr = fl0.f8259h;
/* 107 */                   fl0Var.f8263d = meteringRectangleArr;
/* 109 */                   fl0Var.f8264e = meteringRectangleArr;
/* 111 */                   fl0Var.f8265f = meteringRectangleArr;
/* 113 */                   c1799jn.m5861p();
                        }
                    }
/* 116 */           u93 u93Var = this.f12391i;
/* 120 */           if (u93Var.f17428a != z) {
/* 123 */               u93Var.f17428a = z;
/* 125 */               if (!z) {
                            synchronized (((v93) u93Var.f17430c)) {
/* 136 */                       ((v93) u93Var.f17430c).m9242e();
/* 141 */                       v93 v93Var = (v93) u93Var.f17430c;
/* 161 */                       c2496yf = new C2496yf(v93Var.m9241d(), v93Var.m9239b(), v93Var.m9240c(), v93Var.m9238a());
                            }
/* 165 */                   Looper looperMyLooper = Looper.myLooper();
/* 169 */                   Looper mainLooper = Looper.getMainLooper();
/* 175 */                   rk1 rk1Var = (rk1) u93Var.f17431d;
/* 177 */                   if (looperMyLooper == mainLooper) {
/* 179 */                       rk1Var.mo124j(c2496yf);
                            } else {
/* 183 */                       rk1Var.m8193k(c2496yf);
                            }
/* 190 */                   ((t93) u93Var.f17432e).mo4000o();
/* 197 */                   ((C1799jn) u93Var.f17429b).m5861p();
                        }
                    }
/* 204 */           C2306vt c2306vt = this.f12392j;
/* 208 */           int i = 0;
/* 209 */           if (c2306vt.f18348a != z) {
/* 213 */               c2306vt.f18348a = z;
/* 215 */               if (!z) {
/* 219 */                   if (c2306vt.f18349b) {
/* 221 */                       c2306vt.f18349b = false;
/* 225 */                       C1799jn c1799jn2 = (C1799jn) c2306vt.f18350c;
/* 227 */                       c1799jn2.f12399q = false;
/* 231 */                       C1767ir c1767ir2 = new C1767ir();
/* 236 */                       c1767ir2.f11908a = c1799jn2.f12404v;
/* 238 */                       c1767ir2.f11909b = true;
/* 240 */                       uk1 uk1VarM9034j2 = uk1.m9034j();
/* 244 */                       CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
/* 260 */                       uk1VarM9034j2.m9037p(C0998ho.m4249L(key), Integer.valueOf(m5846k(c1799jn2.f12387e, 1)));
/* 273 */                       uk1VarM9034j2.m9037p(C0998ho.m4249L(CaptureRequest.FLASH_MODE), 0);
/* 285 */                       c1767ir2.m5545e(new C0998ho(nq1.m7021d(uk1VarM9034j2)));
/* 296 */                       c1799jn2.m5859n(Collections.singletonList(c1767ir2.m5546i()));
/* 299 */                       c1799jn2.m5861p();
/* 304 */                       rk1 rk1Var2 = (rk1) c2306vt.f18351d;
/* 322 */                       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 324 */                           rk1Var2.mo124j(0);
                                } else {
/* 328 */                           rk1Var2.m8193k(0);
                                }
                            }
/* 333 */                   C2260um c2260um = (C2260um) c2306vt.f18352e;
/* 335 */                   if (c2260um != null) {
/* 344 */                       c2260um.m9041b(new C1898lp("Camera is not active.", 0));
/* 347 */                       c2306vt.f18352e = null;
                            }
                        }
                    }
/* 349 */           zr3 zr3Var = this.f12393k;
/* 353 */           if (z != zr3Var.f20311b) {
/* 356 */               zr3Var.f20311b = z;
/* 358 */               if (!z) {
                            synchronized (((C0828d1) zr3Var.f20312c).f6954a) {
                            }
                        }
                    }
/* 372 */           C0222cn c0222cn = this.f12395m;
/* 381 */           c0222cn.f3007d.execute(new RunnableC0025an(i, c0222cn, z));
/* 384 */           if (z) {
/* 400 */               return;
                    }
/* 392 */           ((AtomicInteger) this.f12397o.f7853b).set(0);
/* 397 */           hu0.m4312F0("VideoUsageControl");
                }

                /* JADX INFO: renamed from: n */
                public final void m5859n(List list) {
                    int iM5893b;
                    int iM5892a;
                    InterfaceC2188so interfaceC2188so;
/* 5 */             C2467xn c2467xn = (C2467xn) this.f12388f.f8789a;
/* 7 */             list.getClass();
/* 12 */            ArrayList arrayList = new ArrayList();
/* 15 */            Iterator it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                C1803jr c1803jr = (C1803jr) it.next();
/* 33 */                HashSet hashSet = new HashSet();
/* 36 */                uk1.m9034j();
/* 41 */                ArrayList arrayList2 = new ArrayList();
/* 44 */                cl1.m1721a();
/* 49 */                hashSet.addAll(c1803jr.f12441a);
/* 54 */                uk1 uk1VarM9035m = uk1.m9035m(c1803jr.f12442b);
/* 58 */                int i = c1803jr.f12443c;
/* 62 */                arrayList2.addAll(c1803jr.f12444d);
/* 65 */                boolean z = c1803jr.f12445e;
/* 67 */                nm2 nm2Var = c1803jr.f12446f;
/* 71 */                ArrayMap arrayMap = new ArrayMap();
/* 88 */                for (String str : nm2Var.f14383a.keySet()) {
/* 102 */                   arrayMap.put(str, nm2Var.f14383a.get(str));
                        }
/* 108 */               cl1 cl1Var = new cl1(arrayMap);
/* 123 */               InterfaceC2188so interfaceC2188so2 = (c1803jr.f12443c != 5 || (interfaceC2188so = c1803jr.f12447g) == null) ? null : interfaceC2188so;
/* 134 */               if (Collections.unmodifiableList(c1803jr.f12441a).isEmpty() && c1803jr.f12445e) {
/* 146 */                   if (hashSet.isEmpty()) {
/* 155 */                       fs0 fs0Var = c2467xn.f19259a;
/* 157 */                       fs0Var.getClass();
/* 162 */                       ArrayList arrayList3 = new ArrayList();
/* 181 */                       for (Map.Entry entry : ((LinkedHashMap) fs0Var.f8339b).entrySet()) {
/* 193 */                           xy2 xy2Var = (xy2) entry.getValue();
/* 197 */                           if (xy2Var.f19404f && xy2Var.f19403e) {
/* 211 */                               arrayList3.add(((xy2) entry.getValue()).f19399a);
                                    }
                                }
/* 219 */                       Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
/* 227 */                       while (it2.hasNext()) {
/* 235 */                           C1803jr c1803jr2 = ((fb2) it2.next()).f8120g;
/* 239 */                           List listUnmodifiableList = Collections.unmodifiableList(c1803jr2.f12441a);
/* 247 */                           if (!listUnmodifiableList.isEmpty()) {
/* 253 */                               if (c1803jr2.m5892a() != 0 && (iM5892a = c1803jr2.m5892a()) != 0) {
/* 267 */                                   uk1VarM9035m.m9037p(zy2.f20393P, Integer.valueOf(iM5892a));
                                        }
/* 274 */                               if (c1803jr2.m5893b() != 0 && (iM5893b = c1803jr2.m5893b()) != 0) {
/* 288 */                                   uk1VarM9035m.m9037p(zy2.f20394Q, Integer.valueOf(iM5893b));
                                        }
/* 291 */                               Iterator it3 = listUnmodifiableList.iterator();
/* 299 */                               while (it3.hasNext()) {
/* 307 */                                   hashSet.add((d70) it3.next());
                                        }
                                    }
                                }
/* 315 */                       if (hashSet.isEmpty()) {
/* 319 */                           hu0.m4315H0("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                                }
                            } else {
/* 150 */                       hu0.m4315H0("Camera2CameraImpl", "The capture config builder already has surface inside.");
                            }
                        }
/* 329 */               ArrayList arrayList4 = new ArrayList(hashSet);
/* 332 */               nq1 nq1VarM7021d = nq1.m7021d(uk1VarM9035m);
/* 338 */               ArrayList arrayList5 = new ArrayList(arrayList2);
/* 341 */               nm2 nm2Var2 = nm2.f14382b;
/* 345 */               ArrayMap arrayMap2 = new ArrayMap();
/* 348 */               ArrayMap arrayMap3 = cl1Var.f14383a;
/* 362 */               for (String str2 : arrayMap3.keySet()) {
/* 374 */                   arrayMap2.put(str2, arrayMap3.get(str2));
                        }
/* 386 */               arrayList.add(new C1803jr(arrayList4, nq1VarM7021d, i, arrayList5, z, new nm2(arrayMap2), interfaceC2188so2));
                    }
/* 393 */           c2467xn.m10000s("Issue capture request");
/* 398 */           c2467xn.f19255W.m8234g(arrayList);
                }

                /* JADX INFO: renamed from: o */
                public final s81 m5860o() {
/* 5 */             C2260um c2260um = new C2260um();
/* 13 */            c2260um.f17592c = new u32();
/* 17 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 20 */            c2260um.f17591b = c2466xm;
/* 24 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 34 */                this.f12385c.execute(new RunnableC1784j8(4, this, c2260um));
/* 37 */                c2260um.f17590a = "updateSessionConfigAsync";
                    } catch (Exception e) {
/* 41 */                c2466xm.m9977b(e);
                    }
/* 44 */            return w11.m9453w(c2466xm);
                }

                /* JADX INFO: renamed from: p */
                public final long m5861p() {
/* 7 */             this.f12405w = this.f12403u.getAndIncrement();
/* 15 */            ((C2467xn) this.f12388f.f8789a).m9990J();
/* 18 */            return this.f12405w;
                }
            }
