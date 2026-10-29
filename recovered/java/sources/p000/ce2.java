            package p000;

            import android.graphics.Rect;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarDisplayFeature;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ce2 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f2863b = 0;

                /* JADX INFO: renamed from: a */
                public final int f2864a = 3;

                /* JADX INFO: renamed from: a */
                public static boolean m1641a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
/* 5 */             if (Intrinsics.m6216a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
/* 7 */                 return true;
                    }
/* 9 */             if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
/* 25 */                return false;
                    }
/* 35 */            return Intrinsics.m6216a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
                }

                /* JADX INFO: renamed from: b */
                public static boolean m1642b(List list, List list2) {
/* 1 */             if (list == list2) {
/* 51 */                return true;
                    }
/* 5 */             if (list != null && list2 != null && list.size() == list2.size()) {
/* 22 */                int size = list.size();
/* 27 */                for (int i = 0; i < size; i++) {
/* 45 */                    if (m1641a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                            }
                        }
/* 51 */                return true;
                    }
/* 4 */             return false;
                }

                /* JADX INFO: renamed from: c */
                public final q83 m1643c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
/* 1 */             sidecarDeviceState.getClass();
/* 4 */             if (sidecarWindowLayoutInfo == null) {
/* 10 */                return new q83(nd0.f14189a);
                    }
/* 16 */            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
/* 23 */            xd2.m9754d(sidecarDeviceState2, xd2.m9752b(sidecarDeviceState));
/* 36 */            return new q83(m1644d(xd2.m9753c(sidecarWindowLayoutInfo), sidecarDeviceState2));
                }

                /* JADX INFO: renamed from: d */
                public final ArrayList m1644d(List list, SidecarDeviceState sidecarDeviceState) {
/* 1 */             list.getClass();
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             Iterator it = list.iterator();
/* 17 */            while (it.hasNext()) {
/* 25 */                ot0 ot0VarM1645e = m1645e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
/* 29 */                if (ot0VarM1645e != null) {
/* 31 */                    arrayList.add(ot0VarM1645e);
                        }
                    }
/* 35 */            return arrayList;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
                
                    if (r6 == 4) goto L25;
                 */
                /* JADX INFO: renamed from: e */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final ot0 m1645e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
                    C0204c5 c0204c5;
/* 1 */             C2131r4 c2131r4 = C2131r4.f15857l;
/* 3 */             sidecarDisplayFeature.getClass();
/* 6 */             dc0 dc0Var = dc0.f7100b;
/* 9 */             int i = this.f2864a;
/* 11 */            if (i == 0) {
/* 113 */               throw null;
                    }
/* 54 */            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new ug0(sidecarDisplayFeature, i, dc0Var).mo7446v("Type must be either TYPE_FOLD or TYPE_HINGE", yd2.f19581a).mo7446v("Feature bounds must not be 0", zd2.f20106a).mo7446v("TYPE_FOLD must have 0 area", ae2.f203a).mo7446v("Feature be pinned to either left or top", be2.f2391a).mo7445b();
/* 56 */            if (sidecarDisplayFeature2 != null) {
/* 59 */                int type = sidecarDisplayFeature2.getType();
/* 65 */                if (type == 1) {
/* 73 */                    c0204c5 = C0204c5.f2714p;
                        } else if (type == 2) {
/* 70 */                    c0204c5 = C0204c5.f2715q;
                        }
/* 75 */                int iM9752b = xd2.m9752b(sidecarDeviceState);
/* 79 */                if (iM9752b != 0 && iM9752b != 1) {
/* 83 */                    if (iM9752b == 2) {
/* 92 */                        c2131r4 = C2131r4.f15858m;
                            } else if (iM9752b != 3) {
                            }
/* 98 */                    Rect rect = sidecarDisplayFeature.getRect();
/* 102 */                   rect.getClass();
/* 108 */                   return new ot0(new C2334wk(rect), c0204c5, c2131r4);
                        }
                    }
/* 8 */             return null;
                }
            }
