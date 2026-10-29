            package p000;

            import android.content.Context;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import io.sentry.android.core.AbstractC1245n0;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public abstract class sq3 implements jk3 {

                /* JADX INFO: renamed from: a */
                public Object f16749a;

                public sq3(int i) {
                    switch (i) {
                        case 6:
/* 23 */                    this.f16749a = new ConcurrentHashMap();
                            break;
                        default:
/* 12 */                    this.f16749a = new ArrayList();
                            break;
                    }
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: a */
                public uh3 mo4557a() {
/* 2 */             throw null;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: b */
                public bj3 mo4558b() {
/* 2 */             throw null;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: c */
                public q62 mo4559c() {
/* 2 */             throw null;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: e */
                public Context mo4561e() {
/* 2 */             throw null;
                }

                @Override // p000.jk3
                /* JADX INFO: renamed from: f */
                public InterfaceC2475xv mo4562f() {
/* 2 */             throw null;
                }

                /* JADX INFO: renamed from: g */
                public abstract void mo5529g(ra2 ra2Var);

                /* JADX INFO: renamed from: h */
                public abstract AbstractC2313w mo7325h(AbstractC2313w abstractC2313w);

                /* JADX INFO: renamed from: i */
                public abstract String mo5530i();

                /* JADX INFO: renamed from: j */
                public Map mo7326j() {
/* 1 */             return Collections.EMPTY_MAP;
                }

                /* JADX INFO: renamed from: k */
                public abstract AbstractC2313w mo7327k(AbstractC2298vl abstractC2298vl);

                /* JADX INFO: renamed from: l */
                public kv1 m8626l(i61 i61Var) {
                    String str;
/* 1 */             List<j61> list = i61Var.f9465a;
/* 11 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 22 */            for (j61 j61Var : list) {
/* 32 */                boolean z = j61Var.f12096b;
/* 36 */                UsercentricsSettings usercentricsSettings = (UsercentricsSettings) this.f16749a;
/* 38 */                mz2 mz2Var = j61Var.f12097c;
/* 40 */                if (z && mz2Var == mz2.f14077b) {
/* 48 */                    str = usercentricsSettings.f6701a.f6567K0;
                        } else if (z || mz2Var != mz2.f14077b) {
/* 75 */                    str = (z || mz2Var != mz2.f14076a) ? usercentricsSettings.f6701a.f6603f0 : usercentricsSettings.f6701a.f6586U;
                        } else {
/* 59 */                    str = usercentricsSettings.f6701a.f6565J0;
                        }
/* 81 */                h50 h50Var = new h50(j61Var.f12099e);
/* 86 */                h50.Companion.getClass();
/* 103 */               String str2 = ((SimpleDateFormat) h50.f8897d.getValue()).format(h50Var.f8899b.getTime());
/* 107 */               str2.getClass();
/* 113 */               arrayList.add(new vu1(str, str2, z));
                    }
/* 121 */           return new kv1(arrayList, i61Var.f9466b);
                }

                /* JADX INFO: renamed from: m */
                public abstract void mo7328m(AbstractC2313w abstractC2313w);

                /* JADX INFO: renamed from: n */
                public abstract Object mo6976n();

                /* JADX INFO: renamed from: o */
                public abstract void mo7995o(Object obj, long j, byte b);

                /* JADX INFO: renamed from: p */
                public Object m8627p(jh3 jh3Var, kb1 kb1Var) {
/* 3 */             ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f16749a;
/* 5 */             Object obj = concurrentHashMap.get(jh3Var);
/* 9 */             if (obj != null) {
/* 11 */                return obj;
                    }
/* 12 */            Object objMo6976n = mo6976n();
/* 16 */            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(jh3Var, objMo6976n);
/* 20 */            if (objPutIfAbsent != null) {
/* 48 */                return objPutIfAbsent;
                    }
/* 22 */            int iMo3438X = kb1Var.mo3438X();
/* 27 */            for (int i = 0; i < iMo3438X; i++) {
/* 39 */                if (dh3.f7214e.equals(kb1Var.mo3439Y(i))) {
/* 41 */                    kb1Var.mo3440Z(i);
                        }
                    }
/* 47 */            return objMo6976n;
                }

                /* JADX INFO: renamed from: q */
                public abstract boolean mo7996q(Object obj, long j);

                /* JADX INFO: renamed from: r */
                public abstract boolean mo8628r(Level level);

                /* JADX INFO: renamed from: s */
                public abstract void mo7997s(Object obj, long j, boolean z);

                /* JADX INFO: renamed from: t */
                public abstract void mo8629t(sg3 sg3Var);

                /* JADX INFO: renamed from: u */
                public abstract float mo7998u(Object obj, long j);

                /* JADX INFO: renamed from: v */
                public void mo8630v(RuntimeException runtimeException, sg3 sg3Var) {
/* 5 */             AbstractC1245n0.m4877e("AbstractAndroidBackend", "Internal logging error", runtimeException);
                }

                /* JADX INFO: renamed from: w */
                public abstract void mo7999w(Object obj, long j, float f);

                /* JADX INFO: renamed from: x */
                public abstract double mo8000x(Object obj, long j);

                /* JADX INFO: renamed from: y */
                public void mo1375y() {
/* 5 */             bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 7 */             ij3.m4555l(bj3Var);
/* 10 */            bj3Var.mo1375y();
                }

                /* JADX INFO: renamed from: z */
                public abstract void mo8001z(Object obj, long j, double d);

/* 26 */        public sq3(ij3 ij3Var) {
                    kb1.m6061n(ij3Var);
                    this.f16749a = ij3Var;
                }

/* 27 */        public /* synthetic */ sq3(Object obj) {
/* 28 */            this.f16749a = obj;
                }

/* 28 */        public sq3(UsercentricsSettings usercentricsSettings) {
                    usercentricsSettings.getClass();
/* 30 */            this.f16749a = usercentricsSettings;
                }

/* 30 */        public sq3(qa2 qa2Var) {
                    qa2Var.getClass();
                    this.f16749a = qa2Var;
                }
            }
