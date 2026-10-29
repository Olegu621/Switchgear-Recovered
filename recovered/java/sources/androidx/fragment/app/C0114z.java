            package androidx.fragment.app;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import p000.ds0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0114z {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1529a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public final HashMap f1530b = new HashMap();

                /* JADX INFO: renamed from: c */
                public final HashMap f1531c = new HashMap();

                /* JADX INFO: renamed from: d */
                public C0112x f1532d;

                /* JADX INFO: renamed from: a */
                public final void m746a(Fragment fragment) {
/* 7 */             if (this.f1529a.contains(fragment)) {
/* 27 */                ds0.m3204u(fragment, "Fragment already added: ");
/* 30 */                return;
                    }
                    synchronized (this.f1529a) {
/* 14 */                this.f1529a.add(fragment);
                    }
/* 19 */            fragment.mAdded = true;
                }

                /* JADX INFO: renamed from: b */
                public final Fragment m747b(String str) {
/* 7 */             C0113y c0113y = (C0113y) this.f1530b.get(str);
/* 9 */             if (c0113y != null) {
/* 11 */                return c0113y.f1526c;
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final Fragment m748c(String str) {
                    Fragment fragmentFindFragmentByWho;
/* 15 */            for (C0113y c0113y : this.f1530b.values()) {
/* 23 */                if (c0113y != null && (fragmentFindFragmentByWho = c0113y.f1526c.findFragmentByWho(str)) != null) {
/* 33 */                    return fragmentFindFragmentByWho;
                        }
                    }
/* 34 */            return null;
                }

                /* JADX INFO: renamed from: d */
                public final ArrayList m749d() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (C0113y c0113y : this.f1530b.values()) {
/* 28 */                if (c0113y != null) {
/* 30 */                    arrayList.add(c0113y);
                        }
                    }
/* 34 */            return arrayList;
                }

                /* JADX INFO: renamed from: e */
                public final ArrayList m750e() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (C0113y c0113y : this.f1530b.values()) {
/* 28 */                if (c0113y != null) {
/* 32 */                    arrayList.add(c0113y.f1526c);
                        } else {
/* 37 */                    arrayList.add(null);
                        }
                    }
/* 41 */            return arrayList;
                }

                /* JADX INFO: renamed from: f */
                public final List m751f() {
                    ArrayList arrayList;
/* 7 */             if (this.f1529a.isEmpty()) {
/* 9 */                 return Collections.EMPTY_LIST;
                    }
                    synchronized (this.f1529a) {
/* 19 */                arrayList = new ArrayList(this.f1529a);
                    }
/* 23 */            return arrayList;
                }

                /* JADX INFO: renamed from: g */
                public final void m752g(C0113y c0113y) {
/* 1 */             Fragment fragment = c0113y.f1526c;
/* 3 */             String str = fragment.mWho;
/* 5 */             HashMap map = this.f1530b;
/* 11 */            if (map.get(str) != null) {
/* 13 */                return;
                    }
/* 16 */            map.put(fragment.mWho, c0113y);
/* 21 */            if (fragment.mRetainInstanceChangedWhileDetached) {
/* 23 */                boolean z = fragment.mRetainInstance;
/* 25 */                C0112x c0112x = this.f1532d;
/* 27 */                if (z) {
/* 29 */                    c0112x.m730c(fragment);
                        } else {
/* 33 */                    c0112x.m732e(fragment);
                        }
/* 37 */                fragment.mRetainInstanceChangedWhileDetached = false;
                    }
/* 44 */            if (AbstractC0111w.m674K(2)) {
/* 46 */                fragment.toString();
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m753h(C0113y c0113y) {
/* 1 */             Fragment fragment = c0113y.f1526c;
/* 5 */             if (fragment.mRetainInstance) {
/* 9 */                 this.f1532d.m732e(fragment);
                    }
/* 12 */            String str = fragment.mWho;
/* 14 */            HashMap map = this.f1530b;
/* 20 */            if (map.get(str) == c0113y && ((C0113y) map.put(fragment.mWho, null)) != null && AbstractC0111w.m674K(2)) {
/* 42 */                fragment.toString();
                    }
                }

                /* JADX INFO: renamed from: i */
                public final Bundle m754i(String str, Bundle bundle) {
/* 1 */             HashMap map = this.f1531c;
                    return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
                }
            }
