            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraDevice;
            import android.os.Build;
            import android.os.Handler;
            import android.text.TextUtils;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
            import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: xn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2467xn implements InterfaceC2559zp {

                /* JADX INFO: renamed from: U */
                public CameraDevice f19253U;

                /* JADX INFO: renamed from: V */
                public int f19254V;

                /* JADX INFO: renamed from: W */
                public C2154rr f19255W;

                /* JADX INFO: renamed from: X */
                public final LinkedHashMap f19256X;

                /* JADX INFO: renamed from: Y */
                public int f19257Y;

                /* JADX INFO: renamed from: Z */
                public final C2187sn f19258Z;

                /* JADX INFO: renamed from: a */
                public final fs0 f19259a;

                /* JADX INFO: renamed from: a0 */
                public final C1837kn f19260a0;

                /* JADX INFO: renamed from: b */
                public final C0816cq f19261b;

                /* JADX INFO: renamed from: b0 */
                public final C1899lq f19262b0;

                /* JADX INFO: renamed from: c */
                public final y92 f19263c;

                /* JADX INFO: renamed from: c0 */
                public final boolean f19264c0;

                /* JADX INFO: renamed from: d */
                public final nt0 f19265d;

                /* JADX INFO: renamed from: d0 */
                public final boolean f19266d0;

                /* JADX INFO: renamed from: e */
                public final fs0 f19267e;

                /* JADX INFO: renamed from: e0 */
                public boolean f19268e0;

                /* JADX INFO: renamed from: f */
                public final C0210cb f19269f;

                /* JADX INFO: renamed from: f0 */
                public boolean f19270f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f19271g0;

                /* JADX INFO: renamed from: h0 */
                public qi1 f19272h0;

                /* JADX INFO: renamed from: i */
                public final C1799jn f19273i;

                /* JADX INFO: renamed from: i0 */
                public final qi1 f19274i0;

                /* JADX INFO: renamed from: j0 */
                public final xy1 f19275j0;

                /* JADX INFO: renamed from: k0 */
                public final HashSet f19276k0;

                /* JADX INFO: renamed from: l0 */
                public InterfaceC0999hp f19277l0;

                /* JADX INFO: renamed from: m0 */
                public final Object f19278m0;

                /* JADX INFO: renamed from: n0 */
                public boolean f19279n0;

                /* JADX INFO: renamed from: o0 */
                public final c90 f19280o0;

                /* JADX INFO: renamed from: p0 */
                public final qc3 f19281p0;

                /* JADX INFO: renamed from: q0 */
                public final cj2 f19282q0;

                /* JADX INFO: renamed from: r0 */
                public final C0210cb f19283r0;

                /* JADX INFO: renamed from: s0 */
                public volatile int f19284s0 = 3;

                /* JADX INFO: renamed from: v */
                public final C2337wn f19285v;

                /* JADX INFO: renamed from: w */
                public final C2557zn f19286w;

                public C2467xn(Context context, C0816cq c0816cq, String str, C2557zn c2557zn, C1837kn c1837kn, C1899lq c1899lq, Executor executor, Handler handler, c90 c90Var, long j) throws C1936mq {
/* 20 */            fs0 fs0Var = new fs0(4);
/* 23 */            this.f19267e = fs0Var;
/* 26 */            this.f19254V = 0;
/* 30 */            new AtomicInteger(0);
/* 38 */            this.f19256X = new LinkedHashMap();
/* 40 */            this.f19257Y = 0;
/* 42 */            this.f19268e0 = false;
/* 44 */            this.f19270f0 = false;
/* 47 */            this.f19271g0 = true;
/* 54 */            this.f19276k0 = new HashSet();
/* 58 */            this.f19277l0 = AbstractC1861kp.f12965a;
/* 65 */            this.f19278m0 = new Object();
/* 67 */            this.f19279n0 = false;
/* 74 */            this.f19283r0 = new C0210cb(this);
/* 76 */            this.f19261b = c0816cq;
/* 80 */            this.f19260a0 = c1837kn;
/* 82 */            this.f19262b0 = c1899lq;
/* 86 */            nt0 nt0Var = new nt0(handler);
/* 89 */            this.f19265d = nt0Var;
/* 95 */            y92 y92Var = new y92(executor);
/* 98 */            this.f19263c = y92Var;
/* 115 */           this.f19285v = new C2337wn(this, y92Var, nt0Var, j);
/* 122 */           this.f19259a = new fs0(str);
/* 136 */           ((rk1) fs0Var.f8339b).m8193k(new er0(EnumC2506yp.CLOSED, 5));
/* 141 */           C0210cb c0210cb = new C0210cb(c1899lq);
/* 144 */           this.f19269f = c0210cb;
/* 148 */           qi1 qi1Var = new qi1();
/* 156 */           qi1Var.f15573b = new Object();
/* 163 */           qi1Var.f15574c = new LinkedHashSet();
/* 170 */           qi1Var.f15575d = new LinkedHashSet();
/* 177 */           qi1Var.f15576e = new LinkedHashSet();
/* 184 */           qi1Var.f15577f = new C2152rp(qi1Var);
/* 186 */           qi1Var.f15572a = y92Var;
/* 188 */           this.f19274i0 = qi1Var;
/* 192 */           this.f19280o0 = c90Var;
                    try {
/* 194 */               C0962gp c0962gpM2831b = c0816cq.m2831b(str);
/* 210 */               this.f19273i = new C1799jn(c0962gpM2831b, nt0Var, y92Var, new gr0(this), c2557zn.f20272f);
/* 212 */               this.f19286w = c2557zn;
                        synchronized (c2557zn.f20270d) {
                        }
/* 228 */               ((Integer) c2557zn.f20268b.m3981a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
/* 233 */               hu0.m4312F0("Camera2CameraInfo");
/* 242 */               c2557zn.f20271e.m10161l((rk1) c0210cb.f2805c);
/* 249 */               this.f19281p0 = qc3.m7762j(c0962gpM2831b);
/* 255 */               this.f19255W = m10003y();
/* 259 */               er0 er0Var = c2557zn.f20272f;
/* 261 */               er0 er0Var2 = f80.f8038a;
/* 263 */               xy1 xy1Var = new xy1();
/* 266 */               xy1Var.f19393a = y92Var;
/* 268 */               xy1Var.f19395c = nt0Var;
/* 270 */               xy1Var.f19396d = handler;
/* 272 */               xy1Var.f19397e = qi1Var;
/* 274 */               xy1Var.f19398f = er0Var;
/* 276 */               xy1Var.f19394b = er0Var2;
/* 278 */               this.f19275j0 = xy1Var;
/* 288 */               this.f19264c0 = c2557zn.f20272f.m3579d(LegacyCameraOutputConfigNullPointerQuirk.class);
/* 298 */               this.f19266d0 = c2557zn.f20272f.m3579d(LegacyCameraSurfaceCleanupQuirk.class);
/* 302 */               C2187sn c2187sn = new C2187sn(this, str);
/* 305 */               this.f19258Z = c2187sn;
/* 309 */               d52 d52Var = new d52(this);
                        synchronized (c1899lq.f13451b) {
/* 336 */                   de3.m3028j("Camera is already registered: " + this, true ^ c1899lq.f13454e.containsKey(this));
/* 346 */                   c1899lq.f13454e.put(this, new C1862kq(y92Var, d52Var, c2187sn));
                        }
/* 352 */               c0816cq.f6873a.mo1573G(y92Var, c2187sn);
/* 369 */               this.f19282q0 = new cj2(context, str, c0816cq, new dc0(23));
                    } catch (C1897lo e) {
/* 387 */               throw new C1936mq(e);
                    }
                }

                /* JADX INFO: renamed from: u */
                public static String m9978u(int i) {
/* 1 */             if (i == 0) {
/* 36 */                return "ERROR_NONE";
                    }
/* 4 */             if (i == 1) {
/* 33 */                return "ERROR_CAMERA_IN_USE";
                    }
/* 7 */             if (i == 2) {
/* 30 */                return "ERROR_MAX_CAMERAS_IN_USE";
                    }
/* 10 */            if (i == 3) {
/* 27 */                return "ERROR_CAMERA_DISABLED";
                    }
/* 13 */            if (i != 4) {
                        return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
                    }
/* 24 */            return "ERROR_CAMERA_DEVICE";
                }

                /* JADX INFO: renamed from: v */
                public static String m9979v(qi1 qi1Var) {
/* 5 */             StringBuilder sb = new StringBuilder("MeteringRepeating");
/* 8 */             qi1Var.getClass();
/* 15 */            sb.append(qi1Var.hashCode());
/* 18 */            return sb.toString();
                }

                /* JADX INFO: renamed from: w */
                public static String m9980w(wy2 wy2Var) {
/* 20 */            return wy2Var.m9658f() + wy2Var.hashCode();
                }

                /* JADX INFO: renamed from: A */
                public final void m9981A() {
/* 5 */             int i = 0;
/* 6 */             int i2 = 1;
/* 13 */            de3.m3028j(null, this.f19284s0 == 9);
/* 18 */            eb2 eb2VarM3816m = this.f19259a.m3816m();
/* 24 */            if (!eb2VarM3816m.f7607k || !eb2VarM3816m.f7606j) {
/* 371 */               m10000s("Unable to create capture session due to conflicting configurations");
/* 374 */               return;
                    }
/* 54 */            if (!this.f19262b0.m6522e(this.f19253U.getId(), this.f19260a0.m6137p(this.f19253U.getId()))) {
/* 74 */                m10000s("Unable to create capture session in camera operating mode = " + this.f19260a0.f12882b);
/* 77 */                return;
                    }
/* 80 */            HashMap map = new HashMap();
/* 85 */            Collection<fb2> collectionM3817n = this.f19259a.m3817n();
/* 91 */            Collection collectionM3818o = this.f19259a.m3818o();
/* 95 */            C1888lf c1888lf = nh2.f14269a;
/* 99 */            ArrayList arrayList = new ArrayList(collectionM3818o);
/* 110 */           for (fb2 fb2Var : collectionM3817n) {
/* 128 */               if (fb2Var.f8120g.f12442b.f14411a.containsKey(c1888lf) && fb2Var.m3702b().size() != 1) {
/* 164 */                   hu0.m4325T("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(fb2Var.m3702b().size())));
                            break;
                        }
/* 179 */               if (fb2Var.f8120g.f12442b.f14411a.containsKey(c1888lf)) {
/* 185 */                   int i3 = 0;
/* 190 */                   for (fb2 fb2Var2 : collectionM3817n) {
/* 210 */                       if (((zy2) arrayList.get(i3)).mo7453t() == bz2.f2644f) {
/* 223 */                           de3.m3028j("MeteringRepeating should contain a surface", !fb2Var2.m3702b().isEmpty());
/* 242 */                           map.put((d70) fb2Var2.m3702b().get(0), 1L);
                                } else if (fb2Var2.f8120g.f12442b.f14411a.containsKey(c1888lf) && !fb2Var2.m3702b().isEmpty()) {
/* 288 */                           map.put((d70) fb2Var2.m3702b().get(0), (Long) fb2Var2.f8120g.f12442b.mo7025e(c1888lf));
                                }
/* 291 */                       i3++;
                            }
                            break;
                        }
                    }
/* 294 */           C2154rr c2154rr = this.f19255W;
                    synchronized (c2154rr.f16232a) {
/* 299 */               c2154rr.f16243l = map;
                    }
/* 302 */           C2154rr c2154rr2 = this.f19255W;
/* 304 */           fb2 fb2VarM3358b = eb2VarM3816m.m3358b();
/* 308 */           CameraDevice cameraDevice = this.f19253U;
/* 310 */           cameraDevice.getClass();
/* 313 */           xy1 xy1Var = this.f19275j0;
/* 345 */           s81 s81VarM8236i = c2154rr2.m8236i(fb2VarM3358b, cameraDevice, new gk2((er0) xy1Var.f19398f, (er0) xy1Var.f19394b, (qi1) xy1Var.f19397e, (y92) xy1Var.f19393a, (nt0) xy1Var.f19395c, (Handler) xy1Var.f19396d));
/* 361 */           s81VarM8236i.mo3676a(new dp0(i, s81VarM8236i, new C2150rn(this, c2154rr2, i2)), this.f19263c);
                }

                /* JADX INFO: renamed from: B */
                public final void m9982B() {
/* 3 */             if (this.f19272h0 != null) {
/* 9 */                 StringBuilder sb = new StringBuilder("MeteringRepeating");
/* 14 */                this.f19272h0.getClass();
/* 23 */                sb.append(this.f19272h0.hashCode());
/* 26 */                String string = sb.toString();
/* 30 */                fs0 fs0Var = this.f19259a;
/* 34 */                LinkedHashMap linkedHashMap = (LinkedHashMap) fs0Var.f8339b;
/* 41 */                if (linkedHashMap.containsKey(string)) {
/* 48 */                    xy2 xy2Var = (xy2) linkedHashMap.get(string);
/* 50 */                    xy2Var.f19403e = false;
/* 54 */                    if (!xy2Var.f19404f) {
/* 56 */                        linkedHashMap.remove(string);
                            }
                        }
/* 61 */                StringBuilder sb2 = new StringBuilder("MeteringRepeating");
/* 66 */                this.f19272h0.getClass();
/* 75 */                sb2.append(this.f19272h0.hashCode());
/* 78 */                String string2 = sb2.toString();
/* 84 */                LinkedHashMap linkedHashMap2 = (LinkedHashMap) fs0Var.f8339b;
/* 90 */                if (linkedHashMap2.containsKey(string2)) {
/* 97 */                    xy2 xy2Var2 = (xy2) linkedHashMap2.get(string2);
/* 99 */                    xy2Var2.f19404f = false;
/* 103 */                   if (!xy2Var2.f19403e) {
/* 105 */                       linkedHashMap2.remove(string2);
                            }
                        }
/* 108 */               qi1 qi1Var = this.f19272h0;
/* 110 */               qi1Var.getClass();
/* 113 */               hu0.m4312F0("MeteringRepeating");
/* 118 */               uw0 uw0Var = (uw0) qi1Var.f15572a;
/* 120 */               if (uw0Var != null) {
/* 122 */                   uw0Var.mo2951a();
                        }
/* 126 */               qi1Var.f15572a = null;
/* 128 */               this.f19272h0 = null;
                    }
                }

                /* JADX INFO: renamed from: C */
                public final void m9983C() {
                    fb2 fb2Var;
                    List listUnmodifiableList;
/* 3 */             int i = 0;
/* 11 */            de3.m3028j(null, this.f19255W != null);
/* 16 */            m10000s("Resetting Capture Session");
/* 19 */            C2154rr c2154rr = this.f19255W;
                    synchronized (c2154rr.f16232a) {
/* 24 */                fb2Var = c2154rr.f16237f;
                    }
                    synchronized (c2154rr.f16232a) {
/* 32 */                listUnmodifiableList = Collections.unmodifiableList(c2154rr.f16233b);
                    }
/* 37 */            C2154rr c2154rrM10003y = m10003y();
/* 41 */            this.f19255W = c2154rrM10003y;
/* 43 */            c2154rrM10003y.m8238k(fb2Var);
/* 48 */            this.f19255W.m8234g(listUnmodifiableList);
/* 59 */            if (AbstractC0886en.m3520y(this.f19284s0) != 8) {
/* 93 */                m10000s("Skipping Capture Session state check due to current camera state: " + AbstractC0886en.m3492A(this.f19284s0) + " and previous session status: " + c2154rr.m8232e());
                    } else if (this.f19264c0 && c2154rr.m8232e()) {
/* 109 */               m10000s("Close camera before creating new session");
/* 113 */               m9985E(6);
                    }
/* 118 */           if (this.f19266d0 && c2154rr.m8232e()) {
/* 128 */               m10000s("ConfigAndClose is required when close the camera.");
/* 131 */               this.f19268e0 = true;
                    }
/* 133 */           c2154rr.m8229a();
/* 136 */           s81 s81VarM8237j = c2154rr.m8237j();
/* 152 */           m10000s("Releasing session in state ".concat(AbstractC0886en.m3518v(this.f19284s0)));
/* 157 */           this.f19256X.put(c2154rr, s81VarM8237j);
/* 174 */           s81VarM8237j.mo3676a(new dp0(i, s81VarM8237j, new C2150rn(this, c2154rr, i)), pg3.m7428g());
                }

                /* JADX WARN: Code duplicated, block: B:58:0x0106  */
                /* JADX INFO: renamed from: D */
                public final void m9984D(int i, C0915ff c0915ff, boolean z) {
                    EnumC2506yp enumC2506yp;
                    EnumC2506yp enumC2506yp2;
                    C1862kq c1862kqM6519a;
                    HashMap map;
                    C0878ef c0878ef;
/* 33 */            m10000s("Transitioning camera internal state: " + AbstractC0886en.m3492A(this.f19284s0) + " --> " + AbstractC0886en.m3492A(i));
/* 44 */            if (j13.m5651m()) {
/* 67 */                j13.m5660v(AbstractC0886en.m3520y(i), "CX:C2State[" + this + "]");
/* 70 */                if (c0915ff != null) {
/* 75 */                    this.f19257Y++;
                        }
/* 79 */                if (this.f19257Y > 0) {
/* 104 */                   j13.m5660v(c0915ff != null ? c0915ff.f8183a : 0, "CX:C2StateErrorCode[" + this + "]");
                        }
                    }
/* 107 */           this.f19284s0 = i;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 151 */                   enumC2506yp = EnumC2506yp.RELEASED;
                            break;
                        case 1:
/* 148 */                   enumC2506yp = EnumC2506yp.RELEASING;
                            break;
                        case 2:
/* 145 */                   enumC2506yp = EnumC2506yp.CLOSED;
                            break;
                        case 3:
/* 142 */                   enumC2506yp = EnumC2506yp.PENDING_OPEN;
                            break;
                        case 4:
                        case 5:
/* 139 */                   enumC2506yp = EnumC2506yp.CLOSING;
                            break;
                        case 6:
                        case 7:
/* 136 */                   enumC2506yp = EnumC2506yp.OPENING;
                            break;
                        case 8:
/* 133 */                   enumC2506yp = EnumC2506yp.OPEN;
                            break;
                        case 9:
/* 130 */                   enumC2506yp = EnumC2506yp.CONFIGURED;
                            break;
                        default:
/* 126 */                   f42.m3656l("Unknown state: ".concat(AbstractC0886en.m3492A(i)));
/* 129 */                   return;
                    }
/* 153 */           C1899lq c1899lq = this.f19262b0;
                    synchronized (c1899lq.f13451b) {
                        try {
/* 158 */                   int i2 = c1899lq.f13455f;
/* 160 */                   EnumC2506yp enumC2506yp3 = EnumC2506yp.RELEASED;
/* 162 */                   HashMap map2 = c1899lq.f13454e;
/* 165 */                   if (enumC2506yp == enumC2506yp3) {
/* 171 */                       C1862kq c1862kq = (C1862kq) map2.remove(this);
/* 173 */                       if (c1862kq != null) {
/* 175 */                           c1899lq.m6520b();
/* 178 */                           enumC2506yp2 = c1862kq.f12973a;
                                } else {
/* 181 */                           enumC2506yp2 = null;
                                }
                            } else {
/* 187 */                       C1862kq c1862kq2 = (C1862kq) map2.get(this);
/* 191 */                       de3.m3027i(c1862kq2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
/* 194 */                       EnumC2506yp enumC2506yp4 = c1862kq2.f12973a;
/* 196 */                       c1862kq2.f12973a = enumC2506yp;
/* 198 */                       EnumC2506yp enumC2506yp5 = EnumC2506yp.OPENING;
/* 200 */                       if (enumC2506yp == enumC2506yp5) {
/* 211 */                           de3.m3028j("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", enumC2506yp.f19741a || enumC2506yp4 == enumC2506yp5);
                                }
/* 214 */                       if (enumC2506yp4 != enumC2506yp) {
/* 216 */                           C1899lq.m6518c(this, enumC2506yp);
/* 219 */                           c1899lq.m6520b();
                                }
/* 222 */                       enumC2506yp2 = enumC2506yp4;
                            }
/* 224 */                   if (enumC2506yp2 != enumC2506yp) {
/* 236 */                       if (c1899lq.f13453d.f12882b == 2 && enumC2506yp == EnumC2506yp.CONFIGURED) {
/* 252 */                           String strM6137p = c1899lq.f13453d.m6137p(mo8073m().mo310b());
/* 256 */                           if (strM6137p != null) {
/* 258 */                               c1862kqM6519a = c1899lq.m6519a(strM6137p);
                                    } else {
/* 263 */                               c1862kqM6519a = null;
                                    }
                                } else {
/* 263 */                           c1862kqM6519a = null;
                                }
/* 264 */                       if (i2 < 1 && c1899lq.f13455f > 0) {
/* 272 */                           map = new HashMap();
/* 289 */                           for (Map.Entry entry : c1899lq.f13454e.entrySet()) {
/* 307 */                               if (((C1862kq) entry.getValue()).f12973a == EnumC2506yp.PENDING_OPEN) {
/* 321 */                                   map.put((InterfaceC1838ko) entry.getKey(), (C1862kq) entry.getValue());
                                        }
                                    }
                                } else if (enumC2506yp != EnumC2506yp.PENDING_OPEN || c1899lq.f13455f <= 0) {
/* 350 */                           map = null;
                                } else {
/* 335 */                           map = new HashMap();
/* 346 */                           map.put(this, (C1862kq) c1899lq.f13454e.get(this));
                                }
/* 351 */                       if (map != null && !z) {
/* 355 */                           map.remove(this);
                                }
/* 359 */                       if (map != null) {
/* 373 */                           for (C1862kq c1862kq3 : map.values()) {
/* 381 */                               c1862kq3.getClass();
                                        try {
/* 394 */                                   c1862kq3.f12974b.execute(new RunnableC2166s2(c1862kq3.f12976d, 6));
                                        } catch (RejectedExecutionException e) {
/* 403 */                                   hu0.m4326U("CameraStateRegistry", "Unable to notify camera to open.", e);
                                        }
                                    }
                                }
/* 407 */                       if (c1862kqM6519a != null) {
                                    try {
/* 419 */                               c1862kqM6519a.f12974b.execute(new RunnableC2166s2(c1862kqM6519a.f12975c, 7));
                                    } catch (RejectedExecutionException e2) {
/* 428 */                               hu0.m4326U("CameraStateRegistry", "Unable to notify camera to configure.", e2);
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 595 */                   throw th;
                        }
                    }
/* 443 */           ((rk1) this.f19267e.f8339b).m8193k(new er0(enumC2506yp, 5));
/* 446 */           C0210cb c0210cb = this.f19269f;
/* 448 */           c0210cb.getClass();
                    switch (enumC2506yp.ordinal()) {
                        case 0:
                        case 2:
/* 545 */                   c0878ef = new C0878ef(5, c0915ff);
                            break;
                        case 1:
                        case 4:
/* 539 */                   c0878ef = new C0878ef(4, c0915ff);
                            break;
                        case 3:
/* 479 */                   C1899lq c1899lq2 = (C1899lq) c0210cb.f2804b;
                            synchronized (c1899lq2.f13451b) {
/* 490 */                       Iterator it = c1899lq2.f13454e.entrySet().iterator();
                                while (true) {
/* 498 */                           if (!it.hasNext()) {
/* 530 */                               c0878ef = new C0878ef(1, null);
                                    } else if (((C1862kq) ((Map.Entry) it.next()).getValue()).f12973a == EnumC2506yp.CLOSING) {
/* 521 */                               c0878ef = new C0878ef(2, null);
                                    }
                                }
                            }
                            break;
                        case 5:
/* 473 */                   c0878ef = new C0878ef(2, c0915ff);
                            break;
                        case 6:
                        case 7:
/* 467 */                   c0878ef = new C0878ef(3, c0915ff);
                            break;
                        default:
/* 460 */                   ds0.m3204u(enumC2506yp, "Unknown internal camera state: ");
/* 463 */                   return;
                    }
/* 550 */           c0878ef.toString();
/* 553 */           enumC2506yp.toString();
/* 556 */           Objects.toString(c0915ff);
/* 559 */           hu0.m4312F0("CameraStateMachine");
/* 576 */           if (Objects.equals((C0878ef) ((rk1) c0210cb.f2805c).mo118d(), c0878ef)) {
/* 593 */               return;
                    }
/* 580 */           c0878ef.toString();
/* 583 */           hu0.m4312F0("CameraStateMachine");
/* 590 */           ((rk1) c0210cb.f2805c).m8193k(c0878ef);
                }

                /* JADX INFO: renamed from: E */
                public final void m9985E(int i) {
/* 3 */             m9984D(i, null, true);
                }

                /* JADX INFO: renamed from: F */
                public final ArrayList m9986F(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                wy2 wy2Var = (wy2) it.next();
/* 22 */                boolean z = this.f19271g0;
/* 24 */                String strM9980w = m9980w(wy2Var);
/* 28 */                Class<?> cls = wy2Var.getClass();
/* 38 */                fb2 fb2Var = z ? wy2Var.f18868m : wy2Var.f18869n;
/* 41 */                zy2 zy2Var = wy2Var.f18861f;
/* 43 */                C2069pg c2069pg = wy2Var.f18862g;
/* 71 */                arrayList2.add(new C0842df(strM9980w, cls, fb2Var, zy2Var, c2069pg != null ? c2069pg.f15102a : null, c2069pg, wy2Var.m9655b() != null ? lh2.m6433F(wy2Var) : null));
                    }
/* 75 */            return arrayList2;
                }

                /* JADX INFO: renamed from: G */
                public final void m9987G(ArrayList arrayList) {
                    Size size;
/* 7 */             boolean zIsEmpty = this.f19259a.m3817n().isEmpty();
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 16 */            Iterator it = arrayList.iterator();
/* 20 */            Rational rational = null;
                    while (true) {
/* 26 */                if (!it.hasNext()) {
                            break;
                        }
/* 32 */                C0842df c0842df = (C0842df) it.next();
/* 42 */                if (!this.f19259a.m3823t(c0842df.f7149a)) {
/* 44 */                    fs0 fs0Var = this.f19259a;
/* 46 */                    String str = c0842df.f7149a;
/* 48 */                    fb2 fb2Var = c0842df.f7151c;
/* 50 */                    zy2 zy2Var = c0842df.f7152d;
/* 52 */                    C2069pg c2069pg = c0842df.f7154f;
/* 54 */                    List list = c0842df.f7155g;
/* 58 */                    LinkedHashMap linkedHashMap = (LinkedHashMap) fs0Var.f8339b;
/* 64 */                    xy2 xy2Var = (xy2) linkedHashMap.get(str);
/* 66 */                    if (xy2Var == null) {
/* 70 */                        xy2Var = new xy2(fb2Var, zy2Var, c2069pg, list);
/* 73 */                        linkedHashMap.put(str, xy2Var);
                            }
/* 76 */                    xy2Var.f19403e = true;
/* 78 */                    fs0Var.m3827x(str, fb2Var, zy2Var, c2069pg, list);
/* 83 */                    arrayList2.add(c0842df.f7149a);
/* 90 */                    if (c0842df.f7150b == vw1.class && (size = c0842df.f7153e) != null) {
/* 106 */                       rational = new Rational(size.getWidth(), size.getHeight());
                            }
                        }
                    }
/* 114 */           if (arrayList2.isEmpty()) {
/* 273 */               return;
                    }
/* 143 */           m10000s("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
/* 146 */           if (zIsEmpty) {
/* 150 */               this.f19273i.m5858m(true);
/* 153 */               C1799jn c1799jn = this.f19273i;
                        synchronized (c1799jn.f12386d) {
/* 161 */                   c1799jn.f12398p++;
                        }
                    }
/* 169 */           m9996o();
/* 172 */           m9991K();
/* 175 */           m9990J();
/* 178 */           m9983C();
/* 185 */           if (this.f19284s0 == 9) {
/* 187 */               m9981A();
                    } else {
/* 193 */               int iM3520y = AbstractC0886en.m3520y(this.f19284s0);
/* 199 */               if (iM3520y == 2 || iM3520y == 3) {
/* 261 */                   m9988H(false);
                        } else if (iM3520y != 4) {
/* 219 */                   m10000s("open() ignored due to being in state: ".concat(AbstractC0886en.m3492A(this.f19284s0)));
                        } else {
/* 224 */                   m9985E(7);
/* 233 */                   if (!this.f19256X.isEmpty() && !this.f19270f0 && this.f19254V == 0) {
/* 251 */                       de3.m3028j("Camera Device should be open if session close is not complete", this.f19253U != null);
/* 254 */                       m9985E(9);
/* 257 */                       m9981A();
                            }
                        }
                    }
/* 264 */           if (rational != null) {
/* 270 */               this.f19273i.f12390h.getClass();
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m9988H(boolean z) {
/* 3 */             m10000s("Attempting to force open the camera.");
/* 12 */            if (this.f19262b0.m6521d(this)) {
/* 24 */                m10004z(z);
                    } else {
/* 16 */                m10000s("No cameras available. Waiting for available camera before opening camera.");
/* 20 */                m9985E(4);
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m9989I(boolean z) {
/* 3 */             m10000s("Attempting to open the camera.");
/* 10 */            if (this.f19258Z.f16712b && this.f19262b0.m6521d(this)) {
/* 20 */                m10004z(z);
                    } else {
/* 26 */                m10000s("No cameras available. Waiting for available camera before opening camera.");
/* 30 */                m9985E(4);
                    }
                }

                /* JADX INFO: renamed from: J */
                public final void m9990J() {
/* 1 */             fs0 fs0Var = this.f19259a;
/* 3 */             fs0Var.getClass();
/* 8 */             eb2 eb2Var = new eb2();
/* 13 */            ArrayList arrayList = new ArrayList();
/* 32 */            for (Map.Entry entry : ((LinkedHashMap) fs0Var.f8339b).entrySet()) {
/* 44 */                xy2 xy2Var = (xy2) entry.getValue();
/* 48 */                if (xy2Var.f19404f && xy2Var.f19403e) {
/* 58 */                    String str = (String) entry.getKey();
/* 62 */                    eb2Var.m3357a(xy2Var.f19399a);
/* 65 */                    arrayList.add(str);
                        }
                    }
/* 69 */            arrayList.toString();
/* 74 */            hu0.m4312F0("UseCaseAttachState");
/* 77 */            boolean z = eb2Var.f7607k;
/* 79 */            C1799jn c1799jn = this.f19273i;
/* 81 */            if (!z || !eb2Var.f7606j) {
/* 124 */               c1799jn.f12404v = 1;
/* 128 */               c1799jn.f12390h.f8262c = 1;
/* 132 */               c1799jn.f12396n.getClass();
/* 141 */               this.f19255W.m8238k(c1799jn.m5857j());
/* 144 */               return;
                    }
/* 93 */            int i = eb2Var.m3358b().f8120g.f12443c;
/* 95 */            c1799jn.f12404v = i;
/* 99 */            c1799jn.f12390h.f8262c = i;
/* 103 */           c1799jn.f12396n.getClass();
/* 110 */           eb2Var.m3357a(c1799jn.m5857j());
/* 119 */           this.f19255W.m8238k(eb2Var.m3358b());
                }

                /* JADX INFO: renamed from: K */
                public final void m9991K() {
/* 7 */             Iterator it = this.f19259a.m3818o().iterator();
/* 11 */            boolean zBooleanValue = false;
/* 16 */            while (it.hasNext()) {
/* 38 */                zBooleanValue |= ((Boolean) ((zy2) it.next()).mo7023b(zy2.f20390M, Boolean.FALSE)).booleanValue();
                    }
/* 44 */            this.f19273i.f12394l.f20296a = zBooleanValue;
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: b */
                public final void mo8066b(wy2 wy2Var) {
/* 43 */            this.f19263c.execute(new RunnableC2039on(this, m9980w(wy2Var), this.f19271g0 ? wy2Var.f18868m : wy2Var.f18869n, wy2Var.f18861f, wy2Var.f18862g, wy2Var.m9655b() == null ? null : lh2.m6433F(wy2Var), 0));
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: c */
                public final void mo9992c(C1801jp c1801jp) {
/* 1 */             if (c1801jp == null) {
/* 4 */                 c1801jp = AbstractC1861kp.f12965a;
                    }
/* 6 */             c1801jp.m4259u();
/* 9 */             this.f19277l0 = c1801jp;
                    synchronized (this.f19278m0) {
                    }
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: d */
                public final void mo8067d(wy2 wy2Var) {
/* 43 */            this.f19263c.execute(new RunnableC2039on(this, m9980w(wy2Var), this.f19271g0 ? wy2Var.f18868m : wy2Var.f18869n, wy2Var.f18861f, wy2Var.f18862g, wy2Var.m9655b() == null ? null : lh2.m6433F(wy2Var), 2));
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: e */
                public final InterfaceC1972np mo8068e() {
/* 1 */             return this.f19273i;
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: f */
                public final InterfaceC0999hp mo9993f() {
/* 1 */             return this.f19277l0;
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: g */
                public final void mo8069g(wy2 wy2Var) {
/* 43 */            this.f19263c.execute(new RunnableC2039on(this, m9980w(wy2Var), this.f19271g0 ? wy2Var.f18868m : wy2Var.f18869n, wy2Var.f18861f, wy2Var.f18862g, wy2Var.m9655b() == null ? null : lh2.m6433F(wy2Var), 1));
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: h */
                public final void mo9994h(boolean z) {
/* 9 */             this.f19263c.execute(new RunnableC0025an(1, this, z));
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: i */
                public final void mo8070i(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList(arrayList);
/* 10 */            if (arrayList2.isEmpty()) {
/* 12 */                return;
                    }
/* 19 */            ArrayList arrayList3 = new ArrayList(m9986F(arrayList2));
/* 35 */            for (wy2 wy2Var : new ArrayList(arrayList2)) {
/* 43 */                String strM9980w = m9980w(wy2Var);
/* 47 */                HashSet hashSet = this.f19276k0;
/* 53 */                if (hashSet.contains(strM9980w)) {
/* 56 */                    wy2Var.mo6445t();
/* 59 */                    hashSet.remove(strM9980w);
                        }
                    }
/* 71 */            this.f19263c.execute(new RunnableC1970nn(this, arrayList3, 0));
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: j */
                public final void mo8071j(ArrayList arrayList) {
                    int i;
/* 1 */             C1799jn c1799jn = this.f19273i;
/* 5 */             ArrayList arrayList2 = new ArrayList(arrayList);
/* 12 */            if (arrayList2.isEmpty()) {
/* 14 */                return;
                    }
                    synchronized (c1799jn.f12386d) {
/* 20 */                i = 1;
/* 22 */                c1799jn.f12398p++;
                    }
/* 27 */            ArrayList<wy2> arrayList3 = new ArrayList(arrayList2);
/* 30 */            HashSet hashSet = this.f19276k0;
/* 40 */            for (wy2 wy2Var : arrayList3) {
/* 48 */                String strM9980w = m9980w(wy2Var);
/* 56 */                if (!hashSet.contains(strM9980w)) {
/* 59 */                    hashSet.add(strM9980w);
/* 62 */                    wy2Var.mo6444s();
/* 65 */                    wy2Var.mo9666q();
                        }
                    }
                    try {
/* 85 */                this.f19263c.execute(new RunnableC1970nn(this, new ArrayList(m9986F(arrayList2)), i));
                    } catch (RejectedExecutionException unused) {
/* 91 */                m10000s("Unable to attach use cases.");
/* 94 */                c1799jn.m5856i();
                    }
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: l */
                public final void mo9995l(boolean z) {
/* 1 */             this.f19271g0 = z;
                }

                @Override // p000.InterfaceC2559zp
                /* JADX INFO: renamed from: m */
                public final InterfaceC2469xp mo8073m() {
/* 1 */             return this.f19286w;
                }

                @Override // p000.vy2
                /* JADX INFO: renamed from: n */
                public final void mo8074n(wy2 wy2Var) {
/* 14 */            this.f19263c.execute(new RunnableC1784j8(8, this, m9980w(wy2Var)));
                }

                /* JADX INFO: renamed from: o */
                public final void m9996o() {
                    String str;
                    int i;
                    Size size;
/* 3 */             fs0 fs0Var = this.f19259a;
/* 9 */             fb2 fb2VarM3358b = fs0Var.m3816m().m3358b();
/* 13 */            C1803jr c1803jr = fb2VarM3358b.f8120g;
/* 21 */            int size2 = Collections.unmodifiableList(c1803jr.f12441a).size();
/* 29 */            int size3 = fb2VarM3358b.m3702b().size();
/* 41 */            if (fb2VarM3358b.m3702b().isEmpty()) {
/* 429 */               return;
                    }
/* 49 */            boolean zIsEmpty = Collections.unmodifiableList(c1803jr.f12441a).isEmpty();
/* 53 */            int i2 = 2;
/* 54 */            int i3 = 1;
/* 57 */            if (!zIsEmpty) {
/* 398 */               if (size3 == 1 && size2 == 1) {
/* 402 */                   m9982B();
/* 405 */                   return;
                        }
/* 406 */               if (size2 >= 2) {
/* 408 */                   m9982B();
/* 411 */                   return;
                        } else if (this.f19272h0 == null || m10002x()) {
/* 426 */                   hu0.m4312F0("Camera2CameraImpl");
/* 429 */                   return;
                        } else {
/* 422 */                   m9982B();
/* 425 */                   return;
                        }
                    }
/* 62 */            if (this.f19272h0 == null) {
/* 68 */                C0962gp c0962gp = this.f19286w.f20268b;
/* 72 */                C1933mn c1933mn = new C1933mn(this, i2);
/* 75 */                qi1 qi1Var = new qi1();
/* 80 */                bj2 bj2Var = new bj2();
/* 83 */                qi1Var.f15577f = null;
/* 90 */                qi1Var.f15574c = new pi1();
/* 92 */                qi1Var.f15576e = c1933mn;
/* 100 */               Size[] sizeArrM188r = c0962gp.m3982b().m188r(34);
/* 104 */               String str2 = "MeteringRepeating";
/* 106 */               int i4 = 0;
/* 107 */               if (sizeArrM188r != null) {
/* 125 */                   if (bj2Var.f2449a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
/* 149 */                       ArrayList arrayList = new ArrayList();
/* 154 */                       for (Size size4 : sizeArrM188r) {
/* 166 */                           if (bj2.f2448c.compare(size4, bj2.f2447b) >= 0) {
/* 168 */                               arrayList.add(size4);
                                    }
                                }
/* 181 */                       sizeArrM188r = (Size[]) arrayList.toArray(new Size[0]);
                            }
/* 183 */                   List listAsList = Arrays.asList(sizeArrM188r);
/* 192 */                   Collections.sort(listAsList, new kl0(i3));
/* 197 */                   Size sizeM1550e = this.f19280o0.m1550e();
/* 215 */                   long jMin = Math.min(((long) sizeM1550e.getWidth()) * ((long) sizeM1550e.getHeight()), 307200L);
/* 219 */                   int length = sizeArrM188r.length;
/* 220 */                   Size size5 = null;
/* 221 */                   int i5 = 0;
                            while (true) {
/* 222 */                       if (i5 < length) {
/* 224 */                           Size size6 = sizeArrM188r[i5];
/* 235 */                           Size[] sizeArr = sizeArrM188r;
/* 237 */                           str = str2;
/* 240 */                           long width = ((long) size6.getWidth()) * ((long) size6.getHeight());
/* 243 */                           if (width == jMin) {
/* 245 */                               size = size6;
                                        break;
                                    }
/* 247 */                           if (width <= jMin) {
/* 255 */                               i5++;
/* 257 */                               size5 = size6;
/* 258 */                               str2 = str;
/* 260 */                               sizeArrM188r = sizeArr;
/* 264 */                               i4 = 0;
                                    } else {
/* 249 */                               if (size5 != null) {
/* 251 */                                   size = size5;
                                            break;
                                        }
/* 253 */                               i = 0;
                                    }
                                } else {
/* 266 */                           str = str2;
/* 268 */                           i = i4;
                                }
/* 273 */                       size = (Size) listAsList.get(i);
                                break;
                            }
                        } else {
/* 111 */                   hu0.m4325T("MeteringRepeating", "Can not get output size list.");
/* 116 */                   size = new Size(0, 0);
/* 104 */                   str = "MeteringRepeating";
                        }
/* 275 */               qi1Var.f15575d = size;
/* 277 */               Objects.toString(size);
/* 280 */               hu0.m4312F0(str);
/* 287 */               qi1Var.f15573b = qi1Var.m7857c();
/* 289 */               this.f19272h0 = qi1Var;
                    }
/* 295 */           if (!m10002x()) {
/* 393 */               hu0.m4325T("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
/* 396 */               return;
                    }
/* 297 */           qi1 qi1Var2 = this.f19272h0;
/* 299 */           if (qi1Var2 != null) {
/* 301 */               String strM9979v = m9979v(qi1Var2);
/* 305 */               qi1 qi1Var3 = this.f19272h0;
/* 309 */               fb2 fb2Var = (fb2) qi1Var3.f15573b;
/* 313 */               pi1 pi1Var = (pi1) qi1Var3.f15574c;
/* 315 */               bz2 bz2Var = bz2.f2644f;
/* 317 */               List listSingletonList = Collections.singletonList(bz2Var);
/* 323 */               LinkedHashMap linkedHashMap = (LinkedHashMap) fs0Var.f8339b;
/* 329 */               xy2 xy2Var = (xy2) linkedHashMap.get(strM9979v);
/* 332 */               if (xy2Var == null) {
/* 336 */                   xy2Var = new xy2(fb2Var, pi1Var, null, listSingletonList);
/* 339 */                   linkedHashMap.put(strM9979v, xy2Var);
                        }
/* 343 */               xy2Var.f19403e = true;
/* 349 */               fs0Var.m3827x(strM9979v, fb2Var, pi1Var, null, listSingletonList);
/* 352 */               qi1 qi1Var4 = this.f19272h0;
/* 356 */               fb2 fb2Var2 = (fb2) qi1Var4.f15573b;
/* 360 */               pi1 pi1Var2 = (pi1) qi1Var4.f15574c;
/* 362 */               List listSingletonList2 = Collections.singletonList(bz2Var);
/* 368 */               LinkedHashMap linkedHashMap2 = (LinkedHashMap) fs0Var.f8339b;
/* 374 */               xy2 xy2Var2 = (xy2) linkedHashMap2.get(strM9979v);
/* 376 */               if (xy2Var2 == null) {
/* 381 */                   xy2Var2 = new xy2(fb2Var2, pi1Var2, null, listSingletonList2);
/* 384 */                   linkedHashMap2.put(strM9979v, xy2Var2);
                        }
/* 388 */               xy2Var2.f19404f = true;
                    }
                }

                /* JADX INFO: renamed from: p */
                public final void m9997p() {
                    ArrayList<C1803jr> arrayList;
/* 63 */            de3.m3028j("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + AbstractC0886en.m3492A(this.f19284s0) + " (error: " + m9978u(this.f19254V) + ")", this.f19284s0 == 5 || this.f19284s0 == 2 || (this.f19284s0 == 7 && this.f19254V != 0));
/* 66 */            m9983C();
/* 69 */            C2154rr c2154rr = this.f19255W;
                    synchronized (c2154rr.f16232a) {
                        try {
/* 80 */                    if (c2154rr.f16233b.isEmpty()) {
/* 97 */                        arrayList = null;
                            } else {
/* 86 */                        arrayList = new ArrayList(c2154rr.f16233b);
/* 91 */                        c2154rr.f16233b.clear();
                            }
                        } catch (Throwable th) {
/* 161 */                   throw th;
                        }
                    }
/* 99 */            if (arrayList != null) {
/* 109 */               for (C1803jr c1803jr : arrayList) {
/* 127 */                   for (AbstractC1934mo abstractC1934mo : c1803jr.f12444d) {
/* 141 */                       Object obj = c1803jr.f12446f.f14383a.get("CAPTURE_CONFIG_ID_KEY");
/* 155 */                       abstractC1934mo.mo3974a(obj == null ? -1 : ((Integer) obj).intValue());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m9998q() {
/* 3 */             int i = 1;
/* 5 */             int i2 = 2;
/* 18 */            de3.m3028j(null, this.f19284s0 == 2 || this.f19284s0 == 5);
/* 27 */            de3.m3028j(null, this.f19256X.isEmpty());
/* 32 */            if (!this.f19268e0) {
/* 34 */                m10001t();
/* 37 */                return;
                    }
/* 40 */            if (this.f19270f0) {
/* 44 */                m10000s("Ignored since configAndClose is processing");
/* 47 */                return;
                    }
/* 52 */            if (!this.f19258Z.f16712b) {
/* 54 */                this.f19268e0 = false;
/* 56 */                m10001t();
/* 61 */                m10000s("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
                    } else {
/* 67 */                m10000s("Open camera to configAndClose");
/* 75 */                C2466xm c2466xmM7599Y = py0.m7599Y(new C1933mn(this, i));
/* 79 */                this.f19270f0 = true;
/* 90 */                c2466xmM7599Y.f19248b.mo3676a(new RunnableC2166s2(this, i2), this.f19263c);
                    }
                }

                /* JADX INFO: renamed from: r */
                public final CameraDevice.StateCallback m9999r() {
/* 15 */            ArrayList arrayList = new ArrayList(this.f19259a.m3816m().m3358b().f8116c);
/* 24 */            arrayList.add((C2152rp) this.f19274i0.f15577f);
/* 29 */            arrayList.add(this.f19285v);
/* 32 */            return kb1.m6066s(arrayList);
                }

                /* JADX INFO: renamed from: s */
                public final void m10000s(String str) {
/* 1 */             toString();
/* 6 */             hu0.m4312F0("Camera2CameraImpl");
                }

                /* JADX INFO: renamed from: t */
                public final void m10001t() {
/* 17 */            de3.m3028j(null, this.f19284s0 == 2 || this.f19284s0 == 5);
/* 26 */            de3.m3028j(null, this.f19256X.isEmpty());
/* 29 */            this.f19253U = null;
/* 33 */            if (this.f19284s0 == 5) {
/* 36 */                m9985E(3);
/* 39 */                return;
                    }
/* 46 */            this.f19261b.f6873a.mo1579N(this.f19258Z);
/* 49 */            m9985E(1);
                }

                public final String toString() {
/* 21 */            return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f19286w.f20267a);
                }

                /* JADX INFO: renamed from: x */
                public final boolean m10002x() {
                    int i;
/* 5 */             ArrayList arrayList = new ArrayList();
                    synchronized (this.f19278m0) {
                        try {
/* 26 */                    i = this.f19260a0.f12882b == 2 ? 1 : 0;
                        } catch (Throwable th) {
/* 276 */                   throw th;
                        }
                    }
/* 27 */            fs0 fs0Var = this.f19259a;
/* 29 */            fs0Var.getClass();
/* 34 */            ArrayList arrayList2 = new ArrayList();
/* 53 */            for (Map.Entry entry : ((LinkedHashMap) fs0Var.f8339b).entrySet()) {
/* 69 */                if (((xy2) entry.getValue()).f19403e) {
/* 77 */                    arrayList2.add((xy2) entry.getValue());
                        }
                    }
/* 93 */            for (xy2 xy2Var : Collections.unmodifiableCollection(arrayList2)) {
/* 101 */               List list = xy2Var.f19402d;
/* 103 */               if (list == null || list.get(0) != bz2.f2644f) {
/* 116 */                   if (xy2Var.f19401c == null || xy2Var.f19402d == null) {
/* 223 */                       hu0.m4315H0("Camera2CameraImpl", "Invalid stream spec or capture types in " + xy2Var);
/* 16 */                        return false;
                            }
/* 123 */                   fb2 fb2Var = xy2Var.f19399a;
/* 125 */                   zy2 zy2Var = xy2Var.f19400b;
/* 139 */                   for (d70 d70Var : fb2Var.m3702b()) {
/* 147 */                       cj2 cj2Var = this.f19282q0;
/* 149 */                       int iMo1175l = zy2Var.mo1175l();
/* 159 */                       C2143rg c2143rgM8156b = C2143rg.m8156b(i, iMo1175l, d70Var.f7033h, cj2Var.m1707i(iMo1175l));
/* 163 */                       int iMo1175l2 = zy2Var.mo1175l();
/* 167 */                       Size size = d70Var.f7033h;
/* 169 */                       C2069pg c2069pg = xy2Var.f19401c;
/* 203 */                       arrayList.add(new C0017af(c2143rgM8156b, iMo1175l2, size, c2069pg.f15103b, xy2Var.f19402d, c2069pg.f15105d, (Range) zy2Var.mo7023b(zy2.f20389L, null)));
                            }
                        }
                    }
/* 231 */           this.f19272h0.getClass();
/* 236 */           HashMap map = new HashMap();
/* 239 */           qi1 qi1Var = this.f19272h0;
/* 253 */           map.put((pi1) qi1Var.f15574c, Collections.singletonList((Size) qi1Var.f15575d));
                    try {
/* 260 */               this.f19282q0.m1705g(i, arrayList, map, false, false);
/* 265 */               m10000s("Surface combination with metering repeating supported!");
/* 227 */               return true;
                    } catch (IllegalArgumentException unused) {
/* 271 */               m10000s("Surface combination with metering repeating  not supported!");
/* 16 */                return false;
                    }
                }

                /* JADX INFO: renamed from: y */
                public final C2154rr m10003y() {
                    C2154rr c2154rr;
                    synchronized (this.f19278m0) {
/* 12 */                c2154rr = new C2154rr(this.f19281p0, this.f19286w.f20272f);
                    }
/* 16 */            return c2154rr;
                }

                /* JADX INFO: renamed from: z */
                public final void m10004z(boolean z) {
/* 3 */             if (!z) {
/* 11 */                this.f19285v.f18695e.f17601b = -1L;
                    }
/* 15 */            this.f19285v.m9586a();
/* 20 */            this.f19283r0.m1590l();
/* 25 */            m10000s("Opening camera.");
/* 30 */            m9985E(8);
                    try {
/* 48 */                this.f19261b.f6873a.mo1571E(this.f19286w.f20267a, this.f19263c, m9999r());
                    } catch (SecurityException e) {
/* 72 */                m10000s("Unable to open camera due to " + e.getMessage());
/* 75 */                m9985E(7);
/* 80 */                this.f19285v.m9587b();
                    } catch (C1897lo e2) {
/* 100 */               m10000s("Unable to open camera due to " + e2.getMessage());
/* 107 */               if (e2.f13433a == 10001) {
/* 152 */                   m9984D(3, new C0915ff(7, e2), true);
/* 155 */                   return;
                        }
/* 109 */               C0210cb c0210cb = this.f19283r0;
/* 115 */               int i = ((C2467xn) c0210cb.f2805c).f19284s0;
/* 119 */               C2467xn c2467xn = (C2467xn) c0210cb.f2805c;
/* 121 */               if (i != 8) {
/* 125 */                   c2467xn.m10000s("Don't need the onError timeout handler.");
/* 155 */                   return;
                        }
/* 131 */               c2467xn.m10000s("Camera waiting for onError.");
/* 134 */               c0210cb.m1590l();
/* 142 */               c0210cb.f2804b = new C0875ec(c0210cb);
                    }
                }
            }
