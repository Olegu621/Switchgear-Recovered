            package p000;

            import android.accounts.Account;
            import android.app.Activity;
            import android.content.Context;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import com.google.android.gms.common.api.internal.zact;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.internal.base.zau;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
            import java.util.Collection;
            import java.util.Collections;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public abstract class or0 {
                protected final ur0 zaa;
                private final Context zab;
                private final String zac;
                private final C0983h9 zad;
                private final InterfaceC0172b9 zae;
                private final C2323w9 zaf;
                private final Looper zag;
                private final int zah;
                private final tr0 zai;
                private final yg2 zaj;

                public or0(Context context, Activity activity, C0983h9 c0983h9, InterfaceC0172b9 interfaceC0172b9, nr0 nr0Var) {
/* 6 */             kb1.m6062o(context, "Null context is not permitted.");
/* 11 */            kb1.m6062o(c0983h9, "Api must not be null.");
/* 16 */            kb1.m6062o(nr0Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
/* 19 */            Context applicationContext = context.getApplicationContext();
/* 25 */            kb1.m6062o(applicationContext, "The provided context did not have an application context.");
/* 28 */            this.zab = applicationContext;
/* 41 */            String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
/* 45 */            this.zac = attributionTag;
/* 47 */            this.zad = c0983h9;
/* 49 */            this.zae = interfaceC0172b9;
/* 53 */            this.zag = nr0Var.f14416b;
/* 57 */            C2323w9 c2323w9 = new C2323w9(c0983h9, interfaceC0172b9, attributionTag);
/* 60 */            this.zaf = c2323w9;
/* 67 */            this.zai = new eb3(this);
/* 69 */            ur0 ur0VarM9125h = ur0.m9125h(applicationContext);
/* 73 */            this.zaa = ur0VarM9125h;
/* 81 */            this.zah = ur0VarM9125h.f17689h.getAndIncrement();
/* 85 */            this.zaj = nr0Var.f14415a;
/* 87 */            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
/* 103 */               e71 fragment = x61.getFragment(activity);
/* 115 */               ya3 ya3Var = (ya3) fragment.mo3337c(ya3.class, "ConnectionlessLifecycleHelper");
/* 117 */               if (ya3Var == null) {
/* 121 */                   Object obj = pr0.f15258c;
/* 123 */                   ya3Var = new ya3(fragment, ur0VarM9125h);
                        }
/* 128 */               ya3Var.f19560e.add(c2323w9);
/* 131 */               ur0VarM9125h.m9126b(ya3Var);
                    }
/* 134 */           zau zauVar = ur0VarM9125h.f17695n;
/* 141 */           zauVar.sendMessage(zauVar.obtainMessage(7, this));
                }

                /* JADX INFO: renamed from: a */
                public final void m7236a(int i, AbstractC0955gi abstractC0955gi) {
/* 1 */             abstractC0955gi.zak();
/* 4 */             ur0 ur0Var = this.zaa;
/* 6 */             ur0Var.getClass();
/* 22 */            kb3 kb3Var = new kb3(new tb3(i, abstractC0955gi), ur0Var.f17690i.get(), this);
/* 25 */            zau zauVar = ur0Var.f17695n;
/* 32 */            zauVar.sendMessage(zauVar.obtainMessage(4, kb3Var));
                }

                public tr0 asGoogleApiClient() {
/* 1 */             return this.zai;
                }

                /* JADX INFO: renamed from: b */
                public final Task m7237b(int i, um2 um2Var) {
/* 3 */             TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 6 */             yg2 yg2Var = this.zaj;
/* 8 */             ur0 ur0Var = this.zaa;
/* 10 */            ur0Var.getClass();
/* 17 */            ur0Var.m9130g(taskCompletionSource, um2Var.zaa(), this);
/* 33 */            kb3 kb3Var = new kb3(new xb3(i, um2Var, taskCompletionSource, yg2Var), ur0Var.f17690i.get(), this);
/* 36 */            zau zauVar = ur0Var.f17695n;
/* 43 */            zauVar.sendMessage(zauVar.obtainMessage(4, kb3Var));
/* 46 */            return taskCompletionSource.getTask();
                }

                public C2308vv createClientSettingsBuilder() {
                    GoogleSignInAccount googleSignInAccount;
                    GoogleSignInAccount googleSignInAccount2;
                    String str;
/* 3 */             C2308vv c2308vv = new C2308vv();
/* 6 */             InterfaceC0172b9 interfaceC0172b9 = this.zae;
/* 10 */            Account account = null;
/* 11 */            if ((interfaceC0172b9 instanceof InterfaceC2526z8) && (googleSignInAccount2 = ((in3) ((InterfaceC2526z8) interfaceC0172b9)).f9731c) != null && (str = googleSignInAccount2.f3373d) != null) {
/* 30 */                account = new Account(str, "com.google");
                    }
/* 33 */            c2308vv.f18359a = account;
/* 35 */            InterfaceC0172b9 interfaceC0172b10 = this.zae;
/* 52 */            Collection collectionM1993D1 = (!(interfaceC0172b10 instanceof InterfaceC2526z8) || (googleSignInAccount = ((in3) ((InterfaceC2526z8) interfaceC0172b10)).f9731c) == null) ? Collections.EMPTY_SET : googleSignInAccount.m1993D1();
/* 61 */            if (c2308vv.f18360b == null) {
/* 69 */                c2308vv.f18360b = new C1827kd(0);
                    }
/* 73 */            c2308vv.f18360b.addAll(collectionM1993D1);
/* 86 */            c2308vv.f18362d = this.zab.getClass().getName();
/* 94 */            c2308vv.f18361c = this.zab.getPackageName();
/* 96 */            return c2308vv;
                }

                public Task<Boolean> disconnectService() {
/* 1 */             ur0 ur0Var = this.zaa;
/* 3 */             ur0Var.getClass();
/* 12 */            za3 za3Var = new za3(getApiKey());
/* 15 */            zau zauVar = ur0Var.f17695n;
/* 23 */            zauVar.sendMessage(zauVar.obtainMessage(14, za3Var));
/* 28 */            return za3Var.f20056b.getTask();
                }

                @ResultIgnorabilityUnspecified
                public <TResult, A extends InterfaceC2359x8> Task<TResult> doBestEffortWrite(um2 um2Var) {
/* 2 */             return m7237b(2, um2Var);
                }

                @ResultIgnorabilityUnspecified
                public <TResult, A extends InterfaceC2359x8> Task<TResult> doRead(um2 um2Var) {
/* 2 */             return m7237b(0, um2Var);
                }

                @ResultIgnorabilityUnspecified
                @Deprecated
                public <A extends InterfaceC2359x8, T extends p22, U extends cy2> Task<Void> doRegisterEventListener(T t, U u) {
/* 1 */             kb1.m6061n(t);
/* 4 */             kb1.m6061n(u);
/* 13 */            kb1.m6062o(t.getListenerKey(), "Listener has already been released.");
/* 20 */            kb1.m6062o(u.getListenerKey(), "Listener has already been released.");
/* 37 */            kb1.m6053f("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", de3.m3029k(t.getListenerKey(), u.getListenerKey()));
/* 40 */            ur0 ur0Var = this.zaa;
/* 42 */            ur0Var.getClass();
/* 47 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 54 */            ur0Var.m9130g(taskCompletionSource, t.zaa(), this);
/* 75 */            kb3 kb3Var = new kb3(new wb3(new lb3(t, u), taskCompletionSource), ur0Var.f17690i.get(), this);
/* 78 */            zau zauVar = ur0Var.f17695n;
/* 86 */            zauVar.sendMessage(zauVar.obtainMessage(8, kb3Var));
/* 89 */            return taskCompletionSource.getTask();
                }

                @ResultIgnorabilityUnspecified
                public Task<Boolean> doUnregisterEventListener(t81 t81Var, int i) {
/* 3 */             kb1.m6062o(t81Var, "Listener key cannot be null.");
/* 6 */             ur0 ur0Var = this.zaa;
/* 8 */             ur0Var.getClass();
/* 13 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 16 */            ur0Var.m9130g(taskCompletionSource, i, this);
/* 32 */            kb3 kb3Var = new kb3(new wb3(t81Var, taskCompletionSource), ur0Var.f17690i.get(), this);
/* 35 */            zau zauVar = ur0Var.f17695n;
/* 43 */            zauVar.sendMessage(zauVar.obtainMessage(13, kb3Var));
/* 46 */            return taskCompletionSource.getTask();
                }

                @ResultIgnorabilityUnspecified
                public <TResult, A extends InterfaceC2359x8> Task<TResult> doWrite(um2 um2Var) {
/* 2 */             return m7237b(1, um2Var);
                }

                public String getApiFallbackAttributionTag(Context context) {
/* 1 */             return null;
                }

                public final C2323w9 getApiKey() {
/* 1 */             return this.zaf;
                }

                public InterfaceC0172b9 getApiOptions() {
/* 1 */             return this.zae;
                }

                public Context getApplicationContext() {
/* 1 */             return this.zab;
                }

                public String getContextAttributionTag() {
/* 1 */             return this.zac;
                }

                @Deprecated
                public String getContextFeatureId() {
/* 1 */             return this.zac;
                }

                public Looper getLooper() {
/* 1 */             return this.zag;
                }

                public <L> v81 registerListener(L l, String str) {
/* 3 */             return k50.m5967d(this.zag, l, str);
                }

                public final int zaa() {
/* 1 */             return this.zah;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final InterfaceC0836d9 zab(Looper looper, cb3 cb3Var) {
/* 1 */             C2308vv c2308vvCreateClientSettingsBuilder = createClientSettingsBuilder();
/* 18 */            C2345wv c2345wv = new C2345wv(c2308vvCreateClientSettingsBuilder.f18359a, c2308vvCreateClientSettingsBuilder.f18360b, null, c2308vvCreateClientSettingsBuilder.f18361c, c2308vvCreateClientSettingsBuilder.f18362d, je2.f12239a);
/* 23 */            AbstractC2322w8 abstractC2322w8 = this.zad.f8966a;
/* 25 */            kb1.m6061n(abstractC2322w8);
/* 37 */            InterfaceC0836d9 interfaceC0836d9BuildClient = abstractC2322w8.buildClient(this.zab, looper, c2345wv, (Object) this.zae, (rr0) cb3Var, (sr0) cb3Var);
/* 41 */            String contextAttributionTag = getContextAttributionTag();
/* 45 */            if (contextAttributionTag != null && (interfaceC0836d9BuildClient instanceof AbstractC0322a)) {
/* 54 */                ((AbstractC0322a) interfaceC0836d9BuildClient).setAttributionTag(contextAttributionTag);
                    }
/* 57 */            if (contextAttributionTag == null || !(interfaceC0836d9BuildClient instanceof sn1)) {
/* 69 */                return interfaceC0836d9BuildClient;
                    }
/* 64 */            pm2.m7490m(interfaceC0836d9BuildClient);
/* 68 */            throw null;
                }

                public final zact zac(Context context, Handler handler) {
/* 3 */             C2308vv c2308vvCreateClientSettingsBuilder = createClientSettingsBuilder();
/* 23 */            return new zact(context, handler, new C2345wv(c2308vvCreateClientSettingsBuilder.f18359a, c2308vvCreateClientSettingsBuilder.f18360b, null, c2308vvCreateClientSettingsBuilder.f18361c, c2308vvCreateClientSettingsBuilder.f18362d, je2.f12239a));
                }

/* 6 */         public <A extends InterfaceC2359x8, T extends AbstractC0955gi> T doBestEffortWrite(T t) {
/* 7 */             m7236a(2, t);
                    return t;
                }

/* 6 */         public <A extends InterfaceC2359x8, T extends AbstractC0955gi> T doRead(T t) {
/* 7 */             m7236a(0, t);
                    return t;
                }

/* 6 */         public <A extends InterfaceC2359x8, T extends AbstractC0955gi> T doWrite(T t) {
/* 7 */             m7236a(1, t);
                    return t;
                }

                @ResultIgnorabilityUnspecified
/* 50 */        public Task<Boolean> doUnregisterEventListener(t81 t81Var) {
/* 51 */            return doUnregisterEventListener(t81Var, 0);
                }

                @ResultIgnorabilityUnspecified
/* 93 */        public <A extends InterfaceC2359x8> Task<Void> doRegisterEventListener(q22 q22Var) {
/* 94 */            kb1.m6061n(q22Var);
                    throw null;
                }

/* 144 */       public or0(Context context, C0983h9 c0983h9, InterfaceC0172b9 interfaceC0172b9, xt0 xt0Var) {
/* 147 */           this(context, null, c0983h9, interfaceC0172b9, new nr0(xt0Var, Looper.getMainLooper()));
                }
            }
