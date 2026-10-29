            package io.sentry.android.core;

            import io.sentry.ILogger;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.hints.InterfaceC1474b;
            import io.sentry.protocol.C1626w;
            
            /* JADX INFO: renamed from: io.sentry.android.core.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1288z extends AbstractC1475c implements InterfaceC1474b, InterfaceC1473a {

                /* JADX INFO: renamed from: d */
                public final long f10393d;

                /* JADX INFO: renamed from: e */
                public final boolean f10394e;

                /* JADX INFO: renamed from: f */
                public final boolean f10395f;

                public C1288z(long j, ILogger iLogger, long j2, boolean z, boolean z2) {
/* 1 */             super(j, iLogger);
/* 4 */             this.f10393d = j2;
/* 6 */             this.f10394e = z;
/* 8 */             this.f10395f = z2;
                }

                @Override // io.sentry.hints.InterfaceC1474b
                /* JADX INFO: renamed from: a */
                public final boolean mo4957a() {
/* 1 */             return this.f10394e;
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: b */
                public final Long mo4960b() {
/* 3 */             return Long.valueOf(this.f10393d);
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: c */
                public final boolean mo4961c() {
/* 1 */             return false;
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: e */
                public final String mo4962e() {
                    return this.f10395f ? "anr_background" : "anr_foreground";
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: f */
                public final boolean mo4958f(C1626w c1626w) {
/* 1 */             return true;
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: g */
                public final void mo4959g(C1626w c1626w) {
                }
            }
