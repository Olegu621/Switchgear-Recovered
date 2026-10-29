            package p000;

            import android.hardware.camera2.CaptureRequest;
            import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
            import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
            import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 61 */    public final class nb2 {

                /* JADX INFO: renamed from: a */
                public final boolean f14177a;

                public nb2(int i) {
                    switch (i) {
                        case 2:
/* 60 */                    this.f14177a = e80.f7571a.m3582h(SurfaceOrderQuirk.class) != null;
                            break;
                        case 3:
/* 41 */                    this.f14177a = f80.f8038a.m3582h(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                            break;
                        default:
/* 22 */                    this.f14177a = ((StillCaptureFlashStopRepeatingQuirk) f80.f8038a.m3582h(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                            break;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static C1803jr m6959a(C1803jr c1803jr) {
/* 3 */             C1767ir c1767ir = new C1767ir();
/* 8 */             c1767ir.f11908a = c1803jr.f12443c;
/* 16 */            Iterator it = Collections.unmodifiableList(c1803jr.f12441a).iterator();
/* 24 */            while (it.hasNext()) {
/* 36 */                ((HashSet) c1767ir.f11910c).add((d70) it.next());
                    }
/* 42 */            c1767ir.m5545e(c1803jr.f12442b);
/* 45 */            uk1 uk1VarM9034j = uk1.m9034j();
/* 60 */            uk1VarM9034j.m9037p(C0998ho.m4249L(CaptureRequest.FLASH_MODE), 0);
/* 72 */            c1767ir.m5545e(new C0998ho(nq1.m7021d(uk1VarM9034j)));
/* 75 */            return c1767ir.m5546i();
                }

                /* JADX INFO: renamed from: b */
                public boolean m6960b(ArrayList arrayList, boolean z) {
/* 3 */             if (!this.f14177a || !z) {
/* 42 */                return false;
                    }
/* 7 */             Iterator it = arrayList.iterator();
/* 15 */            while (it.hasNext()) {
/* 29 */                Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
/* 31 */                if (num != null && num.intValue() == 2) {
/* 40 */                    return true;
                        }
                    }
/* 42 */            return false;
                }

                /* JADX INFO: renamed from: c */
                public boolean m6961c(ArrayList arrayList, boolean z) {
/* 3 */             if (!this.f14177a || !z) {
/* 44 */                return false;
                    }
/* 8 */             Iterator it = arrayList.iterator();
/* 16 */            while (it.hasNext()) {
/* 32 */                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
/* 37 */                if (iIntValue == 2 || iIntValue == 3) {
/* 42 */                    return true;
                        }
                    }
/* 44 */            return false;
                }

/* 62 */        public nb2(er0 er0Var) {
/* 64 */            this.f14177a = er0Var.m3579d(Preview3AThreadCrashQuirk.class);
                }
            }
