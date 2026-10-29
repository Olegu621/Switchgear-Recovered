            package p000;

            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.CameraDevice;
            import android.os.Handler;
            import android.util.ArrayMap;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.LinkedHashSet;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: qn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C2113qn extends CameraDevice.StateCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15664a = 1;

                /* JADX INFO: renamed from: b */
                public final Object f15665b;

                /* JADX INFO: renamed from: c */
                public final Object f15666c;

                public C2113qn(Executor executor, CameraDevice.StateCallback stateCallback) {
/* 7 */             this.f15666c = executor;
/* 9 */             this.f15665b = stateCallback;
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onClosed(CameraDevice cameraDevice) {
/* 1 */             int i = this.f15664a;
/* 3 */             Object obj = this.f15666c;
                    switch (i) {
                        case 0:
/* 24 */                    ((C2467xn) obj).m10000s("openCameraConfigAndClose camera closed");
/* 32 */                    ((C2260um) this.f15665b).m9040a(null);
                            break;
                        default:
/* 16 */                    ((Executor) obj).execute(new RunnableC2041op(this, cameraDevice, 0));
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onDisconnected(CameraDevice cameraDevice) {
/* 1 */             int i = this.f15664a;
/* 3 */             Object obj = this.f15666c;
                    switch (i) {
                        case 0:
/* 24 */                    ((C2467xn) obj).m10000s("openCameraConfigAndClose camera disconnected");
/* 32 */                    ((C2260um) this.f15665b).m9040a(null);
                            break;
                        default:
/* 16 */                    ((Executor) obj).execute(new RunnableC2041op(this, cameraDevice, 1));
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onError(CameraDevice cameraDevice, int i) {
/* 1 */             int i2 = this.f15664a;
/* 3 */             Object obj = this.f15666c;
                    switch (i2) {
                        case 0:
/* 36 */                    ((C2467xn) obj).m10000s("openCameraConfigAndClose camera error " + i);
/* 44 */                    ((C2260um) this.f15665b).m9040a(null);
                            break;
                        default:
/* 16 */                    ((Executor) obj).execute(new RunnableC2524z6(this, cameraDevice, i, 4));
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onOpened(CameraDevice cameraDevice) {
/* 5 */             int i = this.f15664a;
/* 7 */             Object obj = this.f15666c;
                    switch (i) {
                        case 0:
/* 24 */                    C2467xn c2467xn = (C2467xn) obj;
/* 26 */                    y92 y92Var = c2467xn.f19263c;
/* 30 */                    c2467xn.m10000s("openCameraConfigAndClose camera opened");
/* 44 */                    C2154rr c2154rr = new C2154rr(c2467xn.f19281p0, new er0(Collections.EMPTY_LIST));
/* 50 */                    SurfaceTexture surfaceTexture = new SurfaceTexture(0);
/* 57 */                    surfaceTexture.setDefaultBufferSize(640, 480);
/* 62 */                    Surface surface = new Surface(surfaceTexture);
/* 67 */                    uw0 uw0Var = new uw0(surface);
/* 86 */                    w11.m9453w(uw0Var.f7030e).mo3676a(new RunnableC1784j8(6, surface, surfaceTexture), pg3.m7428g());
/* 91 */                    LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 96 */                    HashSet hashSet = new HashSet();
/* 99 */                    uk1 uk1VarM9034j = uk1.m9034j();
/* 105 */                   ArrayList arrayList = new ArrayList();
/* 108 */                   cl1 cl1VarM1721a = cl1.m1721a();
/* 114 */                   ArrayList arrayList2 = new ArrayList();
/* 119 */                   ArrayList arrayList3 = new ArrayList();
/* 124 */                   ArrayList arrayList4 = new ArrayList();
/* 127 */                   C0168b5 c0168b5M6646a = C1926mg.m6646a(uw0Var);
/* 133 */                   c0168b5M6646a.f2215f = mb0.f13671d;
/* 139 */                   linkedHashSet.add(c0168b5M6646a.m1265j());
/* 144 */                   c2467xn.m10000s("Start configAndClose.");
/* 151 */                   ArrayList arrayList5 = new ArrayList(linkedHashSet);
/* 156 */                   ArrayList arrayList6 = new ArrayList(arrayList2);
/* 161 */                   ArrayList arrayList7 = new ArrayList(arrayList3);
/* 166 */                   ArrayList arrayList8 = new ArrayList(arrayList4);
/* 173 */                   ArrayList arrayList9 = new ArrayList(hashSet);
/* 176 */                   nq1 nq1VarM7021d = nq1.m7021d(uk1VarM9034j);
/* 182 */                   ArrayList arrayList10 = new ArrayList(arrayList);
/* 185 */                   nm2 nm2Var = nm2.f14382b;
/* 189 */                   ArrayMap arrayMap = new ArrayMap();
/* 192 */                   ArrayMap arrayMap2 = cl1VarM1721a.f14383a;
/* 206 */                   for (String str : arrayMap2.keySet()) {
/* 222 */                       arrayMap.put(str, arrayMap2.get(str));
/* 225 */                       arrayList6 = arrayList6;
                            }
/* 265 */                   fb2 fb2Var = new fb2(arrayList5, arrayList6, arrayList7, arrayList8, new C1803jr(arrayList9, nq1VarM7021d, 1, arrayList10, false, new nm2(arrayMap), null), null, null, null);
/* 268 */                   xy1 xy1Var = c2467xn.f19275j0;
/* 328 */                   RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(yo0.m10162b(py0.m7599Y(new ap0(c2154rr.m8236i(fb2Var, cameraDevice, new gk2((er0) xy1Var.f19398f, (er0) xy1Var.f19394b, (qi1) xy1Var.f19397e, (y92) xy1Var.f19393a, (nt0) xy1Var.f19395c, (Handler) xy1Var.f19396d)), 0))), new C2076pn(0, c2154rr, uw0Var), y92Var);
/* 332 */                   Objects.requireNonNull(cameraDevice);
/* 341 */                   runnableC1901lsM9399I.mo3676a(new RunnableC2166s2(cameraDevice, 3), y92Var);
                            break;
                        default:
/* 20 */                    ((Executor) obj).execute(new RunnableC2041op(this, cameraDevice, 2));
                            break;
                    }
                }

/* 11 */        public C2113qn(C2467xn c2467xn, C2260um c2260um) {
/* 12 */            this.f15666c = c2467xn;
                    this.f15665b = c2260um;
                }
            }
