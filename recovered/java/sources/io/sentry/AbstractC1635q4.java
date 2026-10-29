            package io.sentry;

            import io.sentry.exception.C1440a;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import java.util.AbstractMap;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.q4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public abstract class AbstractC1635q4 {

                /* JADX INFO: renamed from: U */
                public transient Throwable f11510U;

                /* JADX INFO: renamed from: V */
                public String f11511V;

                /* JADX INFO: renamed from: W */
                public String f11512W;

                /* JADX INFO: renamed from: X */
                public List f11513X;

                /* JADX INFO: renamed from: Y */
                public C1599f f11514Y;

                /* JADX INFO: renamed from: Z */
                public AbstractMap f11515Z;

                /* JADX INFO: renamed from: a */
                public C1626w f11516a;

                /* JADX INFO: renamed from: b */
                public final C1597e f11517b;

                /* JADX INFO: renamed from: c */
                public C1624u f11518c;

                /* JADX INFO: renamed from: d */
                public C1621r f11519d;

                /* JADX INFO: renamed from: e */
                public AbstractMap f11520e;

                /* JADX INFO: renamed from: f */
                public String f11521f;

                /* JADX INFO: renamed from: i */
                public String f11522i;

                /* JADX INFO: renamed from: v */
                public String f11523v;

                /* JADX INFO: renamed from: w */
                public C1608j0 f11524w;

                public AbstractC1635q4(C1626w c1626w) {
/* 9 */             this.f11517b = new C1597e();
/* 11 */            this.f11516a = c1626w;
                }

                /* JADX INFO: renamed from: a */
                public final Throwable m5381a() {
/* 1 */             Throwable th = this.f11510U;
                    return th instanceof C1440a ? ((C1440a) th).f10921b : th;
                }

                /* JADX INFO: renamed from: b */
                public final void m5382b(String str, String str2) {
/* 3 */             if (this.f11520e == null) {
/* 10 */                this.f11520e = new HashMap();
                    }
/* 12 */            if (str == null) {
/* 24 */                return;
                    }
/* 15 */            AbstractMap abstractMap = this.f11520e;
/* 17 */            if (str2 != null) {
/* 25 */                abstractMap.put(str, str2);
                    } else if (abstractMap != null) {
/* 21 */                abstractMap.remove(str);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5383c(Map map) {
/* 10 */            this.f11520e = map != null ? new HashMap(map) : null;
                }

/* 13 */        public AbstractC1635q4() {
/* 16 */            this(new C1626w());
                }
            }
