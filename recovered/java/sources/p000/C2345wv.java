            package p000;

            import android.accounts.Account;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: renamed from: wv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2345wv {

                /* JADX INFO: renamed from: a */
                public final Account f18823a;

                /* JADX INFO: renamed from: b */
                public final Set f18824b;

                /* JADX INFO: renamed from: c */
                public final Set f18825c;

                /* JADX INFO: renamed from: d */
                public final Map f18826d;

                /* JADX INFO: renamed from: e */
                public final String f18827e;

                /* JADX INFO: renamed from: f */
                public final String f18828f;

                /* JADX INFO: renamed from: g */
                public final je2 f18829g;

                /* JADX INFO: renamed from: h */
                public Integer f18830h;

                public C2345wv(Account account, Set set, C1024id c1024id, String str, String str2, je2 je2Var) {
/* 4 */             this.f18823a = account;
/* 11 */            Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
/* 15 */            this.f18824b = setUnmodifiableSet;
/* 19 */            Map map = c1024id == null ? Collections.EMPTY_MAP : c1024id;
/* 21 */            this.f18826d = map;
/* 23 */            this.f18827e = str;
/* 25 */            this.f18828f = str2;
/* 31 */            this.f18829g = je2Var == null ? je2.f12239a : je2Var;
/* 35 */            HashSet hashSet = new HashSet(setUnmodifiableSet);
/* 42 */            Iterator it = map.values().iterator();
/* 50 */            if (it.hasNext()) {
/* 63 */                throw fm0.m3780f(it);
                    }
/* 56 */            this.f18825c = Collections.unmodifiableSet(hashSet);
                }
            }
