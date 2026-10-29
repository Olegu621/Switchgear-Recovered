            package io.sentry.android.ndk;

            import io.sentry.AbstractC1436e4;
            import io.sentry.C1154a;
            import io.sentry.C1380b4;
            import io.sentry.C1383b7;
            import io.sentry.C1443f;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.ndk.NativeScope;
            import io.sentry.util.AbstractC1704c;
            import p000.RunnableC2558zo;
            import p000.f72;
            import p000.ji1;
            
            /* JADX INFO: renamed from: io.sentry.android.ndk.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1291b extends AbstractC1436e4 {

                /* JADX INFO: renamed from: a */
                public final C1554m6 f10405a;

                /* JADX INFO: renamed from: b */
                public final NativeScope f10406b;

                public C1291b(SentryAndroidOptions sentryAndroidOptions) {
/* 3 */             NativeScope nativeScope = new NativeScope();
/* 11 */            AbstractC1704c.m5462q(sentryAndroidOptions, "The SentryOptions object is required.");
/* 14 */            this.f10405a = sentryAndroidOptions;
/* 16 */            this.f10406b = nativeScope;
                }

                @Override // io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: i */
                public final void mo4967i(C1443f c1443f) {
/* 1 */             C1554m6 c1554m6 = this.f10405a;
                    try {
/* 14 */                c1554m6.getExecutorService().submit(new ji1(28, this, c1443f));
                    } catch (Throwable th) {
/* 30 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
                    }
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: j */
                public final void mo4968j(C1154a c1154a) {
/* 1 */             String str = c1154a.f9790d;
/* 6 */             C1554m6 c1554m6 = this.f10405a;
/* 8 */             if (str != null) {
                        try {
/* 21 */                    c1554m6.getExecutorService().submit(new ji1(27, this, str));
/* 24 */                    return;
                        } catch (Throwable th) {
/* 34 */                    c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Scope sync addAttachment has an error.", new Object[0]);
/* 37 */                    return;
                        }
                    }
/* 38 */            byte[] bArr = c1154a.f9787a;
/* 40 */            if (bArr == null) {
/* 82 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Scope sync addAttachment skips attachment without path or bytes.", new Object[0]);
/* 85 */                return;
                    }
                    try {
/* 55 */                c1554m6.getExecutorService().submit(new RunnableC2558zo(19, this, bArr, c1154a.f9791e));
                    } catch (Throwable th2) {
/* 68 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th2, "Scope sync addAttachment has an error.", new Object[0]);
                    }
                }

                @Override // io.sentry.AbstractC1436e4, io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: m */
                public final void mo4969m() {
/* 1 */             C1554m6 c1554m6 = this.f10405a;
                    try {
/* 14 */                c1554m6.getExecutorService().submit(new f72(this, 25));
                    } catch (Throwable th) {
/* 30 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
                    }
                }

                @Override // io.sentry.InterfaceC1377b1
                /* JADX INFO: renamed from: n */
                public final void mo4970n(C1383b7 c1383b7, C1380b4 c1380b4) {
/* 1 */             C1554m6 c1554m6 = this.f10405a;
/* 3 */             if (c1383b7 == null) {
/* 5 */                 return;
                    }
                    try {
/* 17 */                c1554m6.getExecutorService().submit(new ji1(29, this, c1383b7));
                    } catch (Throwable th) {
/* 33 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
                    }
                }
            }
