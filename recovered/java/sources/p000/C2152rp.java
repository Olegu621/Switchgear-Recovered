            package p000;

            import android.hardware.camera2.CameraDevice;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            /* JADX INFO: renamed from: rp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class C2152rp extends CameraDevice.StateCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16214a;

                /* JADX INFO: renamed from: b */
                public final Object f16215b;

                public C2152rp(ArrayList arrayList) {
/* 2 */             this.f16214a = 0;
/* 12 */            this.f16215b = new ArrayList();
/* 14 */            Iterator it = arrayList.iterator();
/* 22 */            while (it.hasNext()) {
/* 28 */                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
/* 32 */                if (!(stateCallback instanceof C2189sp)) {
/* 38 */                    ((ArrayList) this.f16215b).add(stateCallback);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                private final void m8222c(CameraDevice cameraDevice) {
                }

                /* JADX INFO: renamed from: a */
                public void m8223a() {
                    ArrayList<gk2> arrayListM7860g;
                    synchronized (((qi1) this.f16215b).f15573b) {
/* 12 */                arrayListM7860g = ((qi1) this.f16215b).m7860g();
/* 24 */                ((LinkedHashSet) ((qi1) this.f16215b).f15576e).clear();
/* 35 */                ((LinkedHashSet) ((qi1) this.f16215b).f15574c).clear();
/* 46 */                ((LinkedHashSet) ((qi1) this.f16215b).f15575d).clear();
                    }
/* 58 */            for (gk2 gk2Var : arrayListM7860g) {
                        synchronized (gk2Var.f8664a) {
                            try {
/* 69 */                        List list = gk2Var.f8674k;
/* 71 */                        if (list != null) {
/* 73 */                            Iterator it = list.iterator();
/* 81 */                            while (it.hasNext()) {
/* 89 */                                ((d70) it.next()).m2952b();
                                    }
/* 94 */                            gk2Var.f8674k = null;
                                }
                            } catch (Throwable th) {
/* 107 */                       throw th;
                            }
                        }
/* 102 */               gk2Var.f8684u.m10440w();
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m8224b() {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
                    synchronized (((qi1) this.f16215b).f15573b) {
/* 21 */                linkedHashSet.addAll((LinkedHashSet) ((qi1) this.f16215b).f15576e);
/* 32 */                linkedHashSet.addAll((LinkedHashSet) ((qi1) this.f16215b).f15574c);
                    }
/* 51 */            ((y92) ((qi1) this.f16215b).f15572a).execute(new RunnableC2166s2(linkedHashSet, 9));
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onClosed(CameraDevice cameraDevice) {
                    switch (this.f16214a) {
                        case 0:
/* 17 */                    Iterator it = ((ArrayList) this.f16215b).iterator();
/* 25 */                    while (it.hasNext()) {
/* 33 */                        ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                            }
                            break;
                        default:
/* 6 */                     m8224b();
/* 9 */                     m8223a();
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onDisconnected(CameraDevice cameraDevice) {
                    switch (this.f16214a) {
                        case 0:
/* 17 */                    Iterator it = ((ArrayList) this.f16215b).iterator();
/* 25 */                    while (it.hasNext()) {
/* 33 */                        ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                            }
                            break;
                        default:
/* 6 */                     m8224b();
/* 9 */                     m8223a();
                            break;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onError(CameraDevice cameraDevice, int i) {
                    switch (this.f16214a) {
                        case 0:
/* 72 */                    Iterator it = ((ArrayList) this.f16215b).iterator();
/* 80 */                    while (it.hasNext()) {
/* 88 */                        ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                            }
/* 92 */                    return;
                        default:
/* 6 */                     m8224b();
/* 11 */                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                            synchronized (((qi1) this.f16215b).f15573b) {
/* 29 */                        linkedHashSet.addAll((LinkedHashSet) ((qi1) this.f16215b).f15576e);
/* 40 */                        linkedHashSet.addAll((LinkedHashSet) ((qi1) this.f16215b).f15574c);
                                break;
                            }
/* 58 */                    ((y92) ((qi1) this.f16215b).f15572a).execute(new RunnableC0923fn(linkedHashSet, i, 1));
/* 61 */                    m8223a();
/* 64 */                    return;
                    }
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public final void onOpened(CameraDevice cameraDevice) {
                    switch (this.f16214a) {
                        case 0:
/* 11 */                    Iterator it = ((ArrayList) this.f16215b).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                            }
                            break;
                    }
                }

/* 42 */        public C2152rp(qi1 qi1Var) {
                    this.f16214a = 1;
/* 43 */            this.f16215b = qi1Var;
                }
            }
