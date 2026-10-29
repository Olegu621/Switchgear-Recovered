            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Looper;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class kr0 extends AbstractC0322a implements InterfaceC0836d9 {
                private static volatile Executor zaa;
                private final C2345wv zab;
                private final Set zac;
                private final Account zad;

                /* JADX WARN: Illegal instructions before constructor call */
                public kr0(Context context, Looper looper, int i, C2345wv c2345wv, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 1 */             dq3 dq3VarM6523a = lr0.m6523a(context);
/* 5 */             pr0 pr0Var = pr0.f15259d;
/* 7 */             kb1.m6061n(interfaceC2478xy);
/* 10 */            kb1.m6061n(wp1Var);
/* 32 */            super(context, looper, dq3VarM6523a, pr0Var, i, new ac3(interfaceC2478xy, 0), new er0(wp1Var, 27), c2345wv.f18828f);
/* 35 */            this.zab = c2345wv;
/* 39 */            this.zad = c2345wv.f18823a;
/* 41 */            Set<Scope> set = c2345wv.f18825c;
/* 43 */            Set<Scope> setValidateScopes = validateScopes(set);
/* 47 */            Iterator<Scope> it = setValidateScopes.iterator();
/* 55 */            while (it.hasNext()) {
/* 67 */                if (!set.contains(it.next())) {
/* 72 */                    f42.m3656l("Expanding scopes is not permitted, use implied scopes instead");
/* 76 */                    throw null;
                        }
                    }
/* 77 */            this.zac = setValidateScopes;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Account getAccount() {
/* 1 */             return this.zad;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public Executor getBindServiceExecutor() {
/* 1 */             return null;
                }

                public final C2345wv getClientSettings() {
/* 1 */             return this.zab;
                }

                public Feature[] getRequiredFeatures() {
/* 2 */             return new Feature[0];
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Set<Scope> getScopes() {
/* 1 */             return this.zac;
                }

                @Override // p000.InterfaceC0836d9
                public Set<Scope> getScopesForConnectionlessNonSignIn() {
                    return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
                }

                public Set<Scope> validateScopes(Set<Scope> set) {
/* 1 */             return set;
                }
            }
