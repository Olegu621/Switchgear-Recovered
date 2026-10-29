            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.util.ArrayMap;
            import java.util.ArrayList;
            import java.util.HashSet;
            
            /* JADX INFO: renamed from: co */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0223co {

                /* JADX INFO: renamed from: a */
                public static final C0223co f3021a = new C0223co();

                /* JADX INFO: renamed from: a */
                public void mo1448a(zy2 zy2Var, C1767ir c1767ir) {
/* 8 */             C1803jr c1803jr = (C1803jr) zy2Var.mo7023b(zy2.f20385H, null);
/* 10 */            nq1 nq1Var = nq1.f14410c;
/* 12 */            C1888lf c1888lf = C1803jr.f12438h;
/* 16 */            HashSet hashSet = new HashSet();
/* 19 */            uk1 uk1VarM9034j = uk1.m9034j();
/* 25 */            ArrayList arrayList = new ArrayList();
/* 28 */            cl1 cl1VarM1721a = cl1.m1721a();
/* 36 */            ArrayList arrayList2 = new ArrayList(hashSet);
/* 39 */            nq1 nq1VarM7021d = nq1.m7021d(uk1VarM9034j);
/* 45 */            ArrayList arrayList3 = new ArrayList(arrayList);
/* 48 */            nm2 nm2Var = nm2.f14382b;
/* 52 */            ArrayMap arrayMap = new ArrayMap();
/* 55 */            ArrayMap arrayMap2 = cl1VarM1721a.f14383a;
/* 69 */            for (String str : arrayMap2.keySet()) {
/* 81 */                arrayMap.put(str, arrayMap2.get(str));
                    }
/* 90 */            int i = -1;
/* 93 */            new C1803jr(arrayList2, nq1VarM7021d, -1, arrayList3, false, new nm2(arrayMap), null);
/* 96 */            if (c1803jr != null) {
/* 98 */                i = c1803jr.f12443c;
/* 102 */               c1767ir.m5543b(c1803jr.f12444d);
/* 105 */               nq1Var = c1803jr.f12442b;
                    }
/* 111 */           c1767ir.f11911d = uk1.m9035m(nq1Var);
/* 131 */           c1767ir.f11908a = ((Integer) zy2Var.mo7023b(C0998ho.f9165i, Integer.valueOf(i))).intValue();
/* 151 */           c1767ir.m5544c(new C1001hr((CameraCaptureSession.CaptureCallback) zy2Var.mo7023b(C0998ho.f9163V, new C0187bo())));
/* 169 */           c1767ir.m5545e(new d52(nq1.m7021d(C1974nr.m7034b(zy2Var).f14413b)));
                }
            }
