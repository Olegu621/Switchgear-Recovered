            package p000;

            import android.app.Application;
            import android.content.Context;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rs0 {

                /* JADX INFO: renamed from: y */
                public static rs0 f16254y;

                /* JADX INFO: renamed from: z */
                public static final AtomicBoolean f16255z = new AtomicBoolean(false);

                /* JADX INFO: renamed from: a */
                public boolean f16256a;

                /* JADX INFO: renamed from: b */
                public boolean f16257b;

                /* JADX INFO: renamed from: c */
                public boolean f16258c;

                /* JADX INFO: renamed from: d */
                public boolean f16259d;

                /* JADX INFO: renamed from: e */
                public C1773iy f16260e;

                /* JADX INFO: renamed from: f */
                public C1969nm f16261f;

                /* JADX INFO: renamed from: g */
                public ec0 f16262g;

                /* JADX INFO: renamed from: h */
                public C0168b5 f16263h;

                /* JADX INFO: renamed from: i */
                public ra2 f16264i;

                /* JADX INFO: renamed from: j */
                public xy1 f16265j;

                /* JADX INFO: renamed from: k */
                public C1969nm f16266k;

                /* JADX INFO: renamed from: l */
                public C1969nm f16267l;

                /* JADX INFO: renamed from: m */
                public wc0 f16268m;

                /* JADX INFO: renamed from: n */
                public final er0 f16269n;

                /* JADX INFO: renamed from: o */
                public ts0 f16270o;

                /* JADX INFO: renamed from: p */
                public final ra2 f16271p;

                /* JADX INFO: renamed from: q */
                public wc0 f16272q;

                /* JADX INFO: renamed from: r */
                public C0210cb f16273r;

                /* JADX INFO: renamed from: s */
                public C0210cb f16274s;

                /* JADX INFO: renamed from: t */
                public C0875ec f16275t;

                /* JADX INFO: renamed from: u */
                public C0168b5 f16276u;

                /* JADX INFO: renamed from: v */
                public ScheduledThreadPoolExecutor f16277v;

                /* JADX INFO: renamed from: w */
                public final ll1 f16278w;

                /* JADX INFO: renamed from: x */
                public final Context f16279x;

                public rs0(Application application) {
/* 4 */             this.f16279x = application;
/* 12 */            er0 er0Var = new er0(application, "__hs_lite_sdk_store");
/* 15 */            int i = 1;
/* 16 */            er0 er0Var2 = new er0(i);
/* 19 */            er0Var2.f7853b = er0Var;
/* 21 */            this.f16269n = er0Var2;
/* 30 */            fs0 fs0Var = new fs0(Executors.newFixedThreadPool(2), i);
/* 39 */            fs0 fs0Var2 = new fs0(Executors.newSingleThreadExecutor(), i);
/* 46 */            zb0 zb0Var = new zb0(13);
/* 51 */            ra2 ra2Var = new ra2();
/* 59 */            ra2Var.f15958d = new Object();
/* 61 */            ra2Var.f15955a = fs0Var;
/* 63 */            ra2Var.f15956b = fs0Var2;
/* 65 */            ra2Var.f15957c = zb0Var;
/* 67 */            this.f16271p = ra2Var;
/* 74 */            this.f16278w = new ll1(application, er0Var2);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m8239b() {
                    return f16255z.get();
                }

                /* JADX INFO: renamed from: a */
                public final C1969nm m8240a() {
/* 3 */             if (this.f16266k == null) {
/* 9 */                 Context context = this.f16279x;
/* 54 */                this.f16266k = new C1969nm(new er0(context, "__hs_chat_resource_cache"), new zb0(new p62(7), 12), new xt0(25), context.getCacheDir().getAbsolutePath(), "https://webchat.helpshift.com/latest/android/android-mapping.json", "chat_cacheURLs", "webchat");
                    }
/* 56 */            return this.f16266k;
                }
            }
