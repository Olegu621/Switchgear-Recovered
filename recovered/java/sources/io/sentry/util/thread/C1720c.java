            package io.sentry.util.thread;
            
            /* JADX INFO: renamed from: io.sentry.util.thread.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1720c implements InterfaceC1718a {

                /* JADX INFO: renamed from: a */
                public static final long f11747a = Thread.currentThread().getId();

                /* JADX INFO: renamed from: b */
                public static final C1720c f11748b = new C1720c();

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: a */
                public final String mo4840a() {
/* 5 */             return Thread.currentThread().getName();
                }

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: b */
                public final long mo4841b() {
/* 5 */             return Thread.currentThread().getId();
                }

                @Override // io.sentry.util.thread.InterfaceC1718a
                /* JADX INFO: renamed from: c */
                public final boolean mo4842c() {
                    return f11747a == Thread.currentThread().getId();
                }
            }
