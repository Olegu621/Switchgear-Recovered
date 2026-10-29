            package p000;

            import android.adservices.measurement.MeasurementManager;
            import android.net.Uri;
            import android.view.InputEvent;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class rd1 {

                /* JADX INFO: renamed from: a */
                public final MeasurementManager f15997a;

                public rd1(MeasurementManager measurementManager) {
/* 1 */             measurementManager.getClass();
/* 7 */             this.f15997a = measurementManager;
                }

                /* JADX INFO: renamed from: b */
                public static Object m8135b(rd1 rd1Var, p70 p70Var, c10 c10Var) {
/* 11 */            new C0890er(1, mz0.m6834b(c10Var)).m3571u();
/* 14 */            MeasurementManager measurementManager = rd1Var.f15997a;
/* 17 */            throw null;
                }

                /* JADX INFO: renamed from: d */
                public static Object m8136d(rd1 rd1Var, c10 c10Var) {
/* 8 */             C0890er c0890er = new C0890er(1, mz0.m6834b(c10Var));
/* 11 */            c0890er.m3571u();
/* 1 */             rd1Var.f15997a.getMeasurementApiStatus(new qd1(), new f10(c0890er));
/* 29 */            Object objM3569s = c0890er.m3569s();
/* 33 */            z10 z10Var = z10.f19902a;
/* 35 */            return objM3569s;
                }

                /* JADX INFO: renamed from: g */
                public static Object m8137g(rd1 rd1Var, sf2 sf2Var, c10 c10Var) throws Throwable {
/* 8 */             Object objM5966c = k50.m5966c(new C2107qh(rd1Var, null, 5), c10Var);
                    return objM5966c == z10.f19902a ? objM5966c : Unit.f12910a;
                }

                /* JADX INFO: renamed from: h */
                public static Object m8138h(rd1 rd1Var, Uri uri, InputEvent inputEvent, c10 c10Var) {
/* 8 */             C0890er c0890er = new C0890er(1, mz0.m6834b(c10Var));
/* 11 */            c0890er.m3571u();
/* 1 */             rd1Var.f15997a.registerSource(uri, inputEvent, new qd1(), new f10(c0890er));
/* 29 */            Object objM3569s = c0890er.m3569s();
                    return objM3569s == z10.f19902a ? objM3569s : Unit.f12910a;
                }

                /* JADX INFO: renamed from: j */
                public static Object m8139j(rd1 rd1Var, Uri uri, c10 c10Var) {
/* 8 */             C0890er c0890er = new C0890er(1, mz0.m6834b(c10Var));
/* 11 */            c0890er.m3571u();
/* 1 */             rd1Var.f15997a.registerTrigger(uri, new qd1(), new f10(c0890er));
/* 29 */            Object objM3569s = c0890er.m3569s();
                    return objM3569s == z10.f19902a ? objM3569s : Unit.f12910a;
                }

                /* JADX INFO: renamed from: l */
                public static Object m8140l(rd1 rd1Var, q63 q63Var, c10 c10Var) {
/* 11 */            new C0890er(1, mz0.m6834b(c10Var)).m3571u();
/* 14 */            MeasurementManager measurementManager = rd1Var.f15997a;
/* 17 */            throw null;
                }

                /* JADX INFO: renamed from: n */
                public static Object m8141n(rd1 rd1Var, r63 r63Var, c10 c10Var) {
/* 11 */            new C0890er(1, mz0.m6834b(c10Var)).m3571u();
/* 14 */            MeasurementManager measurementManager = rd1Var.f15997a;
/* 17 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public Object m8142a(p70 p70Var, c10 c10Var) {
/* 1 */             return m8135b(this, p70Var, c10Var);
                }

                /* JADX INFO: renamed from: c */
                public Object m8143c(c10 c10Var) {
/* 1 */             return m8136d(this, c10Var);
                }

                /* JADX INFO: renamed from: e */
                public Object m8144e(sf2 sf2Var, c10 c10Var) {
/* 1 */             return m8137g(this, sf2Var, c10Var);
                }

                /* JADX INFO: renamed from: f */
                public Object m8145f(Uri uri, InputEvent inputEvent, c10 c10Var) {
/* 1 */             return m8138h(this, uri, inputEvent, c10Var);
                }

                /* JADX INFO: renamed from: i */
                public Object m8146i(Uri uri, c10 c10Var) {
/* 1 */             return m8139j(this, uri, c10Var);
                }

                /* JADX INFO: renamed from: k */
                public Object m8147k(q63 q63Var, c10 c10Var) {
/* 1 */             return m8140l(this, q63Var, c10Var);
                }

                /* JADX INFO: renamed from: m */
                public Object m8148m(r63 r63Var, c10 c10Var) {
/* 1 */             return m8141n(this, r63Var, c10Var);
                }
            }
