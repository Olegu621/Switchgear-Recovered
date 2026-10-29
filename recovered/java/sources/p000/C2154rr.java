            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.os.Build;
            import android.view.Surface;
            import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: rr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2154rr {

                /* JADX INFO: renamed from: d */
                public gk2 f16235d;

                /* JADX INFO: renamed from: e */
                public gk2 f16236e;

                /* JADX INFO: renamed from: f */
                public fb2 f16237f;

                /* JADX INFO: renamed from: i */
                public int f16240i;

                /* JADX INFO: renamed from: j */
                public C2466xm f16241j;

                /* JADX INFO: renamed from: k */
                public C2260um f16242k;

                /* JADX INFO: renamed from: o */
                public final zr3 f16246o;

                /* JADX INFO: renamed from: p */
                public final qc3 f16247p;

                /* JADX INFO: renamed from: q */
                public final C1924me f16248q;

                /* JADX INFO: renamed from: a */
                public final Object f16232a = new Object();

                /* JADX INFO: renamed from: b */
                public final ArrayList f16233b = new ArrayList();

                /* JADX INFO: renamed from: g */
                public final HashMap f16238g = new HashMap();

                /* JADX INFO: renamed from: h */
                public List f16239h = Collections.EMPTY_LIST;

                /* JADX INFO: renamed from: l */
                public HashMap f16243l = new HashMap();

                /* JADX INFO: renamed from: m */
                public final nb2 f16244m = new nb2(1);

                /* JADX INFO: renamed from: n */
                public final nb2 f16245n = new nb2(3);

                /* JADX INFO: renamed from: c */
                public final C2117qr f16234c = new C2117qr(this);

                public C2154rr(qc3 qc3Var, er0 er0Var) {
/* 30 */            this.f16240i = 1;
/* 55 */            this.f16240i = 2;
/* 57 */            this.f16247p = qc3Var;
/* 77 */            this.f16246o = new zr3(er0Var.m3579d(CaptureNoResponseQuirk.class));
/* 84 */            this.f16248q = new C1924me(er0Var, 1);
                }

                /* JADX INFO: renamed from: b */
                public static C0150ao m8228b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
                    CameraCaptureSession.CaptureCallback c0150ao;
/* 9 */             ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
/* 12 */            Iterator it = list.iterator();
/* 20 */            while (it.hasNext()) {
/* 26 */                AbstractC1934mo abstractC1934mo = (AbstractC1934mo) it.next();
/* 28 */                if (abstractC1934mo == null) {
/* 30 */                    c0150ao = null;
                        } else {
/* 34 */                    ArrayList arrayList2 = new ArrayList();
/* 37 */                    j13.m5664z(abstractC1934mo, arrayList2);
/* 57 */                    c0150ao = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C0150ao(arrayList2);
                        }
/* 60 */                arrayList.add(c0150ao);
                    }
/* 64 */            Collections.addAll(arrayList, captureCallbackArr);
/* 69 */            return new C0150ao(arrayList);
                }

                /* JADX INFO: renamed from: a */
                public final void m8229a() {
                    synchronized (this.f16232a) {
                        try {
/* 12 */                    int iM3520y = AbstractC0886en.m3520y(this.f16240i);
/* 16 */                    if (iM3520y == 0) {
/* 106 */                       throw new IllegalStateException("close() should not be possible in state: ".concat(AbstractC0886en.m3494C(this.f16240i)));
                            }
/* 19 */                    if (iM3520y == 1) {
/* 87 */                        this.f16240i = 8;
                            } else if (iM3520y == 2) {
/* 77 */                        de3.m3027i(this.f16235d, "The Opener shouldn't null in state:".concat(AbstractC0886en.m3494C(this.f16240i)));
/* 82 */                        this.f16235d.m3963q();
/* 87 */                        this.f16240i = 8;
                            } else if (iM3520y == 3 || iM3520y == 4) {
/* 43 */                        de3.m3027i(this.f16235d, "The Opener shouldn't null in state:".concat(AbstractC0886en.m3494C(this.f16240i)));
/* 48 */                        this.f16235d.m3963q();
/* 52 */                        this.f16240i = 6;
/* 56 */                        this.f16246o.m10440w();
/* 60 */                        this.f16237f = null;
                            }
                        } catch (Throwable th) {
/* 108 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m8230c() {
/* 5 */             if (this.f16240i == 8) {
/* 9 */                 hu0.m4312F0("CaptureSession");
/* 12 */                return;
                    }
/* 13 */            this.f16240i = 8;
/* 16 */            this.f16236e = null;
/* 18 */            C2260um c2260um = this.f16242k;
/* 20 */            if (c2260um != null) {
/* 22 */                c2260um.m9040a(null);
/* 25 */                this.f16242k = null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0096  */
                /* JADX INFO: renamed from: d */
                public final oq1 m8231d(C1926mg c1926mg, HashMap map, String str) {
                    long jLongValue;
/* 1 */             d70 d70Var = c1926mg.f13750a;
/* 3 */             List list = c1926mg.f13751b;
/* 9 */             Surface surface = (Surface) map.get(d70Var);
/* 13 */            de3.m3027i(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
/* 20 */            oq1 oq1Var = new oq1(c1926mg.f13753d, surface);
/* 23 */            qq1 qq1Var = oq1Var.f14865a;
/* 25 */            if (str != null) {
/* 27 */                qq1Var.mo7993h(str);
                    } else {
/* 32 */                qq1Var.mo7993h(null);
                    }
/* 35 */            int i = c1926mg.f13752c;
/* 38 */            if (i == 0) {
/* 40 */                qq1Var.mo7992g(1);
                    } else if (i == 1) {
/* 47 */                qq1Var.mo7992g(2);
                    }
/* 54 */            if (!list.isEmpty()) {
/* 56 */                qq1Var.mo7987b();
/* 59 */                Iterator it = list.iterator();
/* 67 */                while (it.hasNext()) {
/* 79 */                    Surface surface2 = (Surface) map.get((d70) it.next());
/* 81 */                    de3.m3027i(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
/* 84 */                    qq1Var.mo7986a(surface2);
                        }
                    }
/* 88 */            int i2 = Build.VERSION.SDK_INT;
/* 92 */            if (i2 >= 33) {
/* 94 */                qc3 qc3Var = this.f16247p;
/* 96 */                qc3Var.getClass();
/* 105 */               de3.m3028j("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i2 >= 33);
/* 112 */               DynamicRangeProfiles dynamicRangeProfilesMo7380a = ((pb0) qc3Var.f15492b).mo7380a();
/* 116 */               if (dynamicRangeProfilesMo7380a == null) {
/* 151 */                   jLongValue = 1;
                        } else {
/* 118 */                   mb0 mb0Var = c1926mg.f13754e;
/* 120 */                   Long lM6958a = nb0.m6958a(mb0Var, dynamicRangeProfilesMo7380a);
/* 124 */                   if (lM6958a == null) {
/* 142 */                       hu0.m4325T("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + mb0Var);
/* 151 */                       jLongValue = 1;
                            } else {
/* 146 */                       jLongValue = lM6958a.longValue();
                            }
                        }
                    } else {
/* 151 */               jLongValue = 1;
                    }
/* 153 */           qq1Var.mo7991f(jLongValue);
/* 156 */           return oq1Var;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8232e() {
                    boolean z;
                    synchronized (this.f16232a) {
/* 4 */                 int i = this.f16240i;
/* 15 */                z = i == 5 || i == 4;
                    }
/* 17 */            return z;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: f */
                public final void m8233f(ArrayList arrayList) {
                    InterfaceC2188so interfaceC2188so;
                    synchronized (this.f16232a) {
                        try {
/* 7 */                     if (this.f16240i != 5) {
/* 11 */                        hu0.m4312F0("CaptureSession");
/* 15 */                        return;
                            }
/* 23 */                    if (arrayList.isEmpty()) {
/* 26 */                        return;
                            }
                            try {
/* 30 */                        C0997hn c0997hn = new C0997hn(1);
/* 35 */                        ArrayList arrayList2 = new ArrayList();
/* 40 */                        hu0.m4312F0("CaptureSession");
/* 43 */                        Iterator it = arrayList.iterator();
/* 48 */                        boolean z = false;
/* 53 */                        while (it.hasNext()) {
/* 59 */                            C1803jr c1803jr = (C1803jr) it.next();
/* 71 */                            if (!Collections.unmodifiableList(c1803jr.f12441a).isEmpty()) {
/* 88 */                                Iterator it2 = Collections.unmodifiableList(c1803jr.f12441a).iterator();
                                        while (true) {
/* 96 */                                    if (!it2.hasNext()) {
/* 124 */                                       if (c1803jr.f12443c == 2) {
/* 126 */                                           z = true;
                                                }
/* 129 */                                       C1767ir c1767ir = new C1767ir(c1803jr);
/* 134 */                                       if (c1803jr.f12443c == 5 && (interfaceC2188so = c1803jr.f12447g) != null) {
/* 140 */                                           c1767ir.f11914i = interfaceC2188so;
                                                }
/* 142 */                                       fb2 fb2Var = this.f16237f;
/* 144 */                                       if (fb2Var != null) {
/* 150 */                                           c1767ir.m5545e(fb2Var.f8120g.f12442b);
                                                }
/* 155 */                                       c1767ir.m5545e(c1803jr.f12442b);
/* 158 */                                       C1803jr c1803jrM5546i = c1767ir.m5546i();
/* 162 */                                       gk2 gk2Var = this.f16236e;
/* 166 */                                       gk2Var.f8670g.getClass();
/* 187 */                                       CaptureRequest captureRequestM5749i = jb1.m5749i(c1803jrM5546i, ((CameraCaptureSession) ((C0210cb) gk2Var.f8670g.f8789a).f2804b).getDevice(), this.f16238g, false, this.f16248q);
/* 191 */                                       if (captureRequestM5749i != null) {
/* 202 */                                           ArrayList arrayList3 = new ArrayList();
/* 207 */                                           Iterator it3 = c1803jr.f12444d.iterator();
/* 215 */                                           while (it3.hasNext()) {
/* 223 */                                               j13.m5664z((AbstractC1934mo) it3.next(), arrayList3);
                                                    }
/* 227 */                                           c0997hn.m4246a(captureRequestM5749i, arrayList3);
/* 230 */                                           arrayList2.add(captureRequestM5749i);
                                                    break;
                                                }
/* 195 */                                       hu0.m4312F0("CaptureSession");
/* 199 */                                       return;
                                            }
/* 102 */                                   d70 d70Var = (d70) it2.next();
/* 110 */                                   if (!this.f16238g.containsKey(d70Var)) {
/* 114 */                                       Objects.toString(d70Var);
/* 117 */                                       hu0.m4312F0("CaptureSession");
                                                break;
                                            }
                                        }
                                    } else {
/* 75 */                                hu0.m4312F0("CaptureSession");
                                    }
                                }
/* 239 */                       if (arrayList2.isEmpty()) {
/* 318 */                           hu0.m4312F0("CaptureSession");
/* 352 */                           return;
                                }
/* 247 */                       if (this.f16244m.m6961c(arrayList2, z)) {
/* 249 */                           gk2 gk2Var2 = this.f16236e;
/* 255 */                           de3.m3027i(gk2Var2.f8670g, "Need to call openCaptureSession before using this API.");
/* 268 */                           ((CameraCaptureSession) ((C0210cb) gk2Var2.f8670g.f8789a).f2804b).stopRepeating();
/* 276 */                           c0997hn.f9153c = new C2043or(this);
                                }
/* 284 */                       if (this.f16245n.m6960b(arrayList2, z)) {
/* 306 */                           c0997hn.m4246a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C0150ao(this)));
                                }
/* 311 */                       this.f16236e.m3956i(arrayList2, c0997hn);
                            } catch (CameraAccessException e) {
/* 345 */                       hu0.m4325T("CaptureSession", "Unable to access camera: " + e.getMessage());
/* 348 */                       Thread.dumpStack();
                            }
                        } catch (Throwable th) {
/* 354 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m8234g(List list) {
                    synchronized (this.f16232a) {
                        try {
                            switch (AbstractC0886en.m3520y(this.f16240i)) {
                                case 0:
/* 74 */                            throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(AbstractC0886en.m3494C(this.f16240i)));
                                case 1:
                                case 2:
                                case 3:
/* 54 */                            this.f16233b.addAll(list);
                                    break;
                                case 4:
/* 28 */                            this.f16233b.addAll(list);
/* 48 */                            this.f16246o.m10432f().mo3676a(new RunnableC2166s2(this, 8), pg3.m7428g());
                                    break;
                                case 5:
                                case 6:
                                case 7:
/* 23 */                            throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                            }
                        } catch (Throwable th) {
/* 76 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m8235h(fb2 fb2Var) {
                    synchronized (this.f16232a) {
                        try {
/* 8 */                     if (fb2Var == null) {
/* 12 */                        hu0.m4312F0("CaptureSession");
/* 16 */                        return;
                            }
/* 23 */                    if (this.f16240i != 5) {
/* 27 */                        hu0.m4312F0("CaptureSession");
/* 31 */                        return;
                            }
/* 32 */                    C1803jr c1803jr = fb2Var.f8120g;
/* 44 */                    if (Collections.unmodifiableList(c1803jr.f12441a).isEmpty()) {
/* 48 */                        hu0.m4312F0("CaptureSession");
                                try {
/* 51 */                            gk2 gk2Var = this.f16236e;
/* 57 */                            de3.m3027i(gk2Var.f8670g, "Need to call openCaptureSession before using this API.");
/* 70 */                            ((CameraCaptureSession) ((C0210cb) gk2Var.f8670g.f8789a).f2804b).stopRepeating();
                                } catch (CameraAccessException e) {
/* 93 */                            hu0.m4325T("CaptureSession", "Unable to access camera: " + e.getMessage());
/* 96 */                            Thread.dumpStack();
                                }
/* 194 */                       return;
                            }
                            try {
/* 103 */                       hu0.m4312F0("CaptureSession");
/* 106 */                       gk2 gk2Var2 = this.f16236e;
/* 110 */                       gk2Var2.f8670g.getClass();
/* 132 */                       CaptureRequest captureRequestM5749i = jb1.m5749i(c1803jr, ((CameraCaptureSession) ((C0210cb) gk2Var2.f8670g.f8789a).f2804b).getDevice(), this.f16238g, true, this.f16248q);
/* 136 */                       if (captureRequestM5749i == null) {
/* 140 */                           hu0.m4312F0("CaptureSession");
/* 144 */                           return;
                                } else {
/* 164 */                           this.f16236e.m3961o(captureRequestM5749i, this.f16246o.m10430b(m8228b(c1803jr.f12444d, new CameraCaptureSession.CaptureCallback[0])));
/* 168 */                           return;
                                }
                            } catch (CameraAccessException e2) {
/* 187 */                       hu0.m4325T("CaptureSession", "Unable to access camera: " + e2.getMessage());
/* 190 */                       Thread.dumpStack();
/* 194 */                       return;
                            }
/* 196 */                   throw th;
                        } catch (Throwable th) {
/* 196 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final s81 m8236i(fb2 fb2Var, CameraDevice cameraDevice, gk2 gk2Var) {
                    s81 s81VarM3962p;
                    synchronized (this.f16232a) {
                        try {
/* 15 */                    if (AbstractC0886en.m3520y(this.f16240i) != 1) {
/* 29 */                        hu0.m4325T("CaptureSession", "Open not allowed in state: ".concat(AbstractC0886en.m3494C(this.f16240i)));
/* 49 */                        return new tw0(new IllegalStateException("open() should not allow the state: ".concat(AbstractC0886en.m3494C(this.f16240i))), 1);
                            }
/* 57 */                    this.f16240i = 3;
/* 65 */                    ArrayList arrayList = new ArrayList(fb2Var.m3702b());
/* 68 */                    this.f16239h = arrayList;
/* 70 */                    this.f16235d = gk2Var;
                            synchronized (gk2Var.f8679p) {
/* 75 */                        gk2Var.f8680q = arrayList;
/* 77 */                        s81VarM3962p = gk2Var.m3962p(arrayList);
                            }
/* 88 */                    int i = 0;
/* 96 */                    RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(yo0.m10162b(s81VarM3962p), new C2080pr(i, this, fb2Var, cameraDevice), this.f16235d.f8667d);
/* 102 */                   gr0 gr0Var = new gr0(this);
/* 114 */                   runnableC1901lsM9399I.mo3676a(new dp0(i, runnableC1901lsM9399I, gr0Var), this.f16235d.f8667d);
/* 117 */                   return w11.m9453w(runnableC1901lsM9399I);
                        } catch (Throwable th) {
/* 127 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public final s81 m8237j() {
                    synchronized (this.f16232a) {
                        try {
                            switch (AbstractC0886en.m3520y(this.f16240i)) {
                                case 0:
/* 127 */                           throw new IllegalStateException("release() should not be possible in state: ".concat(AbstractC0886en.m3494C(this.f16240i)));
                                case 2:
/* 96 */                            de3.m3027i(this.f16235d, "The Opener shouldn't null in state:".concat(AbstractC0886en.m3494C(this.f16240i)));
/* 101 */                           this.f16235d.m3963q();
                                case 1:
/* 106 */                           this.f16240i = 8;
/* 109 */                           return tw0.f17292c;
                                case 4:
                                case 5:
/* 20 */                            gk2 gk2Var = this.f16236e;
/* 22 */                            if (gk2Var != null) {
/* 24 */                                gk2Var.m3957j();
                                        break;
                                    }
                                case 3:
/* 31 */                            this.f16240i = 7;
/* 35 */                            this.f16246o.m10440w();
/* 50 */                            de3.m3027i(this.f16235d, "The Opener shouldn't null in state:".concat(AbstractC0886en.m3494C(this.f16240i)));
/* 59 */                            if (this.f16235d.m3963q()) {
/* 61 */                                m8230c();
/* 109 */                               return tw0.f17292c;
                                    }
                                case 6:
/* 67 */                            if (this.f16241j == null) {
/* 78 */                                this.f16241j = py0.m7599Y(new C2043or(this));
                                    }
/* 80 */                            return this.f16241j;
                                default:
/* 109 */                           return tw0.f17292c;
                            }
                        } catch (Throwable th) {
/* 129 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m8238k(fb2 fb2Var) {
                    synchronized (this.f16232a) {
                        try {
                            switch (AbstractC0886en.m3520y(this.f16240i)) {
                                case 0:
/* 87 */                            throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(AbstractC0886en.m3494C(this.f16240i)));
                                case 1:
                                case 2:
                                case 3:
/* 68 */                            this.f16237f = fb2Var;
                                    break;
                                case 4:
/* 26 */                            this.f16237f = fb2Var;
/* 28 */                            if (fb2Var == null) {
/* 31 */                                return;
                                    }
/* 46 */                            if (!this.f16238g.keySet().containsAll(fb2Var.m3702b())) {
/* 52 */                                hu0.m4325T("CaptureSession", "Does not have the proper configured lists");
/* 56 */                                return;
                                    } else {
/* 59 */                                hu0.m4312F0("CaptureSession");
/* 64 */                                m8235h(this.f16237f);
                                    }
                                    break;
                                case 5:
                                case 6:
                                case 7:
/* 23 */                            throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                            }
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
                }
            }
