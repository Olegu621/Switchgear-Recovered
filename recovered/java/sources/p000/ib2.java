            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ib2 implements jb2 {

                /* JADX INFO: renamed from: a */
                public final List f9529a;

                /* JADX INFO: renamed from: b */
                public final C0851dp f9530b;

                /* JADX INFO: renamed from: c */
                public final y92 f9531c;

                /* JADX INFO: renamed from: d */
                public by0 f9532d = null;

                public ib2(ArrayList arrayList, y92 y92Var, C0851dp c0851dp) {
/* 16 */            this.f9529a = Collections.unmodifiableList(new ArrayList(arrayList));
/* 18 */            this.f9530b = c0851dp;
/* 20 */            this.f9531c = y92Var;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: a */
                public final Object mo4150a() {
/* 1 */             return null;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: b */
                public final by0 mo4151b() {
/* 1 */             return this.f9532d;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: c */
                public final Executor mo4152c() {
/* 1 */             return this.f9531c;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: d */
                public final int mo4153d() {
/* 1 */             return 0;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: e */
                public final CameraCaptureSession.StateCallback mo4154e() {
/* 1 */             return this.f9530b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 63 */                return true;
                    }
/* 7 */             if (obj instanceof ib2) {
/* 9 */                 ib2 ib2Var = (ib2) obj;
/* 11 */                List list = ib2Var.f9529a;
/* 21 */                if (Objects.equals(this.f9532d, ib2Var.f9532d)) {
/* 23 */                    List list2 = this.f9529a;
/* 33 */                    if (list2.size() == list.size()) {
/* 41 */                        for (int i = 0; i < list2.size(); i++) {
/* 57 */                            if (((oq1) list2.get(i)).equals(list.get(i))) {
                                    }
                                }
/* 63 */                        return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: f */
                public final List mo4155f() {
/* 1 */             return this.f9529a;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: g */
                public final void mo4156g(CaptureRequest captureRequest) {
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: h */
                public final void mo4157h(by0 by0Var) {
/* 1 */             this.f9532d = by0Var;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f9529a.hashCode() ^ 31;
/* 12 */            int i = (iHashCode << 5) - iHashCode;
/* 13 */            by0 by0Var = this.f9532d;
/* 27 */            int iHashCode2 = (by0Var == null ? 0 : by0Var.f2634a.f20364a.hashCode()) ^ i;
/* 30 */            return (iHashCode2 << 5) - iHashCode2;
                }
            }
