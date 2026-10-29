            package p000;

            import android.os.Bundle;
            import androidx.activity.result.ActivityResult;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: g3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0940g3 implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f8447a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC0202c3 f8448b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC0830d3 f8449c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC1816k3 f8450d;

                public C0940g3(AbstractC1816k3 abstractC1816k3, String str, InterfaceC0202c3 interfaceC0202c3, AbstractC0830d3 abstractC0830d3) {
/* 4 */             this.f8450d = abstractC1816k3;
/* 6 */             this.f8447a = str;
/* 8 */             this.f8448b = interfaceC0202c3;
/* 10 */            this.f8449c = abstractC0830d3;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 3 */             boolean zEquals = t61.ON_START.equals(t61Var);
/* 7 */             String str = this.f8447a;
/* 9 */             AbstractC1816k3 abstractC1816k3 = this.f8450d;
/* 11 */            if (!zEquals) {
/* 76 */                if (t61.ON_STOP.equals(t61Var)) {
/* 80 */                    abstractC1816k3.f12570e.remove(str);
/* 83 */                    return;
                        } else {
/* 90 */                    if (t61.ON_DESTROY.equals(t61Var)) {
/* 92 */                        abstractC1816k3.m5942f(str);
/* 95 */                        return;
                            }
/* 95 */                    return;
                        }
                    }
/* 13 */            HashMap map = abstractC1816k3.f12570e;
/* 15 */            Bundle bundle = abstractC1816k3.f12572g;
/* 17 */            HashMap map2 = abstractC1816k3.f12571f;
/* 21 */            AbstractC0830d3 abstractC0830d3 = this.f8449c;
/* 23 */            InterfaceC0202c3 interfaceC0202c3 = this.f8448b;
/* 28 */            map.put(str, new C1014i3(abstractC0830d3, interfaceC0202c3));
/* 35 */            if (map2.containsKey(str)) {
/* 37 */                Object obj = map2.get(str);
/* 41 */                map2.remove(str);
/* 44 */                interfaceC0202c3.mo198c(obj);
                    }
/* 51 */            ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
/* 53 */            if (activityResult != null) {
/* 55 */                bundle.remove(str);
/* 66 */                interfaceC0202c3.mo198c(abstractC0830d3.mo2915c(activityResult.f351a, activityResult.f352b));
                    }
                }
            }
