            package io.sentry.android.core;

            import android.os.Handler;
            import androidx.lifecycle.ProcessLifecycleOwner;
            import io.sentry.C1641r2;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import p000.f72;
            import p000.ji1;
            
            /* JADX INFO: renamed from: io.sentry.android.core.g0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1191g0 implements Closeable {

                /* JADX INFO: renamed from: e */
                public static final C1191g0 f10017e = new C1191g0();

                /* JADX INFO: renamed from: b */
                public volatile C1188f0 f10019b;

                /* JADX INFO: renamed from: a */
                public final C1702a f10018a = new C1702a();

                /* JADX INFO: renamed from: c */
                public final C1248o0 f10020c = new C1248o0(3);

                /* JADX INFO: renamed from: d */
                public volatile Boolean f10021d = null;

                /* JADX INFO: renamed from: c */
                public final void m4788c(InterfaceC1182d0 interfaceC1182d0) {
/* 1 */             C1702a c1702a = this.f10018a;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4790g(C1641r2.f11545a);
/* 13 */                if (this.f10019b != null) {
/* 19 */                    this.f10019b.f10011a.add(interfaceC1182d0);
                        }
/* 25 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 29 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 34 */                    th.addSuppressed(th2);
                        }
/* 37 */                throw th;
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             m4792i();
                }

                /* JADX INFO: renamed from: f */
                public final void m4789f(ILogger iLogger) {
/* 1 */             C1188f0 c1188f0 = this.f10019b;
/* 3 */             if (c1188f0 != null) {
                        try {
/* 9 */                     ProcessLifecycleOwner.f1535w.f1541f.mo4483a(c1188f0);
                        } catch (Throwable th) {
/* 15 */                    this.f10019b = null;
/* 21 */                    iLogger.mo4671d(EnumC1553m5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4790g(ILogger iLogger) {
/* 3 */             if (this.f10019b != null) {
/* 64 */                return;
                    }
                    try {
/* 6 */                 ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f1535w;
/* 13 */                this.f10019b = new C1188f0(this);
/* 21 */                if (C1218e.f10157a.mo4842c()) {
/* 23 */                    m4789f(iLogger);
/* 26 */                    return;
                        }
/* 29 */                C1248o0 c1248o0 = this.f10020c;
/* 42 */                ((Handler) c1248o0.f10226a).post(new ji1(21, this, iLogger));
                    } catch (ClassNotFoundException unused) {
/* 61 */                iLogger.mo4672k(EnumC1553m5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
                    } catch (Throwable th) {
/* 50 */                iLogger.mo4671d(EnumC1553m5.ERROR, "AppState could not register lifecycle observer", th);
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m4791h(InterfaceC1182d0 interfaceC1182d0) {
/* 1 */             C1702a c1702a = this.f10018a;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f10019b != null) {
/* 14 */                    this.f10019b.f10011a.remove(interfaceC1182d0);
                        }
/* 20 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 24 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 29 */                    th.addSuppressed(th2);
                        }
/* 32 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m4792i() {
/* 3 */             if (this.f10019b == null) {
/* 43 */                return;
                    }
/* 6 */             C1702a c1702a = this.f10018a;
/* 8 */             c1702a.m5443c();
                    try {
/* 11 */                C1188f0 c1188f0 = this.f10019b;
/* 17 */                this.f10019b.f10011a.clear();
/* 21 */                this.f10019b = null;
/* 23 */                c1702a.close();
/* 32 */                if (C1218e.f10157a.mo4842c()) {
/* 34 */                    if (c1188f0 != null) {
/* 40 */                        ProcessLifecycleOwner.f1535w.f1541f.mo4484b(c1188f0);
                            }
                        } else {
/* 44 */                    C1248o0 c1248o0 = this.f10020c;
/* 55 */                    ((Handler) c1248o0.f10226a).post(new f72(this, c1188f0));
                        }
                    } catch (Throwable th) {
                        try {
/* 60 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 65 */                    th.addSuppressed(th2);
                        }
/* 68 */                throw th;
                    }
                }
            }
