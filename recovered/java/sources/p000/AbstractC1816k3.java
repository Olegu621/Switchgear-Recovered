            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import androidx.activity.result.ActivityResult;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: k3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1816k3 {

                /* JADX INFO: renamed from: a */
                public final HashMap f12566a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final HashMap f12567b = new HashMap();

                /* JADX INFO: renamed from: c */
                public final HashMap f12568c = new HashMap();

                /* JADX INFO: renamed from: d */
                public ArrayList f12569d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final transient HashMap f12570e = new HashMap();

                /* JADX INFO: renamed from: f */
                public final HashMap f12571f = new HashMap();

                /* JADX INFO: renamed from: g */
                public final Bundle f12572g = new Bundle();

                /* JADX INFO: renamed from: a */
                public final boolean m5937a(int i, int i2, Intent intent) {
                    InterfaceC0202c3 interfaceC0202c3;
/* 11 */            String str = (String) this.f12566a.get(Integer.valueOf(i));
/* 13 */            if (str == null) {
/* 15 */                return false;
                    }
/* 23 */            C1014i3 c1014i3 = (C1014i3) this.f12570e.get(str);
/* 25 */            if (c1014i3 == null || (interfaceC0202c3 = c1014i3.f9430a) == null || !this.f12569d.contains(str)) {
/* 56 */                this.f12571f.remove(str);
/* 66 */                this.f12572g.putParcelable(str, new ActivityResult(i2, intent));
/* 69 */                return true;
                    }
/* 45 */            interfaceC0202c3.mo198c(c1014i3.f9431b.mo2915c(i2, intent));
/* 50 */            this.f12569d.remove(str);
/* 69 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public abstract void mo5938b(int i, AbstractC0830d3 abstractC0830d3, Object obj);

                /* JADX INFO: renamed from: c */
                public final C0977h3 m5939c(String str, AbstractC0830d3 abstractC0830d3, InterfaceC0202c3 interfaceC0202c3) {
/* 1 */             m5941e(str);
/* 11 */            this.f12570e.put(str, new C1014i3(abstractC0830d3, interfaceC0202c3));
/* 14 */            HashMap map = this.f12571f;
/* 20 */            if (map.containsKey(str)) {
/* 22 */                Object obj = map.get(str);
/* 26 */                map.remove(str);
/* 29 */                interfaceC0202c3.mo198c(obj);
                    }
/* 32 */            Bundle bundle = this.f12572g;
/* 38 */            ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
/* 40 */            if (activityResult != null) {
/* 42 */                bundle.remove(str);
/* 53 */                interfaceC0202c3.mo198c(abstractC0830d3.mo2915c(activityResult.f351a, activityResult.f352b));
                    }
/* 59 */            return new C0977h3(this, str, abstractC0830d3, 1);
                }

                /* JADX INFO: renamed from: d */
                public final C0977h3 m5940d(String str, g71 g71Var, AbstractC0830d3 abstractC0830d3, InterfaceC0202c3 interfaceC0202c3) {
/* 1 */             v61 lifecycle = g71Var.getLifecycle();
/* 16 */            if (((i71) lifecycle).f9483c.compareTo(u61.f17377d) >= 0) {
/* 67 */                StringBuilder sb = new StringBuilder("LifecycleOwner ");
/* 70 */                sb.append(g71Var);
/* 75 */                u61 u61Var = ((i71) lifecycle).f9483c;
/* 79 */                sb.append(" is attempting to register while current state is ");
/* 82 */                sb.append(u61Var);
/* 87 */                sb.append(". LifecycleOwners must call register before they are STARTED.");
/* 97 */                throw new IllegalStateException(sb.toString());
                    }
/* 18 */            m5941e(str);
/* 21 */            HashMap map = this.f12568c;
/* 27 */            C1779j3 c1779j3 = (C1779j3) map.get(str);
/* 29 */            if (c1779j3 == null) {
/* 33 */                c1779j3 = new C1779j3(lifecycle);
                    }
/* 38 */            C0940g3 c0940g3 = new C0940g3(this, str, interfaceC0202c3, abstractC0830d3);
/* 43 */            c1779j3.f12034a.mo4483a(c0940g3);
/* 48 */            c1779j3.f12035b.add(c0940g3);
/* 51 */            map.put(str, c1779j3);
/* 57 */            return new C0977h3(this, str, abstractC0830d3, 0);
                }

                /* JADX INFO: renamed from: e */
                public final void m5941e(String str) {
/* 1 */             HashMap map = this.f12567b;
/* 9 */             if (((Integer) map.get(str)) != null) {
/* 11 */                return;
                    }
/* 14 */            n02.f14089a.getClass();
/* 25 */            int iNextInt = n02.f14090b.mo1168d().nextInt(2147418112);
                    while (true) {
/* 31 */                int i = iNextInt + 65536;
/* 32 */                Integer numValueOf = Integer.valueOf(i);
/* 36 */                HashMap map2 = this.f12566a;
/* 42 */                if (!map2.containsKey(numValueOf)) {
/* 64 */                    map2.put(Integer.valueOf(i), str);
/* 71 */                    map.put(str, Integer.valueOf(i));
/* 74 */                    return;
                        } else {
/* 46 */                    n02.f14089a.getClass();
/* 55 */                    iNextInt = n02.f14090b.mo1168d().nextInt(2147418112);
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5942f(String str) {
                    Integer num;
/* 7 */             if (!this.f12569d.contains(str) && (num = (Integer) this.f12567b.remove(str)) != null) {
/* 21 */                this.f12566a.remove(num);
                    }
/* 26 */            this.f12570e.remove(str);
/* 29 */            HashMap map = this.f12571f;
/* 41 */            if (map.containsKey(str)) {
/* 43 */                StringBuilder sbM3513q = AbstractC0886en.m3513q("Dropping pending result for request ", str, ": ");
/* 51 */                sbM3513q.append(map.get(str));
/* 58 */                AbstractC1245n0.m4889q("ActivityResultRegistry", sbM3513q.toString());
/* 61 */                map.remove(str);
                    }
/* 64 */            Bundle bundle = this.f12572g;
/* 70 */            if (bundle.containsKey(str)) {
/* 72 */                StringBuilder sbM3513q2 = AbstractC0886en.m3513q("Dropping pending result for request ", str, ": ");
/* 80 */                sbM3513q2.append(bundle.getParcelable(str));
/* 87 */                AbstractC1245n0.m4889q("ActivityResultRegistry", sbM3513q2.toString());
/* 90 */                bundle.remove(str);
                    }
/* 93 */            HashMap map2 = this.f12568c;
/* 99 */            C1779j3 c1779j3 = (C1779j3) map2.get(str);
/* 101 */           if (c1779j3 != null) {
/* 103 */               ArrayList arrayList = c1779j3.f12035b;
/* 105 */               Iterator it = arrayList.iterator();
/* 113 */               while (it.hasNext()) {
/* 123 */                   c1779j3.f12034a.mo4484b((d71) it.next());
                        }
/* 127 */               arrayList.clear();
/* 130 */               map2.remove(str);
                    }
                }
            }
