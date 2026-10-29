            package p000;

            import android.os.Bundle;
            import java.util.Arrays;
            import java.util.Set;
            
            /* JADX INFO: renamed from: ee */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0877ee implements InterfaceC0172b9 {

                /* JADX INFO: renamed from: b */
                public static final C0877ee f7653b = new C0877ee(new Bundle());

                /* JADX INFO: renamed from: a */
                public final Bundle f7654a;

                public /* synthetic */ C0877ee(Bundle bundle) {
/* 4 */             this.f7654a = bundle;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 73 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0877ee)) {
/* 71 */                return false;
                    }
/* 11 */            Bundle bundle = ((C0877ee) obj).f7654a;
/* 13 */            Bundle bundle2 = this.f7654a;
/* 23 */            if (bundle2.size() != bundle.size()) {
/* 71 */                return false;
                    }
/* 26 */            Set<String> setKeySet = bundle2.keySet();
/* 38 */            if (!setKeySet.containsAll(bundle.keySet())) {
/* 71 */                return false;
                    }
/* 49 */            for (String str : setKeySet) {
/* 69 */                if (!de3.m3029k(bundle2.get(str), bundle.get(str))) {
/* 71 */                    return false;
                        }
                    }
/* 73 */            return true;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f7654a});
                }
            }
