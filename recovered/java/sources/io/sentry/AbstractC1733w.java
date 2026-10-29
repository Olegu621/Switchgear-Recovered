            package io.sentry;

            import java.io.File;
            
            /* JADX INFO: renamed from: io.sentry.w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1733w {

                /* JADX INFO: renamed from: a */
                public final InterfaceC1389c1 f11792a;

                /* JADX INFO: renamed from: b */
                public final ILogger f11793b;

                /* JADX INFO: renamed from: c */
                public final long f11794c;

                /* JADX INFO: renamed from: d */
                public final C1463g7 f11795d;

                public AbstractC1733w(InterfaceC1389c1 interfaceC1389c1, ILogger iLogger, long j, int i) {
/* 4 */             this.f11792a = interfaceC1389c1;
/* 6 */             this.f11793b = iLogger;
/* 8 */             this.f11794c = j;
/* 20 */            this.f11795d = new C1463g7(new C1464h(i));
                }

                /* JADX INFO: renamed from: a */
                public abstract boolean mo5057a(String str);

                /* JADX INFO: renamed from: b */
                public abstract void mo5058b(File file, C1486i0 c1486i0);
            }
